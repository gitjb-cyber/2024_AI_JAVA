package exam02;

public class Human extends Animal {
    @Override
    public void move() {
        System.out.println("두 발로 직립보행");
    }

    public void reading() {
        System.out.println("독서한다.");
    }
    /*
    @Override // 메서드 재정의
    public void move() { // 메서드 오버라이드
        // super.move(); // Animal 의 move();
        System.out.println("두 발로 직립보행 ");
    }*/

}
