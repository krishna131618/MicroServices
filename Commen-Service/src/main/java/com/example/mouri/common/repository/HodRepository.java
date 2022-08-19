package com.example.mouri.common.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mouri.common.entity.Hod;

public interface HodRepository extends JpaRepository<Hod, Long> {

	Optional<Hod> findById(Long hodId);

	

}
