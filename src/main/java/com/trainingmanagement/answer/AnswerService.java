package com.trainingmanagement.answer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerService {
    private final AnswerDto answerDto;

    @Autowired
    public AnswerService(AnswerDto answerDto) {
        this.answerDto = answerDto;
    }

    public List<Answer> getAll() {
        return this.answerDto.findAll();
    }
}
