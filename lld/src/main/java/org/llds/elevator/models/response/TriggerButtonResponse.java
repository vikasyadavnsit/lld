package org.llds.elevator.models.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.llds.elevator.enums.RequestStatus;

@SuperBuilder
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TriggerButtonResponse {

  RequestStatus status;
}
