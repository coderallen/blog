package com.ca.blog.base;

import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;

/**
 * Customised Repository
 * Created by Allen on 31/03/2017.
 * coder.allen@hotmail.com
 */
public class BaseRepository implements CrudRepository {

    @Override
    public Object save(Object o) {
        return null;
    }

    @Override
    public Iterable save(Iterable iterable) {
        return null;
    }

    @Override
    public Object findOne(Serializable serializable) {
        return null;
    }

    @Override
    public boolean exists(Serializable serializable) {
        return false;
    }

    @Override
    public Iterable findAll() {
        return null;
    }

    @Override
    public Iterable findAll(Iterable iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void delete(Serializable serializable) {

    }

    @Override
    public void delete(Object o) {

    }

    @Override
    public void delete(Iterable iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
