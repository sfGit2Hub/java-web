package com.simple.web.handle;

import org.springframework.web.socket.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Administrator on 2017/5/9.
 */
public class SystemWebSocketHandler implements WebSocketHandler {
    private static final ArrayList<WebSocketSession> users = new ArrayList<>();
    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        System.out.println("ConnectionEstablished");
        users.add(session);

        session.sendMessage(new TextMessage("connect"));
        session.sendMessage(new TextMessage("new_msg"));
    }

    @Override
    public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) throws Exception {
        System.out.println("handleMessage" + message.toString());
        sendMessageToUsers(new TextMessage(new Date() + ""));
//        session.sendMessage(new TextMessage(new Date() + ""));
    }

    @Override
    public void handleTransportError(WebSocketSession session, Throwable throwable) throws Exception {
        if(session.isOpen()){
            session.close();
        }
        users.remove(session);
        System.out.println("handle transport error!!!");
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus closeStatus) throws Exception {
        users.remove(session);
        System.out.println("after connection closed!!");
    }

    @Override
    public boolean supportsPartialMessages() {
        return false;
    }

    /**
     * 给所有在线用户发送消息
     *
     * @param message
     */
    public void sendMessageToUsers(TextMessage message) {
        for (WebSocketSession user : users) {
            try {
                if (user.isOpen()) {
                    user.sendMessage(message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
