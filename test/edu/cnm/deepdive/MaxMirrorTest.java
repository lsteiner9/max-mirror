package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class MaxMirrorTest {


  private static Stream<Arguments> maxMirror() {
    return Stream.of(
        Arguments.of(new int[] {1, 2, 3, 4 , 2, 3, 2, 1}, 3));
  }

  @ParameterizedTest
  @MethodSource
  void maxMirror(int[] input, int expected) {
    assertEquals(MaxMirror.maxMirror(input), expected);
  }
}