package org.llds.fos.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.llds.fos.enums.FoodNotificationType;

@SuperBuilder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Notification {

  int id;
  String title;
  String description;
  String thumbnailUrl;

  User user;
  FoodOrder foodOrder;
  FoodNotificationType notificationType;
}
