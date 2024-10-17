package Study;

public class MediumSlotMachine extends GameSet{
    public MediumSlotMachine(int betAmount) {
        super(betAmount, 5); // 난이도 5
    }

    @Override
    public int getPayout() {
        return betAmount * 5; // 5배 보상
    }
}
