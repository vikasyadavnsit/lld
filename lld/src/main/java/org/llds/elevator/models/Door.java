package org.llds.elevator.models;


import java.time.temporal.ChronoUnit;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.llds.elevator.enums.DoorSatus;

@SuperBuilder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Door {

  //door opening and closing interval
  int duration;
  ChronoUnit chronoUnit;
  DoorSatus status;
}
