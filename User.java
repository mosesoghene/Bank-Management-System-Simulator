import java.util.ArrayList;

public class User {
    private final String username;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phone;
//    private ArrayList<Account> accounts;

    public User(String username, String firstName, String lastName, String email, String password, String phone) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phone = phone;
    }

    public User(String username, String firstName, String lastName, String password) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }




}
