package exam01;

public class Ex04 {
    public static void main(String[] args) throws ClassNotFoundException{
        Class cls = Class.forName("exam01.Person"); // 처음부터가 아닌 동적인 과정에서 실행
        // cls 클래스 정보가 담겨있는 객체
        System.out.println(cls);
    }
}
