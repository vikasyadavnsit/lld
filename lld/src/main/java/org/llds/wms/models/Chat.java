package org.llds.wms.models;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import org.llds.wms.enums.MessageType;

@SuperBuilder
@Data
@AllArgsConstructor
public class Chat {

  User source;
  User destination;
  Message message;

}
