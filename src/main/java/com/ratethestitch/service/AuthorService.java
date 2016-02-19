package com.ratethestitch.service;

import com.ratethestitch.domain.Author;

import java.util.List;

/**
 * Service Interface for managing Author.
 */
public interface AuthorService {

    /**
     * Save a author.
     * @return the persisted entity
     */
    public Author save(Author author);

    /**
     *  get all the authors.
     *  @return the list of entities
     */
    public List<Author> findAll();

    /**
     *  get the "id" author.
     *  @return the entity
     */
    public Author findOne(Long id);

    /**
     *  delete the "id" author.
     */
    public void delete(Long id);
}
