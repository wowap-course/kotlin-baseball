//
//  OpponentTest.swift
//  BaseBallTest
//
//  Created by KimMinSeok on 4/4/24.
//

import XCTest

final class OpponentBallTest: XCTestCase {


    func test_상대방은_게임을_시작할때_랜덤한_숫자를_생성한다(){
        let opponent = OpponentBall(numberGenerator: RandomNumberGenerator())
        
        XCTAssertNotEqual(opponent.numbers, [4,5,6])
    }

}
