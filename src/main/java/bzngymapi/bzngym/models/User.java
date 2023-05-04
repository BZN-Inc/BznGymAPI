package bzngymapi.bzngym.models;

import bzngymapi.bzngym.models.abstracts.AbstractEntity;
import bzngymapi.bzngym.models.enums.Gender;
import bzngymapi.bzngym.models.enums.Role;
import bzngymapi.bzngym.models.enums.TrainingType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.OneToMany;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "users")
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class User extends AbstractEntity implements UserDetails {

    @Column(name = "firstName", nullable = false)
    private String firstName;

    @Column(name = "lastName", nullable = false)
    private String lastName;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "password", nullable = false)
    @JsonIgnore
    private String password;

    @Column(name = "address")
    private String address;

    @Column(name = "phone")
    private String phone;

    @Column(name = "birthDay", nullable = false)
    private LocalDate birthDay;

    @Column(name = "trainingType")
    @Enumerated(EnumType.STRING)
    private TrainingType trainingType = TrainingType.BEGINNER;

    @Column(name = "gender", nullable = false)
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name = "weight", nullable = false)
    private Double weight;

    @Column(name = "height", nullable = false)
    private Double height;

    @Column(name = "role", nullable = false)
    @Enumerated(EnumType.STRING)
    @JsonIgnore
    private Role role = Role.USER;

    @OneToMany(mappedBy = "user")
    @Column(name = "trainings")
    private Set<Training> trainings;

    @Override
    @JsonIgnore
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(role.name()));
    }

    @Override
    public String getPassword() {
        return password;
    }
    @Override
    @JsonIgnore
    public String getUsername() {
        return email;
    }

    @Override
    @JsonIgnore
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    @JsonIgnore
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    @JsonIgnore
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    @JsonIgnore
    public boolean isEnabled() {
        return true;
    }
}
