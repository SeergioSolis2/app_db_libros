package com.Databases.Repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Databases.Models.Perfiles;

@Repository
public interface Repositorio extends JpaRepository<Perfiles,Long> {

	List<Perfiles> findAll();
	

}
