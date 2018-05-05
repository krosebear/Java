package com.kramirez.DojoNinja.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kramirez.DojoNinja.models.Dojo;
import com.kramirez.DojoNinja.models.Ninja;
import com.kramirez.DojoNinja.repositories.DojoRepository;
import com.kramirez.DojoNinja.repositories.NinjaRepository;

@Service
public class DojoService {
	private final NinjaRepository ninjaRepo;
	private final DojoRepository dojoRepo;
	
	public DojoService(NinjaRepository ninjaRepo,DojoRepository dojoRepo) {
		this.ninjaRepo = ninjaRepo;
		this.dojoRepo = dojoRepo;
	}
	public List<Dojo> allDojos(){
		return dojoRepo.findAll();
	}
	public void addDojo(Dojo dojo) {
		dojoRepo.save(dojo);
	}
	public Dojo findOne(Long id) {
		return dojoRepo.findById(id);
	}
//	public List<Ninja> findByDojo(Long id){
//		return dojoRepo.findNinjaById(id);
//	}
	
	
}
