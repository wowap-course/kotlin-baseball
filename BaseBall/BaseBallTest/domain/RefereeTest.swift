//
//  RefereeTest.swift
//  BaseBallTest
//
//  Created by KimMinSeok on 4/8/24.
//

import XCTest

final class RefereeTest: XCTestCase {

    func test_Referee는_볼을_출력한다(){
        let number1 = [1,2,3]
        let number2 = [3,4,5]
        
        let Referee = Referee()
        XCTAssertEqual(Referee.ballCount(inputNumbers1: number1, inputNumbers2: number2), 1)
    }
    
    func test_스트라이크를_출력한다(){
        let number1 = [1,2,3]
        let number2 = [1,2,5]
        
        let Referee = Referee()
        XCTAssertEqual(Referee.strikeCount(inputNumbers1: number1, inputNumbers2: number2), 2)
    }
    
    func test_올바른_경기_결과를_출력한다(){
        let number1 = [1,2,3]
        let number2 = [1,3,2]
        
        let gameResult = Referee().gameResultCount(inputNumbers1: number1, inputNumbers2: number2)
        XCTAssertEqual([gameResult.ball, gameResult.strike], [2,1])
    }

}
