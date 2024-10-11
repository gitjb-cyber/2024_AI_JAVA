package exam02;

public class Ex01 {
    public static void main(String[] args) {
        int num = 10;
        if (num == 10) { // 조건식이 참일 때 실행
            System.out.println("10입니다.");
        } else {
            System.out.println("10이 아닙니다.");
        }

        // 간단한 조건식은 삼항조건 연산자로 대체
        String result = num == 10 ? "10입니다." : "10이 아닙니다.";
        System.out.println(result);
    }
}
