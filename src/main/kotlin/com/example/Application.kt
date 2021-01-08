package com.example

import io.micronaut.runtime.Micronaut

object Application {
  @JvmStatic
  fun main(args: Array<String>) {
    Micronaut.build(*args)
        .defaultEnvironments("dev")
        .eagerInitConfiguration(true)
        .mainClass(Application.javaClass)
        .start()
  }
}
