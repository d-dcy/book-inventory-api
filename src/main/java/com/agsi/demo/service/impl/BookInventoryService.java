package com.agsi.demo.service.impl;

import com.agsi.demo.dto.response.BookResponse;
import com.agsi.demo.exception.ResourceNotFoundException;
import com.agsi.demo.model.entity.Book;
import com.agsi.demo.repository.BookInventoryRepository;
import com.agsi.demo.service.IBookInventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class BookInventoryService implements IBookInventoryService {

    @Autowired
    private final BookInventoryRepository bookInventoryRepository;

    /**
     * Retrieves the title and author of a book by its ID.
     *
     * @param id The ID of the book to retrieve.
     * @return A BookResponse containing the book's ID, title, and author.
     * @throws ResourceNotFoundException if no book is found with the given ID.
     */
    @Override
    @Transactional(readOnly = true)
    public BookResponse getBookById(String id) {

        Book book = bookInventoryRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Book not found with id " + id));
        return new BookResponse(book.getId(), book.getTitle(), book.getAuthor());
    }
}
