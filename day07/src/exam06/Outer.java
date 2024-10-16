package exam06;

public class Outer {

    int num1 = 10;
    static int num2 = 20;
    static void staticMethod() {}
    void method() {}

    // 정적 내부 클래스
    static class Inner {
        void innerMethod(){
            /* 외부 클래스의 인스턴스 변수, 인스턴스 메서드 접근 불가
            num1 = 20;
            method();
            */
            num2 = 30; // 정적 변수 접근 가능
            staticMethod(); // 정적 메서드 접근 가능
        }
    }
}
