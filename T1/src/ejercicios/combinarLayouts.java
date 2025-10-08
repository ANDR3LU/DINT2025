package ejercicios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class combinarLayouts extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldDocumento;
	private JTextField textFieldContraseña;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					combinarLayouts frame = new combinarLayouts();
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
	public combinarLayouts() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1019, 574);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblPiePagina = new JLabel("Desarrollado por: André Pazo - DAM2 Curso2025/2026");
		lblPiePagina.setBackground(new Color(128, 255, 0));
		lblPiePagina.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblPiePagina, BorderLayout.SOUTH);
		
		JPanel cabecera = new JPanel();
		contentPane.add(cabecera, BorderLayout.NORTH);
		cabecera.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));
		
		JPanel cabecera_derecha = new JPanel();
		cabecera.add(cabecera_derecha);
		cabecera_derecha.setLayout(new GridLayout(2, 3, 10, 5));
		
		JLabel lblDocumento = new JLabel("Documento");
		cabecera_derecha.add(lblDocumento);
		
		JLabel lblConstraseña = new JLabel("Contraseña");
		cabecera_derecha.add(lblConstraseña);
		
		JButton btnNewButton = new JButton("New button");
		cabecera_derecha.add(btnNewButton);
		
		textFieldDocumento = new JTextField();
		cabecera_derecha.add(textFieldDocumento);
		textFieldDocumento.setColumns(10);
		
		textFieldContraseña = new JTextField();
		cabecera_derecha.add(textFieldContraseña);
		textFieldContraseña.setColumns(10);
		
		JPanel centro = new JPanel();
		contentPane.add(centro, BorderLayout.EAST);
		centro.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("REGISTRO");
		centro.add(lblNewLabel, BorderLayout.NORTH);
		
		JButton btnNewButton_1 = new JButton("Registrar");
		centro.add(btnNewButton_1, BorderLayout.SOUTH);
		
		JPanel Registro = new JPanel();
		Registro.setBackground(new Color(128, 0, 64));
		centro.add(Registro, BorderLayout.CENTER);
		GridBagLayout gbl_Registro = new GridBagLayout();
		gbl_Registro.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_Registro.rowHeights = new int[]{0, 0};
		gbl_Registro.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_Registro.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		Registro.setLayout(gbl_Registro);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 0;
		Registro.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 0, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 0;
		Registro.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 0;
		Registro.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 0;
		Registro.add(textField, gbc_textField);
		textField.setColumns(10);

	}

}
