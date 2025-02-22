package org.example.app.user;

import org.example.app.chat.Chat;
import java.util.List;

public class User {
    private String name;
    private int age;
    private String email;
    private List<Chat> chats;

    public String GetName() {
        return name;
    }

    public List<Chat> GetChats() {
        return chats;
    }
}
