package com.github.gregwhitaker.ratpackdocker.example.api;

import ratpack.func.Action;
import ratpack.handling.Chain;

/**
 * Configures all endpoints in the application.
 */
public class ApiEndpoints implements Action<Chain> {

    @Override
    public void execute(Chain chain) throws Exception {
        chain.get("example", ctx -> {
            ctx.render("This thing works!");
        });
    }
}
