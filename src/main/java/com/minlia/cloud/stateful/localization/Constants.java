package com.minlia.cloud.stateful.localization;

public class Constants {

  public static final String EXCEPTION_PREFIX = "Exceptions";
  //  public static final String EXCEPTIONS_APICODE_PREFIX="ExceptionsApiCode";
  public static final String X_LANG = "X-LANG";
  public Constants() {
    throw new AssertionError();
  }

  public enum LanguageTypes {
    ExceptionsApiCode,
    Message,
    ValidationMessages
  }

}
