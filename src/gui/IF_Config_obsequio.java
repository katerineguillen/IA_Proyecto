package gui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class IF_Config_obsequio extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IF_Config_obsequio frame = new IF_Config_obsequio();
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
	public IF_Config_obsequio() {
		setBounds(100, 100, 450, 300);

	}

}
