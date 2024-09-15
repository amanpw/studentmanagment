package com.loginprofilecomplet.com.loginprofilecomplet.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.stereotype.Service;

import com.loginprofilecomplet.com.loginprofilecomplet.Repository.ProfileRepository;
import com.loginprofilecomplet.com.loginprofilecomplet.entities.Profile;

@Service
public class MainServiceImplementation implements MainService{
      @Autowired
	  ProfileRepository repo;
	@Override
	public String photoStore(Profile profile) {
	   repo.save(profile);
		return "Data has been stored";
	}
}
