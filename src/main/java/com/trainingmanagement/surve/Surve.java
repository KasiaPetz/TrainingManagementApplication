package com.trainingmanagement.surve;

import com.trainingmanagement.survebody.SurveBody;
import com.trainingmanagement.survetemplate.SurveTemplate;
import com.trainingmanagement.training.Training;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "SURVE")
public class Surve {

    @Id
    @Column(name = "SURVE_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 20, nullable = false)
    private boolean isAvalible;

    @OneToOne
    @JoinColumn(name = "training_fk", nullable = false)
    private Training training;

    @ManyToOne
    @JoinColumn(name = "surve_template_fk", nullable = false)
    private SurveTemplate surveTemplate;

    @OneToMany(mappedBy = "surve")
    private List<SurveBody> surveBodies;

    public Integer getId() {
        return id;
    }

    public boolean isAvalible() {
        return isAvalible;
    }

    public Training getTraining() {
        return training;
    }

    public SurveTemplate getSurveTemplate() {
        return surveTemplate;
    }

    public List<SurveBody> getSurveBodies() {
        return surveBodies;
    }
}
