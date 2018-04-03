package com.minlia.cloud.stateful.body;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 *
 * @author will
 */
@ApiModel(value = "带名称的请求体")
@Data
public class WithNameRequestBody implements Body {

  @ApiModelProperty(value = "名称")
  @JsonProperty
  private String name;
}
