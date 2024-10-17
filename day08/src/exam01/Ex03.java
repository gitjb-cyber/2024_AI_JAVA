package exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex03 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("b.txt");
            fis.close();
            System.out.println("자원 해제!");
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            // 예외가 있던 없던 항상 처리하는 자원 해제
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
            System.out.println("자원 해제!");
        }
    }
}
