package org.llds.logger.models.loggers;

import java.io.Serializable;
import org.llds.logger.enums.LogLevel;
import org.llds.logger.models.manager.LogManager;
import org.llds.logger.models.observer.LoggerObserver;

public class Logger implements Cloneable, Serializable {

  private volatile static Logger logger;
  private volatile static AbsractLogger chainOfLoggers;
  private volatile static LoggerObserver loggerObserver;

  private Logger() {
  }

  public static Logger getInstance() {
    if (logger == null) {
      synchronized (Logger.class) {
        if (logger == null) {
          logger = new Logger();
          chainOfLoggers = LogManager.buildChainOfLoggers();
          loggerObserver = LogManager.buildSinkers();
        }
      }
    }
    return logger;
  }

  protected Object readResolve() {
    return logger;
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    throw new CloneNotSupportedException("Clone is not supported");
  }

  private void createMessage(LogLevel logLevel, String message) {
    chainOfLoggers.logMessage(logLevel, message, loggerObserver);
  }

  public void fatal(String message) {
    logger.createMessage(LogLevel.FATAL, message);
  }

  public void error(String message) {
    logger.createMessage(LogLevel.ERROR, message);
  }

  public void warn(String message) {
    logger.createMessage(LogLevel.WARN, message);
  }

  public void info(String message) {
    logger.createMessage(LogLevel.INFO, message);
  }

  public void debug(String message) {
    logger.createMessage(LogLevel.DEBUG, message);
  }

  public void trace(String message) {
    logger.createMessage(LogLevel.TRACE, message);
  }
}
