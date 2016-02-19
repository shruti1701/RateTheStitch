package com.ratethestitch.service.impl;

import com.ratethestitch.service.AuthorService;
import com.ratethestitch.domain.Author;
import com.ratethestitch.repository.AuthorRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;
import java.util.Optional;

/**
 * Service Implementation for managing Author.
 */
@Service
@Transactional
public class AuthorServiceImpl implements AuthorService{

    private final Logger log = LoggerFactory.getLogger(AuthorServiceImpl.class);

    @Inject
    private AuthorRepository authorRepository;

    /**
     * Save a author.
     * @return the persisted entity
     */
    public Author save(Author author) {
        log.debug("Request to save Author : {}", author);
        Author result = authorRepository.save(author);
        return result;
    }

    /**
     *  get all the authors.
     *  @return the list of entities
     */
    @Transactional(readOnly = true)
    public List<Author> findAll() {
        log.debug("Request to get all Authors");
        List<Author> result = authorRepository.findAll();
        return result;
    }

    /**
     *  get one author by id.
     *  @return the entity
     */
    @Transactional(readOnly = true)
    public Author findOne(Long id) {
        log.debug("Request to get Author : {}", id);
        Author author = authorRepository.findOne(id);
        author.setBooks(author.getBooks());

        return author;
    }

    /**
     *  delete the  author by id.
     */
    public void delete(Long id) {
        log.debug("Request to delete Author : {}", id);
        authorRepository.delete(id);
    }
}
