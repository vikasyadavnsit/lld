package org.llds.logger.service;

import org.llds.logger.models.loggers.Logger;

public class MainClass {

  public static void main(String[] args) {
    Logger logger = Logger.getInstance();
    logger.debug("test");
  }

}
