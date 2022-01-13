package com.devsuperior.dsmovies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovies.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
