package exam01;

public class C extends B {
    int numC = 30;
    public C() {
        super(); // 입력하지 않아도 컴파일러가 자동 추가 - B()
        System.out.println("C 생성자");
    }
}
