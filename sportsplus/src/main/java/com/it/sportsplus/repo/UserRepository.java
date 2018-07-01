package com.it.sportsplus.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.it.sportsplus.models.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByUsernameAndPassword(String username, String password);
}
