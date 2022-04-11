package org.llds.wms.service;

import java.time.LocalDateTime;
import org.llds.wms.enums.MessageContentType;
import org.llds.wms.enums.MessageType;
import org.llds.wms.models.Chat;
import org.llds.wms.models.Message;
import org.llds.wms.models.MessageMetadata;
import org.llds.wms.models.User;

public class ChatService {

  User user1 = User.builder()
      .id(1)
      .name("Vikas")
      .phone("9999999999")
      .build();

  User user2 = User.builder()
      .id(2)
      .name("Rajat")
      .phone("88888888888")
      .build();

  MessageMetadata metadata = MessageMetadata.builder()
      .messageContentType(MessageContentType.TEXT)
      .messageType(MessageType.DISAPPEARING)
      .createdAt(LocalDateTime.now())
      .updatedAt(LocalDateTime.now())
      .expirationTime(LocalDateTime.now().plusSeconds(5))
      .build();

  Message message = Message.builder()
      .id(1)
      .content("Hello Rajat")
      .metadata(metadata)
      .build();

  Chat chat = Chat.builder()
      .source(user1)
      .destination(user2)
      .message(message)
      .build();


}
