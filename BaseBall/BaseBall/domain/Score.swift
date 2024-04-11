//
//  File.swift
//  BaseBall
//
//  Created by KimMinSeok on 4/12/24.
//

import Foundation

struct Score {
    var strike : Int
    var ball : Int
    
    init(ball: Int, strike: Int) {
        self.strike = strike
        self.ball = ball
    }
}
