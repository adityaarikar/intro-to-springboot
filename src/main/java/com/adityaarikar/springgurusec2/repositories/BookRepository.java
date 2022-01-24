package com.adityaarikar.springgurusec2.repositories;

import com.adityaarikar.springgurusec2.entity.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
