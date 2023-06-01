package com.hnust.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hnust.model.ChatMessage;

/**
 * @author 长夜
 * @date 2023/5/24 14:54
 */

public class ChatMessageUtil {
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static String getChatMessageJson(ChatMessage chatMessage) {
        try {
            return objectMapper.writeValueAsString(chatMessage);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static ChatMessage getChatMessageObject(String json) {
        try {
            return objectMapper.readValue(json, ChatMessage.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
