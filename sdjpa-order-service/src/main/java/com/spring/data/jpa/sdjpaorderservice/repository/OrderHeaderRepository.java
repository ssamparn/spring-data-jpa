package com.spring.data.jpa.sdjpaorderservice.repository;

import com.spring.data.jpa.sdjpaorderservice.domain.OrderHeader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderHeaderRepository extends JpaRepository<OrderHeader, Long> {

}
