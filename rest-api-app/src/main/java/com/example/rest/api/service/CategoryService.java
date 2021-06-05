package com.example.rest.api.service;

import com.example.rest.api.model.CategoryDTO;

import java.util.List;

/**
 * @author martsiomchyk
 */

public interface CategoryService {

    List<CategoryDTO> getAllCategories();

    CategoryDTO getCategoryByName(String name);
}
