package com.trainingmanagement.question;

public class QuestionDto {
    private Integer id;
    private String content;
    private String type;

    public QuestionDto(Integer id, String content, String type) {
        this.id = id;
        this.content = content;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getType() {
        return type;
    }

}
