package com.morgage.repository;

import com.morgage.model.Shop;
import io.lettuce.core.dynamic.annotation.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ShopRepository extends JpaRepository<Shop,Integer> {
    String SEARCH_QUERY = "select *" +
            "from shop sh" +
            "where sh.name like '%:input%'";

    @Query(value = SEARCH_QUERY, nativeQuery = true)
    List<Shop> searchShopByName(@Param("input") String input);
}
