package com.springboot.board.repository;

import com.springboot.board.domain.entity.Hospital;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface HospitalRepository extends JpaRepository<Hospital, Integer> {
    Page<Hospital> findAll(Pageable pageable);
    List<Hospital> findByBusinessTypeNameIn(List<String> businessTypes);
    List<Hospital> findByFullAddressContaining(String keyword);
    List<Hospital> findByFullAddressStartsWith(String keyword);
    List<Hospital> findByFullAddressEndsWith(String keyword);
}
