//
//  NothingJudgmentTest.swift
//  BaseBallTest
//
//  Created by KimMinSeok on 4/8/24.
//

import XCTest

final class NothingJudgmentTest: XCTestCase {

    func test_같은_수가_없으면_1을_반환한다(){
        let number1 = [1,2,3]
        let number2 = [4,5,6]
        
        let nothingJudgment = NothingJudgment()
        XCTAssertEqual(nothingJudgment.gameCount(userNumber: number1, computerNumber: number2), 1)
    }

    func test_볼이_있으면_0을_반환한다(){
        let number1 = [1,2,3]
        let number2 = [3,5,6]
        
        let nothingJudgment = NothingJudgment()
        XCTAssertEqual(nothingJudgment.gameCount(userNumber: number1, computerNumber: number2), 0)
    }
    
    func test_스트라이크가_있으면_0을_반환한다(){
        let number1 = [1,2,3]
        let number2 = [1,2,4]
        
        let nothingJudgment = NothingJudgment()
        XCTAssertEqual(nothingJudgment.gameCount(userNumber: number1, computerNumber: number2), 0)
    }
}
