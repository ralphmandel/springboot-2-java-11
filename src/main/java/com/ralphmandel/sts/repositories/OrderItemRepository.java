package com.ralphmandel.sts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ralphmandel.sts.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository <OrderItem, Long>{

}
