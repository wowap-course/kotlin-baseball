//
//  Referee.swift
//  BaseBall
//
//  Created by KimMinSeok on 4/8/24.
//

import Foundation

class Referee{
    let ballJudgement : BallJudgment
    let strikeJudgement : StrikeJudgment
    
    init(ballJudgement: BallJudgment, strikeJudgement: StrikeJudgment) {
        self.ballJudgement = ballJudgement
        self.strikeJudgement = strikeJudgement
    }
    
    func gameResult(userNumbers: [Int], computerNumbers: [Int]) -> [Int]{
        return [ballJudgement.gameCount(inputNumbers1: userNumbers, inputNumbers2: computerNumbers), strikeJudgement.gameCount(inputNumbers1: userNumbers, inputNumbers2: computerNumbers)]
    }
}
