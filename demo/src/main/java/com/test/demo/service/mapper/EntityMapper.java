package com.test.demo.service.mapper;

public interface EntityMapper<D,E> {
    D toDto(E e);
    E toEntity(D d);
}
