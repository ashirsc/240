package Service;

import java.security.InvalidParameterException;
import java.util.Set;

import Exceptions.InternalServerError;
import Exceptions.UnauthorizedException;
import Models.Person;

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
