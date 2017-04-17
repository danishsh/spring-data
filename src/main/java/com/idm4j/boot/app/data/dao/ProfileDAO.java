package com.idm4j.boot.app.data.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.idm4j.boot.app.data.model.Profile;


public interface ProfileDAO   {
	Profile get(int id);
	Profile saveOrUpdate(Profile user);
	void delete(int id);
	List<Profile> findAll();
	Profile findByUserName(String userId);
}
