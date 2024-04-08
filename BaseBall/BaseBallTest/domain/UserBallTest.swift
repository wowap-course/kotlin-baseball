//
//  BallCountTest.swift
//  BaseBallTest
//
//  Created by KimMinSeok on 4/8/24.
//

import XCTest

final class UserBallTest: XCTestCase {

    func test_숫자를_받아서_확인할_수_있다() throws{
        let testBall = try UserBall(number: [3,2,4])
        XCTAssertEqual(testBall.number, [3,2,4])
    }
  
    func test_3자리의_수가_들어와야_한다() throws {
        XCTAssertThrowsError(try UserBall(number: [1,2,3,4]))
    }
    
    func test_숫자는_같은_수가_입력되면_안된다() throws {
        XCTAssertThrowsError(try UserBall(number: [3,3,1]))
    }
    
    func test_숫자는_0은_불가능하다() throws {
        XCTAssertThrowsError(try UserBall(number: [3,3,0]))
    }

}
