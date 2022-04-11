package org.llds.fms.models;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FlightPickupLocation {

  String address;
  String pincode;
  String country;

  Date arrivalTime;
  Date departureTime;

}
