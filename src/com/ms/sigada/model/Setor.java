package com.ms.sigada.model;

public class Setor {
	private int ID;
	private String nome;
	
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = (nome == null ? "" : nome);
	}
	
	
	
}