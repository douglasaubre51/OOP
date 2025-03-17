package com.ayane.ui;

import org.eclipse.jetty.server.*;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.websocket.jakarta.server.config.*;

import jakarta.websocket.server.ServerEndpointConfig;

public class ServerApp {
    public static void main(String[] args) {
        Server server = new Server(8080);

        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);

        context.setContextPath("/");
        server.setHandler(context);

        JakartaWebSocketServletContainerInitializer.configure(context, (servletContext, wsContainer) -> {
            wsContainer.addEndpoint(ServerEndpointConfig.Builder.create(ChatServer.class, "/chat").build());
        });

        try {
            server.start();

            System.out.println("Server started!");

        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
