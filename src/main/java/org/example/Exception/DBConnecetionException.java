package org.example.Exception;

public class DBConnecetionException extends Exception{
    public DBConnecetionException(String message) {
        super(message);
    }

    public DBConnecetionException(String message, Throwable cause) {
        super(message, cause);
    }
}
