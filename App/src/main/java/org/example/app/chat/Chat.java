package org.example.app.chat;

import org.example.app.message.Message;
import org.example.app.user.User;

import java.util.List;


public class Chat {
    private List<User> users;
    private List<Message> messages;
    private String name;

    public void ShowMessages() {
        for (Message m : messages) {
            System.out.println(m.getUser().GetName() + ": " + m.getText());
        }
    }
}
