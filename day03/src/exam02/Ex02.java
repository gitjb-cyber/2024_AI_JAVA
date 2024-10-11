package exam02;

public class Ex02 {
    public static void main(String[] args) {
        int[] nums = new int[4]; // int 자료형 변수 4개 생성 + 시작 지점 주소 1개
        System.out.println(nums); // 배열 시작 지점 주소

        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 30;
        nums[3] = 40;

        for (int i = 0; i < 4; i++) {
            System.out.println(nums[i]);
        }
    }
}
