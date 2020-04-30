package com.trainingmanagement.training;

import java.time.LocalDate;

public class TrainingDto {
    private Integer id;
    private String title;
    private LocalDate trainingDate;
    private String city;

    public TrainingDto(Integer id, String title, LocalDate trainingDate, String city) {
        this.id = id;
        this.title = title;
        this.trainingDate = trainingDate;
        this.city = city;
    }

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

}
