package bzngymapi.bzngym.authentication;

import bzngymapi.bzngym.configuration.JwtService;
import bzngymapi.bzngym.models.User;
import bzngymapi.bzngym.models.enums.Role;
import bzngymapi.bzngym.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;

    private final AuthenticationManager authenticationManager;

    public AuthenticationResponse register(RegisterRequest request) {
        var user = User.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .email(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                .address(request.getAddress())
                .phone(request.getPhone())
                .birthDay(request.getBirthDay())
                .gender(request.getGender())
                .weight(request.getWeight())
                .height(request.getHeight())
                .role(Role.USER)
                .build();
        userRepository.save(user);

        var jwtToken = jwtService.generateToken(user);
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();
    }

    public AuthenticationResponse authenticate(AuthenticationRequest request) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getEmail(),
                        request.getPassword()
                )
        );
        // In acest punct, userul este autentificat: username-ul si password-ul sunt corecte
        // Trb sa generam un token si sa-l trimitem inapoi
        var user = userRepository.findByEmail(request.getEmail())
                .orElseThrow(); // adaugare exceptie

        var jwtToken = jwtService.generateToken(user);
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();
    }
}
