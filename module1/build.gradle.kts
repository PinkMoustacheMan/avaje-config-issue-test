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
    compileOnly("io.avaje:avaje-prisms:2.0")
    annotationProcessor("io.avaje:avaje-prisms:2.0")

    implementation("io.avaje:avaje-config:5.1")
}
