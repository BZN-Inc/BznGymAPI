package bzngymapi.bzngym.services.interfaces;

import bzngymapi.bzngym.models.Exercise;

import java.util.List;

public interface ExerciseService {

    public List<Exercise> getExercises();

    public void createExercise(Exercise exercise);

}
