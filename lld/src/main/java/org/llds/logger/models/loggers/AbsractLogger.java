package org.llds.logger.models.loggers;

import java.util.Objects;
import lombok.Data;
import org.llds.logger.enums.LogLevel;
import org.llds.logger.models.observer.LoggerObserver;

@Data
public abstract class AbsractLogger {

  LogLevel logLevel;
  AbsractLogger nextLogger;

  public void logMessage(LogLevel logLevel, String message,
      LoggerObserver observer) {
    if (logLevel.equals(this.getLogLevel())) {
      this.displayMessage(logLevel, message, observer);
    }
    if (Objects.nonNull(this.getNextLogger())) {
      this.getNextLogger().logMessage(logLevel, message, observer);
    }
  }

  public abstract void displayMessage(LogLevel logLevel, String message,
      LoggerObserver observer);

}
