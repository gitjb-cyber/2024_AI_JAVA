// 상 난이도 슬롯머신 (10배 배당)
class HardSlotMachine extends AbstractSlotMachine {
    public HardSlotMachine() {
        super(new String[]{"🍒", "🍉", "❤", "🍷", "🍏", "🍐", "🍑", "🍓", "🍖", "7"});
        // 상위 클래스 기본 생성자에 이모지 10개 배열
    }

    @Override
    public void play(int bet) { // Interface play 함수 재정의
        String[] result = {getRandomSymbol(), getRandomSymbol(), getRandomSymbol()}; // 랜덤 심볼함수
        System.out.println("결과: " + String.join(" | ", result)); // 배열값을 문자로 변환

        if (isWinning(result)) { // 승리 조건에 만족했을 때
            if (result[0].equals("7")) {
                System.out.println("대승리! " + (bet * 20) + " 코인을 획득했습니다.");
                COINS += bet * 20;
            } else {
                System.out.println("승리! " + (bet * 10) + " 코인을 획득했습니다.");
                COINS += bet * 10;
            }
        } else {
            System.out.println("패배했습니다.");
        }
    }
}