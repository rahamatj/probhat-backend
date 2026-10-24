package com.rahamat.probhat_backend.mappers;

import com.rahamat.probhat_backend.dtos.CategoryDto;
import com.rahamat.probhat_backend.entities.Category;

public class CategoryMapper {

    public static CategoryDto toCategoryDto(Category category) {
        if (category == null) {
            return null;
        }

        CategoryDto categoryDto = new CategoryDto();
        categoryDto.setName(category.getName());
        categoryDto.setNameBn(category.getNameBn());
        categoryDto.setSlug(category.getSlug());
        categoryDto.setCreatedAt(category.getCreatedAt());

        return categoryDto;
    }

    public static Category toCategory(CategoryDto categoryDto) {
        if (categoryDto == null) {
            return null;
        }

        Category category = new Category();
        category.setName(categoryDto.getName());
        category.setNameBn(categoryDto.getNameBn());
        category.setSlug(categoryDto.getSlug());
        category.setCreatedAt(categoryDto.getCreatedAt());

        return category;
    }

}
