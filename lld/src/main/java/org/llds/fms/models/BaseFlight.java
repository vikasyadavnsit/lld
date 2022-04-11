package org.llds.fms.models;

import java.util.LinkedList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.llds.fms.enums.FlightType;

@SuperBuilder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BaseFlight {

  String id;
  String name;
  FlightType type;

  LinkedList<FlightPickupLocation> pickupLocations;
  List<FlightSeats> seats;

}
