package gui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class IF_Ventas_generarReportes extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IF_Ventas_generarReportes frame = new IF_Ventas_generarReportes();
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
	public IF_Ventas_generarReportes() {
		setBounds(100, 100, 450, 300);

	}

}
