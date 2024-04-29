package gui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class IF_Ventas_vender extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IF_Ventas_vender frame = new IF_Ventas_vender();
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
	public IF_Ventas_vender() {
		setBounds(100, 100, 450, 300);

	}

}
