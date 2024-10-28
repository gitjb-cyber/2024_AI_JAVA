package exam01;

import java.util.function.ToIntFunction;

public class Ex01 {
    public static void main(String[] args) {
        ToIntFunction<String> func1 = s -> s.length(); // 문자열이 들어오면 문자열 길이를 정수로 반환
    }
}
