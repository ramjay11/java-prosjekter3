package com.ramjava.fruhling.daten.jdbc.repo;

import com.ramjava.fruhling.daten.jdbc.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepo extends CrudRepository<Post, Integer> {
}
