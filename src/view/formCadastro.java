package view;

import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.text.MaskFormatter;

public class formCadastro extends JFrame {
	JLabel tituloLabel, nomeLabel, cpfLabel, emailLabel, enderecoLabel, sexoLabel, telefoneLabel, usuarioLabel,
			senhaLabel;
	JTextField nomeField, emailField, enderecoField, usuarioField, senhaField;
	JButton cadastrarButton, voltarButton;
	JRadioButton masculinoButton, femininoButton;
	JFormattedTextField cpfFormattedField, telefoneFormattedField;

	public formCadastro() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(150, 530);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		setResizable(false);

		cadastrarButton = new JButton("Cadastrar");
		voltarButton = new JButton("Voltar");

		Font font = new Font("Arial", Font.BOLD, 13);

		tituloLabel = new JLabel("Cadastro de Cliente");
		tituloLabel.setFont(font);

		usuarioField = new JTextField(11);
		senhaField = new JTextField(11);

		usuarioLabel = new JLabel("Usuário:");
		senhaLabel = new JLabel("Senha:");

		nomeLabel = new JLabel("Nome:");
		cpfLabel = new JLabel("CPF:");
		emailLabel = new JLabel("Email:");
		enderecoLabel = new JLabel("Endereço:");
		sexoLabel = new JLabel("Sexo:");
		telefoneLabel = new JLabel("Telefone:");
		nomeField = new JTextField(11);
		emailField = new JTextField(11);
		enderecoField = new JTextField(11);

		ButtonGroup group = new ButtonGroup();
		masculinoButton = new JRadioButton("M");
		femininoButton = new JRadioButton("F");
		group.add(masculinoButton);
		group.add(femininoButton);

		try {
			MaskFormatter cpfMask = new MaskFormatter("###.###.###-##");
			cpfFormattedField = new JFormattedTextField(cpfMask);
			cpfFormattedField.setColumns(11);

			MaskFormatter telefoneMask = new MaskFormatter("(##) #####-####");
			telefoneFormattedField = new JFormattedTextField(telefoneMask);
			telefoneFormattedField.setColumns(11);
		} catch (Exception e) {
			e.printStackTrace();
		}

		add(tituloLabel);
		add(nomeLabel);
		add(nomeField);
		add(cpfLabel);
		add(cpfFormattedField);
		add(emailLabel);
		add(emailField);
		add(enderecoLabel);
		add(enderecoField);
		add(usuarioLabel);
		add(usuarioField);
		add(senhaLabel);
		add(senhaField);
		add(sexoLabel);
		add(masculinoButton);
		add(femininoButton);
		add(telefoneLabel);
		add(telefoneFormattedField);
		add(cadastrarButton);
		add(voltarButton);
		setVisible(false);

	}

	public JLabel getTituloLabel() {
		return tituloLabel;
	}

	public void setTituloLabel(JLabel tituloLabel) {
		this.tituloLabel = tituloLabel;
	}

	public JLabel getNomeLabel() {
		return nomeLabel;
	}

	public void setNomeLabel(JLabel nomeLabel) {
		this.nomeLabel = nomeLabel;
	}

	public JLabel getCpfLabel() {
		return cpfLabel;
	}

	public void setCpfLabel(JLabel cpfLabel) {
		this.cpfLabel = cpfLabel;
	}

	public JLabel getEmailLabel() {
		return emailLabel;
	}

	public void setEmailLabel(JLabel emailLabel) {
		this.emailLabel = emailLabel;
	}

	public JLabel getEnderecoLabel() {
		return enderecoLabel;
	}

	public void setEnderecoLabel(JLabel enderecoLabel) {
		this.enderecoLabel = enderecoLabel;
	}

	public JLabel getSexoLabel() {
		return sexoLabel;
	}

	public void setSexoLabel(JLabel sexoLabel) {
		this.sexoLabel = sexoLabel;
	}

	public JLabel getTelefoneLabel() {
		return telefoneLabel;
	}

	public void setTelefoneLabel(JLabel telefoneLabel) {
		this.telefoneLabel = telefoneLabel;
	}

	public JTextField getNomeField() {
		return nomeField;
	}

	public void setNomeField(JTextField nomeField) {
		this.nomeField = nomeField;
	}

	public JTextField getEmailField() {
		return emailField;
	}

	public void setEmailField(JTextField emailField) {
		this.emailField = emailField;
	}

	public JTextField getEnderecoField() {
		return enderecoField;
	}

	public void setEnderecoField(JTextField enderecoField) {
		this.enderecoField = enderecoField;
	}

	public JButton getCadastrarButton() {
		return cadastrarButton;
	}

	public void setCadastrarButton(JButton cadastrarButton) {
		this.cadastrarButton = cadastrarButton;
	}

	public JButton getVoltarButton() {
		return voltarButton;
	}

	public void setVoltarButton(JButton voltarButton) {
		this.voltarButton = voltarButton;
	}

	public JRadioButton getMasculinoButton() {
		return masculinoButton;
	}

	public void setMasculinoButton(JRadioButton masculinoButton) {
		this.masculinoButton = masculinoButton;
	}

	public JRadioButton getFemininoButton() {
		return femininoButton;
	}

	public void setFemininoButton(JRadioButton femininoButton) {
		this.femininoButton = femininoButton;
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

	public JTextField getUsuarioField() {
		return usuarioField;
	}

	public void setUsuarioField(JTextField usuarioField) {
		this.usuarioField = usuarioField;
	}

	public JTextField getSenhaField() {
		return senhaField;
	}

	public void setSenhaField(JTextField senhaField) {
		this.senhaField = senhaField;
	}

	public JFormattedTextField getCpfFormattedField() {
		return cpfFormattedField;
	}

	public void setCpfFormattedField(JFormattedTextField cpfFormattedField) {
		this.cpfFormattedField = cpfFormattedField;
	}

	public JFormattedTextField getTelefoneFormattedField() {
		return telefoneFormattedField;
	}

	public void setTelefoneFormattedField(JFormattedTextField telefoneFormattedField) {
		this.telefoneFormattedField = telefoneFormattedField;
	}

}
