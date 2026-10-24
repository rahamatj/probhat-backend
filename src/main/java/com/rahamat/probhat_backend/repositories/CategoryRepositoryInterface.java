package com.rahamat.probhat_backend.repositories;

import com.rahamat.probhat_backend.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepositoryInterface extends JpaRepository<Category, Long> {

}
