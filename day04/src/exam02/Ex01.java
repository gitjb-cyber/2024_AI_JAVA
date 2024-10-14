package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Student s1 = new Student(); //  Student s1 : 참조 자료형
        s1.id = 1000;         // s1 : 참조 변수(힙 영역 주소값)
        s1.name = "이이름";    // s1 : 지역변수 스택 영역에서 메모리 할당
        s1.major = "영어";
        s1.showInfo();

        System.out.println("s1 : "+ System.identityHashCode(s1)); // s1 가상주소

        s1 = null; // 값이 없는 상태 - 주소 연결 끊김

        Student s2 = new Student();
        s2.id = 1001;
        s2.name = "김이름";
        s2.major = "수학";
        s2.showInfo();

        System.out.println("s2 : "+ System.identityHashCode(s2)); // s2 가상주소

        Student s3 = s2;
        s3.name = "(수정)";
        s3.showInfo();
        s2.showInfo(); // 같은 주소를 쓰기 때문에 s3에서 바꾸면 s2도 바뀜
        System.out.println("s2, s3 주소 비교 : " + (s2 == s3));
        System.out.println("s1, s2 주소 비교 : " + (s1 == s2));
    }
}
