plugins {
    id("java")
    id("wrapper")
}

group = "org.example"
version = "1.0.0-SNAPSHOT"

tasks {
    named<Wrapper>("wrapper") {
        gradleVersion = "9.3.1"
        distributionType = Wrapper.DistributionType.BIN
    }
}
