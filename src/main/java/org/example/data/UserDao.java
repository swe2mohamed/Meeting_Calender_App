package org.example.data;

import org.example.Exception.AuthenticationFieldsException;
import org.example.Exception.UserExpiredException;
import org.example.model.User;

import java.util.Optional;

public interface UserDao {
    User createUser(User user);
    Optional<User> finByUsername (String userName);
    boolean authentication(User user) throws UserExpiredException, AuthenticationFieldsException;

    // Add more later on
}
