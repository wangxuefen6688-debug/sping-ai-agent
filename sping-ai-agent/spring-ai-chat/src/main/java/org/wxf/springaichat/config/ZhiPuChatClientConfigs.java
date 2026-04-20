package org.wxf.springaichat.config;


import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.zhipuai.ZhiPuAiChatModel;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

/***
 * @author wangxuefen
 * @description:对话使用智普模型
 */
@Configuration
public class ZhiPuChatClientConfigs {
    @Bean
    public ChatClient chatClient(ZhiPuAiChatModel zhiPuAiChatModel) {
        return ChatClient.builder(zhiPuAiChatModel).build();
    }
}
