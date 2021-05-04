package com.spring.consumingrestdemo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsumingRestDemoApplication {
    //private String theUrl="http://localhost:8081/greeting";
    private String theUrl="https://quoters.apps.pcfone.io/api/random";

    private static final Logger log = LoggerFactory.getLogger(ConsumingRestDemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ConsumingRestDemoApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {

        return args -> {
            Quote quote = restTemplate.getForObject(theUrl, Quote.class);
            log.info(quote.toString());
            };
        }
    }

