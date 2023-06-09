package bzngymapi.bzngym.services.interfaces;

import bzngymapi.bzngym.models.Training;

import java.util.List;
import java.util.UUID;

public interface TrainingService {

    public List<Training> getTrainings();

    public void createTraining(Training training);

    public void updateTraining(UUID id, Training updatedTraining);

    public void deleteTraining(UUID id);
}
