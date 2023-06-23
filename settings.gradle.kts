plugins {
    id("com.gradle.enterprise").version("3.6.3")
    id("com.gradle.enterprise.gradle-enterprise-conventions-plugin").version("0.7.2")
}

rootProject.name = "gradle-guides"

include("gradle-guides-plugin")
project(":gradle-guides-plugin").projectDir = file("subprojects/gradle-guides-plugin")
