package com.trainingmanagement.question;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class QuestionMapper {

    public QuestionDto toDto(Question question) {
        return new QuestionDto(
                question.getId(),
                question.getContent(),
                question.getType().toString()); //emum na String do DTO
    }

    public List<QuestionDto> toDto(List<Question> questions) {
        return questions.stream()
                .map(this::toDto)  //q  -> toDto(q)
                .collect(Collectors.toList());
    }

}
