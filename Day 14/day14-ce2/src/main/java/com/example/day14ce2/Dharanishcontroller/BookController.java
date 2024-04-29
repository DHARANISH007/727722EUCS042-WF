package com.example.day14ce2.Dharanishcontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day14ce2.Dharanishmodel.DharanishBook;
import com.example.day14ce2.Dharanishservice.DharanishBookService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "Book Controller" ,description = "null")
public class BookController {
    @Autowired
    DharanishBookService bookService;

    @PostMapping("/api/book")
    public DharanishBook addBook(@RequestBody DharanishBook book)
    {
        return bookService.addBook(book);
    }

    @PutMapping("/api/book/{id}")
    public DharanishBook updateBook(@PathVariable int id,@RequestBody DharanishBook book)
    {
        return bookService.updateBook(id,book);
    }

    @GetMapping("/api/book")
    public List<DharanishBook> getBooks()
    {
        return bookService.getBooks();
    }

    @GetMapping("/api/book/{id}")
    public Optional<DharanishBook> getBook(@PathVariable int id)
    {
        return bookService.getBook(id);
    }
}
