package com.etrrat.repository;

import com.etrrat.domain.Hami;
import com.etrrat.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

/**
 * Spring Data JPA repository for the {@link User} entity.
 */
@Repository
public interface HamiRepository extends JpaRepository<Hami, Integer> {

    @Query(
        value = "SELECT * FROM Hami u WHERE u.hamiId> :id",
        nativeQuery = true)
    List<Hami> findByHamiIdAfter(@Param("id") Integer id);


}
