package DataAccess;

import java.util.List;

import Models.Auth;

/**
 *
 */
public class AuthTokenDao extends Database {

    /**
     * @param authToken
     * Adds a auth token to the database.
     */
    void add(Auth authToken) {

    }

    /**
     * @param userName of the Auth to be deleted.
     * @return true if successful.
     */
    boolean delete(String userName) {
        return false;
    }

    /**
     * @return true if successful.
     */
    boolean deleteAll() {
        return false;
    }

    /**
     * @param authToken
     * @return true if auth token is in the database
     */
    boolean get(String authToken) {
        return false;
    }

    List<String> getAll() {
        return null;
    }
}
