package org.llds.hms.models;

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
public class ResidencyAddress {

  String nameOfResidency;
  String address;
  String pincode;
  String city;
  String country;

}
