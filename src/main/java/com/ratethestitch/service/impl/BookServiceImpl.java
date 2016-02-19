package com.ratethestitch.service.impl;

import com.ratethestitch.service.BookService;
import com.ratethestitch.domain.Book;
import com.ratethestitch.repository.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;
import java.util.Optional;

/**
 * Service Implementation for managing Book.
 */
@Service
@Transactional
public class BookServiceImpl implements BookService{

    private final Logger log = LoggerFactory.getLogger(BookServiceImpl.class);
    
    @Inject
    private BookRepository bookRepository;
    
    /**
     * Save a book.
     * @return the persisted entity
     */
    public Book save(Book book) {
        log.debug("Request to save Book : {}", book);
        Book result = bookRepository.save(book);
        return result;
    }

    /**
     *  get all the books.
     *  @return the list of entities
     */
    @Transactional(readOnly = true) 
    public List<Book> findAll() {
        log.debug("Request to get all Books");
        List<Book> result = bookRepository.findAll();
        return result;
    }

    /**
     *  get one book by id.
     *  @return the entity
     */
    @Transactional(readOnly = true) 
    public Book findOne(Long id) {
        log.debug("Request to get Book : {}", id);
        Book book = bookRepository.findOne(id);
        return book;
    }

    /**
     *  delete the  book by id.
     */
    public void delete(Long id) {
        log.debug("Request to delete Book : {}", id);
        bookRepository.delete(id);
    }
}
