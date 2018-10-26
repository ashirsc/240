package Result;

public class LoginResult extends Result {
    String authToken;
    String userName;
    String personId;
    String errorMessage;

    public LoginResult(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public LoginResult(String authToken, String userName, String personId) {
        this.authToken = authToken;
        this.userName = userName;
        this.personId = personId;
    }

    public String getAuthToken() {
        return authToken;
    }

    public String getUserName() {
        return userName;
    }

    public String getPersonId() {
        return personId;
    }
}
