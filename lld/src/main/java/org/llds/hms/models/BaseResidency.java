package org.llds.hms.models;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.llds.hms.enums.ResidencyCategory;

@SuperBuilder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BaseResidency {

  String id;
  ResidencyCategory category;
  ResidencyAddress address;
  List<ResidencyRoom> capacity;

}
