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
                try playOneGame(opponentNumbers: Opponent.init(numberGenerator: RandomNumberGenerator()).numbers)
                restartJudge = try restart()
            }
            
            outputView.endGamePrint()
        } catch {
            outputView.errorInputPrint()
        }
    }
    
    func playOneGame(opponentNumbers: [Int]) throws{
        do {
            var userNumbers = try UserBall(numbers: inputView.inputNumber()).numbers
            while !userNumbers.elementsEqual(opponentNumbers){
                playOneRound(userNumbers: userNumbers, opponentNumbers: opponentNumbers)
                userNumbers = try UserBall(numbers: inputView.inputNumber()).numbers
            }
        } catch {
            throw error
        }
        
        outputView.resultGamePrint()
    }
    
    func playOneRound(userNumbers: [Int], opponentNumbers: [Int]){
        let referee = Referee()
        
        let result = referee.gameResultCount(inputNumbers1: userNumbers, inputNumbers2:opponentNumbers)
        
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
