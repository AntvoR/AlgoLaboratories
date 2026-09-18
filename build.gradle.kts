plugins {
  java
}

subprojects {
  apply(plugin = "java")
  apply(plugin = "application")

  repositories {
    mavenCentral()
  }

  dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.0")
  }
}
