package com.trainingmanagement.survetemplate;

import com.trainingmanagement.question.Question;
import com.trainingmanagement.surve.Surve;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "SURVE_TEMPLATE")
public class SurveTemplate {

    @Id
    @Column(name = "SURVE_TEMPLATE_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 50, nullable = false)
    private String name;

    @OneToMany(mappedBy = "surveTemplate")
    private List<Question> questions;

    @OneToMany(mappedBy = "surveTemplate")
    private List<Surve> surves;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public List<Surve> getSurves() {
        return surves;
    }
}
