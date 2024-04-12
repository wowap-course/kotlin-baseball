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
    
    func nowScorePrint(ball: Int, strike: Int){
        if ball == 0 && strike == 0 {
            print("낫씽")
            return
        }
        
        var output = ""
        if ball > 0 {
            output += "\(ball)볼 "
        }
        if strike > 0 {
            output += "\(strike )스트라이크"
        }
            
        print(output)
    }
    
    func resultGamePrint(){
        print("3개의 숫자를 모두 맞히셨습니다! 게임 종료")
    }
    
    func endGamePrint(){
        print("전체 게임이 종료되었습니다!!")
    }
    
    func errorInputPrint(){
        print("올바른 숫자 양식이 아닙니다!")
    }
}
