package com.codegym.demo.service;

import com.codegym.demo.model.Tag;

import java.util.Optional;

public interface ITagService {
    Optional<Tag> findById(Long id);

    Iterable<Tag> findAll();

    Tag save(Tag tag);

    void delete(Long id);

    Iterable<Tag> findTagsByName(String tag_name);
}
