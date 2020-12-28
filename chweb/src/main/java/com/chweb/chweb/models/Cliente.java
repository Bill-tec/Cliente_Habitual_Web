package com.chweb.chweb.models;

import java.util.List;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
public class Cliente extends Usuario implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@OneToMany
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<Inadimplencia> inadimplencias;

	public List<Inadimplencia> getInadimplencias() {
		return inadimplencias;
	}

	public void setInadimplencias(List<Inadimplencia> inadimplencias) {
		this.inadimplencias = inadimplencias;
	}
	
	
}
