//
//  InputView.swift
//  BaseBall
//
//  Created by KimMinSeok on 4/4/24.
//

import Foundation

class InputView {
    func inputNumber() -> [Int]{
        print("숫자를 입력해주세요 : ")
        return readLine()!.compactMap { Int(String($0))}
    }
    
    func restart() -> Int {
        return Int(readLine()!)!
    }
}
