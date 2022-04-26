package org.llds.elevator.models.request;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ElevatorCallRequest {

  ExternalCallRequest externalCallRequest;
  InternalCallRequest internalCallRequest;
}
