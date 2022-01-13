package com.devsuperior.dsmovies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovies.entities.Score;
import com.devsuperior.dsmovies.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
