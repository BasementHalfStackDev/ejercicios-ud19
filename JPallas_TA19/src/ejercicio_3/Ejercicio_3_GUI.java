package ejercicio_3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio_3_GUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Ejercicio_3_GUI() {
		setTitle("Choose your settings");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 298, 335);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Create labels
		JLabel lbl_OS = new JLabel("Choose your OS:");
		lbl_OS.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_OS.setBounds(10, 11, 262, 20);
		contentPane.add(lbl_OS);

		JLabel lbl_Specialty = new JLabel("Choose your specialties:");
		lbl_Specialty.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_Specialty.setBounds(10, 146, 262, 20);
		contentPane.add(lbl_Specialty);

		// Create radio buttons
		JRadioButton rdbtnWindows = new JRadioButton("Windows");
		rdbtnWindows.setSelected(true);
		rdbtnWindows.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnWindows.setBounds(10, 38, 109, 23);
		contentPane.add(rdbtnWindows);

		JRadioButton rdbtnLinux = new JRadioButton("Linux");
		rdbtnLinux.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnLinux.setBounds(10, 64, 109, 23);
		contentPane.add(rdbtnLinux);

		JRadioButton rdbtnMacOS = new JRadioButton("MacOS");
		rdbtnMacOS.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnMacOS.setBounds(10, 90, 109, 23);
		contentPane.add(rdbtnMacOS);

		JRadioButton rdbtnTempleOS = new JRadioButton("TempleOS?");
		rdbtnTempleOS.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnTempleOS.setBounds(10, 116, 109, 23);
		contentPane.add(rdbtnTempleOS);

		// Group radio buttons
		ButtonGroup choose_OS = new ButtonGroup();
		choose_OS.add(rdbtnWindows);
		choose_OS.add(rdbtnLinux);
		choose_OS.add(rdbtnMacOS);
		choose_OS.add(rdbtnTempleOS);

		// Create checkboxes
		JCheckBox chckbxProgramming = new JCheckBox("Programming");
		chckbxProgramming.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxProgramming.setBounds(10, 173, 129, 23);
		contentPane.add(chckbxProgramming);

		JCheckBox chckbxGraphicdesign = new JCheckBox("Graphic Design");
		chckbxGraphicdesign.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxGraphicdesign.setBounds(10, 199, 129, 23);
		contentPane.add(chckbxGraphicdesign);

		JCheckBox chckbxAdministration = new JCheckBox("Administration");
		chckbxAdministration.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxAdministration.setBounds(10, 225, 129, 23);
		contentPane.add(chckbxAdministration);
		
		JButton btnSendButton = new JButton("Send!");
		btnSendButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button is pressed.");
			}
		});
		btnSendButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSendButton.setBounds(93, 262, 89, 23);
		contentPane.add(btnSendButton);
	}
}
