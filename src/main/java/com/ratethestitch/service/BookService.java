package com.ratethestitch.service;

import com.ratethestitch.domain.Book;

import java.util.List;

/**
 * Service Interface for managing Book.
 */
public interface BookService {

    /**
     * Save a book.
     * @return the persisted entity
     */
    public Book save(Book book);

    /**
     *  get all the books.
     *  @return the list of entities
     */
    public List<Book> findAll();

    /**
     *  get the "id" book.
     *  @return the entity
     */
    public Book findOne(Long id);

    /**
     *  delete the "id" book.
     */
    public void delete(Long id);
}
