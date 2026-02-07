package com.agsi.demo.controller;

import com.agsi.demo.dto.response.BookResponse;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.agsi.demo.service.IBookInventoryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookInventoryController {

    private static final Logger logger = LoggerFactory.getLogger(BookInventoryController.class);

    private final IBookInventoryService bookInventoryService;

    /**
     * Endpoint to retrieve the title and author of a book by its ID.
     *
     * @param id The ID of the book to retrieve.
     * @return A ResponseEntity containing a BookResponse with the book's details.
     */
    @GetMapping("/{id}")
    public ResponseEntity<BookResponse> getBookById(@PathVariable("id") String id) {

        logger.info("Fetching book with ID: {}", id);

        BookResponse bookResponse = bookInventoryService.getBookById(id);

        logger.info("Book details retrieved successfully for ID: {}", id);
        return ResponseEntity.ok(bookResponse);
    }
}
