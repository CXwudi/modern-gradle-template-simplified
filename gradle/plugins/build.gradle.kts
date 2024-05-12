plugins {
  // Similar to the build.gradle.kts in the root directory, this is added
  // to resolve `The Kotlin Gradle plugin was loaded multiple times` warning.
  // However, we do this by applying the `kotlin-dsl` plugin instead of the `kotlin("jvm")` plugin,
  // since we are writing for the Gradle project that builds our precompiled script plugins.
  // The warning appears here because we applied a plugin other than the `kotlin-dsl` plugin.
  // In this case, the gradle-buildconfig-plugin
  `kotlin-dsl` apply false
}