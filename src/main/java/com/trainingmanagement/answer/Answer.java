package com.trainingmanagement.answer;

import com.trainingmanagement.question.Question;
import com.trainingmanagement.survebody.SurveBody;

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

    @ManyToOne
    @JoinColumn(name = "surve_body_fk", nullable = false)
    private SurveBody surveBody;

    @ManyToOne
    @JoinColumn(name = "question_fk", nullable = false)
    private Question question;

    public Integer getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public SurveBody getSurveBody() {
        return surveBody;
    }

    public Question getQuestion() {
        return question;
    }
}
