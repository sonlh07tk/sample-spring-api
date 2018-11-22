package sample.model;

import java.util.UUID;

public class Message {
    private String id;
    private String title;
    private String content;

    public Message() {
        this.id = UUID.randomUUID().toString();
    }

    public Message(String title, String content) {
        this.id = UUID.randomUUID().toString();
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getId() {
        return id;
    }
}
