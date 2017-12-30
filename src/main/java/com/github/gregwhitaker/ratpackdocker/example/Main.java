package com.github.gregwhitaker.ratpackdocker.example;

import com.github.gregwhitaker.ratpack.error.ErrorModule;
import com.github.gregwhitaker.ratpackdocker.example.api.ApiEndpoints;
import com.github.gregwhitaker.ratpackdocker.example.api.ApiModule;
import ratpack.guice.Guice;
import ratpack.server.BaseDir;
import ratpack.server.RatpackServer;

/**
 * Starts the ratpack-docker-example application.
 */
public class Main {

    public static void main(String... args) throws Exception {
        RatpackServer.start(s -> s
                .serverConfig(c -> c
                        .baseDir(BaseDir.find()).build())
                .registry(Guice.registry(b -> b
                        .module(ErrorModule.class)
                        .module(ApiModule.class)))
                .handlers(c -> c
                        .insert(ApiEndpoints.class))
        );
    }
}
