package org.example.data.impl;

import org.example.data.MeetingDao;
import org.example.model.Meeting;

import java.util.Collection;
import java.util.Optional;

public class MeetingDaoImpl implements MeetingDao {
    @Override
    public Meeting createMeeting(Meeting meeting) {
        return null;
    }

    @Override
    public Optional<Meeting> finById(int id) {
        return Optional.empty();
    }

    @Override
    public Collection<Meeting> findAllMeetingByCalendarId(int calenderId) {
        return null;
    }

    @Override
    public boolean deleteMeeting(int meetingId) {
        return false;
    }
}
