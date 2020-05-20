package com.ralphmandel.sts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ralphmandel.sts.entities.User;

public interface UserRepository extends JpaRepository <User, Long>{

}
