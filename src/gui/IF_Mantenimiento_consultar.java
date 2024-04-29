package gui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class IF_Mantenimiento_consultar extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IF_Mantenimiento_consultar frame = new IF_Mantenimiento_consultar();
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
	public IF_Mantenimiento_consultar() {
		setBounds(100, 100, 450, 300);

	}

}
