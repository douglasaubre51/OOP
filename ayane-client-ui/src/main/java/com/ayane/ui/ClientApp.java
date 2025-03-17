package com.ayane.ui;

import java.net.URI;
import jakarta.websocket.*;
import java.util.*;

@ClientEndpoint
public class ClientApp {
    private static Session session;

    @OnOpen
    public void OnOpen(Session session) {
        ClientApp.session = session;
        System.out.println("connection established!");
    }

    @OnMessage
    public void OnMessage(String message) {
        System.out.println("message : " + message);
    }

    @OnClose
    public void OnClose(Session session) {
        System.out.println("disconnected!");
    }

    public static void main(String[] args) {
        WebSocketContainer container = ContainerProvider.getWebSocketContainer();
        try {
            container.connectToServer(ClientApp.class, new URI("ws://localhost:8080/chat"));

            while (true) {
                Scanner scanner = new Scanner(System.in);
                String message = scanner.nextLine();

                if (message.equals("exit")) {
                    session.close();
                    scanner.close();
                    return;
                }

                if (session.isOpen()) {
                    session.getAsyncRemote().sendText(message);
                    ChatServer.broadcast(message, session);
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
