package Study;

// 슬릇머신 3칸(추상 메서드와 interface 사용)
// 난이도 설정(상, 중, 하)
// 상 : 3 * 10 배당 10배
// 중 : 3 * 5 배당 5배
// 하 : 3 * 3 배당 2배
// 설정 순서 : 1. 배팅 할 코인 수 : coin
//           2. 게임 난이도 설정 : lv
//           3. 슬릇 (이모지) 랜덤 돌리기 : coin, lv
//           4. 결과 배당, 남은 코인 : coin
//           5. 재시작 의사 -> 코인이 0일 때 자동 종료 : coin

public interface SlotMachine {
    void spin();
    void displayResult();
    int getPayout();
}
