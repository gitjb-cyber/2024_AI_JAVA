package exam04;
/*
구구단을 홀수 단만 출력하도록 프로그램을 만드시오. 구현 소스
 */
public class Ex04 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (i % 2 == 1){
                    System.out.println(i + " * " + j + " = " + i * j);
                }
            }
        }
    }
}