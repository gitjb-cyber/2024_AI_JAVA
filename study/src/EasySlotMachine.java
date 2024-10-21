// 하 난이도 슬롯머신 (2배 배당)
public class EasySlotMachine extends AbstractSlotMachine {
    public EasySlotMachine() {
        super(new String[]{"🍒", "🍉", "❤"}); // 상위 클래스 기본 생성자에 이모지 3개 배열
    }

    @Override
    public void play(int bet) { // Interface play 함수 재정의
        String[] result = {getRandomSymbol(), getRandomSymbol(), getRandomSymbol()}; // 랜덤 심볼함수
        System.out.println("결과: " + String.join(" | ", result)); // 배열값을 문자로 변환

        if (isWinning(result)) { // 승리 조건에 만족했을 때
            System.out.println("승리! " + (bet * 2) + " 코인을 획득했습니다.");
            COINS += bet * 2;
        } else {
            System.out.println("패배했습니다.");
        }
    }
}