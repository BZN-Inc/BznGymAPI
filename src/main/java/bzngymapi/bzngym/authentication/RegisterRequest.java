package bzngymapi.bzngym.authentication;

import bzngymapi.bzngym.models.enums.Gender;
import bzngymapi.bzngym.models.enums.Role;
import bzngymapi.bzngym.models.enums.TrainingType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.random.RandomGenerator;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String address;
    private String phone;
    private LocalDate birthDay;
    private Gender gender;
    private Double weight;
    private Double height;
    private Role role = Role.USER;
}
