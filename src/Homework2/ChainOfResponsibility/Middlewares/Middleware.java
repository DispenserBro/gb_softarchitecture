package Homework2.ChainOfResponsibility.Middlewares;

public abstract class Middleware {
    private Middleware next;

    public static Middleware link(Middleware first, Middleware... chain) {
        Middleware head = first;
        for (Middleware nextInChain: chain) {
            head.next = nextInChain;
            head = nextInChain;
        }
        return first;
    }

    public abstract boolean check(String username, String password);


    protected boolean checkNext(String username, String password) {
        if (next == null) {
            return true;
        }
        return next.check(username, password);
    }
}