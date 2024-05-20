package org.example.data.impl;

import org.example.data.CalenderDao;
import org.example.model.Calender;

import java.util.Calendar;
import java.util.Collection;
import java.util.Optional;

public class CalenderDaoImpl implements CalenderDao {
    @Override
    public Calender create(String title, String username) {
        return null;
    }

    @Override
    public Optional<Calender> findById(int id) {
        return Optional.empty();
    }

    @Override
    public Collection<Calender> finCalendersByUsername(String username) {
        return null;
    }

    @Override
    public Optional<Calendar> findCalendarByTitle(String title) {
        return Optional.empty();
    }

    @Override
    public boolean deleteCalendar(int calenderId) {
        return false;
    }
}
