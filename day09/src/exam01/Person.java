package exam01;

public class Person {
    private int age;
    private String name;

    public Person() {} // 기본 생성자

    public Person(int age, String name) { // 생성자 초기화
        this.age = age;
        this.name = name;
    }

    // get, set
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // toString
    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
