package com.consumption.consumption.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Bu sınıf, CORS (Cross-Origin Resource Sharing) yapılandırmasını sağlar.
 * React uygulamasının backend'e erişimini sağlar.
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // Tüm URL'ler için CORS yapılandırması
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:5173")  // React uygulamasının çalıştığı URL
                .allowedMethods("GET", "POST", "PUT", "DELETE", "HEAD")
                .allowCredentials(true);
    }
}
