package study.spring.looseCoupling;

public class Main {
    public static void main(String[] args) {
        UserDataProvider databaseProvider = new UserDatabaseProvider();
        UserManager userManagerWithDB = new UserManager(databaseProvider);

        UserDataProvider webServiceProvider = new WebServiceDataProvider();
        UserManager userManagerWithWebService = new UserManager(webServiceProvider);

        System.out.println(userManagerWithDB.getUserInfo());
        System.out.println(userManagerWithWebService.getUserInfo());
    }
}
