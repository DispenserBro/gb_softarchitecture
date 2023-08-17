package Homework2.ChainOfResponsibility.Middlewares;

import Homework2.ChainOfResponsibility.Server.Server;

public class CheckUserMiddleware extends Middleware {
    private Server server;

    public CheckUserMiddleware(Server server) {
        this.server = server;
    }

    public boolean check(String username, String password) {
        if (!server.hasUser(username)) {
            System.out.println("This user is not registered!");
            return false;
        }
        if (!server.isValidPassword(username, password)) {
            System.out.println("Wrong password!");
            return false;
        }
        return checkNext(username, password);
    }
}
