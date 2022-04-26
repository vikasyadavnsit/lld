package org.llds.elevator.service;

import java.util.Optional;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import org.llds.elevator.enums.ButtonType;
import org.llds.elevator.enums.Direction;
import org.llds.elevator.enums.RequestStatus;
import org.llds.elevator.models.Floor;
import org.llds.elevator.models.User;
import org.llds.elevator.models.request.ExternalCallRequest;
import org.llds.elevator.models.request.InternalCallRequest;
import org.llds.elevator.models.response.CallElevatorResponse;
import org.llds.elevator.models.response.TriggerButtonResponse;

public class MainClass {

  volatile public static Queue<ExternalCallRequest> externalPendingQueue = new LinkedBlockingDeque<>();
  volatile public static Queue<InternalCallRequest> internalPendingQueue = new LinkedBlockingDeque<>();

  volatile public static Queue<ExternalCallRequest> taskExternalQueue = new LinkedBlockingDeque<>();
  volatile public static Queue<InternalCallRequest> taskInternalQueue = new LinkedBlockingDeque<>();


  public static void main(String[] args) {

    ExecutorService executorService = Executors.newFixedThreadPool(4);
    executorService.execute(new PendingRequestWorkerThread());
    executorService.execute(new TaskRequestWorkerThread());

    User user = User.builder()
        .weight(Double.valueOf("65"))
        .build();

    Floor currentFloor = Floor.builder()
        .floorNo(1)
        .label("1")
        .build();

    Floor destinationFloor = Floor.builder()
        .floorNo(7)
        .label("7")
        .build();

    ExternalCallRequest externalCallRequest = ExternalCallRequest.builder()
        .currentFloor(currentFloor)
        .direction(Direction.UP)
        .build();

    CallElevatorResponse callElevatorResponse = callElevator(externalCallRequest);
    System.out.println(callElevatorResponse);

    InternalCallRequest internalCallRequest = InternalCallRequest.builder()
        .currentFloor(currentFloor)
        .destinationFloor(destinationFloor)
        .build();

    TriggerButtonResponse triggerButtonResponse = triggerElevatorButton(ButtonType.DESTINATION,
        internalCallRequest);
    System.out.println(triggerButtonResponse);


  }

  private static TriggerButtonResponse triggerElevatorButton(ButtonType buttonType,
      InternalCallRequest internalCallRequest) {
    return switch (buttonType) {
      case DESTINATION -> triggerDestinationButton(internalCallRequest);
      default -> null;
    };
  }

  private static TriggerButtonResponse triggerDestinationButton(
      InternalCallRequest internalCallRequest) {
    internalPendingQueue.add(internalCallRequest);
    return TriggerButtonResponse.builder()
        .status(RequestStatus.QUEUED)
        .build();
  }

  private static CallElevatorResponse callElevator(ExternalCallRequest externalCallRequest) {
    Optional<ExternalCallRequest> optional = externalPendingQueue.stream().filter(
        x -> x.getCurrentFloor().equals(externalCallRequest.getCurrentFloor()) && x.getDirection()
            .equals(externalCallRequest.getDirection())).findFirst();

    if (!optional.isPresent()) {
      externalPendingQueue.add(externalCallRequest);
      return CallElevatorResponse.builder()
          .status(RequestStatus.QUEUED)
          .build();
    }
    return null;

  }


}
