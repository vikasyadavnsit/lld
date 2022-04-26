package org.llds.elevator.models.request;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.llds.elevator.enums.Direction;
import org.llds.elevator.models.Floor;

@SuperBuilder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExternalCallRequest {

  Direction direction;
  Floor currentFloor;
}
