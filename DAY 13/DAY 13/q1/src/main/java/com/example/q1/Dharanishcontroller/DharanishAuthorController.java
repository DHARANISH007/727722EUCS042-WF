package com.example.q1.Dharanishcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.q1.model.DharanishAuthor;
import com.example.q1.model.DharanishBook;
import com.example.q1.service.DharanishAuthorService;
import com.example.q1.service.DharanishBookService;

@RestController
public class DharanishAuthorController {
    @Autowired
    private DharanishAuthorService authorService;
@Autowired
private DharanishBookService bookService;
    @PostMapping("/author")
    public ResponseEntity<DharanishAuthor> createAuthor(@RequestBody DharanishAuthor author) {
        DharanishAuthor savedAuthor = authorService.saveAuthor(author);
        return new ResponseEntity<>(savedAuthor, HttpStatus.CREATED);
    }

    @PostMapping("/book/author/{authorId}")
    public ResponseEntity<DharanishBook> createBookForAuthor(@PathVariable Long authorId, @RequestBody DharanishBook book) {
        DharanishBook savedBook = bookService.saveBook(authorId, book);
        return new ResponseEntity<>(savedBook, HttpStatus.CREATED);
    }

    @GetMapping("/author/{authorId}")
    public ResponseEntity<DharanishAuthor> getAuthorById(@PathVariable Long authorId) {
        DharanishAuthor author = authorService.getAuthorById(authorId);
        if (author != null) {
            return new ResponseEntity<>(author, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/author")
    public ResponseEntity<List<DharanishAuthor>> getAllAuthors() {
        List<DharanishAuthor> authors = authorService.getAllAuthors();
        return new ResponseEntity<>(authors, HttpStatus.OK);
    }

    @PutMapping("/author/{authorId}")
    public ResponseEntity<DharanishAuthor> updateAuthor(@PathVariable Long authorId, @RequestBody DharanishAuthor author) {
        DharanishAuthor updatedAuthor = authorService.updateAuthor(authorId, author);
        if (updatedAuthor != null) {
            return new ResponseEntity<>(updatedAuthor, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @DeleteMapping("/book/{bookId}")
    public ResponseEntity<String> deleteBook(@PathVariable Long bookId) {
        bookService.deleteBook(bookId);
        return new ResponseEntity<>("Book deleted successfully", HttpStatus.OK);
    }
}
