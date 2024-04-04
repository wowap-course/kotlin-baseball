//
//  Opponent.swift
//  BaseBall
//
//  Created by KimMinSeok on 4/4/24.
//

import Foundation

class Opponent{
    var number : [Int]
    
    init(numberGenerator : NumberGenerator){
        self.number = numberGenerator.getNumber()
    }
    
}
