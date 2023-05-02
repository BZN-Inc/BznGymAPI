package bzngymapi.bzngym.services.implementations;

import bzngymapi.bzngym.models.Exercise;
import bzngymapi.bzngym.repositories.ExerciseRepository;
import bzngymapi.bzngym.services.interfaces.ExerciseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExerciseServiceImpl implements ExerciseService {

    private final ExerciseRepository exerciseRepository;

    public ExerciseServiceImpl(ExerciseRepository exerciseRepository){
        this.exerciseRepository = exerciseRepository;
    }

    @Override
    public List<Exercise> getExercises() {
        return exerciseRepository.findAll();
    }

    @Override
    public void createExercise(Exercise exercise) {
        exerciseRepository.save(exercise);
    }
}
