package com.example.lms.services.impl;

import com.example.lms.models.Author;
import com.example.lms.models.Book;
import com.example.lms.repositories.AuthorRepository;
import com.example.lms.services.interfaces.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    AuthorRepository authorRepository;

    @Override
    public String addBook(Book book) throws Exception {

        try{
            Author author = authorRepository.findById(book.getAuthor().getId()).get();
            author.getBooks().add(book);

            book.setAuthor(author);

            authorRepository.save(author);
            return "book saved";
        } catch (Exception e) {
            throw new Exception("Author not present");
        }
    }
}
