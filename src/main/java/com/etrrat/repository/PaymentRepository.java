package com.etrrat.repository;

import com.etrrat.domain.Hami;
import com.etrrat.domain.User;
import com.etrrat.domain.ZohaHesab;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Spring Data JPA repository for the {@link User} entity.
 */
@Repository
public interface PaymentRepository extends JpaRepository<ZohaHesab, String> {




}
