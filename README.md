## What is this?

A small project that depicts an issue with `avaje-config` in which implementations of the ConfigurationSource are not
picked up by the SPI loader.

## How to run and what to expect

`./gradlew assemble`

Executing this with the issue present in `avaje-config` results in the build finishing successfully without the
"TestConfigurationSource loaded successfully" log being present.\
Reason being that the custom `TestConfigurationSource` is not loaded properly and the code located within is never
executed.

Fixing the `avaje-config` implementation to invoke the ServiceProvider with an explicitly passed `ClassLoader` parameter
yields the expected log output.
