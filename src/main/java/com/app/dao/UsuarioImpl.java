package com.app.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.modelo.Usuario;
import com.app.repositorio.RepositorioUsuario;
import com.app.servicios.ServiciosUsuario;

@Service
public class UsuarioImpl implements ServiciosUsuario{
	
	@Autowired
	private RepositorioUsuario repositorioUsuario;

	@Override
	public Usuario RegistrarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return repositorioUsuario.save(usuario);
	}

	@Override
	public void ActualizarUsuario(Long id, String nombre, String apellido, String email, String telefono, String password) {
		// TODO Auto-generated method stub
		
		Usuario usuario = repositorioUsuario.getById(id);
		String nombreActual = usuario.getNombre();
		usuario.setNombre(nombreActual);
		String apellidoActual = usuario.getApellido();
		usuario.setApellido(apellidoActual);
		String emailActual = usuario.getEmail();
		usuario.setEmail(emailActual);
		String telefonoActual = usuario.getTelefono();
		usuario.setTelefono(telefonoActual);
		String passwordActual = usuario.getPassword();
		usuario.setPassword(passwordActual);
		
		
				
		
	}

	@Override
	public List<Usuario> listarUsuarios() {
		// TODO Auto-generated method stub
		return repositorioUsuario.findAll();
	}
	
	
}
