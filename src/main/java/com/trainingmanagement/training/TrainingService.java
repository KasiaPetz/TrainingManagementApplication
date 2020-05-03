package com.trainingmanagement.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainingService {

    private final TrainingDao trainingDao;

    @Autowired
    public TrainingService(TrainingDao trainingDao) {
        this.trainingDao = trainingDao;
    }

    public List<Training> getAll() {
        return this.trainingDao.findAll();
    }

}
