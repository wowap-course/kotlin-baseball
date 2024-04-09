//
//  BaseBallGameController.swift
//  BaseBall
//
//  Created by KimMinSeok on 4/8/24.
//
enum RestartError: Error {
    case IllegalArgumentException
}

import Foundation

class BaseBallGameController{
    let inputView : InputView
    let outputView : OutputView
    var restartJudge = true
    
    init(inputView: InputView, outputView: OutputView) {
        self.inputView = inputView
        self.outputView = outputView
    }
    
    func run() {
        do {
            while restartJudge == true {
                try playOneGame(computerNumbers: Opponent.init(numberGenerator: RandomNumberGenerator()).numbers)
                restartJudge = try restart()
            }
            
            outputView.endGamePrint()
        } catch {
            outputView.errorInputPrint()
        }
    }
    
    func playOneGame(computerNumbers: [Int]) throws{
        do {
            var userNumbers = try UserBall(numbers: inputView.inputNumber()).numbers
            while !userNumbers.elementsEqual(computerNumbers){
                playOneRound(userNumbers: userNumbers, computerNumbers: computerNumbers)
                userNumbers = try UserBall(numbers: inputView.inputNumber()).numbers
            }
        } catch {
            throw error
        }
        
        outputView.resultGamePrint()
    }
    
    func playOneRound(userNumbers: [Int], computerNumbers: [Int]){
        let referee = Referee(ballJudgement: BallJudgment(), strikeJudgement: StrikeJudgment())
        
        let result = referee.gameResult(userNumbers: userNumbers, computerNumbers: computerNumbers)
        
        outputView.nowScorePrint(result: result)
    }
    
    func restart() throws -> Bool{
        let number = inputView.restart()
        if number != RESTART_NUM1 && number != RESTART_NUM2{
            throw RestartError.IllegalArgumentException
        } else {
            return number == 1
        }
    }
    
    private let RESTART_NUM1 = 1
    private let RESTART_NUM2 = 2
    
}
