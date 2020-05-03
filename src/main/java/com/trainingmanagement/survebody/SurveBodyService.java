package com.trainingmanagement.survebody;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SurveBodyService {
    private final SurveBodyDao surveBodyDao;

    @Autowired
    public SurveBodyService(SurveBodyDao surveBodyDao) {
        this.surveBodyDao = surveBodyDao;
    }

    public List<SurveBody> getAll() {
        return this.surveBodyDao.findAll();
    }

//    public Long countAll() {
//        return this.surveBodyDao.count();
//    }

}
