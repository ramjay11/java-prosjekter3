package com.ramjava.fruhling.daten.jdbc.model.dto;

import com.ramjava.fruhling.daten.jdbc.model.Author;
import com.ramjava.fruhling.daten.jdbc.model.Post;

public record PostDetails(Post post, Author author) {
}
