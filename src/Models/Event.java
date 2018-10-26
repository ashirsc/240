package Models;

public class Event {

    String envetId;
    String eventType;
    String Descendant;
    String personId;
    int latitude;
    int longitude;
    String conntry;
    String city;
    int year;

    public String getEnvetId() {
        return envetId;
    }

    public void setEnvetId(String envetId) {
        this.envetId = envetId;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getDescendant() {
        return Descendant;
    }

    public void setDescendant(String descendant) {
        Descendant = descendant;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    public String getConntry() {
        return conntry;
    }

    public void setConntry(String conntry) {
        this.conntry = conntry;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
