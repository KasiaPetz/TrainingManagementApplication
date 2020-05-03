package com.trainingmanagement.surve;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurveDao extends JpaRepository<Surve, Integer> {

}
