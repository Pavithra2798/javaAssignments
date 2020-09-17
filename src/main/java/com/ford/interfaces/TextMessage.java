package com.ford.interfaces;

public class TextMessage implements MessagingService {
    private final String message;
    private int senderNumber;
    private int receiverNumber;

    public TextMessage(int senderNumber, int receiverNumber, String message) {
        this.senderNumber = senderNumber;
        this.receiverNumber = receiverNumber;
        this.message = message;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(senderNumber + " sent a message " + message + " to " + receiverNumber);
    }

    @Override
    public void receiveMessage() {
        System.out.println("Received message is " + message);
    }
}
