import javax.persistence.Embeddable;

/**
 * Created by yashi on 05-07-2017.
 */

@Embeddable
public class Address {
    Integer streetNo;
    String location;
    String state;

    public Integer getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(Integer streetNo) {
        this.streetNo = streetNo;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
