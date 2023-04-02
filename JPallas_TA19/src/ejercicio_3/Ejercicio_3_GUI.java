package ejercicio_3;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Enumeration;
import java.awt.event.ActionEvent;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import java.awt.SystemColor;

public class Ejercicio_3_GUI extends JFrame {

	private JPanel contentPane;
	private JCheckBox chckbxProgramming;
	private JCheckBox chckbxGraphicdesign;
	private JCheckBox chckbxAdministration;
	private JRadioButton rdbtnWindows;
	private JRadioButton rdbtnLinux;
	private JRadioButton rdbtnMacOS;
	private JRadioButton rdbtnTempleOS;
	private ButtonGroup choose_OS;
	private JSlider hourSlider;
	private JLabel lbl_Hours;

	public Ejercicio_3_GUI() {
		setTitle("Choose your settings");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 298, 401);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.menu);
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
		rdbtnWindows = new JRadioButton("Windows");
		rdbtnWindows.setSelected(true);
		rdbtnWindows.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnWindows.setBounds(10, 38, 109, 23);
		contentPane.add(rdbtnWindows);

		rdbtnLinux = new JRadioButton("Linux");
		rdbtnLinux.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnLinux.setBounds(10, 64, 109, 23);
		contentPane.add(rdbtnLinux);

		rdbtnMacOS = new JRadioButton("MacOS");
		rdbtnMacOS.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnMacOS.setBounds(10, 90, 109, 23);
		contentPane.add(rdbtnMacOS);

		rdbtnTempleOS = new JRadioButton("TempleOS?");
		rdbtnTempleOS.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnTempleOS.setBounds(10, 116, 109, 23);
		contentPane.add(rdbtnTempleOS);

		// Group radio buttons
		choose_OS = new ButtonGroup();
		choose_OS.add(rdbtnWindows);
		choose_OS.add(rdbtnLinux);
		choose_OS.add(rdbtnMacOS);
		choose_OS.add(rdbtnTempleOS);

		// Create checkboxes
		chckbxProgramming = new JCheckBox("Programming");
		chckbxProgramming.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxProgramming.setBounds(10, 173, 129, 23);
		contentPane.add(chckbxProgramming);

		chckbxGraphicdesign = new JCheckBox("Graphic Design");
		chckbxGraphicdesign.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxGraphicdesign.setBounds(10, 199, 129, 23);
		contentPane.add(chckbxGraphicdesign);

		chckbxAdministration = new JCheckBox("Administration");
		chckbxAdministration.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxAdministration.setBounds(10, 225, 129, 23);
		contentPane.add(chckbxAdministration);

		hourSlider = new JSlider();
		hourSlider.setBounds(10, 291, 262, 26);
		hourSlider.setMinimum(0);
		hourSlider.setMaximum(10);
		hourSlider.setValue(5);
		hourSlider.addChangeListener(sliderChange);
		contentPane.add(hourSlider);

		lbl_Hours = new JLabel("Hours spent using a computer: " + hourSlider.getValue());
		lbl_Hours.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Hours.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_Hours.setBounds(10, 260, 262, 20);
		contentPane.add(lbl_Hours);

		JButton btnSendButton = new JButton("Send!");
		btnSendButton.addActionListener(send);
		btnSendButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSendButton.setBounds(98, 328, 89, 23);
		contentPane.add(btnSendButton);

		setVisible(true);
	}

	ActionListener send = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			ArrayList<String> selectedBoxes = new ArrayList<String>();
			String selectedBtn = "";
			int hours = hourSlider.getValue();

			if (chckbxProgramming.isSelected()) {
				selectedBoxes.add(chckbxProgramming.getText());
			}

			if (chckbxGraphicdesign.isSelected()) {
				selectedBoxes.add(chckbxGraphicdesign.getText());
			}

			if (chckbxAdministration.isSelected()) {
				selectedBoxes.add(chckbxAdministration.getText());
			}

			for (Enumeration<AbstractButton> OSbuttons = choose_OS.getElements(); OSbuttons.hasMoreElements();) {
				AbstractButton tempbutton = OSbuttons.nextElement();
				if (tempbutton.isSelected()) {
					selectedBtn = tempbutton.getText();
				}
			}

			setVisible(false);
			Ejercicio_3_DisplayChoices_GUI frame = new Ejercicio_3_DisplayChoices_GUI(selectedBtn, selectedBoxes,
					hours);
		}
	};

	ChangeListener sliderChange = new ChangeListener() {
		public void stateChanged(ChangeEvent e) {
			lbl_Hours.setText("Hours spent using a computer: " + hourSlider.getValue());
		}
	};

}
