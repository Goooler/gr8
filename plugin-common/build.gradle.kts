plugins {
  id("gr8.build.common")
  id("gr8.build.publishing")
}

dependencies {
  api("dev.gradleplugins:gradle-api:6.9.4")
  implementation("net.mbonnin.r8:r8:8.3.8")
}

val name = "Gr8 Plugin Common"
val description = "The Gr8 Plugin bytecode with no plugin declaration"

gr8Publishing {
  configurePublications(name, description)
}

publishing.publications.create("default", MavenPublication::class.java) {
  from(components.getByName("java"))
}