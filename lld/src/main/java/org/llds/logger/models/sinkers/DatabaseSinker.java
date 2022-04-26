package org.llds.logger.models.sinkers;


import org.llds.logger.enums.LogLevel;

public class DatabaseSinker extends AbstractSinker {

  @Override
  public void logMessage(String message, LogLevel logLevel) {
    System.out.println("DATABASE-LOGGER :: " + logLevel + " :: " + message);
  }
}

