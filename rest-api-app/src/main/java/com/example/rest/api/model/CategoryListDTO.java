package com.example.rest.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * @author martsiomchyk
 */
@Data
@AllArgsConstructor
public class CategoryListDTO {
    List<CategoryDTO> categories;
}
