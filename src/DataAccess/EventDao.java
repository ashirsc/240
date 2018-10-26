package DataAccess;

import java.util.List;

import Models.Event;

public class EventDao {

    /**
     * Adds event to the database
     * @param event
     *
     */
    void add(Event event) {

    }

    /**
     * @param id The eventId of the event to be deleted.
     * @return true if event was deleted.
     */
    boolean delete(String id) {

        return false;
    }

    /**
     * @param userPersonId The personId for the user.
     * @return true if events were deleted.
     */
    boolean deleteAll(String userId) {

        return false;
    }

    /**
     * Method gets a event from the database if event id correlate
     * @param Id 8 character eventId
     * @return null if event doesn't exist, otherwise returns the event.
     */
    Event get(String Id) {

        return null;
    }

    /**
     * @param userPersonId The personId for the user.
     * @return All Events attach to a user.
     */
    List<Event> getAll(String userId){

        return null;
    }
}
