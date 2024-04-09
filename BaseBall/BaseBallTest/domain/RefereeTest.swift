//
//  RefereeTest.swift
//  BaseBallTest
//
//  Created by KimMinSeok on 4/8/24.
//

import XCTest

final class RefereeTest: XCTestCase {

    func test_올바른_정답을_출력한다1(){
        let number1 = [1,2,3]
        let number2 = [4,5,6]
        
        let Referee = Referee(ballJudgement: BallJudgment(), strikeJudgement: StrikeJudgment())
        XCTAssertEqual(Referee.gameResult(userNumber: number1, computerNumber: number2), [1,0,0])
    }
    
    func test_올바른_정답을_출력한다2(){
        let number1 = [1,2,3]
        let number2 = [3,2,1]
        
        let Referee = Referee(ballJudgement: BallJudgment(), strikeJudgement: StrikeJudgment())
        XCTAssertEqual(Referee.gameResult(userNumber: number1, computerNumber: number2), [0,2,1])
    }
    
    func test_올바른_정답을_출력한다3(){
        let number1 = [1,2,3]
        let number2 = [1,2,3]
        
        let Referee = Referee(ballJudgement: BallJudgment(), strikeJudgement: StrikeJudgment())
        XCTAssertEqual(Referee.gameResult(userNumbers: number1, computerNumbers: number2), [0,0,3])
    }

}
