package Study;

public class HardSlotMachine extends GameSet{
    public HardSlotMachine(int betAmount) {
        super(betAmount, 10); // 난이도 10
    }

    @Override
    public int getPayout() {
        return betAmount * 10; // 10배 보상
    }
}
