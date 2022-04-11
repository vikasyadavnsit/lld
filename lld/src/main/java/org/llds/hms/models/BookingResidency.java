package org.llds.hms.models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.llds.hms.enums.ResidencyCategory;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookingResidency {

  String id;
  ResidencyCategory category;
  ResidencyAddress address;
  ResidencyRoom room;

}