package exam01;

public class Ex01 {
    public static void main(String[] args) {
        /*int num1 = 10; // main 함수의 지역 변수
        int num2 = 20;
        int result = add(num1, num2);
        System.out.println(result);
        */
        int result1 = add(10, 20);
        System.out.println(result1);

        int result2 = add(10, 20, 30);
        System.out.println(result2);
    }
    static int add(int num1, int num2) { // 매개변수 num1, num2 정의, 함수 : 실행 코드
        // add 함수의 지역변수
        int result = num1 + num2;
        return result;
    }
    static int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}
