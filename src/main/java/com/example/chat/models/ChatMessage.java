package com.example.chat.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ChatMessage {
    @JsonProperty("sender")
    private String sender;

    @JsonProperty("content")
    private String content;
}