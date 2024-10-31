package exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Ex04 {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("항목1");
        items.add("항목2");
        items.add("항목3");
        items.add("항목4");
        items.add("항목5");

        ListIterator<String> iter = items.listIterator(); // List 특징이 있는 반복자 패턴
        System.out.println("==========순방향==========");
        while (iter.hasNext()) { // 다음 요소 체크
            String item = iter.next();
            System.out.println(item);
        }

        System.out.println("==========역방향==========");
        while (iter.hasPrevious()) { // 이전 요소 체크
            String item = iter.previous();
            System.out.println(item);
        }
    }
}
