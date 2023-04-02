package ejercicio_3;

import java.awt.EventQueue;

public class Ejercicio_3_App {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio_3_GUI frame = new Ejercicio_3_GUI();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
