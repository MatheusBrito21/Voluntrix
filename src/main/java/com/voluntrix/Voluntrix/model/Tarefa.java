package com.voluntrix.Voluntrix.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Tarefa {
	private static int idCount = 0;
	private int id;
	private String descricao;
	private String local;
	private LocalDateTime horario;
	private boolean status;
	private LocalDateTime dataInicio;
	private LocalDateTime dataFim;
	
	public Tarefa() {
		super();
		idCount++;
		this.id = idCount;
	}

	public Tarefa(String descricao, String local, LocalDateTime horario, boolean status, LocalDateTime dataInicio, LocalDateTime dataFim) {
		super();
		idCount++;
		this.id = idCount;
		this.descricao = descricao;
		this.local = local;
		this.horario = horario;
		this.status = status;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public LocalDateTime getHorario() {
		return horario;
	}

	public void setHorario(LocalDateTime horario) {
		this.horario = horario;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public LocalDateTime getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDateTime dataInicio) {
		this.dataInicio = dataInicio;
	}

	public LocalDateTime getDataFim() {
		return dataFim;
	}

	public void setDataFim(LocalDateTime dataFim) {
		this.dataFim = dataFim;
	}
	
	@Override
	public String toString() {
		
		 DateTimeFormatter formatHoras = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm");
		return "Id:" + this.id + "\n"
				+"Descricao:"+ this.descricao + "\n" 
				+"Local:"+ this.local + "\n"
				+"Horario:"+ this.horario.format(formatHoras)+"\n"
				+"-------------------------------|\n";
	}
	
	
	
	

}
