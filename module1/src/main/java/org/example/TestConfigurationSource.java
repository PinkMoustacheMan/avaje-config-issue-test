package org.example;

import io.avaje.config.Configuration;
import io.avaje.config.ConfigurationSource;
import io.avaje.spi.ServiceProvider;

@ServiceProvider
public class TestConfigurationSource implements ConfigurationSource {

    @Override
    public void load(final Configuration configuration) {
        System.err.println("TestConfigurationSource loaded successfully");
    }

}
