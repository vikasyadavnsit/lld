package org.llds.hms.models;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.llds.hms.enums.BookingStatus;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Booking {

  String bookingId;

  BookingResidency residency;
  GuestUser guestUser;

  Date checkinDate;
  Date checkoutDate;

  BookingStatus bookingStatus;
}
