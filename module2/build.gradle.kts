plugins {
    id("java-library")
}

group = "org.example"
version = "1.0.0-SNAPSHOT"

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    implementation(project(":module1"))
    annotationProcessor(project(":module1"))
}
