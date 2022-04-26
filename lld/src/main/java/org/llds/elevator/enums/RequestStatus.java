package org.llds.elevator.enums;

import lombok.Getter;

@Getter
public enum RequestStatus {
  QUEUED,
  PENDING,
  ONTHEWAY,
  COMPLETED
}
