package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame{

	private JTextField txtNombre;
	private JLabel lblUsuario;
	private JLabel lblContrasea;
	private JButton btnNewButton;
	private String nombre;
	private String contra;
	private JPasswordField txtContra;
	/**
	 * Create the application.
	 */
	public Login() {
		nombre = "admin";
		contra = "admin";
		initialize();
	}

	/**
	 * Initialize the contents of the 
	 */
	private void initialize() {
		setBounds(100, 100, 264, 295);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(43, 48, 80, 14);
		getContentPane().add(lblUsuario);
		
		lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setBounds(43, 105, 96, 14);
		getContentPane().add(lblContrasea);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(43, 73, 164, 20);
		getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		btnNewButton = new JButton("INICIAR");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(txtNombre.getText().equals(nombre) && txtContra.getText().equals(contra)){
				GestionPersonal gestion = new GestionPersonal();
				gestion.setVisible(true);
				dispose();
				}else{
					JOptionPane.showMessageDialog(null, "El nombre de usuario y contraseña no coinciden","FALLO INICIO SESIÓN", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(43, 167, 164, 50);
		getContentPane().add(btnNewButton);
		
		txtContra = new JPasswordField();
		txtContra.setBounds(43, 130, 164, 20);
		getContentPane().add(txtContra);
	}
}
