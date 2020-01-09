package com.spring.lesson.exception;

public class StorageFileNotFoundException extends Throwable {
    public StorageFileNotFoundException() {
    }

    public StorageFileNotFoundException(String message) {
        super(message);
    }

    public StorageFileNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public StorageFileNotFoundException(Throwable cause) {
        super(cause);
    }
}
