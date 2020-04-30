package com.trainingmanagement.training;

import org.springframework.stereotype.Component;


@Component
public class TrainingMapper {

    private TrainingDto toDto(Training training) {
        return new TrainingDto(
                training.getId(),
                training.getTitle(),
                training.getTrainingDate(),
                training.getCity());
    }
}
