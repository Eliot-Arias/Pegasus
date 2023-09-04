package com.app.servicios;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.modelo.Usuario;

@Service
public interface ServiciosUsuario {
	public Usuario RegistrarUsuario(Usuario usuario);
	
	public void ActualizarUsuario(Long id, String nombre, String apellido, String email, String telefono, String password);
	
	public List<Usuario> listarUsuarios();
	
}
