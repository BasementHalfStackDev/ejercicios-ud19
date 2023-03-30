package ejercicio_1;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Ejercicio_1_GUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtAsd;
	private final Action action = new SwingAction();


	/**
	 * Create the frame.
	 */
	public Ejercicio_1_GUI() {
		setTitle("Hello! Whats your name?");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 290, 242);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Write a name to greet");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 38, 254, 17);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNewLabel);

		txtAsd = new JTextField();
		txtAsd.setBounds(10, 97, 254, 20);
		txtAsd.setToolTipText("Your name goes here");
		contentPane.add(txtAsd);
		txtAsd.setColumns(10);

		JButton btnNewButton = new JButton("Greet me!");
		btnNewButton.setBackground(new Color(255, 255, 153));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setAction(action);
		btnNewButton.setBounds(78, 157, 121, 35);
		contentPane.add(btnNewButton);
	}

	private class SwingAction extends AbstractAction {

		private static final long serialVersionUID = 1L;

		public SwingAction() {
			putValue(NAME, "Greet me!");
			putValue(SHORT_DESCRIPTION, "Greets the user on click");
		}

		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Greetings " + txtAsd.getText() + "!");
		}
	}
}
