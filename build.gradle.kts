import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val micronautVersion = "2.2.2"

plugins {
  val kotlinVersion = "1.4.20"

  kotlin("jvm") version kotlinVersion
  kotlin("kapt") version kotlinVersion
  kotlin("plugin.allopen") version kotlinVersion

  id("io.micronaut.application") version "1.2.0"
}

group = "com.example"
version = "0.1-SNAPSHOT"
java.targetCompatibility = JavaVersion.VERSION_11

repositories {
  mavenCentral()
  maven {
    url = uri("https://oss.sonatype.org/content/repositories/snapshots/")
  }
}

dependencies {
  implementation("io.micronaut.kotlin:micronaut-kotlin-runtime")

  testImplementation("org.junit.jupiter:junit-jupiter-api")

  testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.7.0")
}

tasks.test {
  useJUnitPlatform()
}

micronaut {
  version(micronautVersion)
  runtime("netty")
}

tasks.withType<KotlinCompile> {
  kotlinOptions.jvmTarget = java.targetCompatibility.majorVersion
}

application {
  mainClass.set("com.example.Application")
}
