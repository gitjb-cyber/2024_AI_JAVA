package exam01;

public class Ex02 {
    public static void main(String[] args) {
        Calculator cal = new Calculator() {
            @Override
            public int add(int num1, int num2) {
                return num1 + num2;
            }
        };
        // 위 함수와 같음
        Calculator cal2 = (x, y) -> x + y;

    }
}
