package org.llds.elevator.service;


import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.json.simple.JSONObject;
import org.llds.elevator.enums.MessageType;
import org.llds.elevator.enums.RequestStatus;
import org.llds.elevator.models.request.ExternalCallRequest;

@NoArgsConstructor
@Slf4j
public class TaskRequestWorkerThread implements Runnable {

  public void handleExternalQueue() throws InterruptedException {
    while (true) {
      while (!MainClass.taskExternalQueue.isEmpty()) {
        ExternalCallRequest externalCallRequest = MainClass.taskExternalQueue.poll();
        log.info("Inside handleExternalTaskQueue : {}", externalCallRequest);

        //Todo : messaging queue with mutiple floors as subscriber for our events
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("type", MessageType.CALL_ELEVATOR_RESPONSE);
        jsonObject.put("floor", externalCallRequest.getCurrentFloor().getFloorNo());
        jsonObject.put("status", RequestStatus.ONTHEWAY);

        log.info("Trigger Event to all consumers : {}", jsonObject);
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

