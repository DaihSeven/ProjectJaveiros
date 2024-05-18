package com.api.tabelafipe.repository;


import com.api.tabelafipe.model.InteresseModel;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
public class InteresseRepository implements JpaRepository<InteresseModel, Long> {

    @Override
    public void flush() {

    }

    @Override
    public <S extends InteresseModel> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends InteresseModel> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<InteresseModel> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public InteresseModel getOne(Long aLong) {
        return null;
    }

    @Override
    public InteresseModel getById(Long aLong) {
        return null;
    }

    @Override
    public InteresseModel getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends InteresseModel> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends InteresseModel> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends InteresseModel> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends InteresseModel> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends InteresseModel> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends InteresseModel> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends InteresseModel, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends InteresseModel> S save(S entity) {
        return null;
    }

    @Override
    public <S extends InteresseModel> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<InteresseModel> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<InteresseModel> findAll() {
        return null;
    }

    @Override
    public List<InteresseModel> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(InteresseModel entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends InteresseModel> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<InteresseModel> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<InteresseModel> findAll(Pageable pageable) {
        return null;
    }
}
