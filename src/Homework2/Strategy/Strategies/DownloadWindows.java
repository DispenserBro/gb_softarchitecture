package Homework2.Strategy.Strategies;

public class DownloadWindows extends DownloadStrategy {
    public DownloadWindows() {
        super("Windows");
    }

    @Override
    public void collectDetails() {
        System.out.println(productName + " file download at " + percentage + "%");
    }
}
