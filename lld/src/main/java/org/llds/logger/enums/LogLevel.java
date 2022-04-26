package org.llds.logger.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum LogLevel {

  FATAL(1),
  ERROR(2),
  WARN(3),
  INFO(4),
  DEBUG(5),
  TRACE(6);

  int value;
}
