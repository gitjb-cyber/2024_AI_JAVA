package exam05;

import java.util.HashSet;
import java.util.Set;

public class Ex06 {
    public static void main(String[] args) {
        Set<Customer> items = new HashSet<>(); // 동등성 비교 제거
        items.add(new Customer(1000, "고오객","user01@test.org"));
        items.add(new Customer(1000, "고오객","user01@test.org"));
        items.add(new Customer(1000, "고오객","user01@test.org"));
        items.add(new Customer(2000, "고옥액","user02@test.org"));
        items.add(new Customer(3000, "고오액","user03@test.org"));

        for (Customer item : items) {
            System.out.println(item);
        }
    }
}
