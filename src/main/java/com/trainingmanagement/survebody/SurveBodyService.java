package com.trainingmanagement.survebody;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SurveBodyService {
    private final SurveBodyDao surveBodyDao;

    @Autowired
    public SurveBodyService(SurveBodyDao surveBodyDao) {
        this.surveBodyDao = surveBodyDao;
    }

}
