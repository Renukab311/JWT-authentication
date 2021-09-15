package com.admin.Springbootjwt.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.admin.Springbootjwt.model.DAOUser;

@Repository
public interface UserDao extends CrudRepository<DAOUser, Integer> {
	DAOUser findByUsername(String username);
}