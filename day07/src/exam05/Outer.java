package exam05;

public class Outer { // 외부 클래스

    int num1 = 10;

    class Inner { // 인스턴스 내부 클래스
        static int num; // JDK 15 버전 밑으로 오류 발생
                        // 16 부터 가능
        int num1 = 20;
        void method() {
            System.out.println(num1);
            // Inner 쪽에 있으면 Inner 에 있는 변수를 사용
            // 없으면 Outer 쪽에 있는 변수 사용
            System.out.println(Outer.this.num1); // Outer 의 num1
        }
    }
}
