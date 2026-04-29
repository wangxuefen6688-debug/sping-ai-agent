package org.wxf.springaitoolcalling.configs;


import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.MessageChatMemoryAdvisor;
import org.springframework.ai.chat.memory.ChatMemory;
import org.springframework.ai.zhipuai.ZhiPuAiChatModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.wxf.springaitoolcalling.tools.DateTimeTools;
import org.wxf.springaitoolcalling.tools.MathTools;

@Configuration
public class ChatClientConfigs {
    @Bean
    public ChatClient chatClient(ZhiPuAiChatModel zhiPuAiChatModel, ChatMemory chatMemory) {
        return ChatClient.builder(zhiPuAiChatModel)
                .defaultTools(new DateTimeTools(), new MathTools())
                .defaultAdvisors(MessageChatMemoryAdvisor.builder(chatMemory).build())
                .build();
    }
}
