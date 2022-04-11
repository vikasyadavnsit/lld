package org.llds.fos.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseResponse<T> {

  @JsonProperty("data")
  private T data;
  private boolean success;
  private String message;
  private int code;

}
