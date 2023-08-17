package Homework2.ChainOfResponsibility;

import Homework2.ChainOfResponsibility.Middlewares.*;
import Homework2.ChainOfResponsibility.Server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static Server server;
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    private static void init() {
        server = new Server();
        server.register("admin", "12");
        server.register("user", "123");

        // Проверки связаны в одну цепь. Клиент может строить различные цепи,
        // используя одни и те же компоненты.
        Middleware middleware = Middleware.link(
                new CheckUserMiddleware(server),
                new CheckRoleMiddleware()
        );

        // Сервер получает цепочку от клиентского кода.
        server.setMiddleware(middleware);
    }
    public static void main(String[] args) {
        init();

        boolean success = false;

        while(!success) {
            try {
                System.out.print("Enter username: ");
                String username = reader.readLine();
                System.out.print("Enter password: ");
                String password = reader.readLine();
                success = server.logIn(username, password);
            } catch (IOException e) {
                System.out.println("Invalid data!");
            }
        }
    }
}
