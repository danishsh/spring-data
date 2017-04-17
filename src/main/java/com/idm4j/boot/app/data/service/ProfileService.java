package com.idm4j.boot.app.data.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.idm4j.boot.app.data.model.Profile;


public interface ProfileService {
	Profile get(int id);
	Profile saveOrUpdate(Profile user);
	void delete(int id);
	List<Profile> findAll();
	Profile findByUserName(String userId);
}
