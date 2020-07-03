package com.trainingmanagement.survetemplate;

import com.trainingmanagement.question.Question;
import com.trainingmanagement.question.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SurveTemplateService {

    private final SurveTemplateDao surveTemplateDao;
    private final QuestionDao questionDao;

    @Autowired
    public SurveTemplateService(SurveTemplateDao surveTemplateDao, QuestionDao questionDao) {
        this.surveTemplateDao = surveTemplateDao;
        this.questionDao = questionDao;
    }

    public List<SurveTemplate> getAll() {
        return this.surveTemplateDao.findAll();
    }

    @Transactional
    public SurveTemplate create(SurveTemplate surveTemplate) {
        if (surveTemplate.getId() != null) {
            throw new IllegalArgumentException("SurveTemplate can not have id while creating. Id: " + surveTemplate.getId());
        }

        for (Question question: surveTemplate.getQuestions()) {
            if(question.getId() != null) {
                throw new IllegalArgumentException("Question can not have id while creating. Id: " + question.getId());
            }
        }

        final SurveTemplate result = surveTemplateDao.save(surveTemplate);

        for (Question question : surveTemplate.getQuestions()) {
            question.setSurveTemplate(surveTemplate);
            questionDao.save(question);
        }

        return result;
    }
}
