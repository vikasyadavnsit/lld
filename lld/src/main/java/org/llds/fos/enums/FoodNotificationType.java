package org.llds.fos.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FoodNotificationType {
  EMAIL,
  SMS,
  PUSH_NOTIFICATION,
  OTHER
}
