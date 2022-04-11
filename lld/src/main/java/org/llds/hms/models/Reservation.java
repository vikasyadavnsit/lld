package org.llds.hms.models;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {

  String reservationNumber;
  List<Booking> bookings;
  User bookingUser;

  Double totalCost;
}
