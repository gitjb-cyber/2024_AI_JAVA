package exam01;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {
    public static void main(String[] args) {
        Set<String> items = new HashSet<>(); // 검색 기능
        items.add("이름1");
        items.add("이름1");
        items.add("이름1");
        items.add("이름2");
        items.add("이름3");
        items.add("이름4");
        items.add("이름5");
        System.out.println(items);
    }
}