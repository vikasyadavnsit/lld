package org.llds.elevator.service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.json.simple.JSONObject;
import org.llds.elevator.enums.MessageType;
import org.llds.elevator.enums.RequestStatus;
import org.llds.elevator.models.request.ExternalCallRequest;

@NoArgsConstructor
@Slf4j
public class PendingRequestWorkerThread implements Runnable {

  public void handleExternalQueue() throws InterruptedException {
    while (true) {
      while (!MainClass.externalPendingQueue.isEmpty()) {
        ExternalCallRequest externalCallRequest = MainClass.externalPendingQueue.poll();
        log.info("Inside handleExternalPendingQueue : {}", externalCallRequest);

        //Todo : messaging queue with mutiple floors as subscriber for our events
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("type", MessageType.CALL_ELEVATOR_RESPONSE);
        jsonObject.put("floor", externalCallRequest.getCurrentFloor().getFloorNo());
        jsonObject.put("status", RequestStatus.PENDING);

        log.info("Trigger Event to all consumers : {}", jsonObject);
        MainClass.taskExternalQueue.add(externalCallRequest);
      }
      Thread.sleep(100);
    }
  }

  @Override
  public void run() {
    try {
      handleExternalQueue();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
