package com.TrainingManagement.paricipiant;

import com.TrainingManagement.training.Training;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "PARTICIPIANT")
public class Participiant {

    @Id
    @Column(name = "PARTICIPIANT_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 50, nullable = false)
    private String firstname;
    @Column(length = 50, nullable = false)
    private String lastname;
    @Column(length = 10, nullable = false)
    private String teta;
    @Column(length = 50)
    private String position;
    private LocalDate employmentDate;
    @ManyToOne
    @JoinColumn(name = "training_fk", nullable = false)
    private Training training;

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getTeta() {
        return teta;
    }

    public String getPosition() {
        return position;
    }

    public LocalDate getEmploymentDate() {
        return employmentDate;
    }
}
