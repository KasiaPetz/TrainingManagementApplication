package com.TrainingManagement.surve;

import com.TrainingManagement.surveTemplate.SurveTemplate;
import com.TrainingManagement.training.Training;

import javax.persistence.*;

@Entity
@Table(name = "SURVE")
public class Surve {

    @Id
    @Column(name = "SURVE_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 20, nullable = false)
    private boolean isAvalible;

    //TODO połączenie one to one do Training i do Template many to one
    private Training training;
    private SurveTemplate surveTemplate;

    public Integer getId() {
        return id;
    }

    public boolean isAvalible() {
        return isAvalible;
    }


}
