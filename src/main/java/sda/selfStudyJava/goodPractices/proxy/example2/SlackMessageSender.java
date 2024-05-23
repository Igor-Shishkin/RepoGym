package sda.selfStudyJava.goodPractices.proxy.example2;

import java.util.ArrayList;
import java.util.List;

public class SlackMessageSender implements MessageSender{
    private final List<Message> messages = new ArrayList<>();

    @Override
    public void sendMessage(final String channelName, final String username, final String messageText) {
        final Message message = new Message(channelName, username, messageText);
        System.out.println("Sent message: " + message);
        messages.add(message);
        System.out.println("Messages: " + messages);
    }
}
