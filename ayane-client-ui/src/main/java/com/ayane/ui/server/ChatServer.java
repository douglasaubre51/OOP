package com.ayane.ui.server;

import java.util.concurrent.*;

import jakarta.websocket.*;
import jakarta.websocket.server.*;

@ServerEndpoint(value = "/chat")
public class ChatServer {
    private static final CopyOnWriteArraySet<Session> sessions = new CopyOnWriteArraySet<>();

    @OnOpen
    public void onOpen(Session session) {
        sessions.add(session);
        System.out.println("new connection:" + session.hashCode());

        try {
            session.getAsyncRemote().sendText("yokoso!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @OnMessage
    public void OnClose(Session session) {
        sessions.remove(session);
        System.out.println("Connection closed:" + session.hashCode());
    }

    @OnError
    public void OnError(Session session, Throwable throwable) {
        System.err.println("error in session:" + session.hashCode() + ":" + throwable.getMessage());
    }

    public static void broadcast(String message, Session sender) {
        for (Session session : sessions) {
            if (session.isOpen() && !session.equals(sender)) {
                try {
                    session.getAsyncRemote().sendText(message);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
