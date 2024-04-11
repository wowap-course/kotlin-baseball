//
//  RandomNumberGenerator.swift
//  BaseBall
//
//  Created by KimMinSeok on 4/4/24.
//

import Foundation

class RandomNumberGenerator : NumberGenerator{
    
    lazy var nums = Array(MIN_RANDOM_NUM...MAX_RANDOM_NUM)
    
    func getNumbers() -> [Int] {
        nums.shuffle()
        return Array(nums.prefix(RANDOM_NUM_LENGTH))
    }
    
    private let MIN_RANDOM_NUM = 1
    private let MAX_RANDOM_NUM = 9
    private let RANDOM_NUM_LENGTH = 3
    
}
