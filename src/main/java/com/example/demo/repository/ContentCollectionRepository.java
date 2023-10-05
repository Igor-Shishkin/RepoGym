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

    private final List<Content> contentList = new ArrayList<>();

    public List<Content> findAll() {
        return contentList;
    }
    public Optional<Content> findById (Integer id) {
        return contentList.stream()
                .filter(c -> c.id().equals(id))
                .findFirst();
    }
    @PostConstruct
    private void unit() {
        Content content = new Content(1,
                "My first blog post",
                "Description",
                Status.IDEA,
                Type.ARTICLE,
                LocalDateTime.now(),
                null,
                "" );
        contentList.add(content);
    }
    public void save(Content content) {
        contentList.removeIf(c -> c.id().equals(content.id()));
        contentList.add(content);
    }

    public boolean existById(Integer id) {
        return contentList.stream()
                .filter(c -> c.id().equals(id))
                .count() == 1;
    }

    public void delete(Integer id) {
        contentList.removeIf(content -> content.id().equals(id));
    }
}
