package exam02;

public class Ex02 {
    public static void main(String[] args) {
        String str = "ABC";
        System.out.println(System.identityHashCode(str));

        str += "DEF";
        System.out.println(System.identityHashCode(str));

        str += "GHI";
        System.out.println(System.identityHashCode(str));
        // 문자가 결합할 때 마다 새로운 객체로 생성
        System.out.println(str);


    }
}
