//
//  StrikeJudgment.swift
//  BaseBall
//
//  Created by KimMinSeok on 4/8/24.
//

import Foundation

class StrikeJudgment : Judgment{
    func gameCount(userNumber: [Int], computerNumber: [Int]) -> Int {
        return userNumber.enumerated().filter { $0.element == computerNumber[$0.offset] }.count
    }
}
