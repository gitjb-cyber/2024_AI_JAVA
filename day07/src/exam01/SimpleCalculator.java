package exam01;

public class SimpleCalculator extends Calculator{

    public SimpleCalculator() {
        super(); //
    }

    @Override // 메서드 구현(Ctrl + i)
    public int add(int num1, int num2) {
        return num1 + num2;
    }
}
