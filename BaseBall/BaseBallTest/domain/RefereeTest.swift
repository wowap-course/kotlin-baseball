//
//  RefereeTest.swift
//  BaseBallTest
//
//  Created by KimMinSeok on 4/8/24.
//

import XCTest

final class RefereeTest: XCTestCase {

    func test_Referee는_볼을_출력한다(){
        // Given
        let number1 = [1,2,3]
        let number2 = [3,4,5]
        let gameResult = Referee().getGameScore(baseNumbers: number1, targetNumbers: number2)
        
        // When
        let actual = [gameResult.ball, gameResult.strike]
        
        // Then
        XCTAssertEqual(actual, [1,0])
    }
    
    func test_스트라이크를_출력한다(){
        // Given
        let number1 = [1,2,3]
        let number2 = [1,2,5]
        let gameResult = Referee().getGameScore(baseNumbers: number1, targetNumbers: number2)
        
        // When
        let actual = [gameResult.ball, gameResult.strike]
        
        // Then
        XCTAssertEqual(actual, [0,2])
    }
    
    func test_올바른_경기_결과를_출력한다(){
        // Given
        let number1 = [1,2,3]
        let number2 = [1,3,2]
        let gameResult = Referee().getGameScore(baseNumbers: number1, targetNumbers: number2)
        
        // When
        let actual = [gameResult.ball, gameResult.strike]
        
        // Then
        XCTAssertEqual(actual, [2,1])
    }

}
