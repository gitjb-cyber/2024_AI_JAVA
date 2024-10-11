package exam02;

public class Ex09 {
    public static void main(String[] args) {
        int[][] nums = new int[][]{
                {10, 20, 30},
                {40, 50, 60}
        };

        int [][] nums1 = {{10, 20, 30}, {40, 50, 60}};

        System.out.printf("nums.length = %d%n", nums.length);
        System.out.printf("nums[0].length = %d%n", nums[0].length);
        System.out.printf("nums[1].length = %d%n", nums[1].length);

        int[] nums2 = nums[0];
        nums2[1] = 22; // nums 0행 1열의 내용 변경

        System.out.println(nums2 == nums[0]); // true

        for (int i = 0; i < nums.length; i++) { // 0행 1행
            for (int j = 0; j < nums[i].length; j++) { // 0열 1열 2열
                System.out.printf("%d행 %d열 = %d%n", i, j, nums[i][j]);
            }
        }
    }
}
