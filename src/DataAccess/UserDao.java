package DataAccess;

import java.util.List;

import Models.User;

public class UserDao {

    /**
     * Adds user object to the database
     * @param user
     */
    void add(User user) {
        return;
    }

    /**
     * @param userId of user to be deleted.
     * @return true if user was deleted.
     */
    boolean delete(String userId) {

        return false;
    }

    /**
     * @return true if all users are successfully deleted.
     */
    boolean deleteAll() {
        return false;
    }
    /**
     * Gets user out of the database if user is found.
     * @param userName
     * @return
     */
    User get(String userName) {

        return null;
    }

    /**
     * @return list of all users in database.
     */
    List<User> getAll() {
        return null;
    }
}
