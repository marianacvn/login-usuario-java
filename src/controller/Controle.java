package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.BaseDados;
import model.Usuario;
import view.Login;
import view.formCadastro;

public class Controle implements ActionListener {
	formCadastro cadastro;
	Login login;

	public Controle() {
		BaseDados.inicializarBase();
		login = new Login();
		cadastro = new formCadastro();
		cadastro.setVisible(false);

		cadastro.getCadastrarButton().addActionListener(this);
		cadastro.getVoltarButton().addActionListener(this);
		login.getCadastrarButton().addActionListener(this);
		login.getExibirBox().addActionListener(this);
		login.getEntrarButton().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cadastro.getCadastrarButton()) {
			String nome = cadastro.getNomeField().getText();
			String cpf = cadastro.getCpfFormattedField().getText();
			String email = cadastro.getEmailField().getText();
			String telefone = cadastro.getTelefoneFormattedField().getText();
			String endereco = cadastro.getEnderecoField().getText();
			String username = cadastro.getUsuarioField().getText();
			String senha = cadastro.getSenhaField().getText();
			String sexo = cadastro.getMasculinoButton().isSelected() ? "M" : "F";
			Usuario usuario = new Usuario(nome, cpf, email, telefone, endereco, sexo, username, senha);
			boolean cadastrou = BaseDados.adicionarUsuario(usuario);
			String msg = "";
			if (cadastrou) {
				msg = "Usuario: '" + usuario.getNome() + "'foi cadastrado com sucesso!";
			} else {
				msg = "Usuario: '" + usuario.getNome() + "' já está cadastrado!";
			}
			JOptionPane.showMessageDialog(cadastro, msg);
			System.out.println(BaseDados.listarUsuario());
		}
		if (e.getSource() == cadastro.getVoltarButton()) {
			cadastro.setVisible(false);
			login.setVisible(true);
		}
		if (e.getSource() == login.getCadastrarButton()) {
			login.setVisible(false);
			cadastro.setVisible(true);
		}
		if (e.getSource() == login.getExibirBox()) {
			if (login.getSenhaPasswordField().getEchoChar() == '*') {
				login.getSenhaPasswordField().setEchoChar((char) 0);
				System.out.println("exibirBox: " + login.getExibirBox());
			} else {
				login.getSenhaPasswordField().setEchoChar('*');
			}
		}
		if (e.getSource() == login.getEntrarButton()) {
				String username = login.getUsuarioField().getText();
				String senha = login.getSenhaPasswordField().getText();
				System.out.println("usuario"+ username);
				System.out.println("senha"+senha);
				boolean validarUsuario = BaseDados.validarUsuario(username, senha);
			if (validarUsuario) {
					JOptionPane.showMessageDialog(null, "Usuário foi logado com sucesso!");
			} else {
					JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos", "Atenção",
							JOptionPane.ERROR_MESSAGE);
				}

			}
		}
	}


