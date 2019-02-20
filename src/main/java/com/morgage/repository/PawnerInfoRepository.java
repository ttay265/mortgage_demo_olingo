package com.morgage.repository;

import com.morgage.model.PawnerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PawnerInfoRepository extends JpaRepository<PawnerInfo, Integer> {
}
