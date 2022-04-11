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
public class User {

  int id;
  String name;
  String email;
  String phone;

  List<Device> deviceList;

}
