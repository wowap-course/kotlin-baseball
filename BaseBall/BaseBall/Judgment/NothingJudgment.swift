//
//  NothingJudgment.swift
//  BaseBall
//
//  Created by KimMinSeok on 4/8/24.
//

import Foundation

class NothingJudgment : Judgment{
    func gameCount(userNumber: [Int], computerNumber: [Int]) -> Int {
        return userNumber.filter { num in
            computerNumber.contains(num)
        }.isEmpty ? 1 : 0
    }
}
