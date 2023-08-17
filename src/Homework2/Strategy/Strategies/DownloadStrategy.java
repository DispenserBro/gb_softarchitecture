package Homework2.Strategy.Strategies;

public abstract class DownloadStrategy {
    String productName;
    int percentage;

    public DownloadStrategy(String productName) {
        this.productName = productName;
        percentage = 0;
    }

    public  abstract void collectDetails();

    public boolean download(String fileUri) {
        if (percentage < 100) {
            System.out.println("Downloading " + fileUri + " by "  + productName + "...");
            System.out.println("Progress: " + percentage + "%");
            percentage += 10;
            return false;
        }
        System.out.println(productName + " download completed!");
        return true;
    }


}
