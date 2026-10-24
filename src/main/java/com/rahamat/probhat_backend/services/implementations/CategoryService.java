package com.rahamat.probhat_backend.services.implementations;

import com.rahamat.probhat_backend.dtos.CategoryDto;
import com.rahamat.probhat_backend.entities.Category;
import com.rahamat.probhat_backend.mappers.CategoryMapper;
import com.rahamat.probhat_backend.repositories.CategoryRepositoryInterface;
import com.rahamat.probhat_backend.services.interfaces.CategoryServiceInterface;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@AllArgsConstructor
@Service
public class CategoryService implements CategoryServiceInterface {

    private final CategoryRepositoryInterface categoryRepository;

    @Override
    public List<CategoryDto> getCategories() {
        List<Category> categories = categoryRepository.findAll();

        return categories.stream()
                .map(CategoryMapper::toCategoryDto)
                .toList();
    }

    @Override
    public CategoryDto getCategoryById(Long id) {
        Category category = categoryRepository.findById(id).orElseThrow(() -> new RuntimeException("Category with id " + id + " not found"));
        return CategoryMapper.toCategoryDto(category);
    }

    @Override
    public CategoryDto createCategory(CategoryDto categoryDto) {
        Category category = CategoryMapper.toCategory(categoryDto);
        Category savedCategory = categoryRepository.save(category);
        return CategoryMapper.toCategoryDto(savedCategory);
    }

    @Override
    public CategoryDto updateCategory(Long id, CategoryDto categoryDto) {
        Category category = categoryRepository.findById(id).orElseThrow(() -> new RuntimeException("Category with id " + id + " not found"));
        category.setName(categoryDto.getName());
        category.setNameBn(categoryDto.getNameBn());
        category.setSlug(categoryDto.getSlug());
        Category updatedCategory = categoryRepository.save(category);
        return CategoryMapper.toCategoryDto(updatedCategory);
    }

    @Override
    public Map<String, String> deleteCategory(Long id) {
        Category category = categoryRepository.findById(id).orElseThrow(() -> new RuntimeException("Category with id " + id + " not found"));
        categoryRepository.delete(category);
        Map<String, String> response = new HashMap<>();
        response.put("message", "Category with id " + id + " deleted successfully");
        return response;
    }
}
