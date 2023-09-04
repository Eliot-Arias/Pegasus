package com.app.controlador;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.modelo.Usuario;
import com.app.servicios.ServiciosUsuario;

@RestController
public class ProductoControlador {
	
	@Autowired
	private ServiciosUsuario serviciosUsuario;
	
	@GetMapping("/")
	public String Login() {
		return "Pegasus SAC";
	}
	
	@PostMapping("/registrar")
	public Usuario registrarUsuario(@RequestParam Long id, String nombre, String apellido, String email, String telefono, String password) {
		Usuario usuario = new Usuario();
		try {
			usuario.setId(id);
			usuario.setNombre(nombre);
			usuario.setApellido(apellido);
			usuario.setEmail(email);
			usuario.setTelefono(telefono);
			usuario.setPassword(password);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return serviciosUsuario.RegistrarUsuario(usuario);
	}
	
	
	@GetMapping("/actualizar")
	public void ActualizarUsuario(@RequestParam Long id, String nombre, String apellido, String email, String telefono, String password) {
		serviciosUsuario.ActualizarUsuario(id, nombre, apellido, email, telefono, password);
	}
	
	
	@GetMapping("/listar")
	public List<Usuario> listarUsuarios(){
		return serviciosUsuario.listarUsuarios();
	}
}
