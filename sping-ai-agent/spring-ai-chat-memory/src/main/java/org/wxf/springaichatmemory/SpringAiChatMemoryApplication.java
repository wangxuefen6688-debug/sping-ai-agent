package org.wxf.springaichatmemory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {
        org.springframework.ai.model.ollama.autoconfigure.OllamaApiAutoConfiguration.class,
        org.springframework.ai.model.ollama.autoconfigure.OllamaChatAutoConfiguration.class,
        org.springframework.ai.model.ollama.autoconfigure.OllamaEmbeddingAutoConfiguration.class
})
public class SpringAiChatMemoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAiChatMemoryApplication.class, args);
    }

}
