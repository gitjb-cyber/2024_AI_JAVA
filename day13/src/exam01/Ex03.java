package exam01;

import java.util.function.Function;

public class Ex03 {
    public static void main(String[] args) {
        // 항등 함수, 매개변수로 투입된 값을 반환값 그대로 반환
        Function<String, String> func1 = s -> s;
        Function<String, String> func2 = Function.identity(); // s -> s
    }
}
