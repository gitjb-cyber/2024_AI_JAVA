package exam02;

public class Ex03 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(100);
        System.out.println(System.identityHashCode(sb));

        sb.append("ABC");
        System.out.println(System.identityHashCode(sb));

        sb.append("DEF");
        System.out.println(System.identityHashCode(sb));

        sb.append("GHI");
        System.out.println(System.identityHashCode(sb));

        String str = sb.toString(); // 문자열로 변경
        System.out.println(str);
        System.out.println(System.identityHashCode(sb));

        String str2 = "ABCDEFGHI";
        System.out.println("str2 주소 : " + System.identityHashCode(str2));
        // str, str2 주소가 다름
        System.out.printf("str1 == str2 : %s%n", str == str2); // 지양할 것 - 동일성
        System.out.printf("str.equals(str2) : %s%n", str.equals(str2) ); // 동등성
    }
}
