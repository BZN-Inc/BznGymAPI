package bzngymapi.bzngym.models;

import bzngymapi.bzngym.models.abstracts.AbstractEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


@Entity
@Table(name = "exercises")
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Exercise extends AbstractEntity {

    @Column(name = "firstName", nullable = false)
    private String name;

    @Column(name = "setNumber", nullable = false)
    private Integer setNumber;

    @Column(name = "repNumber", nullable = false)
    private Integer repNumber;

    @Column(name = "pauseTime", nullable = false)
    private Integer pauseTime;

    @Column(name = "image", nullable = false)
    private String image; //URL type
}
