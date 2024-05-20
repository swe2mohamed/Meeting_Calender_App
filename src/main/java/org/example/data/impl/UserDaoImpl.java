package org.example.data.impl;

import org.example.Exception.AuthenticationFieldsException;
import org.example.Exception.UserExpiredException;
import org.example.data.UserDao;
import org.example.model.User;

import java.util.Optional;

public class UserDaoImpl implements UserDao {
    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public Optional<User> finByUsername(String userName) {
        return Optional.empty();
    }

    @Override
    public boolean authentication(User user) throws UserExpiredException, AuthenticationFieldsException {
        return false;
    }
}
