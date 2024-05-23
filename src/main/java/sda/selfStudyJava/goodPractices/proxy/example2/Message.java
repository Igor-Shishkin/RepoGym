package sda.selfStudyJava.goodPractices.proxy.example2;

import java.time.LocalDateTime;

public class Message {
    private String channelName;
    private LocalDateTime postDate;
    private String author;
    private String text;

    public Message(final String channelName, final String author, final String text) {
        this.channelName = channelName;
        this.author = author;
        this.text = text;
        this.postDate = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Message{" +
                "channelName='" + channelName + '\'' +
                ", postDate=" + postDate +
                ", author='" + author + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
