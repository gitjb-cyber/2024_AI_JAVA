package exam01;

import java.lang.reflect.Constructor;

// 스터디
public class Ex02 {
    public static void main(String[] args) throws Exception { // 오류 전가 -> 설정하려면 try~catch
        Class<Person> cls = Person.class; // 클래스 Person 클래스 호출
        Constructor defaultCon = cls.getDeclaredConstructor();
        // 오류 : 생성자가 정의 안되어 있을 수도 있어서

        // 기본 생성자 생성
        Person p1 = (Person)defaultCon.newInstance();
        // newInstance()은 기본 타입:Object
        // (Person)추가하여 Person 객체 타입으로 형변환
        System.out.println(p1);

        // 매개변수가 있는 생성자로 객체 생성
        Constructor paramCon = cls.getDeclaredConstructor(int.class, String.class); // Person의 매개변수 추가(age, name)
        Person p2 = (Person)paramCon.newInstance(20, "김이박");
        // Object... 여기 올 매개변수의 종류가 뭔지 몰라 다 넣음
        // (Person)추가하여 Person 객체 타입으로 형변환
        System.out.println(p2);

        Object[] params = {30, "박김"};
        Person p3 = (Person)paramCon.newInstance(params); // 실제 매개변수는 배열을 자주 쓴다
        System.out.println(p3);
    }
}
