package org.wxf.springaichat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.wxf.springaichat.service.ChatService;

@RestController
@RequestMapping("/api/multi-chat")
public class ChatController {

    @Autowired
    private  ChatService chatService;

    @RequestMapping("/chat")
    public String chat(@RequestParam String question) {
        return chatService.chat(question);
    }

}
