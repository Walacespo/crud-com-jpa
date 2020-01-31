package com.walace.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.walace.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
