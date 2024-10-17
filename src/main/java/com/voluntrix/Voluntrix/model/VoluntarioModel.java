package com.voluntrix.Voluntrix.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "voluntario")

public class VoluntarioModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private String contato;
	private String credencial;
	private String endereco;
	private String email;
	private int pontuacaoTotal = 0;
	private int idade;
	
	public VoluntarioModel() {
		
	}
	
	public VoluntarioModel(String nome, String contato, String credencial, String endereco, String email,
			int pontuacaoTotal, int idade) {
		super();
		this.nome = nome;
		this.contato = contato;
		this.credencial = credencial;
		this.endereco = endereco;
		this.email = email;
		this.pontuacaoTotal = pontuacaoTotal;
		this.idade = idade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getCredencial() {
		return credencial;
	}

	public void setCredencial(String credencial) {
		this.credencial = credencial;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPontuacaoTotal() {
		return pontuacaoTotal;
	}

	public void setPontuacaoTotal(int pontuacaoTotal) {
		this.pontuacaoTotal = pontuacaoTotal;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	@Override
	public String toString() {
		return "Id:" + this.id + "\n"
				+"Nome:"+ this.nome + "\n" 
				+"Contato:"+ this.contato + "\n"
				+"Credencial:"+ this.credencial+"\n"
				+"Endere�o:" + this.endereco + "\n"
				+"E-mail:" + this.email +"\n"
				+"Pontuacao Total:" + this.pontuacaoTotal +"\n"
				+"Idade:"+ idade+"\n"
				+"-------------------------------|\n";
	}

}
