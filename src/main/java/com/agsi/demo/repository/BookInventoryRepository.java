package com.agsi.demo.repository;

import com.agsi.demo.model.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookInventoryRepository extends JpaRepository<Book, String> {

}
