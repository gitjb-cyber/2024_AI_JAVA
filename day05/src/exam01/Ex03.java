package exam01;

public class Ex03 {
    public static void main(String[] args) {
        Student.id = 1000;

        Class cls = Student.class; // 클래스 로더가 만들어주는 정적 메모리 객체

        Student.staticMethod();
    }
}
