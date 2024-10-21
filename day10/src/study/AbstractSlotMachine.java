package study;

import java.util.Random;
// 슬롯머신 추상 클래스
public abstract class AbstractSlotMachine implements SlotMachine {
    protected String[] symbols; // 같은 패키지에서만 접근 가능한 변수 선언
    protected Random random = new Random();
    protected static int COINS = 0;


    public AbstractSlotMachine(String[] symbols) {
        this.symbols = symbols;
    }

    protected String getRandomSymbol() {
        int idx = random.nextInt(symbols.length);
        return symbols[idx];
    }

    protected boolean isWinning(String[] result) {
        return result[0].equals(result[1]) && result[1].equals(result[2]);
    }

    public abstract void play(int bet);
}