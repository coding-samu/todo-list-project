package com.project.todolist.config;  // Usa il pacchetto appropriato per il tuo progetto

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:3000")  // Modifica con l'URL del tuo frontend
                .allowedMethods("GET", "POST", "PUT", "DELETE")  // Metodi HTTP permessi
                .allowedHeaders("*");  // Testate HTTP permessi
    }
}
