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
    var number : [Int] = []
    init(number: [Int]) throws {
        self.number = number
        
        guard hasduplication(number: number), hasZeroNumber(number: number) else {
             throw BallCountError.IllegalArgumentException
        }

    }
    
    private func hasduplication(number: [Int]) -> Bool {
        let uniqueNumber = Set(number)
        return uniqueNumber.count == BALL_LENGTH
    }
    
    private func hasZeroNumber(number : [Int]) -> Bool{
        return !number.contains(INCLUDE_ZERO)
    }
    
    private let BALL_LENGTH = 3
    private let INCLUDE_ZERO = 0
    
}
