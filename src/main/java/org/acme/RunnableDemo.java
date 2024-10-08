package org.acme;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class RunnableDemo {
    public static void main(String[] args) {
        final ExecutorService exService = Executors.newSingleThreadExecutor();
        Runnable r = () -> System.out.println("Lambda Expression Test with Runnable");
        exService.execute(r);
    }
}