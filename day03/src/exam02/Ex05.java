package exam02;

public class Ex05 {
    public static void main(String[] args) {
        int [] nums1 = {10, 20, 30, 40};
        int [] nums2 = nums1; // nums1 의 주소값을 복사
        int [] nums3 = {0, 1, 2, 3};
        System.out.println(nums1);
        System.out.println(nums2);
        System.out.println(nums3);
        nums2[1] = 22;
        System.out.println(nums1[1]);
    }
}
