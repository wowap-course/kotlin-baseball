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
    
    func gameResult(userNumber: [Int], computerNumber: [Int]) -> [Int]{
        return [ballJudgement.gameCount(userNumber: userNumber, computerNumber: computerNumber), strikeJudgement.gameCount(userNumber: userNumber, computerNumber: computerNumber)]
    }
}
