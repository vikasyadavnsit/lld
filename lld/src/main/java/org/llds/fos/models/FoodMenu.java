package org.llds.fos.models;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FoodMenu {

  int id;
  int restaurantId;
  List<FoodItem> foodItemList;
}
