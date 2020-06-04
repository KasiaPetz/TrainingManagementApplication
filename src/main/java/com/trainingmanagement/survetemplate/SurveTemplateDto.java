package com.trainingmanagement.survetemplate;

import com.trainingmanagement.question.QuestionDto;

import java.util.List;

public class SurveTemplateDto {
    private Integer id;
    private String name;
    private List<QuestionDto> questions;

    public SurveTemplateDto(Integer id, String name, List<QuestionDto> questions) {
        this.id = id;
        this.name = name;
        this.questions = questions;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<QuestionDto> getQuestions() {
        return questions;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuestions(List<QuestionDto> questions) {
        this.questions = questions;
    }

    @Override
    public String toString() {
        return "SurveTemplateDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", questionsDto=" + questions +
                '}';
    }
}
