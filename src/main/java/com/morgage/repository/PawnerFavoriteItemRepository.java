package com.morgage.repository;

import com.morgage.model.PawnerFavoriteItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PawnerFavoriteItemRepository extends JpaRepository<PawnerFavoriteItem, Integer> {
}
