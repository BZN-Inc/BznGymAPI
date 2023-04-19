package bzngymapi.bzngym.services.implementations;

import bzngymapi.bzngym.models.User;
import bzngymapi.bzngym.repositories.UserRepository;
import bzngymapi.bzngym.services.interfaces.IUserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.regex.Pattern;

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

    public static boolean isEmailValid (String emailAddress) {
        return Pattern.compile("^(.+)@(\\S+)$")
                .matcher(emailAddress)
                .matches();
    }

    public static boolean isPhoneValid (String phoneNumber) {
        return Pattern.compile("^(\\+\\d{1,3}( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$")
                .matcher(phoneNumber)
                .matches();
    }

}
