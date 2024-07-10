package net.youssfi.configservice;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServiceApplication {

    @Value("${eureka.client.service-url.defaultZone}")
    private static String discoveryURL;
    private static final Logger logger
            = LoggerFactory.getLogger(ConfigServiceApplication.class);



    public static void main(String[] args) {

        SpringApplication.run(ConfigServiceApplication.class, args);
        logger.info("Example log from {}", discoveryURL);
    }

}
