package com.trainingmanagement.survetemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SurveTemplateService {

    private final SurveTemplateDao surveTemplateDao;

    @Autowired
    public SurveTemplateService(SurveTemplateDao surveTemplateDao) {
        this.surveTemplateDao = surveTemplateDao;
    }

    public List<SurveTemplate> getAll() {
        return this.surveTemplateDao.findAll();
    }

    public void create(SurveTemplate surveTemplate) {
        //Sprawdzić czy surveTemplate oraz lista jego pytań w polach id maja nulle
        //jesli nie to rzuc wyjatek

        //walidacja

        //zapis surveTemplate do bazy danych za pomoca dao
    }
}
