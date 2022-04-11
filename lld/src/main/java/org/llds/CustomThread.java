package org.llds;

import java.time.Duration;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;
import lombok.Data;

@Data
public class CustomThread implements Runnable {

  CustomThread(Integer custId) {
    this.custId = custId;
  }

  private final Integer custId;
  private Instant previousInstant;
  volatile private int count = 1;

  @Override
  public void run() {
    Set<String> set = new HashSet<>();
    String id = "";
    Instant tempInstant, start = Instant.now();
    previousInstant = start;
    count = 1;
    while ((tempInstant = Instant.now()).isBefore(start.plusSeconds(1))) {
      if (tempInstant.isAfter(previousInstant.plusMillis(1))) {
        previousInstant = tempInstant;
        count = 1;
      }
      id = Thread.currentThread().getName() + "-" + tempInstant.toEpochMilli() + "-" + this.custId
          + "-" + count++;
      boolean res = set.add(id);
      if (!res) {
        System.out.println(id);
      }
    }
    //System.out.println(Thread.currentThread().getName() + " --" + set.size());

  }
}