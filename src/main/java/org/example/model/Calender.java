package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Calender {
    private int id;
    private String title;
    private String username;
    private List<Meeting> meetings;

    // Creating meeting by user
    public Calender(String title, String username) {
        this.title = title;
        this.username = username;
    }

    // For find meeting by title
    public Calender(String title) {
        this.title = title;
    }

    // For Database
    public Calender(int id, String title, String username, List<Meeting> meetings) {
        this(title, username);
        this.id = id;
        this.meetings = meetings;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getUsername() {
        return username;
    }

    public List<Meeting> getMeetings() {
        return meetings;
    }

    public void addMeeting(Meeting meeting){
        if (meetings == null) meetings = new ArrayList<>();
        meetings.add(meeting);
    }

    public void removeMeeting(Meeting meeting){
        if (meetings == null) throw new IllegalArgumentException("Meeting list is null");
        if (meeting == null) throw new IllegalArgumentException("Meeting data is null.");
        meetings.remove(meeting);
    }

    public String calenderInfo(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Calender info: ").append("\n");
        stringBuilder.append("id: ").append(id).append("\n");
        stringBuilder.append("Title: ").append(title).append("\n");
        stringBuilder.append("Username: ").append(username).append("\n");


        return stringBuilder.toString();

    }
}
