package com.TrainingManagement.surveBody;

import com.TrainingManagement.paricipiant.Participiant;
import com.TrainingManagement.surve.Surve;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "SURVE_BODY")
public class SurveBody {
    @Id
    @Column(name = "SURVE_BODY_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 10, nullable = false) //czy moze dodawac biezaca date ?
    private LocalDate fillDate;
    @Column(length = 20, nullable = false)
    private boolean isAnonymous;


    private Surve surve;
    private Participiant paticipant;

    public Integer getId() {
        return id;
    }

    public LocalDate getFillDate() {
        return fillDate;
    }

    public boolean isAnonymous() {
        return isAnonymous;
    }

}
