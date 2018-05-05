package com.kramirez.DriversLicense.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kramirez.DriversLicense.models.License;
import com.kramirez.DriversLicense.models.Person;
import com.kramirez.DriversLicense.repositories.LicenseRepository;
import com.kramirez.DriversLicense.repositories.PersonRepository;


@Service
public class HomeService {
	private final PersonRepository personRepo;
	private final LicenseRepository licenseRepo;
	
	public HomeService(PersonRepository personRepo, LicenseRepository licenseRepo) {
		this.personRepo = personRepo;
		this.licenseRepo = licenseRepo;
	}
	public List<Person> allPeople(){
		return personRepo.findAll();
	}
	public Person findPersonById(Long id) {
		return personRepo.findOne(id);
	}
	public void addPerson(Person person) {
		personRepo.save(person);
		
	}
	public Object allLicenses() {
		return licenseRepo.findAll();
	}
	public License addLicense(License license) {
		Long personId = license.getPerson().getId();
		String licNumber = String.format("%06d", personId);
		license.setNumber(licNumber);
		License lic = licenseRepo.save(license);
		return lic;
		
	}
}
