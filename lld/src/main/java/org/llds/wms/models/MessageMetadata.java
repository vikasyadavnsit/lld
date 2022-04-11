package org.llds.wms.models;


import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.llds.wms.enums.MessageContentType;
import org.llds.wms.enums.MessageType;

@SuperBuilder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageMetadata {

  int id;

  MessageContentType messageContentType;
  MessageType messageType;
  LocalDateTime expirationTime;
  LocalDateTime createdAt;
  LocalDateTime updatedAt;

}
