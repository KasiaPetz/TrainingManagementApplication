package com.trainingmanagement.answer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnswerService {
    private final AnswerDao answerDao;

    @Autowired
    public AnswerService(AnswerDao answerDao) {
        this.answerDao = answerDao;
    }

}
