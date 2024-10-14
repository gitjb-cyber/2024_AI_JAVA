package exam01;

public class Ex04 {
    public static void main(String[] args) {
        try {
            String str = "null"; // NullPointerException
            System.out.println(str.toUpperCase());

            int num1 = 10;
            int num2 = 0;
            int result = num1 / num2; // ArithmeticException 에러 건너뜀
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) { // 예외가 발생하는데 뭔지 모르겠다
            System.out.println(e.getMessage());
        }
    }
}
