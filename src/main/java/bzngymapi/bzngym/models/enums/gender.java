package bzngymapi.bzngym.models.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.Optional;

@Getter
@AllArgsConstructor
public enum gender {

    MALE("male"),
    FEMALE("female");

    private final String type;

    public static Optional<gender> getGenderByFieldString(String field) {
        return Arrays.stream(gender.values())
                .filter(genderElement -> genderElement.type.equals(field))
                .findAny();
    }
}
