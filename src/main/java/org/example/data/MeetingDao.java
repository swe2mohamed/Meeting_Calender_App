package org.example.data;

import org.example.model.Meeting;

import java.util.Collection;
import java.util.Optional;

public interface MeetingDao {
    Meeting createMeeting(Meeting meeting);
    Optional<Meeting> finById(int id);
    Collection<Meeting> findAllMeetingByCalendarId(int calenderId);
    boolean deleteMeeting(int meetingId);

    // Add more methods as needed
}
