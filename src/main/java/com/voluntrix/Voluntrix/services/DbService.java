package com.voluntrix.Voluntrix.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.voluntrix.Voluntrix.model.VoluntarioModel;
import com.voluntrix.Voluntrix.repositories.VoluntarioRepository;

@Service
public class DbService {
	
	@Autowired
	VoluntarioRepository volunRepository;
	
	public void instanciaDb() {
		List<VoluntarioModel> voluntarios = new ArrayList<VoluntarioModel>();
		
		voluntarios.add(new VoluntarioModel("Matheus Brito", "61999998888", "ADMIN","Edificio Embratel" , "matheus@hitss.com", 0, 26));
		voluntarios.add(new VoluntarioModel("Everton", "61999998888", "USER","LOCAL" , "everton@hitss.com", 0, 30));
		voluntarios.add(new VoluntarioModel("Romeu", "61999998888", "USER","LOCAL" , "romeu@hitss.com", 0, 30));
		voluntarios.add(new VoluntarioModel("Marcelo", "61999998888", "USER","" , "marcelo@hitss.com", 0, 30));
		
		volunRepository.saveAll(voluntarios);
		
	}

}
