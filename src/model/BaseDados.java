package model;

import java.util.ArrayList;

public class BaseDados {
	private static ArrayList<Usuario> usuarios;

	public static void inicializarBase() {
		usuarios = new ArrayList<Usuario>();
	}

	public static boolean adicionarUsuario(Usuario usuario) {
		if (buscarUsuario(usuario.getCpf()) == null) {
			return usuarios.add(usuario);
		}
		return false;
	}

	public static boolean editarUsuario(String cpf, Usuario novoUsuario) {
		Usuario usuarioBase = buscarUsuario(cpf);
		if (usuarioBase != null) {
			usuarios.set(usuarios.indexOf(usuarioBase), novoUsuario);
			return true;
		}
		return false;
	}

	public static Usuario buscarUsuario(String cpf) {
		for (Usuario usuario : usuarios) {
			if (usuario.getCpf().equals(cpf)) {
				return usuario;
			}
		}
		return null;
	}

	public static Usuario buscarUsuario(Usuario usuario) {
		return buscarUsuario(usuario.getCpf());

	}

	public static boolean validarUsuario(String username, String senha) {
		for (Usuario usuario : usuarios) {
			if (usuario.getUsername().equals(username) && usuario.getSenha().equals(senha)) {
				return true;
			}
		}

		return false;
	}

	public static boolean removerUsuario(String cpf) {
		return usuarios.remove(buscarUsuario(cpf));
	}

	public static ArrayList<Usuario> listarUsuario() {
		return usuarios;
	}

}
