package com.codegym.demo.config;

import com.codegym.demo.service.ITagService;
import com.codegym.demo.service.impl.TagServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class AppConfig implements WebMvcConfigurer {

    @Bean
    public ITagService tagService() {
        return new TagServiceImpl();
    }
}
