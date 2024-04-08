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
                try playOneGame(computerNumber: Opponent.init(numberGenerator: RandomNumberGenerator()).number)
                restartJudge = try restart()
            }
            
            outputView.endGamePrint()
        } catch {
            outputView.errorInputPrint()
        }
    }
    
    func playOneGame(computerNumber: [Int]) throws{
        do {
            var userNumber = try UserBall(number: inputView.inputNumber()).number
            while !userNumber.elementsEqual(computerNumber){
                playOneRound(userNumber: userNumber, computerNumber: computerNumber)
                userNumber = try UserBall(number: inputView.inputNumber()).number
            }
        } catch {
            throw error
        }
        
        outputView.resultGamePrint()
    }
    
    func playOneRound(userNumber: [Int], computerNumber: [Int]){
        let referee = Referee(nothingJudgement: NothingJudgment(), ballJudgement: BallJudgment(), strikeJudgement: StrikeJudgment())
        
        let result = referee.gameResult(userNumber: userNumber, computerNumber: computerNumber)
        
        outputView.nowScorePrint(result: result)
    }
    
    func restart() throws -> Bool{
        let number = inputView.restart()
        if number != 1 && number != 2{
            throw RestartError.IllegalArgumentException
        } else {
            return number == 1 ? true : false
        }
    }
    
}
