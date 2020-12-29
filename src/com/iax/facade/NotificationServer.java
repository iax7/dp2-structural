package com.iax.facade;

public class NotificationServer {
    // connect() -> Connection
    // auth(appID, key) -> AuthToken
    // send(authToken, message, target)
    // conn.disconnect()

    public Connection connect(String ipAddress) {
        return new Connection();
    }

    public AuthToken auth(String appID, String key) {
        return new AuthToken();
    }

    public void send(AuthToken authToken, Message message, String target) {
        System.out.println("Sending a message: " + message);
    }
}
