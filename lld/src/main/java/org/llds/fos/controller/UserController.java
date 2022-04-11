package org.llds.fos.controller;

import org.llds.fos.models.BaseResponse;
import org.llds.fos.models.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/fos/users/register")
public class UserController {

  @PostMapping("/customer")
  public BaseResponse<Customer> registerCustomer(@RequestBody Customer customer) {
    return BaseResponse.<Customer>builder()
        .data(customer)
        .code(HttpStatus.OK.value())
        .message(HttpStatus.OK.name())
        .success(true)
        .build();
  }

}
