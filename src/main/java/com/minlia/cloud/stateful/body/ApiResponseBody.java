package com.minlia.cloud.stateful.body;

/**
 * @author will
 */
public class ApiResponseBody<T> extends StatefulBody {

  public ApiResponseBody() {
    super();
  }

  public ApiResponseBody(Integer code, Integer status, String message, T payload) {
    super(code, status, message, payload);
  }

}
