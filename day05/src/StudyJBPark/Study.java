package StudyJBPark;

public class Study {
    public static void main(String[] args) {
        // 10개의 정수 배열 그 수들 중 짝수의 개수가 몇개인지 출력하는 프로그램
        // 홀수일 때 홀수값을 합산
        int[] numbers = {2, 3, 34, 56, 25, 256, 15, 353, 14, 7};
        int count = 0;
        int oddNumbers = 0;
        for (int i = 0; i < 10; i++) {
            if (numbers[i] % 2 == 0) {
                ++count;
            }else {
                oddNumbers +=numbers[i];
            }
        }
        System.out.println("짝수 갯수: " + count);
        System.out.println("홀수 합산: " + oddNumbers);
    }
}