package Service;

import java.security.InvalidParameterException;
import java.util.Set;

import Exceptions.InternalServerError;
import Exceptions.UnauthorizedException;
import Models.Event;

public class EventService {

    /**
     * @return event for given eventId
     */
    Event event(String eventId) throws UnauthorizedException, InvalidParameterException,
            IllegalAccessError, InternalServerError {
        return null;
    }

    /**
     * @return all events for associated with the user
     * @throws UnauthorizedException, bad auth token
     * @throws InternalServerError
     */
    Set<Event> event() throws UnauthorizedException, InternalServerError {
        return null;
    }
}
