package org.llds.logger.models.sinkers;

import org.llds.logger.enums.LogLevel;

public abstract class AbstractSinker {

  public abstract void logMessage(String message, LogLevel logLevel);

}
