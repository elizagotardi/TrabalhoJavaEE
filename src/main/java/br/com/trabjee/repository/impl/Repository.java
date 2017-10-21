package br.com.trabjee.repository.impl;

import java.util.List;

import br.com.trabjee.domain.BaseEntity;

public interface Repository<T extends BaseEntity> {

	List<T> getAll();

	T findById(Long id);

	T save(T object);

	void remove(Long id);

}
