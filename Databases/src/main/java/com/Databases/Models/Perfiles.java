package com.Databases.Models;

import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.*;

@Entity
@Table(name = "perfil")

public class Perfiles {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "Usuario")
	private String Usuario;

	@Column(name = "Email")
	private String Email;

	public Perfiles() {

	}

	public Perfiles(Long id, String usuario, String email) {
		super();
		this.id = id;
		Usuario = usuario;
		Email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsuario() {
		return Usuario;
	}

	public void setUsuario(String usuario) {
		Usuario = usuario;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

}
