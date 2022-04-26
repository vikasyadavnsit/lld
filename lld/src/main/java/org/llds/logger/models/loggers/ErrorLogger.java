package org.llds.logger.models.loggers;

import org.llds.logger.enums.LogLevel;
import org.llds.logger.models.observer.LoggerObserver;

public class ErrorLogger extends AbsractLogger {

  public ErrorLogger() {
    this.logLevel = LogLevel.ERROR;
  }

  @Override
  public void displayMessage(LogLevel logLevel, String message,
      LoggerObserver observer) {
    observer.notifyObservers(logLevel, message);
  }
}
