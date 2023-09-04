package com.app.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.modelo.Usuario;

@Repository
public interface RepositorioUsuario extends JpaRepository<Usuario, Long>{
	
}
