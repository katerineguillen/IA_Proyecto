package gui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class IF_Config_cantidadOptima extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IF_Config_cantidadOptima frame = new IF_Config_cantidadOptima();
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
	public IF_Config_cantidadOptima() {
		setBounds(100, 100, 450, 300);

	}

}
