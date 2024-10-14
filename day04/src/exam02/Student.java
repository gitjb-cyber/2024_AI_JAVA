package exam02;

// exam02.Student : 전체 클래스명
public class Student {
    // 인스턴스 변수
    int id; // 학번
    String name; // 학생명
    String major; // 전공과목

    /*
    * 따로 정의하지 않으면 기본 생성되는 생성자
    * 없으면 자동으로 컴파일러가 추가 - 디폴트 생성자
    * */
    public Student() {
        // 객체 생성 이후 실행
        // 객체의 변수의 초기화
        id = 1000;
        name = "김이박";
        major = "영어";
    } // 함수 정의 - 객체를 생성하는 기능

    public Student(int _id, String _name, String _major) {
        id = _id;
        name = _name;
        major = _major;
    } // 생성자 오버로딩

    void showInfo() {
        System.out.printf("id = %d, name = %s, major = %s%n", id, name, major);
    }
}
