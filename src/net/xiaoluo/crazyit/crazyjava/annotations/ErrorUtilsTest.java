package net.xiaoluo.crazyit.crazyjava.annotations;

import java.util.Arrays;

public class ErrorUtilsTest {
  public static void main(String[] args) {
    ErrorUtils.faultyMethod(Arrays.asList("string1"),
                            Arrays.asList("string2"));
  }
}
