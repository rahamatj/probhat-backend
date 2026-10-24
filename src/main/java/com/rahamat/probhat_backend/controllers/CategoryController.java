package com.rahamat.probhat_backend.controllers;

import com.rahamat.probhat_backend.entities.Category;
import com.rahamat.probhat_backend.repositories.CategoryRepositoryInterface;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
@AllArgsConstructor
public class CategoryController {

    private final CategoryRepositoryInterface categoryRepository;

    @GetMapping({"", "/"})
    public ResponseEntity<List<Category>> getCategories() {

        List<Category> categories = categoryRepository.findAll();

        return ResponseEntity.ok(categories);
    }
}
