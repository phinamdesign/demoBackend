package com.codegym.demo.service.impl;

import com.codegym.demo.model.Tag;
import com.codegym.demo.repository.ITagRepository;
import com.codegym.demo.service.ITagService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class TagServiceImpl implements ITagService {
    @Autowired
    private ITagRepository repository;

    @Override
    public Optional<Tag> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Iterable<Tag> findAll() {
        return repository.findAll();
    }

    @Override
    public Tag save(Tag tag) {
        return repository.save(tag);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Iterable<Tag> findTagsByName(String tag_name) {
        return repository.findTagsByName(tag_name);
    }
}
