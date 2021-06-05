package com.example.rest.api.repository;

import com.example.rest.api.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author martsiomchyk
 */

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByName(String name);
}