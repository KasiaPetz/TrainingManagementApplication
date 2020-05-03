package com.trainingmanagement.survebody;

import com.trainingmanagement.answer.Answer;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "SURVE_BODY")
public class SurveBody {

    @Id
    @Column(name = "SURVE_BODY_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 10, nullable = false)
    private LocalDate fillDate;

    @ManyToOne
    @JoinColumn(name = "surve_fk", nullable = false)
    private SurveDao surve;

    @OneToMany(mappedBy = "surveBody")
    private List<Answer> answers;

    public Integer getId() {
        return id;
    }

    public LocalDate getFillDate() {
        return fillDate;
    }

    public SurveDao getSurve() {
        return surve;
    }

    public List<Answer> getAnswers() {
        return answers;
    }
}
