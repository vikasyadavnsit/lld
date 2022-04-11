package org.llds;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class Test {

  public static void main(String[] args) {

    ExecutorService executorService = Executors.newCachedThreadPool();
    IntStream.range(0, 10).forEach(x -> executorService.execute(new CustomThread(x)));

  }
}
