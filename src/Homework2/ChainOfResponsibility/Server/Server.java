package Homework2.ChainOfResponsibility.Server;

import Homework2.ChainOfResponsibility.Middlewares.Middleware;

import java.util.HashMap;
import java.util.Map;

public class Server {
    private Map<String, String> users = new HashMap<>();
    private Middleware middleware;

    public void setMiddleware(Middleware middleware) {
        this.middleware = middleware;
    }

    public boolean logIn(String username, String password) {
        if (middleware.check(username, password)) {
            System.out.println("Authorization have been successful!");
            return true;
        }
        return false;
    }

    public void register(String username, String password) {
        users.put(username, password);
    }

    public boolean hasUser(String username) {
        return users.containsKey(username);
    }

    public boolean isValidPassword(String username, String password) {
        return users.get(username).equals(password);
    }
}
