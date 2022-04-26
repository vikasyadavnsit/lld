package org.llds.elevator.models;

import java.util.LinkedHashSet;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.llds.elevator.enums.Direction;
import org.llds.elevator.enums.ElevatorState;

@SuperBuilder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Elevator {

  int id;
  String label;

  Door door;
  Floor currentFloor;
  LinkedHashSet<Floor> destinationList;
  ElevatorState elevatorState;
  Direction direction;
  Double liftingCapacity;

  boolean emergencyBrakes = false;
}
