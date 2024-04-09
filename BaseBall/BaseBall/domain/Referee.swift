//
//  Referee.swift
//  BaseBall
//
//  Created by KimMinSeok on 4/8/24.
//

import Foundation

class Referee{
    func ballCount(inputNumbers1: [Int], inputNumbers2: [Int]) -> Int {
        return inputNumbers1.filter { num in
            inputNumbers2.contains(num) && num != inputNumbers2[inputNumbers1.firstIndex(of: num)!]
        }.count
    }
    
    func strikeCount(inputNumbers1: [Int], inputNumbers2: [Int]) -> Int {
        return inputNumbers1.enumerated().filter { $0.element == inputNumbers2[$0.offset] }.count
    }
}
