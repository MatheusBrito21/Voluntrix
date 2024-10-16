package com.voluntrix.Voluntrix.model;

public class Colaborador {
	private static int idCount = 0;
	private int id;
	private String nome;
	private String privilegio = "ADMIN";
		
	public Colaborador() {
		super();
		idCount++;
		this.id = idCount;
	}

	public Colaborador(String nome, String privilegio) {
		super();
		idCount++;
		this.id = idCount;
		this.nome = nome;
		this.privilegio = privilegio;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getPrivilegio() {
		return this.privilegio;
	}
	
	public void setPrivilegio(String privilegio) {
		this.privilegio = privilegio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Id:" + this.id + "\n"
				+"Nome:"+ this.nome + "\n" 
				+"Privilegio:"+ this.privilegio+"\n"
				+"-------------------------------|\n";
	}
	
	
}
