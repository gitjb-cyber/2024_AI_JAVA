package exam04;

public class Ex01 {
    public static void main(String[] args) {
        Transportation trans = Transportation.BUS;


        switch (trans) {
            // case : Transportation.BUS
            case BUS :
                System.out.println("버스!");
                break;
            case SUBWAY :
                System.out.println("지하철!");
                break;
            case TAXI:
                System.out.println("택시!");
                break; // 마지막 구간 break 생략 가능
        }
    }
}
