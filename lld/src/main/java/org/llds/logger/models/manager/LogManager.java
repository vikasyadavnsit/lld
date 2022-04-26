package org.llds.logger.models.manager;

import org.llds.logger.enums.LogLevel;
import org.llds.logger.models.loggers.AbsractLogger;
import org.llds.logger.models.loggers.DebugLogger;
import org.llds.logger.models.loggers.ErrorLogger;
import org.llds.logger.models.loggers.InfoLogger;
import org.llds.logger.models.loggers.TraceLogger;
import org.llds.logger.models.loggers.WarnLogger;
import org.llds.logger.models.observer.LoggerObserver;
import org.llds.logger.models.sinkers.ConsoleSinker;
import org.llds.logger.models.sinkers.FileSinker;

public class LogManager {

  public static AbsractLogger buildChainOfLoggers() {
    AbsractLogger errorLogger = new ErrorLogger();
    AbsractLogger warnLogger = new WarnLogger();
    AbsractLogger debugLogger = new DebugLogger();
    AbsractLogger infoLogger = new InfoLogger();
    AbsractLogger traceLogger = new TraceLogger();

    errorLogger.setNextLogger(warnLogger);
    warnLogger.setNextLogger(debugLogger);
    debugLogger.setNextLogger(infoLogger);
    infoLogger.setNextLogger(traceLogger);
    return errorLogger;
  }

  public static LoggerObserver buildSinkers() {
    LoggerObserver loggerObserver = new LoggerObserver();
    ConsoleSinker consoleSinker = new ConsoleSinker();
    FileSinker fileSinker = new FileSinker();

    loggerObserver.addObserver(LogLevel.ERROR, consoleSinker);
    loggerObserver.addObserver(LogLevel.DEBUG, consoleSinker);
    loggerObserver.addObserver(LogLevel.DEBUG, fileSinker);

    return loggerObserver;
  }


}
