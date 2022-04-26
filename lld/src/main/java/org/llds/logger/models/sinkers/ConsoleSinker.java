package org.llds.logger.models.sinkers;

import org.llds.logger.enums.LogLevel;

public class ConsoleSinker extends AbstractSinker {

  @Override
  public void logMessage(String message, LogLevel logLevel) {
    System.out.println("CONSOLE-LOGGER :: " + logLevel + " :: " + message);
  }
}
