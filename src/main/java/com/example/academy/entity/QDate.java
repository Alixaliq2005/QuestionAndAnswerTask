package com.example.academy.entity;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class QDate {

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public static LocalDate parse(String dateString) {
        return LocalDate.parse(dateString, formatter);
    }

    public static String format(LocalDate date) {
        return date.format(formatter);
    }
}
