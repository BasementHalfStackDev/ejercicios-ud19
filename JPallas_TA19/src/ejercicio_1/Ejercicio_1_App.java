package ejercicio_1;

import java.awt.EventQueue;

public class Ejercicio_1_App {

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio_1_GUI frame = new Ejercicio_1_GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
