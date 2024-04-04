//
//  OpponentTest.swift
//  BaseBallTest
//
//  Created by KimMinSeok on 4/4/24.
//

import XCTest

final class OpponentTest: XCTestCase {

    func test_상대방은_숫자를_가지고_있다(){
        let opponent = Opponent(numberGenerator: RandomNumberGenerator())
        opponent.number = [1,2,3]
        
        XCTAssertEqual(opponent.number, [1,2,3])
    }

    func test_상대방은_게임을_시작할때_랜덤한_숫자를_생성한다(){
        let opponent = Opponent(numberGenerator: RandomNumberGenerator())
        
        XCTAssertNotEqual(opponent.number, [4,5,6])
    }

}
