package study.spring.looseCoupling;

// A - MySQL
// B - Web Service

public class UserDatabaseProvider implements UserDataProvider {
    public String getUserDetails() {
        return "User details from database";
    }
}
