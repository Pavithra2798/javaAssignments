package com.ford.interfaces;

public class Email implements MessagingService {
    private final String smtpAddress;
    private final String message;
    private String senderEmail;
    private String receiverEmail;

    public Email(String senderMail, String receiverEmail,String smtpAddress,String message) {
        this.receiverEmail= receiverEmail;
        this.senderEmail = senderMail;
        this.smtpAddress = smtpAddress;
        this.message = message;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(senderEmail + " sent an email " + message + " to " + receiverEmail + " via " + smtpAddress);
    }

    @Override
    public void receiveMessage() {
        System.out.println("Received email is " + message);
    }
}
