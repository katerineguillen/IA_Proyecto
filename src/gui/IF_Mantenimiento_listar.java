package gui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class IF_Mantenimiento_listar extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IF_Mantenimiento_listar frame = new IF_Mantenimiento_listar();
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
	public IF_Mantenimiento_listar() {
		setBounds(100, 100, 450, 300);

	}

}
