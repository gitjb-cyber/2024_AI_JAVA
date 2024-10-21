package study;

// 상 난이도 슬롯머신 (10배 배당)
class HardSlotMachine extends AbstractSlotMachine {
    public HardSlotMachine() {
        super(new String[]{"🍒", "🍉", "❤", "🍷", "🍏", "🍐", "🍑", "🍓", "🍖", "7"});
    }

    @Override
    public void play(int bet) {
        String[] result = {getRandomSymbol(), getRandomSymbol(), getRandomSymbol()};
        System.out.println("결과: " + String.join(" | ", result));

        if (isWinning(result)) {
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