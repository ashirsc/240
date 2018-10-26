package DataAccess;

import java.util.List;

import Models.Person;

public class PersonDao {

    /**
     * Adds a person object to the database.
     * @param person
     */
    void addPerson(Person person) {

    }

    /**
     * @param id of person to be deleted.
     * @return true if person was successfully deleted.
     */
    boolean delete(String id) {

        return false;
    }

    /**
     * @param userPersonId personId of user.
     * @return true if deletion was succesful
     */
    boolean deleteAll(String userPersonId) {

        return false;
    }

    /**
     * Gets a person object form the database
     * @param id 8 character personId
     * @return
     */
    Person getPerson(String id) {

        return null;
    }

    /**
     * @param userPersonId personId of the user.
     * @return All persons that are decendent of the user.
     */
    List<Person> getAll(String userPersonId) {

        return null;
    }


}
