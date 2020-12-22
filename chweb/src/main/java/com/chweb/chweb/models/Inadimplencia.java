package com.chweb.chweb.models;

import java.util.Calendar;

public class Inadimplencia {
	private int id;
	private Calendar data;
	private Float valor;
	private Cliente cliente;
	private Comercio comercio;
	
	public Inadimplencia(int id, Calendar data, Float valor, Cliente cliente, Comercio comercio) {
		this.id = id;
		this.cliente = cliente;
		this.valor = valor;
		this.data = data;
		this.comercio = comercio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public Float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Comercio getComercio() {
		return comercio;
	}

	public void setComercio(Comercio comercio) {
		this.comercio = comercio;
	}

	
	
}
