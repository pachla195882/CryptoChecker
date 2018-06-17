package com.radpac.CryptoChecker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class CryptoCheckerApplication {

    private static final Logger log = LoggerFactory.getLogger(CryptoCheckerApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(CryptoCheckerApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
            Ticker btcplnticker = restTemplate.getForObject("https://bitbay.net/API/Public/BTCPLN/ticker.json", Ticker.class);
            log.info(btcplnticker.toString());
        };
    }
}
