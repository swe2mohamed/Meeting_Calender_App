package org.example.data;

import org.example.model.Calender;
import org.example.model.User;

import java.util.Calendar;
import java.util.Collection;
import java.util.Optional;

public interface CalenderDao {
    /**
     * Creates a calendar.
     * @param title the title of the calendar
     * @param username the username of the owner of the calendar
     * @return the created calendar
     */
    Calender create(String title, String username);


    /**
     * Finds a calendar by its ID.
     * @param id the ID of the calendar
     * @return an Optional containing the calendar if it exists, otherwise an empty Optional
     */
    Optional<Calender> findById(int id);

    /**
     * Finds all calendars associated with a specific user.
     * @param username the username of the user
     * @return a collection of calendars that the user has
     */
    Collection<Calender> finCalendersByUsername(String username);

    /**
     * Finds a calendar by its title.
     * @param title the title of the calendar
     * @return an Optional containing the calendar if it exists, otherwise an empty Optional
     */
    Optional<Calendar> findCalendarByTitle(String title);

    /**
     * Deletes a calendar by ID.
     * @param id the ID of the calendar
     * @return true if the calendar was successfully deleted, false otherwise
     */
    boolean deleteCalendar(int calenderId);



}
