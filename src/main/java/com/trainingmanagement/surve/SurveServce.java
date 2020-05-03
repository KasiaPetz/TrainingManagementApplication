package com.trainingmanagement.surve;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SurveServce {
    private final SurveDao surveDao;

    @Autowired
    public SurveServce(SurveDao surveDao) {
        this.surveDao = surveDao;
    }

    public List<Surve> getAll() {
        return this.surveDao.findAll();
    }

//    public Surve saveSurve(final Surve surve) {
//        return this.surveDao.save(surve);
//    }

//    public Optional<Surve> deleteById(final Integer id) {
//        return surveDao.deleteById(id);
//    }
}
