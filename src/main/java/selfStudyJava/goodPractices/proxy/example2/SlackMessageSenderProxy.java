package selfStudyJava.goodPractices.proxy.example2;

import java.util.UUID;
import java.util.Optional;

public class SlackMessageSenderProxy implements MessageSender{

    private final MessageSender messageSender;
    private final SessionTokens sessionTokens;
    private final TokenValidator tokenValidator;

    public SlackMessageSenderProxy(final MessageSender messageSender, final SessionTokens sessionTokens, final TokenValidator tokenValidator) {
        this.messageSender = messageSender;
        this.sessionTokens = sessionTokens;
        this.tokenValidator = tokenValidator;
    }

    @Override
    public void sendMessage(final String channelName, final String username, final String message) {
        final Optional<UUID> userTokenOptional = sessionTokens.getUserToken(username);
        if (userTokenOptional.isPresent()) {
            final UUID existingToken = userTokenOptional.get();
            if (!tokenValidator.isExpired(existingToken)) {
                messageSender.sendMessage(channelName, username, message);
            }
        } else {
            System.out.printf("Message from %s not sent to channel %s because user has no valid access token", username, channelName);
        }
    }
}
