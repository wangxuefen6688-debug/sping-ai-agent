package org.wxf.springaichatmemory.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.wxf.springaichatmemory.service.ChatMemoryService;

/**
 * @author wangxuefen
 */
@RestController
@RequestMapping("/api/memory/multi-chat")
public class ChatMemoryController {
    @Autowired
    private ChatMemoryService chatMemoryService;


    @RequestMapping("/chat")
    public String chat(@RequestParam String question) {
        return chatMemoryService.chat(question);
    }
}
