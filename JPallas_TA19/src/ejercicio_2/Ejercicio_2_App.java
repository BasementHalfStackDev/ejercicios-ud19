package ejercicio_2;

import java.awt.EventQueue;

public class Ejercicio_2_App {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio_2_GUI frame = new Ejercicio_2_GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
