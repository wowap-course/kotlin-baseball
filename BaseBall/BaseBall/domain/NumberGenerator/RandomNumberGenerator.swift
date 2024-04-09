//
//  RandomNumberGenerator.swift
//  BaseBall
//
//  Created by KimMinSeok on 4/4/24.
//

import Foundation

class RandomNumberGenerator : NumberGenerator{
    var nums = Array(1...9)
    
    func getNumbers() -> [Int] {
        nums.shuffle()
        return Array(nums[0...2])
    }
}
