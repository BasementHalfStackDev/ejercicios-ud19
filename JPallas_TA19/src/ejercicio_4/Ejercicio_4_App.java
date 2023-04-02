package ejercicio_4;

import java.awt.EventQueue;

public class Ejercicio_4_App {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio_4_GUI_Calculator frame = new Ejercicio_4_GUI_Calculator();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
