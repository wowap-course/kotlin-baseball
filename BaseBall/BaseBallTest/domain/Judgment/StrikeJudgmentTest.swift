//
//  BallRefereeTest.swift
//  BaseBallTest
//
//  Created by KimMinSeok on 4/8/24.
//

import XCTest

final class StrikeJudgmentTest: XCTestCase {

    func test_스트라이크를_출력한다(){
        let number1 = [1,2,3]
        let number2 = [4,5,3]
        
        let strikeJudgment = StrikeJudgment()
        XCTAssertEqual(strikeJudgment.gameCount(inputNumbers1: number1, inputNumbers2: number2), 1)
    }
    
    func test_숫자가_있지만_다른_자리이면_스트라이크를_출력하지_않는다(){
        let number1 = [1,2,3]
        let number2 = [3,1,2]
        
        let strikeJudgment = StrikeJudgment()
        XCTAssertEqual(strikeJudgment.gameCount(inputNumbers1: number1, inputNumbers2: number2), 0)
    }
    
    func test_맞는_숫자가_없으면_스트라이크를_출력하지_않는다(){
        let number1 = [1,2,3]
        let number2 = [4,5,6]
        
        let strikeJudgment = StrikeJudgment()
        XCTAssertEqual(strikeJudgment.gameCount(inputNumbers1: number1, inputNumbers2: number2), 0)
    }
    
    func test_여러개의_스트라이크를_출력한다(){
        let number1 = [1,2,3]
        let number2 = [1,2,4]
        
        let strikeJudgment = StrikeJudgment()
        XCTAssertEqual(strikeJudgment.gameCount(inputNumbers1: number1, inputNumbers2: number2), 2)
    }

}
