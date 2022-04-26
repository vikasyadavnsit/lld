package org.llds.elevator.enums;

import lombok.Getter;

@Getter
public enum ElevatorState {
  IDLE,
  STUCKED,
  MOVING,
  STOPPED
}
