package org.llds.hms.models;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.llds.hms.enums.ResidencyRoomStatus;
import org.llds.hms.enums.ResidencyRoomType;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResidencyRoom {

  String id;
  ResidencyRoomType roomType;
  Integer capacity;

  Double price;

  ResidencyRoomStatus status;
  Date checkinDate;
  Date checkoutDate;
}
