package com.github.gregwhitaker.ratpackdocker.example.api;

import com.google.inject.AbstractModule;

/**
 * Guice module that wires up all API endpoints.
 */
public class ApiModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(ApiEndpoints.class);
    }
}
