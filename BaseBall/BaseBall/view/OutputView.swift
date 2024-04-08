//
//  OutputView.swift
//  BaseBall
//
//  Created by KimMinSeok on 4/8/24.
//

import Foundation

class OutputView{
    func startGamePrint(){
        print("숫자 야구를 시작합니다.")
    }
    
    func nowScorePrint(result: [Int]){
        if result.first == 1 {
            print("낫싱")
        } else if result.last == 3 {
            print("3개의 숫자를 모두 맞히셨습니다! 게임 종료")
        } else if result[1] > 0 && result[2] > 0 {
            print("\(result[1])볼 \(result[2])스트라이크")
        } else if result[1] > 0 {
            print("\(result[1])볼")
        } else if result[2] > 0 {
            print("\(result[2])스트라이크")
        }
    }

    func endGamePrint(){
        print("게임이 종료되었습니다!!")
        
    }
}
