package com.morgage.repository;

import com.morgage.model.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopRepository extends JpaRepository<Shop,Integer> {
}
