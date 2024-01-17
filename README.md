# Simplified Modern Gradle Template

This is the simplified version of [Modern Gradle Template](https://github.com/CXwudi/modern-gradle-template) that suites using as a GitHub template.

The structure of the template stays the same but less boiler stuff to be deleted.

## How to use

1. Modify the project name `rootProject.name` in [`settings.gradle.kts`](settings.gradle.kts) to your own project name.
2. Add your own mixin plugins and convention plugins, and don't forget to archive centralized version management by adding your
   own libraries into the version catalog.
    - Tip 1: if you want to use version catalog in the `dependencies` block in precompiled script plugins
      (mixin or convention plugins),
      put them in the `constraints` block in
      the [`dev-version-constraints` platform](gradle/platform/dev-version-constraints/build.gradle.kts).
      Then in precompiled script plugins, declare the library dependency without the version
      (e.g. `implementation("org.springframework.boot:spring-boot-starter")`).
      This works for Maven bom and Gradle platform as well.
    - Tip 2: if you want to use version catalog in the `plugins` block in precompiled script plugins (mixin or convention plugins),
      you instead let the `build.gradle.kts` (is also the one with `kotlin-dsl` applied)
      that build the precompiled script plugin applies the version catalog.
      Then in precompiled script plugins, declare the library dependency without the version
      ((e.g. `id("org.springframework.boot")`)
    - Tip 3: there is a little [`kotlin-jvm` mixin plugin](gradle/plugins/mixin/kotlin-jvm) that demonstrates
      the above two tips.
      You can also reuse any mixin and convention plugins that already exist in this template.
      Or if you want to start from scratch, you can delete all mixin and convention plugins.
3. Delete the sample submodules beginning with `sample-`, and start adding your own submodules.
   Or you can reuse them by renaming them as it only contains a single `build.gradle.kts` file.
4. (Optional) The template contains a renovate bot config file to automatically update dependencies in the version catalog.
   You can delete it if you don't need it.

## TODO

- [ ] Convert this template to a Cookiecutter template
  using [this guide](https://maciejwalkowiak.com/blog/creating-project-templates-with-cookiecutter/)
  and [this sample template](https://github.com/thomaslee/cookiecutter-java)