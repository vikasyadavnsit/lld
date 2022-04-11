package org.llds.fos.controller;

import java.util.Arrays;
import java.util.List;
import org.llds.fos.models.BaseResponse;
import org.llds.fos.models.FoodMenu;
import org.llds.fos.models.Restaurant;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/fos/restaurants")
public class RestaurantController {

  @GetMapping("/")
  public BaseResponse<List<Restaurant>> getRestaurants(
      @RequestParam("pincode") int pincode) {
    return BaseResponse.<List<Restaurant>>builder()
        .data(Arrays.asList(new Restaurant()))
        .code(HttpStatus.OK.value())
        .message(HttpStatus.OK.name())
        .success(true)
        .build();
  }

  @GetMapping("/menu")
  public BaseResponse<FoodMenu> getFoodMenu(
      @RequestParam("id") int restaurantId) {
    return BaseResponse.<FoodMenu>builder()
        .data(new FoodMenu())
        .code(HttpStatus.OK.value())
        .message(HttpStatus.OK.name())
        .success(true)
        .build();
  }


}
