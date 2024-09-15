package com.loginprofilecomplet.com.loginprofilecomplet.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.loginprofilecomplet.com.loginprofilecomplet.entities.Profile;
import com.loginprofilecomplet.com.loginprofilecomplet.services.MainServiceImplementation;

@Controller
public class MainControllers {
      @Autowired
	  MainServiceImplementation service ;
     @PostMapping("/create")
     public String create(
    		
    		 @RequestParam String name ,
    		 @RequestParam String dob,
    		 @RequestParam String gender ,
    		 @RequestParam String city ,
    		 @RequestParam MultipartFile photo ,
    		 Model model 
    		 ) 
     {
    	 Profile profile = new Profile();
    	 profile.setName(name);
    	 profile.setDob(dob);
    	 profile.setGender(gender);
    	 profile.setCity(city);
    	try {
    	
    	if(!photo.isEmpty()) {
    		
    		profile.setPhoto(photo.getBytes());
    	} 
    	}catch(IOException e) {
    		e.printStackTrace();    
    }
    	 service.photoStore(profile);
    	 model.addAttribute("profile", profile);
    	 return "displayProfile";
     }
}
