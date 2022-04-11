package org.llds.fos.controller;

import java.util.Arrays;
import java.util.List;
import org.llds.fos.enums.FoodItemCatergoryType;
import org.llds.fos.enums.FoodItemDishType;
import org.llds.fos.enums.FoodItemNatureTye;
import org.llds.fos.models.BaseResponse;
import org.llds.fos.models.FoodItem;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/fos/food/items/")
public class FoodItemController {

  @GetMapping
  public BaseResponse<List<FoodItem>> getFoodItemsByName(
      @RequestParam(name = "name") String name) {
    return BaseResponse.<List<FoodItem>>builder()
        .data(Arrays.asList(new FoodItem()))
        .code(HttpStatus.OK.value())
        .message(HttpStatus.OK.name())
        .success(true)
        .build();
  }

  @GetMapping
  public BaseResponse<List<FoodItem>> getFoodItemsByTypes(
      @RequestParam(required = false, name = "category_type") FoodItemCatergoryType foodItemCatergoryType,
      @RequestParam(required = false, name = "dish_type") FoodItemDishType foodItemDishType,
      @RequestParam(required = false, name = "nature") FoodItemNatureTye foodItemNatureTye) {
    return BaseResponse.<List<FoodItem>>builder()
        .data(Arrays.asList(new FoodItem()))
        .code(HttpStatus.OK.value())
        .message(HttpStatus.OK.name())
        .success(true)
        .build();
  }

}
