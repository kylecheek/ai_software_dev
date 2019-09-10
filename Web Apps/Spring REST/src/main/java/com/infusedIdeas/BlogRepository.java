package com.infusedIdeas;

import com.infusedIdeas.controllers.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Integer> {

    // custom query to search blog post by title or content
    List<Blog> findByTitleContainingOrContentContaining(String text, String textAgain);

}