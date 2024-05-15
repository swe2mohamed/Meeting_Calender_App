package org.example.model;

import java.security.SecureRandom;
import java.util.Random;

public class User {
    private String username;
    private String password;
    private boolean expired;


    // "Registration": Constructor to register a new user to a database.
    public User(String username) {
        this.username = username;
    }

    // "Authentication": Constructor to authentication.
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(String username, String password, boolean expired) {

        this.expired = expired;
    }

    public String getUsername() {
        return username;
    }

    public boolean isExpired() {
        return expired;
    }

    public String userInfo() {
        return
                "username='" + username + '\'' +
                ", password='" + password + '\'';
    }

    private String generateRandomPassword() {
        String allowedCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int passwordLength = 10;
        StringBuilder stringBuilder = new StringBuilder();

        Random random = new SecureRandom();
        for (int i = 0; i < passwordLength ; i++){
            int randomIndex = random.nextInt(allowedCharacters.length());
            char randomChar = allowedCharacters.charAt(randomIndex);
            stringBuilder.append(randomChar);

        }
        return stringBuilder.toString();
    }

    public void newPassword(){
        this.password = generateRandomPassword();
    }


}
