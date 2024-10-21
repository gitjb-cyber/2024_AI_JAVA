package exam01;

import static exam01.Transportation.*; // Transportation 에 정의된 정적 자원 import

public class Ex01 {
    public static void main(String[] args) {
        System.out.printf("SUBWAY.name() : %s, SUBWAY.ordinal() : %d%n", SUBWAY.name(), SUBWAY.ordinal());
        // Transportation.SUBWAY.name(), Transportation.SUBWAY.ordinal()
        System.out.printf("BUS.name() : %s, BUS.ordinal() : %d%n", BUS.name(), BUS.ordinal());
        System.out.printf("TAXI.name() : %s, TAXI.ordinal() : %d%n", TAXI.name(), TAXI.ordinal());
    }
}
