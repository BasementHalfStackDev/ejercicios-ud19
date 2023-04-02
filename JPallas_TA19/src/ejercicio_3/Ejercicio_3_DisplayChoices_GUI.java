package ejercicio_3;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.SystemColor;

public class Ejercicio_3_DisplayChoices_GUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Ejercicio_3_DisplayChoices_GUI(String OS, ArrayList<String> specialties, int hours) {
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(Ejercicio_3_DisplayChoices_GUI.class.getResource("/ejercicio_3/icons/icon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 157);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.menu);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblOS = new JLabel("Your slected OS is: " + OS + ".");
		lblOS.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblOS.setBounds(10, 36, 414, 14);
		contentPane.add(lblOS);

		JLabel lblSpecialties = new JLabel(toString(specialties));
		lblSpecialties.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSpecialties.setBounds(10, 61, 414, 14);
		contentPane.add(lblSpecialties);

		JLabel lblHours = new JLabel("You usually spend " + hours + " hours on your PC.");
		lblHours.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblHours.setBounds(10, 86, 337, 14);
		contentPane.add(lblHours);
		
		JLabel lbl_selectedChoices = new JLabel("Your choices");
		lbl_selectedChoices.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_selectedChoices.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_selectedChoices.setBounds(10, 11, 414, 14);
		contentPane.add(lbl_selectedChoices);

		setVisible(true);
	}

	private String toString(ArrayList<String> specialties) {
		String toreturn = "Your specialities are : ";

		if (specialties.size() == 0) {
			return "You have no specialities";
		}

		for (int i = 0; i < specialties.size(); i++) {

			if (specialties.size() == 1) {
				return "Your speciality is: " + specialties.get(i) + ".";
			}

			if (i + 1 == specialties.size()) {
				toreturn = toreturn + "and " + specialties.get(i) + ".";
			} else if (i + 2 < specialties.size()) {
				toreturn = toreturn + specialties.get(i) + ", ";
			} else {
				toreturn = toreturn + specialties.get(i) + " ";
			}

		}
		return toreturn;
	}

}
