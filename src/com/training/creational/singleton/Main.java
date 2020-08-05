package com.training.creational.singleton;

import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = Executors.newCachedThreadPool();

        Callable<Singleton> callable = () -> {
            Singleton singleton = Singleton.getSingleton();
            return singleton;
        };

        List<Callable<Singleton>> collect = Stream.iterate(0, i -> ++i)
                .limit(100)
                .map(integer -> callable)
                .collect(Collectors.toList());


        List<Future<Singleton>> futures = executorService.invokeAll(collect);

        List<Singleton> singleton = futures.stream()
                .map(testClassFuture -> {
                    try {
                        return testClassFuture.get();
                    } catch (InterruptedException | ExecutionException e) {
                        throw new RuntimeException(e);
                    }
                }).distinct().collect(Collectors.toList());

        System.out.println(singleton);

        executorService.shutdown();



    }
}
