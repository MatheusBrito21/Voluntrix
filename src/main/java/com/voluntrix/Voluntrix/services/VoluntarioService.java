package com.voluntrix.Voluntrix.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.voluntrix.Voluntrix.model.VoluntarioModel;
import com.voluntrix.Voluntrix.repositories.VoluntarioRepository;

@Service
public class VoluntarioService {
	
	@Autowired
	VoluntarioRepository repository;
	
	public List<VoluntarioModel> getAll(){
		List<VoluntarioModel> lista = repository.findAll();
		return lista;
	}
	
	public VoluntarioModel createVoluntario(VoluntarioModel v) {
		return repository.save(v);
	}

}
