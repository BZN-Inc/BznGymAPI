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
@Table(name = "trainings")
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Training extends AbstractEntity {

    @Column(name = "title")
    private String title;

    @Column(name = "duration")
    private Integer duration;

    @Column(name = "content")
    private String content;

    @Column(name = "backgroundImg")
    private String backgroundImg;

    @Column(name = "color")
    private String color;

}
