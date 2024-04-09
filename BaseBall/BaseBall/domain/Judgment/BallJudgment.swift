//
//  BallReferee.swift
//  BaseBall
//
//  Created by KimMinSeok on 4/8/24.
//

import Foundation

class BallJudgment : Judgment {
    func gameCount(inputNumbers1: [Int], inputNumbers2: [Int]) -> Int {
        return inputNumbers1.filter { num in
            inputNumbers2.contains(num) && num != inputNumbers2[inputNumbers1.firstIndex(of: num)!]
        }.count
    }
}
