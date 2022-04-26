package org.llds.logger.models.loggers;


import org.llds.logger.enums.LogLevel;
import org.llds.logger.models.observer.LoggerObserver;

public class WarnLogger extends AbsractLogger {

  public WarnLogger() {
    this.logLevel = LogLevel.WARN;
  }

  @Override
  public void displayMessage(LogLevel logLevel, String message,
      LoggerObserver observer) {
    observer.notifyObservers(logLevel, message);
  }
}


