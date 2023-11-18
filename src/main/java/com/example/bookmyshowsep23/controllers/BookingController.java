package com.example.bookmyshowsep23.controllers;

import com.example.bookmyshowsep23.dtos.BookMovieRequestDto;
import com.example.bookmyshowsep23.dtos.BookMovieResponseDto;
import com.example.bookmyshowsep23.models.Booking;
import com.example.bookmyshowsep23.models.Payment;
import com.example.bookmyshowsep23.models.ResponseStatus;
import com.example.bookmyshowsep23.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BookingController {
    private BookingService bookingService;

    @Autowired
    BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }
    //Dependency Injection -> Spring is a Dependency Injection framework.

    BookMovieResponseDto bookMovie(BookMovieRequestDto requestDto) {
        //DTO -> Data Transfer Objects
        BookMovieResponseDto responseDto = new BookMovieResponseDto();

        try {
            Booking booking = bookingService.bookMovie(
                    requestDto.getUserId(),
                    requestDto.getShowId(),
                    requestDto.getShowSeatId()
            );

            responseDto.setBookingId(booking.getId());
            responseDto.setResponseStatus(ResponseStatus.SUCCESS);
            responseDto.setAmount(booking.getPrice());
        } catch (Exception e) {
            responseDto.setResponseStatus(ResponseStatus.FAILURE);
        }

        return responseDto;
    }
}