package com.trainingmanagement.survetemplate;

import com.trainingmanagement.question.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Transactional
    public void create(SurveTemplate surveTemplate) {
        if(surveTemplate.getId() != null) {
            throw new IllegalArgumentException("SurveTemplate can not have id while creating. Id: " + surveTemplate.getId());
        }
        for (Question question: surveTemplate.getQuestions()) {
            if(question.getId() != null) {
                throw new IllegalArgumentException("Question can not have id while creating. Id: " + question.getId());
            }
        }



        //zapis surveTemplate do bazy danych za pomoca dao

    }
}
