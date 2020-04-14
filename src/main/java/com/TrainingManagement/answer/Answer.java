package com.TrainingManagement.answer;

import com.TrainingManagement.question.Question;
import com.TrainingManagement.surveBody.SurveBody;

import javax.persistence.*;

@Entity
@Table(name = "ANSWER")
public class Answer {

    @Id
    @Column(name = "ANSWER_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String content;

    private SurveBody surveBody;
    private Question question;

    public Integer getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

}
