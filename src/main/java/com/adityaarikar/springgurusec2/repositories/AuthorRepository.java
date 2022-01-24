package com.adityaarikar.springgurusec2.repositories;

import com.adityaarikar.springgurusec2.entity.Author;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Id;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
