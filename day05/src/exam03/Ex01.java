package exam03;

public class Ex01 {
    public static void main(String[] args) {
        A a = new A();
        a.num1 = 10; // 클래스 외부
        a.num2 = 20; // 클래스 외부

        a.method(); // 인스턴스 메서드 : 객체가 되었을 때 사용할 수 있는 함수

    }
}
