package com.kramirez.GroupLanguages.services;
import java.util.List;

import org.springframework.stereotype.Service;

import com.kramirez.GroupLanguages.models.Language;
import com.kramirez.GroupLanguages.repositories.LanguageRepository;

@Service
public class LanguageService {
	private LanguageRepository langrepo;
	public LanguageService(LanguageRepository langrepo) {
		this.langrepo = langrepo;
	}
	public List<Language> allLanguages() {
        return langrepo.findAll();
    }
	 public Language findLanguageById(Long id) {
	        return langrepo.findOne(id);
	    }

    public void addLanguage(Language language) {
        langrepo.save(language);
    }
    public void updateLanguage(Long id, Language language) {
    		langrepo.save(language);
 
    }
    public void destroyLanguage(Long id) {
    		langrepo.delete(id);
    }
}
