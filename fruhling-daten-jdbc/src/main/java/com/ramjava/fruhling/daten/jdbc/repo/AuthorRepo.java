package com.ramjava.fruhling.daten.jdbc.repo;

import com.ramjava.fruhling.daten.jdbc.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepo extends CrudRepository<Author, Integer> {
}
