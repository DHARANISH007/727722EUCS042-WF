package com.example.q1.Dharanishcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.q1.model.DharanishBook;
import com.example.q1.service.DharanishBookService;

@RestController
public class DharanishBookController {
    @Autowired
    private DharanishBookService bookService;

    @GetMapping("/book/{bookId}")
    public ResponseEntity<DharanishBook> getBookById(@PathVariable Long bookId) {
        DharanishBook book = bookService.getBookById(bookId);
        if (book != null) {
            return new ResponseEntity<>(book, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
