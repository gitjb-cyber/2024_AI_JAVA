package exam01;

public class Ex04 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = num1++; // 대입(=) 후 증가연산(++)
        int num3 = ++num1; // 증가연산 후 대입
        System.out.println(num2);
        System.out.println(num1);
        double num4 = 10.5;
        num4++;
        System.out.println(num4);
    }
}
