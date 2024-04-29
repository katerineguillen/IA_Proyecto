package gui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class IF_Config_cuotaDiaria extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IF_Config_cuotaDiaria frame = new IF_Config_cuotaDiaria();
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
	public IF_Config_cuotaDiaria() {
		setBounds(100, 100, 450, 300);

	}

}
