package com.trainingmanagement.question;

import org.springframework.stereotype.Service;

@Service
public class QuestionService {
    private final QuestionDao questionDao;

    public QuestionService(QuestionDao questionDao) {
        this.questionDao = questionDao;
    }

}
