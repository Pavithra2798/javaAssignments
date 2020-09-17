package com.ford.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class MessagingServiceTest {
    @Test
    public void shouldSendTextMessage() {
        MessagingService textMessage = new TextMessage(12345,123456,"Hi");
        textMessage.sendMessage("Hi");
        textMessage.receiveMessage();
        Assert.assertNotNull(textMessage);
    }

    @Test
    public void shouldSendEmail() {
        MessagingService email = new Email("pavi@gmail.com","y@gmail.com", "smtp.gmail.com","hello");
        email.sendMessage("hello");
        email.receiveMessage();
        Assert.assertNotNull(email);
    }
}
