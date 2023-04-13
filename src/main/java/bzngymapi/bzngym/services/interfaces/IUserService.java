package bzngymapi.bzngym.services.interfaces;

import bzngymapi.bzngym.models.User;

import java.util.List;

public interface IUserService {

    public List<User> getUsers();

    public void createUser(User user);
}
