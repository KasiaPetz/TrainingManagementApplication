package com.TrainingManagement.surveTemplate;

import javax.persistence.*;

@Entity
@Table(name = "SURVE_TEMPLATE")
public class SurveTemplate {

    @Id
    @Column(name = "SURVE_TEMPLATE_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 50, nullable = false)
    private String name;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
