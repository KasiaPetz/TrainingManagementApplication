package com.trainingmanagement.question;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {
    private final Question question;

    @Autowired
    public QuestionService(Question question) {
        this.question = question;
    }

}
