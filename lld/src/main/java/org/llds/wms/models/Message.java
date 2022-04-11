package org.llds.wms.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
@AllArgsConstructor
public class Message {

  int id;
  String content;

  MessageMetadata metadata;

}
