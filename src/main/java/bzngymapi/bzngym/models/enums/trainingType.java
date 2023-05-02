package bzngymapi.bzngym.models.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.Optional;

@Getter
@AllArgsConstructor
public enum TrainingType {

    BEGINNER("beginner"),
    INTERMEDIATE("intermediate"),
    ADVANCED("advanced");

    private final String type;

    public static Optional<TrainingType> getTrainingTypeByFieldString(String field) {
        return Arrays.stream(TrainingType.values())
                .filter(trainingTypeElement -> trainingTypeElement.type.equals(field))
                .findAny();
    }
}
