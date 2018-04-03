package com.minlia.cloud.stateful.body;

import java.util.List;
import lombok.Data;

/**
 *
 * @author will
 */
@Data
public class WithIdItemBody implements Body {

  private List<WithIdBody> items;
}
