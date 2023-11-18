package com.example.bookmyshowsep23.services;

import com.example.bookmyshowsep23.exceptions.InvalidUserException;
import com.example.bookmyshowsep23.models.Booking;
import com.example.bookmyshowsep23.models.Show;
import com.example.bookmyshowsep23.models.ShowSeat;
import com.example.bookmyshowsep23.models.User;
import com.example.bookmyshowsep23.repositories.ShowRepository;
import com.example.bookmyshowsep23.repositories.ShowSeatRepository;
import com.example.bookmyshowsep23.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.List;
import java.util.Optional;

@Service
public class BookingService {
    private UserRepository userRepository;
    private ShowRepository showRepository;
    private ShowSeatRepository showSeatRepository;

    @Autowired
    BookingService(UserRepository userRepository, ShowRepository showRepository,
                   ShowSeatRepository showSeatRepository) {
        this.showRepository = showRepository;
        this.userRepository = userRepository;
        this.showSeatRepository = showSeatRepository;
    }
    public Booking bookMovie(Long userId, Long showId, List<Long> showSeatIds) throws InvalidUserException {
        //STEPS:
        //1. Get user with the userId.
        //2. Get show with the showId.
        //3. Get showSeats with showSeatIds.
        //4. Check if seats are available or not.
        //5. if no, throw an exception.
        //6. If yes, Mark the seat status as BLOCKED.
        //7. Save the updated status in DB.
        //8. Create the booking object with PENDING status.
        //9. Return the booking object.

        //1. Get user with the userId.
        Optional<User> optionalUser = userRepository.findById(userId);

        if (optionalUser.isEmpty()) {
            throw new InvalidUserException("Invalid User");
        }

        return null;
    }
}
