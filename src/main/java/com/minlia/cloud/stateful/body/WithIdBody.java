package com.minlia.cloud.stateful.body;

import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 *
 * @author will
 */
@Data
@ApiModel(value = "WithIdBody",description = "带Id的主体")
public class WithIdBody implements Body {

  /**
   * ID
   */
  private Long id;

}
