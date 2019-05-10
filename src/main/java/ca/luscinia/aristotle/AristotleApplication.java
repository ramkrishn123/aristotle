package ca.luscinia.aristotle;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@EnableAsync
@EnableCaching
@EnableAdminServer
public class AristotleApplication {

    public static void main(String[] args) {
        
        SpringApplication.run(AristotleApplication.class, args);
    }

}
