package org.example.model;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Optional;

public class Meeting {
    private int id;
    private String title;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String description;
    private Calendar calendar;

    // For the user
    public Meeting(String title, LocalDateTime startTime, LocalDateTime endTime, String description) {
        this.title = title;
        this.startTime = startTime;
        this.endTime = endTime;
        this.description = description;
    }

    public Meeting(String title, LocalDateTime startTime, LocalDateTime endTime, String description, Calendar calendar) {
        this(title, startTime, endTime, description);
        this.calendar = calendar;
    }

    // For Database
    public Meeting(int id, String title, LocalDateTime startTime, LocalDateTime endTime, String description, Calendar calendar) {
        this(title, startTime, endTime, description, calendar);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public String getDescription() {
        return description;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    private void timeValidation(){
        if(this.endTime.isBefore(this.startTime)){
            throw new IllegalArgumentException("End time must be after the start time");
        }
        if (this.startTime.isBefore(LocalDateTime.now())){
            throw new IllegalArgumentException("Start time must be in the future.");
        }
    }
}
