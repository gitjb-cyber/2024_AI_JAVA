package exam02;

public class Schedule2 {
    private int year, month, day; // 년도, 월, 일

    public Schedule2() {
        this(2024, 10, 14); // this 는 첫줄에만 써야 한다.
        /*year = 2024;
        month = 10;
        day = 14;*/
    } // 초기화

    public Schedule2(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void showInfo() {
        System.out.printf("%d년 %d월 %d일%n", year, month, day);
        // this.year <- 출처가 명확하기에 this 생략

        printThis(); // this.printThis();
    }

    public void printThis() {
        System.out.println(this); //// 객체의 주소값
    }
    public Schedule2 getThis() {
        return this;
    }
}
