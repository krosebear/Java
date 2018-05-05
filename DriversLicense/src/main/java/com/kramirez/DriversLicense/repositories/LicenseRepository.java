package com.kramirez.DriversLicense.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kramirez.DriversLicense.models.License;


@Repository
public interface LicenseRepository extends CrudRepository<License, Long>{
	List<License> findAll();
	License findOne(Long id);
}
