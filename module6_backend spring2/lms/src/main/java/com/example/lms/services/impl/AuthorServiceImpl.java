package com.example.lms.services.impl;

import com.example.lms.models.Author;
import com.example.lms.repositories.AuthorRepository;
import com.example.lms.services.interfaces.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    @Override
    public String addAuthor(Author author) {
        authorRepository.save(author);

        return "author added";
    }
}
