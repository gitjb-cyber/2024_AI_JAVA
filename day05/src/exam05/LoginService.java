package exam05;

public class LoginService {

    private static LoginService instance;

    private LoginService() {}

    public static LoginService getInstance() { // 인스턴스 메서드
        if (instance == null) {
            instance = new LoginService();
        }
        return instance;
    }
    public void login(String userId, String password) {

    }
}
