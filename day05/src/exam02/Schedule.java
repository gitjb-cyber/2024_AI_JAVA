package exam02;

public class Schedule {
    private int year, month, day;

    public void setYear(int _year) {
        year = _year; // year(힙), _year(스택)
    }

    public int getYear() { // 값을 불러오는 getter
        return year;
    }

    public void setMonth(int _month) {
        month = _month;
    }

    public int getMonth() {
        return month;
    }

    public void setDay(int _day) {
        if (month == 2 && _day > 28) { // 통제 가능
            _day = 28;
        }
        day = _day;
    }

    public int getDay() {
        return day;
    }

    void showDate() { // default 접근 제어자
        System.out.printf("%d년 %d월 %d일%n", year, month,day);
    }
}
