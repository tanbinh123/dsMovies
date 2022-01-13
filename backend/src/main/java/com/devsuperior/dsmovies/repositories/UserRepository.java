package com.devsuperior.dsmovies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovies.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail(String email);
}
