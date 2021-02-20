package com.ga.melodiesapp.dao;

import org.springframework.data.repository.CrudRepository;

import com.ga.melodiesapp.model.User;


public interface UserDao extends CrudRepository<User, Integer> {
	public User findById(int id);

	public User findByEmailAddress(String emailAddress);

}
