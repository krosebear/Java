package com.kramirez.DojoNinja.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kramirez.DojoNinja.models.Ninja;
import com.kramirez.DojoNinja.repositories.DojoRepository;
import com.kramirez.DojoNinja.repositories.NinjaRepository;

@Service
public class NinjaService {
	private final NinjaRepository ninjaRepo;
	private final DojoRepository dojoRepo;
	
	public NinjaService(NinjaRepository ninjaRepo,DojoRepository dojoRepo) {
		this.ninjaRepo = ninjaRepo;
		this.dojoRepo = dojoRepo;
	}
	public List<Ninja> allNinjas(){
		return ninjaRepo.findAll();
	}
	public void addNinja(Ninja ninja) {
		ninjaRepo.save(ninja);
	}
	public Ninja findOne(Long id) {
		System.out.println(ninjaRepo.findById(id));
		return ninjaRepo.findById(id);
	}
	
	

}
