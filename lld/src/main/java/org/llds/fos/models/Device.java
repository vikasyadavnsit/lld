package org.llds.fos.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.llds.fos.enums.DeviceType;

@SuperBuilder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Device {

  int id;
  DeviceType deviceType;
  String token;

}
