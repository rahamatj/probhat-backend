package com.rahamat.probhat_backend.services.interfaces;

import com.rahamat.probhat_backend.dtos.CategoryDto;

import java.util.List;
import java.util.Map;

public interface CategoryServiceInterface {

    List<CategoryDto> getCategories();

    CategoryDto getCategoryById(Long id);

    CategoryDto createCategory(CategoryDto categoryDto);

    CategoryDto updateCategory(Long id, CategoryDto categoryDto);

    Map<String, String> deleteCategory(Long id);
}
