package bzngymapi.bzngym.services.interfaces;

import bzngymapi.bzngym.models.User;

import java.util.List;
import java.util.UUID;

public interface UserService {

    public List<User> getUsers();

    public void createUser(User user);

    public void updateUser(UUID id, User updatedUser);

    public void deleteUser(UUID id);
}
