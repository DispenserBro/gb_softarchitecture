package Homework2.Strategy.Contexts;

import Homework2.Strategy.Strategies.DownloadStrategy;

public class Context {
    private DownloadStrategy strategy;

    public Context(DownloadStrategy strategy) {
        this.strategy = strategy;
    }

    public void download(String file) {
        strategy.download(file);
    }
}
