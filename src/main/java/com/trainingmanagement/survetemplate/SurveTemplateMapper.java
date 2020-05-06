package com.trainingmanagement.survetemplate;

import com.trainingmanagement.question.QuestionDto;
import com.trainingmanagement.question.QuestionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class SurveTemplateMapper {

    private final QuestionMapper questionMapper;

    @Autowired
    public SurveTemplateMapper(QuestionMapper questionMapper) {
        this.questionMapper = questionMapper;
    }

    public SurveTemplateDto toDto(SurveTemplate surveTemplate) {
        final List<QuestionDto> questionDtos = questionMapper.toDto(surveTemplate.getQuestions());

        return new SurveTemplateDto(
                surveTemplate.getId(),
                surveTemplate.getName(),
                questionDtos);
    }

    public List<SurveTemplateDto> toDto(List<SurveTemplate> surveTemplates) {
        return surveTemplates.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

}
