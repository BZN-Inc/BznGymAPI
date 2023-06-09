package bzngymapi.bzngym.models.abstracts;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.UUID;

@MappedSuperclass // marcheaza o clasa ca fiind superioara pentru clasele mostenitoare
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString
public abstract class AbstractEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private LocalDate creationDate;

    private LocalDate updatedDate;

    //private LocalDate deleteDate;
}
