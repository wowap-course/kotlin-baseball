//
//  BallCount.swift
//  BaseBall
//
//  Created by KimMinSeok on 4/8/24.
//
enum BallCountError: Error {
    case IllegalArgumentException
}

import Foundation

class UserBall{
    private(set) var numbers : [Int] = []
    init(numbers: [Int]) throws {
        self.numbers = numbers
        
        guard hasduplication(numbers: numbers), hasZeroNumber(numbers: numbers) else {
             throw BallCountError.IllegalArgumentException
        }

    }
    
    private func hasduplication(numbers: [Int]) -> Bool {
        let uniqueNumbers = Set(numbers)
        return uniqueNumbers.count == BALL_LENGTH
    }
    
    private func hasZeroNumber(numbers : [Int]) -> Bool{
        return !numbers.contains(INCLUDE_ZERO)
    }
    
    private let BALL_LENGTH = 3
    private let INCLUDE_ZERO = 0
    
}
