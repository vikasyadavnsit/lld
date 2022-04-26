package org.llds.logger.models.loggers;

import org.llds.logger.enums.LogLevel;
import org.llds.logger.models.observer.LoggerObserver;

public class DebugLogger extends AbsractLogger {

  public DebugLogger() {
    this.logLevel = LogLevel.DEBUG;
  }

  @Override
  public void displayMessage(LogLevel logLevel, String message,
      LoggerObserver observer) {
    observer.notifyObservers(logLevel, message);
  }
}
