package exam01;

public class B extends A { // A 클래스 상속
    int numB = 20;
    public B() {
        super(); // 입력하지 않아도 컴파일러가 자동 추가 - A()
        System.out.println("B 생성자");
    }
}