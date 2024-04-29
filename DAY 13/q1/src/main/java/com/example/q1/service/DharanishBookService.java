package com.example.q1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.q1.model.DharanishAuthor;
import com.example.q1.model.DharanishBook;
import com.example.q1.repository.DharanishAuthorRepository;
import com.example.q1.repository.DharanishBookRepository;

@Service
public class DharanishBookService {
    @Autowired
    private DharanishBookRepository bookRepository;
@Autowired
private DharanishAuthorRepository authorRepository;
    public DharanishBook saveBook(Long authorId, DharanishBook book) {
        DharanishAuthor author = authorRepository.findById(authorId).orElse(null);
        if (author != null) {
            book.setAuthor(author);
            author.getBooks().add(book);
            return bookRepository.save(book);
        }
        return null;
    }

    public DharanishBook getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}

