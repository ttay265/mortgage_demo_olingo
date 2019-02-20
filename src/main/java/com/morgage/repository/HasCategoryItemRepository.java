package com.morgage.repository;

import com.morgage.model.HasCategoryItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HasCategoryItemRepository extends JpaRepository<HasCategoryItem, Integer> {
}
