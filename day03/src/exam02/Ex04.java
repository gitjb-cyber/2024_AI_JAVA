package exam02;

public class Ex04 {
    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4}; // 선언과 동시에 초기화
        int[] nums1 = {11, 22, 33, 44}; // 축약 가능
        int[] nums2;
        nums2 = new int[] {10, 20, 30, 40};

        int[] nums3 = {10, 20, 30, 40, 50, 60, 70};
        System.out.printf("lenth = %d%n", nums3.length);

        for (int i = 0; i < nums3.length; i++) { // (i <= 변수명.length - 1) -> (i < 변수명.length) : 관례
            System.out.println(nums3[i]);
        }

        for (int num : nums) { // 향상된 for 문 : 배열 처음부터 끝까지
            System.out.println(num);
        }

    }
}