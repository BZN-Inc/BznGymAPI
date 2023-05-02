package bzngymapi.bzngym.services.implementations;

import bzngymapi.bzngym.models.Training;
import bzngymapi.bzngym.repositories.TrainingRepository;
import bzngymapi.bzngym.services.interfaces.TrainingService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainingServiceImpl implements TrainingService {

    private final TrainingRepository trainingRepository;

    public TrainingServiceImpl(TrainingRepository trainingRepository) {
        this.trainingRepository = trainingRepository;
    }


    @Override
    public List<Training> getTrainings() {
        return trainingRepository.findAll();
    }

    @Override
    public void createTraining(Training training) {
        trainingRepository.save(training);
    }
}
