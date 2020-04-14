package com.TrainingManagement.question;

import com.TrainingManagement.surveTemplate.SurveTemplate;

import javax.persistence.*;

@Entity
@Table(name = "QUESTION")
public class Question {

    @Id
    @Column(name = "QUESTION_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String content;
    // type ?????

    //TODO many to one do template
    private SurveTemplate surveTemplate;

    public Integer getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

}
