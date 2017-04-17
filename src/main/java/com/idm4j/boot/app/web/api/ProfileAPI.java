package com.idm4j.boot.app.web.api;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.idm4j.boot.app.data.dao.ProfileDAO;
import com.idm4j.boot.app.data.model.Profile;
import com.idm4j.boot.app.data.service.ProfileService;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileAPI {

	private static final Logger logger = LoggerFactory.getLogger(ProfileAPI.class);

	@Autowired
	private ProfileService profileService;

	public ProfileAPI() {
		// TODO Auto-generated constructor stub
	}

	// This API will fetch the profile from the IDM
	@RequestMapping(value = "/ProfileAPI/get/{id}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody Profile get(@PathVariable("id") int id) {
		Profile profile = null;
		try {
			logger.debug("Start - get");
			profile = profileService.get(id);
		} catch (Exception ex) {
			logger.debug("Exception in get- " + ex.getMessage());
		} finally {
			logger.debug("End - get");
		}
		return profile;

	}

	// This API will fetch all profile from the IDM
	@RequestMapping(value = "/ProfileAPI/getAll/", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody List<Profile> getAll() {
		List<Profile> profileList = null;
		try {
			logger.debug("Start - getAll");
			profileList = profileService.findAll();

		} catch (Exception ex) {
			logger.debug("Exception in getAll - " + ex.getMessage());
		} finally {
			logger.debug("End - getAll");
		}
		return profileList;

	}

	// This API will add the profile from the IDM
	@RequestMapping(value = "/ProfileAPI/save", method = RequestMethod.POST, consumes = "application/json")
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody Profile save(@RequestBody Profile profile) {

		try {
			logger.debug("Start - save");
			profile = profileService.saveOrUpdate(profile);

		} catch (Exception ex) {
			logger.debug("Exception in save- " + ex.getMessage());
		} finally {
			logger.debug("End - save");
		}
		return profile;
	}

	// This API will update the profile from the IDM
	@RequestMapping(value = "/ProfileAPI/update", method = RequestMethod.POST, consumes = "application/json")
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody Profile update(@RequestBody Profile profile) {

		try {
			logger.debug("Start - update");
			profile = profileService.saveOrUpdate(profile);

		} catch (Exception ex) {
			logger.debug("Exception in update- " + ex.getMessage());
		} finally {
			logger.debug("End - update");
		}
		return profile;
	}

}
