package com.trainingmanagement.training;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "TRAINING")
public class Training {

    @Id
    @Column(name = "TRAINING_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private LocalDate trainingDate;

    @Column(length = 50, nullable = false)
    private String city;

    @OneToOne(mappedBy = "training")
    private SurveDao surve;

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getTrainingDate() {
        return trainingDate;
    }

    public String getCity() {
        return city;
    }

    public SurveDao getSurve() {
        return surve;
    }
}
