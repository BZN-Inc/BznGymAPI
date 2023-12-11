package bzngymapi.bzngym.services.interfaces;

import bzngymapi.bzngym.models.Exercise;

import java.util.List;
import java.util.UUID;

public interface ExerciseService {

    public List<Exercise> getExercises();

    public void createExercise(Exercise exercise);

    public void updateExercise(UUID id, Exercise updatedExercise);

    public void deleteExercise(UUID id);

}
