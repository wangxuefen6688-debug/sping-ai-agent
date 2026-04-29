package org.wxf.springaitoolcalling.tools;


import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.context.annotation.Bean;

@Slf4j
public class MathTools {
    @Bean
    @Tool(description="计算两个数的和")
    public double sqrt(Integer a, Integer b) {
        log.info("=============sqrt=============a:{},b:{}", a, b);
        return a + b;
    }
}
