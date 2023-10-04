package com.example.demo.repository;

import com.example.demo.model.Content;
import com.example.demo.model.Status;
import com.example.demo.model.Type;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ContentCollectionRepository {

    private final List<Content> content = new ArrayList<>();

    public List<Content> findAll() {
        return content;
    }
    public Optional<Content> findById (Integer id) {
        return content.stream()
                .filter(c -> c.id().equals(id))
                .findFirst();
    }
    @PostConstruct
    private void unit() {
        Content c = new Content(1,
                "My first blog post",
                "Description",
                Status.IDEA,
                Type.ARTICLE,
                LocalDateTime.now(),
                null,
                "" );
        content.add(c);
    }
}
