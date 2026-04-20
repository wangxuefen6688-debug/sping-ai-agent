package org.wxf.springaichat.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.ChatClientResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.ollama.api.OllamaApi;
import org.springframework.ai.zhipuai.ZhiPuAiChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wxf.springaichat.controller.ChatController;

@Service
public class ChatService {
    @Autowired
    private ChatClient chatClient;
    public String chat(String question) {
        ChatClient.CallResponseSpec user = chatClient.prompt()
                .user(question)
                .system("You are a helpful assistant.")
                .call();
        ChatClientResponse chatClientResponse = user.chatClientResponse();
        if (chatClientResponse.chatResponse() != null) {
            return chatClientResponse.chatResponse().getResult().getOutput().getText();
        }
        return "Sorry, I don't know the answer to your question.";
    }
}
