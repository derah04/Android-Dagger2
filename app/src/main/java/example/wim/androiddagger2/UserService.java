package example.wim.androiddagger2;

/**
 * Created by Wim on 8/12/16.
 */
public class UserService {

    private User user;

    public UserService(User user) {
        this.user = user;
    }

    public void addNewUser(String id, String firstname, String lastname) {
        user.setId(id);
        user.setFirstName(firstname);
        user.setLastName(lastname);
    }

    public User getUser() {
        return user;
    }

}
