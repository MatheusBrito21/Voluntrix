package com.voluntrix.Voluntrix.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "voluntario")
@NoArgsConstructor
@AllArgsConstructor
public class VoluntarioModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter @Setter
	private int id;
	@Getter @Setter
	private String nome;
	@Getter @Setter
	private String contato;
	@Getter @Setter
	private String credencial;
	@Getter @Setter
	private String endereco;
	@Getter @Setter
	private String email;
	@Getter @Setter
	private int pontuacaoTotal = 0;
	@Getter @Setter
	private int idade;
	
	
	@Override
	public String toString() {
		return "Id:" + this.id + "\n"
				+"Nome:"+ this.nome + "\n" 
				+"Contato:"+ this.contato + "\n"
				+"Credencial:"+ this.credencial+"\n"
				+ "Endere�o:" + this.endereco + "\n"
				+"E-mail:" + this.email +"\n"
				+"Pontuacao Total:" + this.pontuacaoTotal +"\n"
				+"Idade:"+ idade+"\n"
				+"-------------------------------|\n";
	}

}
