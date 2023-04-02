package ejercicio_4;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio_4_About extends JFrame {

	private JButton btnNewButton;
	private JPanel contentPane;

	// About section with info about the program
	public Ejercicio_4_About() {
		setType(Type.POPUP);
		setTitle("About");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 468, 270);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lbl_Title = new JLabel("Simple Calculator");
		lbl_Title.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Title.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_Title.setBounds(10, 11, 432, 25);
		contentPane.add(lbl_Title);

		JLabel lbl_Version = new JLabel("Version 1.2");
		lbl_Version.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Version.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_Version.setBounds(10, 47, 432, 25);
		contentPane.add(lbl_Version);

		JLabel lbl_Author = new JLabel("Created by Josep Maria Pallàs Batalla ©");
		lbl_Author.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Author.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_Author.setBounds(10, 83, 432, 25);
		contentPane.add(lbl_Author);

		JLabel lbl_License = new JLabel("MIT License");
		lbl_License.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_License.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_License.setBounds(10, 119, 432, 25);
		contentPane.add(lbl_License);

		JLabel lbl_LastUpdate = new JLabel("Last updated: 2023/04/02");
		lbl_LastUpdate.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_LastUpdate.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_LastUpdate.setBounds(10, 155, 432, 25);
		contentPane.add(lbl_LastUpdate);

		btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(134, 191, 191, 29);
		contentPane.add(btnNewButton);
		setVisible(true);
	}

}
