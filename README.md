# kotlin-baseball
: 1부터 9까지 서로 다른 수로 이뤄진 3자리 수를 맞추는 게임

## 기능 요구 사항
- [] 상대방(컴퓨터)은 1~9까지 서로 다른 임의의 수 3개를 선택한다.
- [] 게임 플레이어는 컴퓨터가 생각하고 있는 숫자 3개를 입력한다.
- [] 상대방(컴퓨터)은 입력된 숫자에 대한 결과를 출력한다.
- [] 같은 수가 같은 자리에 있으면 스트라이크, 다른 자리에 있으면 볼, 같은 수가 전혀 없으면 낫싱

## 조건
- 컴퓨터가 선택한 3개의 숫자를 모두 맞히면 게임이 종료된다.
- 게임을 종료한 후 게임을 다시 시작하거나 완전히 종료할 수 있다.
- 사용자가 잘못된 값을 입력할 경우 IllegalArgumentException를 발생시키고, [ERROR]로 시작하는 에러 메시지를 출력 후 그 부분부터 입력을 다시 받는다.