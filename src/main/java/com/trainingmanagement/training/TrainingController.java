package com.trainingmanagement.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/training")
public class TrainingController {

    private final TrainingService trainingService;
    private final TrainingMapper trainingMapper;

    @Autowired
    public TrainingController(TrainingService trainingService, TrainingMapper trainingMapper) {
        this.trainingService = trainingService;
        this.trainingMapper = trainingMapper;
    }

    @GetMapping("/getAll")
    public List<TrainingDto> getAll() {
        final List<Training> trainings = this.trainingService.getAll();

        return this.trainingMapper.toDto(trainings);
    }

}
