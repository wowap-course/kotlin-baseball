//
//  Opponent.swift
//  BaseBall
//
//  Created by KimMinSeok on 4/4/24.
//

import Foundation

class Opponent{
    var numbers : [Int]
    
    init(numberGenerator : NumberGenerator){
        self.numbers = numberGenerator.getNumbers()
    }
    
}
