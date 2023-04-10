package com.spring.data.jpa.sdjpaorderservice.repository;

import com.spring.data.jpa.sdjpaorderservice.domain.OrderHeader;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderHeaderRepository extends JpaRepository<OrderHeader, Long> {
}
