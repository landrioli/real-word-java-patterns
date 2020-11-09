package com.patterns.creational.builder;

public class Message {
    public static class MessageBuilder {
        private String header;
        private String body;
        private String footer;
        private Priority priority;

        public MessageBuilder WithHeader(String header){
            this.header = header;
            return this;
        }
        public MessageBuilder WithBody(String body){
            this.body=body;
            return this;
        }
        public MessageBuilder WithFooter(String footer){
            this.footer = footer;
            return this;
        }
        public MessageBuilder WithPriority(Priority priority){
            this.priority = priority;
            return this;
        }

        public Message Build(){
            return new Message(this);
        }
    }

    private String header;
    private String body;
    private String footer;
    private Priority priority;

    private Message(MessageBuilder builder){
        this.header = builder.header;
        this.body = builder.body;
        this.footer = builder.footer;
        this.priority = builder.priority;
    }
}
