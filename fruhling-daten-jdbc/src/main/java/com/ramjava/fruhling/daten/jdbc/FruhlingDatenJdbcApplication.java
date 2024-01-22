package com.ramjava.fruhling.daten.jdbc;

import com.ramjava.fruhling.daten.jdbc.model.Author;
import com.ramjava.fruhling.daten.jdbc.model.Comment;
import com.ramjava.fruhling.daten.jdbc.model.Post;
import com.ramjava.fruhling.daten.jdbc.repo.AuthorRepo;
import com.ramjava.fruhling.daten.jdbc.repo.PostRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jdbc.core.mapping.AggregateReference;

@SpringBootApplication
public class FruhlingDatenJdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(FruhlingDatenJdbcApplication.class, args);
	}
	// Persist to the H2 DB
	@Bean
	CommandLineRunner commandLineRunner(PostRepo posts, AuthorRepo author) {
		return args -> {
			AggregateReference<Author, Integer> adolf = AggregateReference
					.to(author.save(new Author(null, "Adolf", "Hitler", "ah@yahoo.com", "ah88")).id());
			Post post = new Post("Mein Kampf", "Historical Book", adolf);
			post.addComment(new Comment("Adolf Hitler", "Buch über das politische Manifest von Adolf Hitler"));
			posts.save(post);
		};
	}
}
