package com.trainingmanagement.survetemplate;

import com.trainingmanagement.question.QuestionDto;

import java.util.List;

public class SurveTemplateDto {
    private Integer id;
    private String name;
    private List<QuestionDto> questionsDto;

    public SurveTemplateDto(Integer id, String name, List<QuestionDto> questionsDto) {
        this.id = id;
        this.name = name;
        this.questionsDto = questionsDto;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<QuestionDto> getQuestions() {
        return questionsDto;
    }

}
