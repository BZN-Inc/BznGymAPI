package bzngymapi.bzngym.services.interfaces;

import bzngymapi.bzngym.models.Training;

import java.util.List;

public interface TrainingService {

    public List<Training> getTrainings();

    public void createTraining(Training training);
}
