package org.wxf.springaitoolcalling.service;


import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wangxuefen
 */
@Service
public class ChatMemoryToolService {
    @Autowired
    private ChatClient chatClient;
    private static final String CONVERSATION_ID = "naming-20250528";
    public String chat(String question) {

        ChatClient.CallResponseSpec user = chatClient.prompt()
                .user(question)
                .advisors(e->e.param("conversation_id",CONVERSATION_ID))
                .call();
        return user.chatClientResponse().chatResponse().getResult().getOutput().getText();
    }
}
