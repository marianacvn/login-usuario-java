package view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Login extends JFrame {
	JLabel usuarioLabel, senhaLabel, iconLabel, mensagemLabel;
	ImageIcon iconIcon;
	JTextField usuarioField;
	JCheckBox exibirBox;
	JPasswordField senhaPasswordField;
	JButton entrarButton, cadastrarButton;

	public Login() {
		setTitle("LOGIN");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setSize(300, 460);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());

		Font font = new Font("Arial", Font.BOLD, 13);

		usuarioLabel = new JLabel("Usuário:");
		usuarioLabel.setFont(font);
		senhaLabel = new JLabel(" Senha:");
		senhaLabel.setFont(font);

		usuarioField = new JTextField(19);

		exibirBox = new JCheckBox("Exibir senha");

		senhaPasswordField = new JPasswordField(19);
		entrarButton = new JButton("Entrar");
		cadastrarButton = new JButton("Cadastre-se");
		mensagemLabel = new JLabel("");
		mensagemLabel.setForeground(Color.RED);

		iconIcon = new ImageIcon("images/user.png");
		iconLabel = new JLabel(iconIcon);
		
		


		add(iconLabel);
		add(usuarioLabel);
		add(usuarioField);
		add(senhaLabel);
		add(senhaPasswordField);
		add(cadastrarButton);
		add(entrarButton);
		add(exibirBox);
		setVisible(true);

	}

	public JLabel getUsuarioLabel() {
		return usuarioLabel;
	}

	public void setUsuarioLabel(JLabel usuarioLabel) {
		this.usuarioLabel = usuarioLabel;
	}

	public JLabel getSenhaLabel() {
		return senhaLabel;
	}

	public void setSenhaLabel(JLabel senhaLabel) {
		this.senhaLabel = senhaLabel;
	}

	public JLabel getIconLabel() {
		return iconLabel;
	}

	public void setIconLabel(JLabel iconLabel) {
		this.iconLabel = iconLabel;
	}

	public JLabel getMensagemLabel() {
		return mensagemLabel;
	}

	public void setMensagemLabel(JLabel mensagemLabel) {
		this.mensagemLabel = mensagemLabel;
	}

	public ImageIcon getIconIcon() {
		return iconIcon;
	}

	public void setIconIcon(ImageIcon iconIcon) {
		this.iconIcon = iconIcon;
	}

	public JTextField getUsuarioField() {
		return usuarioField;
	}

	public void setUsuarioField(JTextField usuarioField) {
		this.usuarioField = usuarioField;
	}

	public JCheckBox getExibirBox() {
		return exibirBox;
	}

	public void setExibirBox(JCheckBox exibirBox) {
		this.exibirBox = exibirBox;
	}

	public JPasswordField getSenhaPasswordField() {
		return senhaPasswordField;
	}

	public void setSenhaPasswordField(JPasswordField senhaPasswordField) {
		this.senhaPasswordField = senhaPasswordField;
	}

	public JButton getEntrarButton() {
		return entrarButton;
	}

	public void setEntrarButton(JButton entrarButton) {
		this.entrarButton = entrarButton;
	}

	public JButton getCadastrarButton() {
		return cadastrarButton;
	}

	public void setCadastrarButton(JButton cadastrarButton) {
		this.cadastrarButton = cadastrarButton;
	}
}
