package Homework2.ChainOfResponsibility.Middlewares;

public class CheckRoleMiddleware extends Middleware {
    public boolean check(String username, String password) {
        if (username.equals("admin")) {
            System.out.println("Hello, admin!");
            return true;
        }
        System.out.println("Hello, user!");
        return checkNext(username, password);
    }
}
