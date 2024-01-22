package com.ramjava.fruhling.daten.jdbc.controller;

import com.ramjava.fruhling.daten.jdbc.model.Post;
import com.ramjava.fruhling.daten.jdbc.model.dto.PostDetails;
import com.ramjava.fruhling.daten.jdbc.repo.AuthorRepo;
import com.ramjava.fruhling.daten.jdbc.repo.PostRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/posts")
public class PostController {
    private final PostRepo postRepo;
    private final AuthorRepo authorRepo;

    public PostController(PostRepo postRepo, AuthorRepo authorRepo) {
        this.postRepo = postRepo;
        this.authorRepo = authorRepo;
    }

    @GetMapping
    public Iterable<Post> findAll() {
        return postRepo.findAll();
    }
    @GetMapping("/{id}")
    public Post findById(@PathVariable Integer id) {
        return postRepo.findById(id).orElse(null);
    }

    @GetMapping("/{id}/details")
    public PostDetails getPostDetails(@PathVariable Integer id) {
        Post post = postRepo.findById(id).orElse(null);
        return new PostDetails(post, authorRepo.findById(post.getAuthor().getId()).get());
    }
}
