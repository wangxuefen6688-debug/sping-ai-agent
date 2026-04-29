package com.example.demo.configs;


import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.MessageChatMemoryAdvisor;
import org.springframework.ai.chat.client.advisor.vectorstore.QuestionAnswerAdvisor;
import org.springframework.ai.chat.memory.ChatMemory;
import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.ai.zhipuai.ZhiPuAiChatModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChatClientConfigs {

    @Bean
    public ChatClient chatClient(ZhiPuAiChatModel zhiPuAiChatModel, ChatMemory chatMemory, VectorStore vectorStore) {
        return ChatClient.builder(zhiPuAiChatModel)
                .defaultAdvisors(MessageChatMemoryAdvisor.builder(chatMemory).build(), QuestionAnswerAdvisor.builder(vectorStore).build())
                .defaultSystem("You are a friendly chat bot that answers question with json always")
                .build();
    }
}
