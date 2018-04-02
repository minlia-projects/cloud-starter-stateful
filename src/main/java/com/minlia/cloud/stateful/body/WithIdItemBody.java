package com.minlia.cloud.stateful.body;

import java.util.List;
import lombok.Data;

/**
 * Created by will on 6/20/17.
 */
@Data
public class WithIdItemBody implements Body {

  private List<WithIdBody> items;
}
