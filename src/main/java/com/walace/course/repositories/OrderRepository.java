package com.walace.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.walace.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
