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
    var number : Int = 0
    init(number: Int) throws {
        self.number = number
        
        guard hasduplication(number: number), hasZeroNumber(number: number) else {
             throw BallCountError.IllegalArgumentException
        }

    }
    
    private func hasduplication(number: Int) -> Bool {
        var test = Set<Character>()
        for i in String(number){
            test.insert(i)
        }
        print(test)
        return test.count == BALL_LENGTH
    }
    
    private func hasZeroNumber(number : Int) -> Bool{
        return !String(number).contains(INCLUDE_ZERO)
    }
    
    private let BALL_LENGTH = 3
    private let INCLUDE_ZERO = "0"
    
}
