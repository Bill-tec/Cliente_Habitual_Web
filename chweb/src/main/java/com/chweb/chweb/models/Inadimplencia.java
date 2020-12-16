package com.chweb.chweb.models;

import java.util.Calendar;

public class Inadimplencia {
	private int id;
	private Calendar data;
	private Float valor;
	private int idCliente;
	private int idComercio;
	
	public Inadimplencia(int id, Calendar data, Float valor, int idCliente, int idComercio) {
		this.id = id;
		this.idCliente = idCliente;
		this.valor = valor;
		this.data = data;
		this.idComercio = idComercio;
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

	public int getCliente() {
		return idCliente;
	}

	public void setClienteId(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getIdComercio() {
		return idComercio;
	}

	public void setIdComercio(int idComercio) {
		this.idComercio = idComercio;
	}
	
}
