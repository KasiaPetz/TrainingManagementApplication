package com.trainingmanagement.survetemplate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurveTemplateDao extends JpaRepository<SurveTemplate, Integer> {

}
