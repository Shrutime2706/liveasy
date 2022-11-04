package com.example.workshop.repositary;

import com.example.workshop.model.Load;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

// java persistence api
@Repository
public interface LoadRepository extends JpaRepository<Load, Integer> {


    @Query(value = "select * from `workshop`.`load`", nativeQuery = true)
   public Optional<List<Load>> getAll();

    @Query(value = "select * from `workshop`.`load` where shipper_id= 1", nativeQuery = true)
    Optional<Load> findByLoadId(Integer id);
}
