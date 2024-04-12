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
    init(inputView: InputView, outputView: OutputView) {
        self.inputView = inputView
        self.outputView = outputView
    }
    
    func run() {
        do {
            try playOneGame(opponentNumbers: OpponentBall(numberGenerator: RandomNumberGenerator()).numbers)
            while try restart() {
                try playOneGame(opponentNumbers: OpponentBall(numberGenerator: RandomNumberGenerator()).numbers)
            }
            outputView.endGamePrint()
            
        } catch {
            outputView.errorInputPrint()
        }
    }
    
    private func playOneGame(opponentNumbers: [Int]) throws{
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
    
    private func playOneRound(userNumbers: [Int], opponentNumbers: [Int]){
        let referee = Referee()
        
        let resultScore = referee.getGameScore(baseNumbers: userNumbers, targetNumbers:opponentNumbers)
        
        outputView.nowScorePrint(ball: resultScore.ball, strike: resultScore.strike)
    }
    
    private func restart() throws -> Bool{
        let number = inputView.inputRestart()
        if number != RESTART_NUM1 && number != RESTART_NUM2{
            throw RestartError.IllegalArgumentException
        } else {
            return number == RESTART_NUMBER
        }
    }
    
    private let RESTART_NUM1 = 1
    private let RESTART_NUM2 = 2
    private let RESTART_NUMBER = 1
    
}
