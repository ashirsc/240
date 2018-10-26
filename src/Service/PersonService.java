package Service;

import Exceptions.InternalServerError;
import Exceptions.UnauthorizedException;
import Models.Person;

import java.security.InvalidParameterException;
import java.util.Set;

public class PersonService {


    /**
     * @param personId
     * @return Person with given person id.
     * Auth required
     */
    Person person(String personId) throws UnauthorizedException,
            InvalidParameterException, InternalServerError, IllegalAccessError {
        return null;
    }

    Set<Person> people() throws UnauthorizedException, InternalServerError {
        return null;
    }
}
