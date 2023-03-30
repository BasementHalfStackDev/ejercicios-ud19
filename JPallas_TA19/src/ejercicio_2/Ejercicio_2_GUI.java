package ejercicio_2;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

public class Ejercicio_2_GUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField addMovie;
	public JComboBox<String> comboBox = new JComboBox<String>();

	/**
	 * Create the frame.
	 */
	public Ejercicio_2_GUI() {
		setTitle("Movie adding program");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 487, 312);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(175, 238, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Movie title");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(31, 25, 86, 20);
		contentPane.add(lblNewLabel);

		// Movie adding textfield
		addMovie = new JTextField();
		addMovie.setToolTipText("Type the name of the movie");
		addMovie.setBounds(127, 27, 334, 20);
		addMovie.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(addMovie);
		addMovie.setColumns(10);

		// Movie adding button
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(388, 57, 73, 29);

		// Function to add textfield content to comboBox movie list on button click
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String value = addMovie.getText();
				comboBox.addItem(value);
				addMovie.setText(""); // Empties textbox once added
			}
		});

		JLabel lblNewLabel_1 = new JLabel("Added movies");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(31, 146, 112, 20);
		contentPane.add(lblNewLabel_1);
		contentPane.add(btnNewButton);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBox.setBounds(153, 144, 308, 22);

		// Adds 2 example movies
		comboBox.addItem("Shrek");
		comboBox.addItem("Avatar");
		contentPane.add(comboBox);
	}

}
