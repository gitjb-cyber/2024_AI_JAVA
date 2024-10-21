import java.util.Random;
// 슬롯머신 추상 클래스
public abstract class AbstractSlotMachine implements SlotMachine {
    // 같은 패키지에서만 접근 가능한 변수 선언
    protected String[] symbols; // 각 클래스에서 선언된 이모지 배열
    protected Random random = new Random();
    protected static int COINS = 0;


    public AbstractSlotMachine(String[] symbols) {
        this.symbols = symbols;
    }

    protected String getRandomSymbol() { // 룰렛 함수
        int idx = random.nextInt(symbols.length); // 각 클래스에서 선언된 이모지 배열의 랜덤 값
        return symbols[idx]; // 입력한 심볼을 심볼 갯수 중 랜덤 호출
    }

    protected boolean isWinning(String[] result) { // 이기는 경우의 함수
        return result[0].equals(result[1]) && result[1].equals(result[2]); // 0번째 == 1번째 == 2번째
    }

    public abstract void play(int bet); // 추상메서드 play
}