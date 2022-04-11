package org.llds.fms.models;

import java.util.Date;
import java.util.LinkedList;
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
public class Booking {

  String id;
  LinkedList<BaseFlight> flights;
  Date bookingDate;

  FlightPickupLocation sourceLocation;
  FlightPickupLocation destinationLocation;

  User passenger;
  User bookingUser;
}
