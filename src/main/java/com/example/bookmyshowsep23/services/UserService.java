package com.example.bookmyshowsep23.services;

import com.example.bookmyshowsep23.exceptions.InvalidUserException;
import com.example.bookmyshowsep23.models.User;
import com.example.bookmyshowsep23.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserService {
    private UserRepository userRepository;

    UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public User signUp(String emailId, String password) throws InvalidUserException {
        Optional<User> optionalUser = userRepository.findByEmail(emailId);

        //If the user is present in the DB then go to login workflow else call the signUp workflow.
        if (optionalUser.isPresent()) {
            return login(emailId, password);
        }

        User user = new User();
        user.setBookings(new ArrayList<>());
        user.setEmail(emailId);
        user.setPassword(password);

        //save the user to DB.
        return userRepository.save(user);
    }

    public User login(String emailId, String password) {
        return null;
    }
}
