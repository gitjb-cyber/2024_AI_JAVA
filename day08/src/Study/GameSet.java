package Study;

import java.util.Random;

public abstract class GameSet implements SlotMachine{
    protected int betAmount;
    protected int[] result;
    protected int difficulty;

    public GameSet(int betAmount, int difficulty) {
        this.betAmount = betAmount;
        this.difficulty = difficulty;
        this.result = new int[3];
    }

    @Override
    public void spin() {
        Random rand = new Random();
        for (int i = 0; i < 3; i++) {
            result[i] = rand.nextInt(difficulty) + 1; // 1부터 difficulty까지의 난수
        }
    }

    @Override
    public void displayResult() {
        System.out.print("슬롯 결과: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
