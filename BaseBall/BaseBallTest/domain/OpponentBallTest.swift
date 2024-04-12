//
//  OpponentTest.swift
//  BaseBallTest
//
//  Created by KimMinSeok on 4/4/24.
//

import XCTest

final class OpponentBallTest: XCTestCase {


    func test_상대방은_게임을_시작할때_3자리의_숫자를_가진다(){
        // Given
        let opponent = OpponentBall(numberGenerator: RandomNumberGenerator())
        
        // When
        let resultNumbersCount = opponent.numbers.count
        
        // Then
        XCTAssertEqual(resultNumbersCount, 3)
    }
    
    func test_상대방은_0이_포함되지_않는_숫자를_가진다(){
        // Given
        let opponent = OpponentBall(numberGenerator: RandomNumberGenerator())
        
        // When
        let resultNumbers = opponent.numbers
        
        // Then
        XCTAssertTrue(!resultNumbers.contains(0))
    }
    
    func test_상대방은_중복이_아닌_3자리의_숫자를_가진다(){
        // Given
        let opponent = OpponentBall(numberGenerator: RandomNumberGenerator())
        
        // When
        let resultNumbersCount = Set(opponent.numbers).count
        
        // Then
        XCTAssertEqual(resultNumbersCount, 3)
    }
}
