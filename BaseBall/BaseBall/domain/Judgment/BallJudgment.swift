//
//  BallReferee.swift
//  BaseBall
//
//  Created by KimMinSeok on 4/8/24.
//

import Foundation

class BallJudgment : Judgment {
    func gameCount(userNumber: [Int], computerNumber: [Int]) -> Int {
        return userNumber.filter { num in
            computerNumber.contains(num) && num != computerNumber[userNumber.firstIndex(of: num)!]
        }.count
    }
}
