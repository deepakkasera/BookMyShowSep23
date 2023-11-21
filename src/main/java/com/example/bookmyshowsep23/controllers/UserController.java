package com.example.bookmyshowsep23.controllers;

import com.example.bookmyshowsep23.dtos.SignUpRequestDto;
import com.example.bookmyshowsep23.dtos.SignUpResponseDto;
import com.example.bookmyshowsep23.models.ResponseStatus;
import com.example.bookmyshowsep23.models.User;
import com.example.bookmyshowsep23.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    private UserService userService;

    UserController(UserService userService) {
        this.userService = userService;
    }

    public SignUpResponseDto singUp(SignUpRequestDto requeUstDto) {
        User user;
        SignUpResponseDto responseDto = new SignUpResponseDto();

        try {
            user = userService.signUp(requeUstDto.getEmailId(), requeUstDto.getPassword());

            responseDto.setResponseStatus(ResponseStatus.SUCCESS);
            responseDto.setUserId(user.getId());
        } catch (Exception e) {
            responseDto.setResponseStatus(ResponseStatus.FAILURE);
            responseDto.setUserId(-1L);
        }

        return responseDto;
    }
}
