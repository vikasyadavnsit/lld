package org.llds.logger.models.loggers;


import org.llds.logger.enums.LogLevel;
import org.llds.logger.models.observer.LoggerObserver;

public class TraceLogger extends AbsractLogger {

  public TraceLogger() {
    this.logLevel = LogLevel.TRACE;
  }

  @Override
  public void displayMessage(LogLevel logLevel, String message,
      LoggerObserver observer) {
    observer.notifyObservers(logLevel, message);
  }
}

