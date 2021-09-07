package com.j6d9.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.j6d9.entity.OrderDetail;

public interface OrderDetailDao extends JpaRepository<OrderDetail, Long> {

}
