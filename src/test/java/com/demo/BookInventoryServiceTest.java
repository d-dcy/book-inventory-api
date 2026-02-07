package com.demo;

import com.agsi.demo.dto.response.BookResponse;
import com.agsi.demo.exception.ResourceNotFoundException;
import com.agsi.demo.model.entity.Book;
import com.agsi.demo.repository.BookInventoryRepository;
import com.agsi.demo.service.impl.BookInventoryService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class BookInventoryServiceTest {

    @Mock
    private BookInventoryRepository bookInventoryRepository;

    @InjectMocks
    private BookInventoryService bookInventoryService;

    private Book mockBook;

    @BeforeEach
    void setUp() {
        mockBook = new Book("1", "The Five People You Meet in Heaven", "Mitch Albom");
    }

    @Test
    void getBookById_Success() {

        when(bookInventoryRepository.findById("1")).thenReturn(Optional.of(mockBook));

        BookResponse response = bookInventoryService.getBookById("1");

        assertNotNull(response);
        assertEquals("The Five People You Meet in Heaven", response.getTitle());
        assertEquals("1", response.getId());
        verify(bookInventoryRepository, times(1)).findById("1");
    }

    @Test
    void getBookById_NotFound_ThrowsException() {

        when(bookInventoryRepository.findById("99")).thenReturn(Optional.empty());

        assertThrows(ResourceNotFoundException.class, () -> {
            bookInventoryService.getBookById("99");
        });
    }
}
