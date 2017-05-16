package vista;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JSlider;
import javax.swing.JToggleButton;

import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import models.Empleado;
import controller.controlador;

import java.awt.event.MouseAdapter;

public class GestionPersonal extends JFrame{

	private JTextField textNombre, textApellido;
	private ButtonGroup genero;
	private JLabel lblTitulo;
	private JLabel lblNombre;
	private JLabel lblApellido;
	private JRadioButton rdbtnHombre, rdbtnMujer;
	private JList list;
	private JLabel lblAntiguedad;
	private JLabel lblDia;
	private JComboBox cbDia, cbMes, cbAno;
	private JLabel lblMes;
	private JLabel lblAo;
	private JButton btnCrear;
	private JLabel lblPuestoEnLa;
	private JLabel lblSueldo;
	private JSlider slider;
	private JLabel lblSueldoAlMes;
	private JLabel lblComentarios;
	private JTextArea txtComentario;
	private JToggleButton btnEstaDeVacaciones, btnEditar;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JMenu mnAyuda;
	private JMenuItem menuItem;
	private JButton btnNextEmpleado;
	private JButton btnLastEmpleado;
	private JLabel lblEmpleado;
	private JButton btnGuardar;
	private JButton btnBorrar;
	

	public GestionPersonal() {
		Initialize();
		setPropiedades();
		setEventos();
	}

	private void Initialize(){
		genero = new ButtonGroup();
		lblTitulo = new JLabel("Gestion de Personal - Modo Escritura");
		lblNombre = new JLabel("Nombre:");
		lblApellido = new JLabel("Apellido:");
		textNombre = new JTextField();
		textApellido = new JTextField();
		rdbtnHombre = new JRadioButton("Hombre");
		rdbtnMujer = new JRadioButton("Mujer");
		lblPuestoEnLa = new JLabel("Puesto en la empresa:");
		lblAntiguedad = new JLabel("Antiguedad:");
		lblDia = new JLabel("Dia:");
		cbDia = new JComboBox();
		lblMes = new JLabel("Mes:");
		cbMes = new JComboBox();
		lblAo = new JLabel("A\u00F1o:");
		cbAno = new JComboBox();
		btnCrear = new JButton("CREAR");
		lblSueldo = new JLabel("Sueldo(0-10000):");
		slider = new JSlider();
		list = new JList();
		lblSueldoAlMes = new JLabel("0\u20AC al mes");
		lblComentarios = new JLabel("Comentarios:");
		txtComentario = new JTextArea();
		btnEstaDeVacaciones = new JToggleButton("ESTA DE VACACIONES");
		menuBar = new JMenuBar();
		mnNewMenu = new JMenu("Modo");
		mntmNewMenuItem = new JMenuItem("Lectura");
		mntmNewMenuItem_1 = new JMenuItem("Escritura");
		mnAyuda = new JMenu("Ayuda");
		menuItem = new JMenuItem("???");
		btnNextEmpleado = new JButton(">");
		btnLastEmpleado = new JButton("<");
		lblEmpleado = new JLabel("0 de 0");	
		btnGuardar = new JButton("GUARDAR");
		btnEditar = new JToggleButton("EDITAR");
		btnBorrar = new JButton("BORRAR");


	}
	private void setPropiedades() {
		
		//PROPIEDADES
		setBounds(100, 100, 587, 521);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTitulo.setBounds(20, 32, 287, 19);
		getContentPane().add(lblTitulo);
		
		
		lblNombre.setBounds(52, 84, 57, 14);
		getContentPane().add(lblNombre);
		
		
		lblApellido.setBounds(52, 110, 57, 14);
		getContentPane().add(lblApellido);
		
		
		textNombre.setBounds(119, 81, 140, 20);
		getContentPane().add(textNombre);
		textNombre.setColumns(10);
		
		
		textApellido.setColumns(10);
		textApellido.setBounds(119, 107, 140, 20);
		getContentPane().add(textApellido);
		
		rdbtnHombre.setBounds(52, 145, 109, 23);
		getContentPane().add(rdbtnHombre);
		
		rdbtnMujer.setBounds(163, 145, 109, 23);
		getContentPane().add(rdbtnMujer);
		
		genero.add(rdbtnHombre);
		genero.add(rdbtnMujer);
		
		lblPuestoEnLa.setBounds(52, 195, 109, 14);
		getContentPane().add(lblPuestoEnLa);
		
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Jefe supremo", "Currante", "Programador", "Becario"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(163, 194, 120, 93);
		getContentPane().add(list);
		
		lblAntiguedad.setBounds(52, 301, 74, 14);
		getContentPane().add(lblAntiguedad);
		
		
		lblDia.setBounds(52, 328, 28, 14);
		getContentPane().add(lblDia);
		
		cbDia.addItem("Dia");
		for(int i=1; i <= 31; i++){
			cbDia.addItem(i);
		}
		cbDia.setBounds(77, 321, 46, 29);
		getContentPane().add(cbDia);
		
		
		lblMes.setBounds(133, 326, 28, 19);
		getContentPane().add(lblMes);
		
		
		cbMes.addItem("Mes");
		for(int i=1; i <= 12; i++){
			cbMes.addItem(i);
		}
		cbMes.setBounds(163, 321, 46, 29);
		getContentPane().add(cbMes);
		
		
		lblAo.setBounds(213, 328, 28, 14);
		getContentPane().add(lblAo);
		
		cbAno.setBounds(241, 321, 66, 29);
		cbAno.addItem("Año");
		for(int i=2017; i >= 1990; i--){
			cbAno.addItem(i);
		}
		getContentPane().add(cbAno);
		
		btnCrear.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCrear.setBounds(59, 377, 200, 50);
		getContentPane().add(btnCrear);
		
		lblSueldo.setBounds(278, 149, 91, 14);
		getContentPane().add(lblSueldo);

		slider.setValue(0);
		slider.setMaximum(10000);
		slider.setBounds(380, 145, 181, 23);
		getContentPane().add(slider);
		
		lblSueldoAlMes.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSueldoAlMes.setBounds(349, 193, 212, 50);
		lblSueldoAlMes.setHorizontalAlignment(SwingConstants.CENTER);
		lblSueldoAlMes.setOpaque(true);
		getContentPane().add(lblSueldoAlMes);
		
		lblComentarios.setBounds(333, 273, 74, 14);
		getContentPane().add(lblComentarios);
		
		txtComentario.setBounds(333, 296, 228, 130);
		getContentPane().add(txtComentario);
		
		btnEstaDeVacaciones.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnEstaDeVacaciones.setBounds(333, 67, 200, 50);
		getContentPane().add(btnEstaDeVacaciones);
		
		menuBar.setBounds(0, 0, 571, 21);
		getContentPane().add(menuBar);
		
		menuBar.add(mnNewMenu);
		
		mnNewMenu.add(mntmNewMenuItem);
		
		mnNewMenu.add(mntmNewMenuItem_1);
		
		menuBar.add(mnAyuda);

		mnAyuda.add(menuItem);
		
		btnNextEmpleado.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNextEmpleado.setBounds(487, 29, 46, 29);
		btnNextEmpleado.setVisible(false);
		getContentPane().add(btnNextEmpleado);
		
		btnLastEmpleado.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnLastEmpleado.setBounds(333, 29, 46, 29);
		btnLastEmpleado.setVisible(false);
		getContentPane().add(btnLastEmpleado);
		
		lblEmpleado.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmpleado.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmpleado.setBounds(386, 32, 91, 23);
		lblEmpleado.setVisible(false);
		getContentPane().add(lblEmpleado);

		btnGuardar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnGuardar.setBounds(59, 377, 200, 50);
		btnGuardar.setVisible(false);
		getContentPane().add(btnGuardar);
		
		
		btnEditar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnEditar.setBounds(429, 434, 132, 37);
		btnEditar.setVisible(false);
		getContentPane().add(btnEditar);
		
		btnBorrar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBorrar.setBounds(278, 434, 129, 37);
		btnBorrar.setVisible(false);
		getContentPane().add(btnBorrar);
		
	}
	
	private void setEventos(){
		//EVENTOS
		slider.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent arg0) {
				lblSueldoAlMes.setText(slider.getValue() + "€ al mes");
				setColorSueldo();
			}
		});
		//VENTANA MODO LEER
		mntmNewMenuItem.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				
				try{
					RellenarFormulario(controlador.ObtenerEmpleado(controlador.indice));
					
					lblTitulo.setText("Gestion de Personal - Modo Leer");
					for(Component i: getContentPane().getComponents()){
						i.setEnabled(false);
					}
					
					btnNextEmpleado.setEnabled(true);
					btnLastEmpleado.setEnabled(true);
					lblEmpleado.setEnabled(true);
					
					btnNextEmpleado.setVisible(true);
					btnLastEmpleado.setVisible(true);
					lblEmpleado.setVisible(true);
					
					btnEditar.setVisible(true);
					btnGuardar.setVisible(true);
					btnCrear.setVisible(false);
					btnEditar.setEnabled(true);
					btnBorrar.setVisible(true);
					btnBorrar.setEnabled(true);
					
					lblEmpleado.setText((controlador.indice+1) + " de " + controlador.ObtenerLista().size());
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, e.getMessage(),"ERROR MODO LEER", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		//VENTANA MODO ESCRITURA
		mntmNewMenuItem_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				
				lblTitulo.setText("Gestion de Personal - Modo Escritura");
				for(Component i: getContentPane().getComponents()){
					i.setEnabled(true);
				}
				
				lblEmpleado.setVisible(false);
				btnLastEmpleado.setVisible(false);
				btnNextEmpleado.setVisible(false);
				btnEditar.setVisible(false);
				btnGuardar.setVisible(false);
				btnCrear.setVisible(true);
				btnBorrar.setVisible(false);
				btnBorrar.setEnabled(true);
				Limpiar();
			}
		});
		
		//CREAR EMPLEADO
		btnCrear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {		
				try{
					controlador.AnadirEmpleado(textNombre.getText(), 
							textApellido.getText(), 
							(rdbtnHombre.isSelected())?'H':(rdbtnMujer.isSelected())?'M':'X', 
							(String)list.getSelectedValue(), 
							cbDia.getSelectedItem() + "/" + cbMes.getSelectedItem() + "/" + cbAno.getSelectedItem(),
							btnEstaDeVacaciones.isSelected(), 
							slider.getValue(), 
							txtComentario.getText());
					JOptionPane.showMessageDialog(null, "Empleado creado y añadido con éxito","CREACION EMPLEADO", JOptionPane.INFORMATION_MESSAGE);
				}catch(RuntimeException e){
					JOptionPane.showMessageDialog(null, e.getMessage(),"FALLO CREACION", JOptionPane.ERROR_MESSAGE);
				}

			}
		});
		//LEER SIGUIENTE EMPLEADO
		btnNextEmpleado.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try{
					RellenarFormulario(controlador.nextEmpleado());
					lblEmpleado.setText((controlador.indice+1) + " de " + controlador.ObtenerLista().size());
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, e.getMessage(),"FUERA DEL INDICE", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		//LEER ANTERIOR EMPLEADO
		btnLastEmpleado.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try{
					RellenarFormulario(controlador.lastEmpleado());
					lblEmpleado.setText((controlador.indice+1) + " de " + controlador.ObtenerLista().size());
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, e.getMessage(),"FUERA DEL INDICE", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		//EDITAR EMPLEADO
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try{
					controlador.EditarEmpleado(textNombre.getText(), 
							textApellido.getText(), 
							(rdbtnHombre.isSelected())?'H':(rdbtnMujer.isSelected())?'M':'X', 
							(String)list.getSelectedValue(), 
							cbDia.getSelectedItem() + "/" + cbMes.getSelectedItem() + "/" + cbAno.getSelectedItem(),
							btnEstaDeVacaciones.isSelected(), 
							slider.getValue(), 
							txtComentario.getText());
					JOptionPane.showMessageDialog(null, "Empleado editado con éxito","CREACION EMPLEADO", JOptionPane.INFORMATION_MESSAGE);
				}catch(RuntimeException e){
					JOptionPane.showMessageDialog(null, e.getMessage(),"FALLO CREACION", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		//MODO EDITAR
		btnEditar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(Component i: getContentPane().getComponents()){
					i.setEnabled(btnEditar.isSelected());
				}
				
				btnEditar.setEnabled(true);
				btnNextEmpleado.setEnabled(true);
				btnLastEmpleado.setEnabled(true);
				lblEmpleado.setEnabled(true);
			}
		});
		
		//BORRAR EMPLEADO
		btnBorrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try{
				controlador.BorrarEmpleado(controlador.ObtenerEmpleado(controlador.indice));
				RellenarFormulario(controlador.ObtenerEmpleado(controlador.indice));
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, e.getMessage(),"ERROR BORRAR USUARIO", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
	}
	
	//FUNCION QUE RELLENA EL FORMULARIO (LECTURA)
	private void RellenarFormulario(Empleado emp){
		try{
			
			String fecha[] = emp.getFecha().split("/");
			
			textNombre.setText(emp.getNombre());
			textApellido.setText(emp.getApellido());
			if(emp.getGenero() == 'M')
				rdbtnMujer.setSelected(true);
			else if(emp.getGenero() == 'H')
				rdbtnHombre.setSelected(true);
	
			list.setSelectedValue(emp.getPuesto(), true);
			cbDia.setSelectedItem(Integer.parseInt(fecha[0]));
			cbMes.setSelectedItem(Integer.parseInt(fecha[1]));
			cbAno.setSelectedItem(Integer.parseInt(fecha[2]));
			
			btnEstaDeVacaciones.setSelected(emp.getVacaciones());
			
			slider.setValue(emp.getSueldo());
			lblSueldoAlMes.setText(emp.getSueldo() + "€ al mes");
			setColorSueldo();
			
			txtComentario.setText(emp.getComentario());
			
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, e.getMessage(),"", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	//FUNCION PARA CAMBIAR EL COLOR DEL LABEL DE SUELDO
	private void setColorSueldo(){
		if(slider.getValue() < 1500){
			lblSueldoAlMes.setBackground(Color.RED);
		}else if(slider.getValue() < 3000){
			lblSueldoAlMes.setBackground(Color.ORANGE);
		}else if(slider.getValue() < 4500){
			lblSueldoAlMes.setBackground(Color.YELLOW);
		}else if(slider.getValue() < 6000){
			lblSueldoAlMes.setBackground(Color.GREEN);
		}else if(slider.getValue() < 7500){
			lblSueldoAlMes.setBackground(Color.BLUE);
		}else{
			lblSueldoAlMes.setBackground(Color.MAGENTA);
		}
	}
	
	private void Limpiar(){
		textNombre.setText("");
		textApellido.setText("");
		cbDia.setSelectedIndex(0);
		cbMes.setSelectedIndex(0);
		cbAno.setSelectedIndex(0);
		btnEstaDeVacaciones.setSelected(false);
		slider.setValue(0);
		lblSueldoAlMes.setText(slider.getValue() + "€ al mes");
		lblSueldoAlMes.setBackground(null);
		txtComentario.setText("");
	}
}
