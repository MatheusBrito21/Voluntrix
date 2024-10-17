package com.voluntrix.Voluntrix.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.voluntrix.Voluntrix.model.VoluntarioModel;
import com.voluntrix.Voluntrix.services.VoluntarioService;

@RestController
@RequestMapping(path = "/voluntario")
public class VoluntarioController {
	
	@Autowired
	VoluntarioService service;
	
	@GetMapping(path = "/teste")
	public String teste() {
		
		VoluntarioModel v = new VoluntarioModel();
		v.setNome("Matheus");
		return v.getNome();
	}
	
	@GetMapping(path = "/todos")
	public ResponseEntity<List<VoluntarioModel>> getAll(){
		List<VoluntarioModel> listaTodos = service.getAll();
		return ResponseEntity.ok().body(listaTodos);
	}
	
	@PostMapping(path = "criar")
	public ResponseEntity<VoluntarioModel> createVoluntario(@RequestBody VoluntarioModel v){
		VoluntarioModel newVoluntario = service.createVoluntario(v);
		return ResponseEntity.ok().body(newVoluntario);
		
	}
	
	
	
	
	
	
	
	
}
