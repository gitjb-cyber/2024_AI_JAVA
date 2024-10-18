package exam03;

public class Ex04 {
    public static void main(String[] args) {
        // Integer : 객체(기본자료형 X)
        Integer num1 = 100; // 오토박싱
        Integer num2 = 200; // 오토박싱
        Integer num3 = num1 + num2; // 언박싱 + 오토박싱
        // num1.intValue() + num2.intValue() = int형 / -> 다시 Integer로 오토박싱
        System.out.println(num3);
    }
}
