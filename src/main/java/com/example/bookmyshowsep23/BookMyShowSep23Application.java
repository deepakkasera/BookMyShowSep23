package com.example.bookmyshowsep23;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class BookMyShowSep23Application {

    public static void main(String[] args) {
        SpringApplication.run(BookMyShowSep23Application.class, args);

    }

}
