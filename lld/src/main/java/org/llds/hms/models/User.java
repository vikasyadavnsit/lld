package org.llds.hms.models;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.llds.fms.enums.Gender;

@SuperBuilder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

  String id;
  String name;
  Gender gender;
  Date dateOfBirth;
  String email;
  String phone;

}

