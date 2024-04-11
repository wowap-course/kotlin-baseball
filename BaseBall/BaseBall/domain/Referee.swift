//
//  Referee.swift
//  BaseBall
//
//  Created by KimMinSeok on 4/8/24.
//

import Foundation

class Referee{
    
    func gameResultCount(inputNumbers1: [Int], inputNumbers2: [Int]) -> Score{
        return Score(ball: ballCount(inputNumbers1: inputNumbers1, inputNumbers2: inputNumbers2), strike: strikeCount(inputNumbers1: inputNumbers1, inputNumbers2: inputNumbers2))
    }
    
    func ballCount(inputNumbers1: [Int], inputNumbers2: [Int]) -> Int {
        return inputNumbers1.filter { num in
            inputNumbers2.contains(num) && num != inputNumbers2[inputNumbers1.firstIndex(of: num)!]
        }.count
    }
    
    func strikeCount(inputNumbers1: [Int], inputNumbers2: [Int]) -> Int {
        return inputNumbers1.enumerated().filter { $0.element == inputNumbers2[$0.offset] }.count
    }
}
