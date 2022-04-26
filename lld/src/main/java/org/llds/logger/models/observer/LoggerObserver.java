package org.llds.logger.models.observer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.llds.logger.enums.LogLevel;
import org.llds.logger.models.sinkers.AbstractSinker;

public class LoggerObserver {

  Map<LogLevel, Set<AbstractSinker>> sinkersMap = new HashMap<>();

  public void addObserver(LogLevel logLevel, AbstractSinker sinker) {
    Set<AbstractSinker> sinkerSet = sinkersMap.getOrDefault(logLevel, new HashSet<>());
    sinkerSet.add(sinker);
    sinkersMap.put(logLevel, sinkerSet);
  }

  public void notifyObservers(LogLevel logLevel, String message) {
    sinkersMap.getOrDefault(logLevel, Set.of()).stream().forEach(observer -> {
      observer.logMessage(message, logLevel);
    });
  }

}
