package com.example.day14ce2.Dharanishservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day14ce2.Dharanishmodel.DharanishBook;
import com.example.day14ce2.Dharanishrepository.DharanishBookRepo;

@Service
public class DharanishBookService {
   @Autowired
   DharanishBookRepo bookRepo;

   public DharanishBook addBook(DharanishBook book)
   {
        return bookRepo.save(book);
   }

   public List<DharanishBook> getBooks()
   {
        return bookRepo.findAll();
   }

   public Optional<DharanishBook> getBook(int id)
   {
    return bookRepo.findById(id);
   }

   public DharanishBook updateBook(int id,DharanishBook book)
   {
        DharanishBook avail = bookRepo.findById(id).orElse(null);
        if(avail!=null)
        {
            avail.setAuthor(book.getAuthor());
            avail.setAvailableCopies(book.getAvailableCopies());
            avail.setTitle(book.getTitle());
            avail.setTotalCopies(book.getTotalCopies());
            return bookRepo.save(avail);
        }
        else 
        return null;
   }
}
