package Homework2.Strategy.Strategies;

public class DownloadLinux extends DownloadStrategy {
    public DownloadLinux() {
        super("Linux");
    }

    @Override
    public void collectDetails() {
        System.out.println(productName + " file download at " + percentage + "%");
    }
}
