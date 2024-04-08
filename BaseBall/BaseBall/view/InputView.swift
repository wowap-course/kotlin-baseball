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
        print("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.")
        return Int(readLine()!)!
    }
}
