package org.llds.fms.models;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.llds.fms.enums.FlightSeatingClass;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FlightSeats {

  FlightSeatingClass seatingClass;
  Integer seatingCapacity;
  Integer luggageCapacity;

  Double farePrice;
  Double luggagePrice;

  List<FlightSeatArea> seatingArea;

}
