package org.wxf.springaitoolcalling.configs;


import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.MessageChatMemoryAdvisor;
import org.springframework.ai.chat.memory.ChatMemory;
import org.springframework.ai.tool.ToolCallback;
import org.springframework.ai.tool.function.FunctionToolCallback;
import org.springframework.ai.zhipuai.ZhiPuAiChatModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.wxf.springaitoolcalling.tools.DateTimeTools;
import org.wxf.springaitoolcalling.tools.MathTools;
import org.wxf.springaitoolcalling.tools.fuction.ProductFuctionReq;
import org.wxf.springaitoolcalling.tools.fuction.ProductFuctionTool;

@Configuration
public class ChatClientConfigs {

    ToolCallback toolCallback = FunctionToolCallback.builder("findProduct",  new ProductFuctionTool())
            .inputType(ProductFuctionReq.class).build();




    @Bean
    public ChatClient chatClient(ZhiPuAiChatModel zhiPuAiChatModel, ChatMemory chatMemory) {
        return ChatClient.builder(zhiPuAiChatModel)
                .defaultTools(new DateTimeTools(), new MathTools())
                .defaultAdvisors(MessageChatMemoryAdvisor.builder(chatMemory).build())
                .defaultToolCallbacks(toolCallback)
                .build();
    }
}
