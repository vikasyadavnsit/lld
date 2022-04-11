package org.llds.wms.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MessageType {
  NORMAL,
  DISAPPEARING,
  ONETIME,
  OTHER
}
