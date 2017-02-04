package com.queensburg;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {
  @Test
  public void someMethodAddsStuff() {
    int sum = Main.someMethod(3, 6);
    assertEquals("someMethod should sum the arguments", 9, sum);
  }

  @Test
  public void anotherMethodFindsTheDifference() {
    int difference = Main.anotherMethod(8, 3);
    assertEquals("anotherMethod should return the difference of the arguments", 5, difference);
  }
}
