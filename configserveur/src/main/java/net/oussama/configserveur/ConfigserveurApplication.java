package net.oussama.configserveur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigserveurApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigserveurApplication.class, args);
    }

}
