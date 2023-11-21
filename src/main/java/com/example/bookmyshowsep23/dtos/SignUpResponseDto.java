package com.example.bookmyshowsep23.dtos;

import com.example.bookmyshowsep23.models.ResponseStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignUpResponseDto {
    private ResponseStatus responseStatus;
    private Long userId;
}
