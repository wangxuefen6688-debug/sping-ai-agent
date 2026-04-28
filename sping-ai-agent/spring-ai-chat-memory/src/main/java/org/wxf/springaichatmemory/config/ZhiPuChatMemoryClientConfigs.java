package org.wxf.springaichatmemory.config;


import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.MessageChatMemoryAdvisor;
import org.springframework.ai.chat.memory.ChatMemory;
import org.springframework.ai.zhipuai.ZhiPuAiChatModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wangxuefen
 */
@Configuration
public class ZhiPuChatMemoryClientConfigs {


    @Bean
    public ChatClient chatClient(ZhiPuAiChatModel zhiPuAiChatModel, ChatMemory chatMemory) {

        return ChatClient.builder(zhiPuAiChatModel)
                .defaultAdvisors(MessageChatMemoryAdvisor.builder(chatMemory).build())
                .defaultSystem("你要解决用户的问题")
                .build();
    }
}
