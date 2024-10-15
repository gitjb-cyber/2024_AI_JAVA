package member;

public class Member extends MemberVip{
    private String id;
    private String name;
    private int point;

    public Member (){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public Member(String id, String name, int point) {
        this.id = id;
        this.name = name;
        this.point = point;
    }

    @Override
    public void MemberVip() {
        System.out.println("회원님의 정보를 호출합니다.");
        System.out.printf("id : %s , 이름 : %s , 잔여 포인트 : %d%n", id, name, point);
    }
}
