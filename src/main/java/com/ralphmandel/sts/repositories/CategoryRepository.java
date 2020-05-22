package com.ralphmandel.sts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ralphmandel.sts.entities.Category;

public interface CategoryRepository extends JpaRepository <Category, Long>{

}
