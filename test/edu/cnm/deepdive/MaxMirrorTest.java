package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class MaxMirrorTest {


  private static Stream<Arguments> maxMirror() {
    return Stream.of(
        Arguments.of(new int[]{1, 2, 3, 4, 2, 3, 2, 1}, 3),
        Arguments.of(new int[]{21, 22, 9, 8, 7, 6, 23, 24, 6, 7, 8, 9, 25, 7, 8, 9}, 4),
        Arguments.of(new int[]{1, 2, 1, 20, 21, 1, 2, 1, 2, 23, 24, 2, 1, 2, 1, 25}, 4)
    );
  }

  private static Stream<Arguments> isMirror() {
    return Stream.of(
        Arguments.of(new int[]{1, 2, 3, 4, 2, 3, 2, 1}, 0, 4, false),
        Arguments.of(new int[]{1, 2, 3, 4, 4, 3, 2, 1}, 0, 7, true),
        Arguments.of(new int[]{1, 2, 3, 4, 4, 3, 2, 1}, 0, 5, false)
    );
  }

  private static Stream<Arguments> areMirrors() {
    return Stream.of(
        Arguments.of(new int[]{1, 2, 3, 4, 2, 3, 2, 1}, 0, 4, 4, 6, false),
        Arguments.of(new int[]{1, 2, 3, 4, 4, 3, 2, 1}, 0, 2, 5, 7, true),
        Arguments.of(new int[]{1, 2, 3, 4, 4, 3, 2, 1}, 0, 5, 1, 6, false)
    );
  }


  @ParameterizedTest
  @MethodSource
  void maxMirror(int[] input, int expected) {
    assertEquals(expected, MaxMirror.maxMirror(input));
  }

}