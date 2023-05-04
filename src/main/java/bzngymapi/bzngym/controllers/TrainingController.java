package bzngymapi.bzngym.controllers;

import bzngymapi.bzngym.models.Training;
import bzngymapi.bzngym.services.implementations.TrainingServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "/bzngym/v1/trainings")
@RequiredArgsConstructor
public class TrainingController {

    private final TrainingServiceImpl trainingService;

    @GetMapping
    public List<Training> getTrainings() {
        return trainingService.getTrainings();
    }

    @PostMapping
    public void createTraining(@RequestBody Training training) {
        trainingService.createTraining(training);
    }
}
