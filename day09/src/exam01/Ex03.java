package exam01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

// 스터디
public class Ex03 {
    public static void main(String[] args) throws Exception { // 오류 전가
        Class<Person> cls = Person.class;
        // 범용적 정보 확인

        Constructor con = cls.getDeclaredConstructor();// 기본 생성자 정보 호출
        Object obj = con.newInstance(); // 따로 형변환 X obj 배열


        Method m1 = cls.getDeclaredMethod("setAge", int.class); // setAge 메서드 호출
        Object r1 = m1.invoke(obj, 20); // 반환값X -> null, 호출은 가능
        System.out.println(r1);

        Method m2 = cls.getDeclaredMethod("getAge");
        Object r2 = m2.invoke(obj);
        int age = (int)r2;
        System.out.println(age);
        System.out.println(obj);
    }
}
