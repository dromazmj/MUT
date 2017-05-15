package benmatt.myuniversitytutor;

/**
 * Created by mattdromazos on 4/4/17.
 */

public class User {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String university;
    private String major;

    public User()
    {

    }

    public User(String username, String password, String firstName, String lastName,
        String university, String major)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.university = university;
    }
}
