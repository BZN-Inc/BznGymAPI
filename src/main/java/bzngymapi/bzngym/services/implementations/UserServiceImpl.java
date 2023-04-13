package bzngymapi.bzngym.services.implementations;

import bzngymapi.bzngym.models.User;
import bzngymapi.bzngym.repositories.UserRepository;
import bzngymapi.bzngym.services.interfaces.IUserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public void createUser(User user) {
        userRepository.save(user);
    }
}
