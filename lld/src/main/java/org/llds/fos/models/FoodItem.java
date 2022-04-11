package org.llds.fos.models;

import java.util.List;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.llds.fos.enums.FoodItemCatergoryType;
import org.llds.fos.enums.FoodItemDishType;
import org.llds.fos.enums.FoodItemNatureTye;

@SuperBuilder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FoodItem {

  int id;
  int foodMenuId;
  int restaurantId;
  String name;
  String description;
  List<String> pictures;

  Set<FoodItemCatergoryType> foodItemCatergoryTypeList;
  FoodItemDishType foodItemDishType;
  FoodItemNatureTye foodItemNatureTye;

  Double amount;
}
