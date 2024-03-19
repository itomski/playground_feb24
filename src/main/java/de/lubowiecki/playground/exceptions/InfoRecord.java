package de.lubowiecki.playground.exceptions;

import java.time.LocalDate;

// Ab Java 14
public record InfoRecord(String content, LocalDate createdAt) {
}
