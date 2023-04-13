package bzngymapi.bzngym.models;

import bzngymapi.bzngym.models.abstracts.AbstractEntity;
import bzngymapi.bzngym.models.enums.gender;
import bzngymapi.bzngym.models.enums.trainingType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Entity
@Table(name = "users")
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class User extends AbstractEntity {

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "address")
    private String address;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;

    @Column(name = "birthDay")
    private LocalDate birthDay;

    @Column(name = "trainingType")
    @Enumerated(EnumType.STRING)
    private trainingType trainingType;

    @Column(name = "gender")
    @Enumerated(EnumType.STRING)
    private gender gender;

    @Column(name = "weight")
    private Double weight;

    @Column(name = "height")
    private Double height;

}
