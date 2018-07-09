package com.minlia.cloud.stateful.body;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

/**
 *
 * @author will
 */
@Data
@ApiModel(value = "withIdItemBody",description = "带多个Id项的主体")
public class WithIdItemBody<ID extends Serializable> implements Body {

  @ApiModelProperty(value = "items",notes = "Items")
  private List<WithIdBody<ID>> items;
}
