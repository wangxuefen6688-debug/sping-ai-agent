package org.wxf.springaitoolcalling.contoller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.wxf.springaitoolcalling.service.ChatMemoryToolService;

/**
 * @author wangxuefen
 */
@RestController
@RequestMapping("/api/memory/multi-chat")
public class ChatMemoryToolController {
    @Autowired
    private ChatMemoryToolService chatMemoryService;


    @RequestMapping("/chat")
    public String chat(@RequestParam String question) {
        return chatMemoryService.chat(question);
    }
}
