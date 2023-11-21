package com.example.bookmyshowsep23;

import com.example.bookmyshowsep23.controllers.UserController;
import com.example.bookmyshowsep23.dtos.SignUpRequestDto;
import com.example.bookmyshowsep23.dtos.SignUpResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class BookMyShowSep23Application implements CommandLineRunner  {
    @Autowired
    private UserController userController;

    public static void main(String[] args) {
        SpringApplication.run(BookMyShowSep23Application.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        SignUpRequestDto requestDto = new SignUpRequestDto();
        requestDto.setEmailId("abc@gmail.com");
        requestDto.setPassword("abc123");
        SignUpResponseDto responseDto = userController.singUp(requestDto);
    }
}
