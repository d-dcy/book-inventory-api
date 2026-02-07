package com.agsi.demo.service;

import com.agsi.demo.dto.response.BookResponse;

public interface IBookInventoryService {

    /**
     * Retrieves the book details by its ID.
     *
     * @param bookId The ID of the book to retrieve.
     * @return A BookResponse containing the book details.
     */
    public BookResponse getBookById(String bookId);
}
