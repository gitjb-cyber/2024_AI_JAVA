package exam05;

public class Ex01 {
    public static void main(String[] args) {
        Outer out = new Outer(); // Outer 객체 생성
        Outer.Inner inner = out.new Inner(); // 인스턴스 내부 클래스 생성
        // 정적 메서드, 정적 변수 정의 불가
        System.out.println(Outer.Inner.num);
        inner.method();
    }
}
