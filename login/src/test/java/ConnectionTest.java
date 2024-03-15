import org.example.login.dao.LoginDAO;

public class ConnectionTest {
    public static void main(String[] args) {
        final LoginDAO dao = new LoginDAO();
        System.out.println(dao.checkUserExistence("Albert", "123"));
        System.out.println(dao.checkUserExistence("Albert", "1234"));
    }
}
