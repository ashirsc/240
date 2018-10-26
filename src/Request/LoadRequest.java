package Request;

import Models.Event;
import Models.Person;
import Models.User;

import java.util.Set;
import java.util.TreeSet;

public class LoadRequest {

    Set<User> users = new TreeSet<>();
    Set<Person> persons = new TreeSet<>();
    Set<Event> events = new TreeSet<>();

}
