package org.llds.fos.models;

import java.time.LocalTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Restaurant {

  int id;
  String name;
  Address address;
  LocalTime openingTime;
  LocalTime closingTime;

  FoodMenu foodMenu;

}
