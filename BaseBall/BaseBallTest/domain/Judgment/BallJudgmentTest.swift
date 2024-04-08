//
//  BallRefereeTest.swift
//  BaseBallTest
//
//  Created by KimMinSeok on 4/8/24.
//

import XCTest

final class BallJudgmentTest: XCTestCase {

    func test_볼을_출력한다(){
        let number1 = [1,2,3]
        let number2 = [3,4,5]
        
        let ballJudgment = BallJudgment()
        XCTAssertEqual(ballJudgment.gameCount(userNumber: number1, computerNumber: number2), 1)
    }
    
    func test_숫자가_있지만_같은_자리이면_볼을_출력하지_않는다(){
        let number1 = [1,2,3]
        let number2 = [4,5,3]
        
        let ballJudgment = BallJudgment()
        XCTAssertEqual(ballJudgment.gameCount(userNumber: number1, computerNumber: number2), 0)
    }
    
    func test_맞는_숫자가_없으면_볼을_출력하지_않는다(){
        let number1 = [1,2,3]
        let number2 = [4,5,6]
        
        let ballJudgment = BallJudgment()
        XCTAssertEqual(ballJudgment.gameCount(userNumber: number1, computerNumber: number2), 0)
    }
    
    func test_여러개의_볼을_출력한다(){
        let number1 = [1,2,3]
        let number2 = [3,2,1]
        
        let ballJudgment = BallJudgment()
        XCTAssertEqual(ballJudgment.gameCount(userNumber: number1, computerNumber: number2), 2)
    }

}
