package org.example.app.message;

import org.example.app.user.User;

import java.util.Date;

public class Message {
    private final Date date;
    private String text;
    private final User user;
    public Message(Date date, String text, User user) {
        this.date = date;
        this.text = text;
        this.user = user;
    }

    public Date getDate() {
        return date;
    }

    public String getText() {
        return text;
    }

    public void editText(String text) {
        this.text = text;
    }

    public User getUser() {
        return user;
    }
}
