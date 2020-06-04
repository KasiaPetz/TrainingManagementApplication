package com.trainingmanagement.question;

import com.trainingmanagement.answer.Answer;
import com.trainingmanagement.survetemplate.SurveTemplate;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "QUESTION")
public class Question {

    @Id
    @Column(name = "QUESTION_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String content;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Type type;

    @ManyToOne
    @JoinColumn(name = "surve_template_fk", nullable = false)
    private SurveTemplate surveTemplate;

    @OneToMany(mappedBy = "question")
    private List<Answer> answers;

    public Question(Integer id, String content, Type type) {
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

    public Type getType() {
        return type;
    }

    public SurveTemplate getSurveTemplate() {
        return surveTemplate;
    }

    public List<Answer> getAnswers() {
        return answers;
    }
}
