package com.trainingmanagement.training;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;


@Component
public class TrainingMapper {

    public TrainingDto toDto(Training training) {
        return new TrainingDto(
                training.getId(),
                training.getTitle(),
                training.getTrainingDate(),
                training.getCity());
    }

    public List<TrainingDto> toDto(List<Training> trainings) {
        return trainings.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

}
