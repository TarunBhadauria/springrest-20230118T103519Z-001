package com.springrest.exception;

public class CourseException extends RuntimeException {
    String message = "Something wrong happened";
    public CourseException(String message) {
        super(message);
    } }
