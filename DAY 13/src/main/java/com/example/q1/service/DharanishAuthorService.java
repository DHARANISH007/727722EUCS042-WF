package com.example.q1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.q1.model.DharanishAuthor;
import com.example.q1.repository.DharanishAuthorRepository;

@Service
public class DharanishAuthorService {
    @Autowired
    private DharanishAuthorRepository authorRepository;

    public DharanishAuthor saveAuthor(DharanishAuthor author) {
        return authorRepository.save(author);
    }

    public DharanishAuthor getAuthorById(Long id) {
        return authorRepository.findById(id).orElse(null);
    }

    public List<DharanishAuthor> getAllAuthors() {
        return authorRepository.findAll();
    }

    public DharanishAuthor updateAuthor(Long id, DharanishAuthor author) {
        DharanishAuthor existingAuthor = authorRepository.findById(id).orElse(null);
        if (existingAuthor != null) {
            existingAuthor.setEmail(author.getEmail());
            existingAuthor.setPhoneNumber(author.getPhoneNumber());
            existingAuthor.setAddress(author.getAddress());
            return authorRepository.save(existingAuthor);
        }
        return null;
    }

    public void deleteAuthor(Long id) {
        authorRepository.deleteById(id);
    }
}
