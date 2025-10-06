package pruebasLayouts;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;

public class flowLayout extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private FlowLayout flow;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					flowLayout frame = new flowLayout();
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
	public flowLayout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 313, 449);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		flow = new FlowLayout(FlowLayout.LEFT, 15, 15);  
		contentPane.setLayout(flow);                     
		
		JButton Boton1 = new JButton("Boton1");
		Boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(Boton1);
		
		JButton Boton2 = new JButton("Boton2");
		contentPane.add(Boton2);
		
		JButton Boton3 = new JButton("Boton3");
		contentPane.add(Boton3);
		
		JButton btnNewButton = new JButton("Long-Named Boton 4");
		contentPane.add(btnNewButton);
		
		JButton Boton5 = new JButton("Boton 5");
		Boton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(Boton5);
		
		JRadioButton AlinearIzquierda = new JRadioButton("Alinear izquierda");
		buttonGroup.add(AlinearIzquierda);
		contentPane.add(AlinearIzquierda);
		
		JRadioButton AlinearDerecha = new JRadioButton("Alinear derecha");
		buttonGroup.add(AlinearDerecha);
		contentPane.add(AlinearDerecha);
		
		AlinearIzquierda.setSelected(true); 

		
		JButton BotonAplicar = new JButton("Aplicar");
		contentPane.add(BotonAplicar);

		BotonAplicar.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        if (AlinearIzquierda.isSelected()) {
		            flow.setAlignment(FlowLayout.LEFT);
		        } else if (AlinearDerecha.isSelected()) {
		            flow.setAlignment(FlowLayout.RIGHT);
		        }
		        contentPane.revalidate();
		        contentPane.repaint();
		    }
		});

	}

}
