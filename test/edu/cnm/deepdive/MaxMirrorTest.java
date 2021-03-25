package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class MaxMirrorTest {


  private static Stream<Arguments> maxMirror() {
    return Stream.of(
        Arguments.of(new int[] {1, 2, 3, 4, 2, 3, 2, 1}, 3));
  }

  private static Stream<Arguments> isMirror() {
    return Stream.of(
        Arguments.of(new int[] {1, 2, 3, 4, 2, 3, 2, 1}, 0, 4, false),
        Arguments.of(new int[] {1, 2, 3, 4, 4, 3, 2, 1}, 0, 7, true),
        Arguments.of(new int[] {1, 2, 3, 4, 4, 3, 2, 1}, 0, 5, false)
    );
  }

  private static Stream<Arguments> areMirrors() {
    return Stream.of(
        Arguments.of(new int[] {1, 2, 3, 4, 2, 3, 2, 1}, 0, 4, 4, 6, false),
        Arguments.of(new int[] {1, 2, 3, 4, 4, 3, 2, 1}, 0, 2, 5, 7, true),
        Arguments.of(new int[] {1, 2, 3, 4, 4, 3, 2, 1}, 0, 5, 1, 6, false)
    );
  }


  @ParameterizedTest
  @MethodSource
  void maxMirror(int[] input, int expected) {
    assertEquals(expected, MaxMirror.maxMirror(input));
  }

  @Test
  void recurseMirror() {
  }

  @ParameterizedTest
  @MethodSource
  void isMirror(int[] nums, int start, int stop, boolean expected) {
    assertEquals(expected, MaxMirror.isMirror(nums, start, stop));
  }

  @ParameterizedTest
  @MethodSource
  void areMirrors(int[] nums, int start1, int stop1, int start2, int stop2, boolean expected) {
    assertEquals(expected, MaxMirror.areMirrors(nums, start1, stop1, start2, stop2));
  }
}