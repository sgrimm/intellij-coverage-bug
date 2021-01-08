package com.example

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class ExampleTest {
  @Test
  fun testSomething() {
    Assertions.assertEquals(0, ExampleService().doSomething())
  }
}