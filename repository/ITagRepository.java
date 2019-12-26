package com.codegym.demo.repository;

import com.codegym.demo.model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITagRepository extends JpaRepository<Tag, Long> {
    Iterable<Tag> findTagsByName(String tag_name);
}
