package com.spring.data.jpa.sdjpaorderservice.repository;

import com.spring.data.jpa.sdjpaorderservice.domain.OrderApproval;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderApprovalRepository extends JpaRepository<OrderApproval, Long> {
}
