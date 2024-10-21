package exam03;

public class Ex02 {
    public static void main(String[] args) {
        Box appleBox = new Box();
        appleBox.setItem(new Grape()); // 사과만 담으려는 박으인데 포도도 담길 수 있음

        // Apple apple = (Apple)appleBox.getItem();
        Object _apple = appleBox.getItem(); // 타입 안정성이 떨어진다
        if (_apple instanceof Apple) {
            Apple apple = (Apple)_apple;
        }
    }
}
