package views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Panel;

public class Application extends JFrame {

	private JPanel contentPane;
	private JTextField txtnombres;
	private JTextField txtapellidos;
	private JTextField txtidentificacion;
	private JTextField textField;
	private JTextField txtfechanacimiento;
	private JLabel lblDepartamento;
	private JTextField txtdepartamento;
	private JLabel lblCausaDeIngreso;
	private JTextField textField_1;
	private JLabel lblhogar;
	private JTextField textField_2;
	private JLabel lblDormitorioAsignado;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application frame = new Application();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Application() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 493, 497);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblnombres = new JLabel("Nombres:");
		lblnombres.setHorizontalAlignment(SwingConstants.CENTER);
		lblnombres.setBounds(10, 33, 80, 14);
		contentPane.add(lblnombres);
		
		txtnombres = new JTextField();
		txtnombres.setToolTipText("Ingrese El Nombre del Residente");
		txtnombres.setBounds(138, 30, 127, 20);
		contentPane.add(txtnombres);
		txtnombres.setColumns(10);
		
		JLabel lab = new JLabel("Apellidos:");
		lab.setHorizontalAlignment(SwingConstants.CENTER);
		lab.setBounds(10, 64, 80, 14);
		contentPane.add(lab);
		
		txtapellidos = new JTextField();
		txtapellidos.setBounds(138, 61, 127, 20);
		contentPane.add(txtapellidos);
		txtapellidos.setColumns(10);
		
		JLabel lblidentificacion = new JLabel("Identificacion:");
		lblidentificacion.setHorizontalAlignment(SwingConstants.CENTER);
		lblidentificacion.setBounds(10, 106, 80, 14);
		contentPane.add(lblidentificacion);
		
		JLabel lbledad = new JLabel("Edad:");
		lbledad.setHorizontalAlignment(SwingConstants.CENTER);
		lbledad.setBounds(10, 153, 80, 14);
		contentPane.add(lbledad);
		
		JLabel lblNewLabel_2 = new JLabel("Fecha De Nacimiento:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(10, 198, 108, 20);
		contentPane.add(lblNewLabel_2);
		
		txtidentificacion = new JTextField();
		txtidentificacion.setBounds(138, 103, 127, 20);
		contentPane.add(txtidentificacion);
		txtidentificacion.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(138, 150, 127, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		txtfechanacimiento = new JTextField();
		txtfechanacimiento.setBounds(138, 198, 127, 20);
		contentPane.add(txtfechanacimiento);
		txtfechanacimiento.setColumns(10);
		
		lblDepartamento = new JLabel("Departamento:");
		lblDepartamento.setHorizontalAlignment(SwingConstants.CENTER);
		lblDepartamento.setBounds(10, 246, 108, 14);
		contentPane.add(lblDepartamento);
		
		txtdepartamento = new JTextField();
		txtdepartamento.setBounds(138, 243, 127, 20);
		contentPane.add(txtdepartamento);
		txtdepartamento.setColumns(10);
		
		lblCausaDeIngreso = new JLabel("Causa De Ingreso:");
		lblCausaDeIngreso.setHorizontalAlignment(SwingConstants.CENTER);
		lblCausaDeIngreso.setBounds(10, 294, 108, 14);
		contentPane.add(lblCausaDeIngreso);
		
		textField_1 = new JTextField();
		textField_1.setBounds(138, 291, 127, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		lblhogar = new JLabel("Hogar Asgnado:");
		lblhogar.setHorizontalAlignment(SwingConstants.CENTER);
		lblhogar.setBounds(10, 338, 108, 14);
		contentPane.add(lblhogar);
		
		textField_2 = new JTextField();
		textField_2.setBounds(138, 335, 127, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		lblDormitorioAsignado = new JLabel("Dormitorio Asignado");
		lblDormitorioAsignado.setBounds(20, 370, 98, 14);
		contentPane.add(lblDormitorioAsignado);
		
		textField_3 = new JTextField();
		textField_3.setBounds(138, 366, 127, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(29, 409, 89, 23);
		contentPane.add(btnGuardar);
		
		JButton btncancelar = new JButton("Cancelar");
		btncancelar.setBounds(138, 409, 89, 23);
		contentPane.add(btncancelar);
	}
}
