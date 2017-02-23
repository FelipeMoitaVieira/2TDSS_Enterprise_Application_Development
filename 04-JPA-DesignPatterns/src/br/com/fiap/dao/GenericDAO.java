package br.com.fiap.dao;

public interface GenericDAO<T,K> {

	void insert(T name);
	void update(T name);
	void delete(K id);
	T findById(K id);
}
