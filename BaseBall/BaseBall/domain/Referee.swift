//
//  Referee.swift
//  BaseBall
//
//  Created by KimMinSeok on 4/8/24.
//

import Foundation

class Referee{
    let nothingJudgement : NothingJudgment
    let ballJudgement : BallJudgment
    let strikeJudgement : StrikeJudgment
    
    init(nothingJudgement: NothingJudgment, ballJudgement: BallJudgment, strikeJudgement: StrikeJudgment) {
        self.nothingJudgement = nothingJudgement
        self.ballJudgement = ballJudgement
        self.strikeJudgement = strikeJudgement
    }
    
    func gameResult(userNumber: [Int], computerNumber: [Int]) -> [Int]{
        return [nothingJudgement.gameCount(userNumber: userNumber, computerNumber: computerNumber), ballJudgement.gameCount(userNumber: userNumber, computerNumber: computerNumber), strikeJudgement.gameCount(userNumber: userNumber, computerNumber: computerNumber)]
    }
}
