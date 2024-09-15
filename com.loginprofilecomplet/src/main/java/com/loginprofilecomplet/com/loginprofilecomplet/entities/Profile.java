package com.loginprofilecomplet.com.loginprofilecomplet.entities;

import java.util.Arrays;
import java.util.Base64;

import org.springframework.web.multipart.MultipartFile;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class Profile {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String dob;
  private String gender;
  private String city ;
  @Lob
  @Basic(fetch = FetchType.LAZY)
  @Column(columnDefinition = "LONGBLOB")
  private byte[] photo ;
public Profile() {
	super();
	// TODO Auto-generated constructor stub
}
public Profile(Long id, String name, String dob, String gender, String city, byte[] photo) {
	super();
	this.id = id;
	this.name = name;
	this.dob = dob;
	this.gender = gender;
	this.city = city;
	this.photo = photo;
}
   public String getPhotoBase64(){
	   
	   if(photo==null) {
		   return null;
	   }
	   
	   return Base64.getEncoder().encodeToString(photo);
   }
public Long getId() {
	return id;
}
public void setId(Long id2) {
	this.id = id2;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public byte[] getPhoto() {
	return photo;
}
public void setPhoto(byte[] photo) {
	this.photo = photo;
}
@Override
public String toString() {
	return "Profile [id=" + id + ", name=" + name + ", dob=" + dob + ", gender=" + gender + ", city=" + city
			+ ", photo=" + Arrays.toString(photo) + ", getId()=" + getId() + ", getName()=" + getName() + ", getDob()="
			+ getDob() + ", getGender()=" + getGender() + ", getCity()=" + getCity() + ", getPhoto()="
			+ Arrays.toString(getPhoto()) + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
}
}
