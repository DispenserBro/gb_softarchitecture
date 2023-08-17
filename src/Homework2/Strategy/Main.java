package Homework2.Strategy;

import Homework2.Strategy.Contexts.Context;
import Homework2.Strategy.Strategies.*;

public class Main {
    public static void main(String[] args) {
        String fileName = "file.txt";

        DownloadStrategy downloadWindows = new DownloadWindows();
        DownloadStrategy downloadLinux = new DownloadLinux();

        Context context = new Context(downloadLinux);
        context.download(fileName);
        context.download(fileName);
        context.download(fileName);

        context = new Context(downloadWindows);
        context.download(fileName);
        context.download(fileName);
        context.download(fileName);
        context.download(fileName);

        downloadLinux.collectDetails();
        downloadWindows.collectDetails();

        context = new Context(downloadLinux);
        context.download(fileName);
        context.download(fileName);
        context.download(fileName);
        context.download(fileName);
        context.download(fileName);
        context.download(fileName);
        context.download(fileName);
        context.download(fileName);
        context.download(fileName);
    }
}
