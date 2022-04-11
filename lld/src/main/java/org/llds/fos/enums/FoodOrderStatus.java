package org.llds.fos.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FoodOrderStatus {
  PENDING,
  ACCEPTED,
  REJECTED,
  DELAYED,
  DELIVERED,
  ON_THE_WAY,
  CANCELLED,
  REFUNDED,
  OTHER
}
