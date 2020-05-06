package com.trainingmanagement.surve;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SurveService {
    private final SurveDao surveDao;

    @Autowired
    public SurveService(SurveDao surveDao) {
        this.surveDao = surveDao;
    }

}
