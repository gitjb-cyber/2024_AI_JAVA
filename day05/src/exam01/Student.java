package exam01;

public class Student {
    static int id; // 학번 여러개를 쓰는건 지양
    String name; // 학생명
    String major; // 전공


    public Student() {}

    void showInfo() {
        System.out.printf("id = %d, name = %s, major = %s%n", id, name, major);
    }

    static void staticMethod() {
        System.out.println("정적 메서드!");
        // this.name = "김이박"; 사용 불가
        id = 1000; // 정적 변수 사용 가능
        staticMethod2();
    }

    static void staticMethod2() {

    }

}
