package com.trainingmanagement.answer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerDto extends JpaRepository<Answer, Integer> {

}
