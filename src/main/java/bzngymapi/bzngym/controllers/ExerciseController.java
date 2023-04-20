package bzngymapi.bzngym.controllers;

import bzngymapi.bzngym.models.Exercise;
import bzngymapi.bzngym.services.implementations.ExerciseServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/bzngym/v1/exercises")
public class ExerciseController {

    private final ExerciseServiceImpl exerciseService;

    public ExerciseController (ExerciseServiceImpl exerciseService) {
        this.exerciseService = exerciseService;
    }

    @GetMapping
    public List<Exercise> getExercises() {
        return exerciseService.getExercises();
    }

    @PostMapping
    public void createExercise(@RequestBody Exercise exercise) {
        exerciseService.createExercise(exercise);
    }

}
