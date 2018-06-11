package com.minlia.cloud.stateful.body;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import lombok.Data;

/**
 *
 * @author will
 */
@Data
@ApiModel(value = "WithIdItemBody",description = "带多个Id项的主体")
public class WithIdItemBody implements Body {

  @ApiModelProperty(value = "items",notes = "Items")
  private List<WithIdBody> items;
}
