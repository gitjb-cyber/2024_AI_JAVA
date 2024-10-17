package Study;

public class EasySlotMachine extends GameSet{
    public EasySlotMachine(int betAmount) {
        super(betAmount, 3); // 난이도 3
    }

    @Override
    public int getPayout() {
        return betAmount * 2; // 2배 보상
    }
}
