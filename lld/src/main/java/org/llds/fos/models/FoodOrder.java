package org.llds.fos.models;

import java.time.LocalDateTime;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.llds.fos.enums.FoodOrderStatus;

@SuperBuilder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FoodOrder {

  int id;
  LocalDateTime orderTime;
  List<FoodItemGroup> foodItemGroupList;
  Address deliveryAddress;

  Double totalAmount;

  Device device;
  FoodOrderStatus orderStatus;
  DeliveryUser deliveryUser;

  @Data
  @Builder
  static class FoodItemGroup {

    FoodItem foodItem;
    Restaurant restaurant;

  }

}
