package bzngymapi.bzngym.services.interfaces;

import bzngymapi.bzngym.models.User;

import java.util.List;

public interface UserService {

    public List<User> getUsers();

    public void createUser(User user);
}
