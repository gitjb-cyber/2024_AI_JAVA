package study;

// 하 난이도 슬롯머신 (2배 배당)
public class EasySlotMachine extends AbstractSlotMachine {
    public EasySlotMachine() {
        super(new String[]{"🍒", "🍉", "❤"});
    }

    @Override
    public void play(int bet) {
        String[] result = {getRandomSymbol(), getRandomSymbol(), getRandomSymbol()};
        System.out.println("결과: " + String.join(" | ", result));

        if (isWinning(result)) {
            System.out.println("승리! " + (bet * 2) + " 코인을 획득했습니다.");
            COINS += bet * 2;
        } else {
            System.out.println("패배했습니다.");
        }
    }
}