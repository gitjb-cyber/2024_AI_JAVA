package exam01;

public class Ex01 {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            System.out.println("---" + i + "단---");
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d X %d = %d%n", i, j, i * j);
            }
        }
        System.out.println("가"); // 줄개행 X
        System.out.print("나"); // 줄개행 O
    }
}