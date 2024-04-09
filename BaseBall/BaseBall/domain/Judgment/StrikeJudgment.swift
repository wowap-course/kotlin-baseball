//
//  StrikeJudgment.swift
//  BaseBall
//
//  Created by KimMinSeok on 4/8/24.
//

import Foundation

class StrikeJudgment : Judgment{
    func gameCount(inputNumbers1: [Int], inputNumbers2: [Int]) -> Int {
        return inputNumbers1.enumerated().filter { $0.element == inputNumbers2[$0.offset] }.count
    }
}
