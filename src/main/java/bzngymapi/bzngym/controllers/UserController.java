package bzngymapi.bzngym.controllers;

import bzngymapi.bzngym.models.User;
import bzngymapi.bzngym.services.implementations.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/bzngym/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserServiceImpl userService;

    @GetMapping
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @PostMapping
    public void createUser(@RequestBody User user) {
        userService.createUser(user);
    }
}
