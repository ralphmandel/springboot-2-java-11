package com.ralphmandel.sts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ralphmandel.sts.entities.Order;

public interface OrderRepository extends JpaRepository <Order, Long>{

}
