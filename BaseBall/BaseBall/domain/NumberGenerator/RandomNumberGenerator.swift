//
//  RandomNumberGenerator.swift
//  BaseBall
//
//  Created by KimMinSeok on 4/4/24.
//

import Foundation

class RandomNumberGenerator : NumberGenerator{
    var num = Array(1...9)
    
    func getNumber() -> [Int] {
        num.shuffle()
        return Array(num[0...2])
    }
}
