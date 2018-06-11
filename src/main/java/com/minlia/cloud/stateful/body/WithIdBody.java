package com.minlia.cloud.stateful.body;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 *
 * @author will
 */
@Data
@ApiModel(value = "withIdBody",description = "带Id的主体")
public class WithIdBody implements Body {

  /**
   * ID
   */
  @ApiModelProperty(value = "id",notes = "ID")
  private Long id;

}
