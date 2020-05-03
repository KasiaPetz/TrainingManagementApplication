package com.trainingmanagement.survebody;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurveBodyDao extends JpaRepository<SurveBody, Integer> {

}
