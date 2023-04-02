package ejercicio_4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class Ejercicio_4_GUI_Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JButton btnNewButton_9;
	private JButton btnNewButton_10;
	private JButton btnNewButton_11;
	private JButton btnNewButton_12;
	private JButton btnNewButton_13;
	private JButton btnNewButton_14;
	private JButton btnNewButton_15;
	private JButton btnNewButton_16;
	private JButton btnNewButton_17;

	/**
	 * Create the frame.
	 */
	public Ejercicio_4_GUI_Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 455, 583);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 419, 58);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 80, 419, 58);
		contentPane.add(textField_1);
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(10, 217, 56, 58);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("8");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1.setBounds(76, 217, 56, 58);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("9");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_2.setBounds(142, 217, 56, 58);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("4");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_3.setBounds(10, 286, 56, 58);
		contentPane.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("5");
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_4.setBounds(76, 286, 56, 58);
		contentPane.add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("6");
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_5.setBounds(142, 286, 56, 58);
		contentPane.add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("1");
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_6.setBounds(10, 355, 56, 58);
		contentPane.add(btnNewButton_6);
		
		btnNewButton_7 = new JButton("2");
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_7.setBounds(76, 355, 56, 58);
		contentPane.add(btnNewButton_7);
		
		btnNewButton_8 = new JButton("3");
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_8.setBounds(142, 355, 56, 58);
		contentPane.add(btnNewButton_8);
		
		btnNewButton_9 = new JButton("0");
		btnNewButton_9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_9.setBounds(76, 424, 56, 58);
		contentPane.add(btnNewButton_9);
		
		btnNewButton_10 = new JButton(".");
		btnNewButton_10.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_10.setBounds(142, 424, 56, 58);
		contentPane.add(btnNewButton_10);
		
		btnNewButton_11 = new JButton("Exit");
		btnNewButton_11.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_11.setBounds(10, 424, 56, 58);
		contentPane.add(btnNewButton_11);
		
		btnNewButton_12 = new JButton("÷");
		btnNewButton_12.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_12.setBounds(223, 217, 56, 58);
		contentPane.add(btnNewButton_12);
		
		btnNewButton_13 = new JButton("x");
		btnNewButton_13.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_13.setBounds(223, 286, 56, 58);
		contentPane.add(btnNewButton_13);
		
		btnNewButton_14 = new JButton("—");
		btnNewButton_14.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton_14.setBounds(223, 355, 56, 58);
		contentPane.add(btnNewButton_14);
		
		btnNewButton_15 = new JButton("+");
		btnNewButton_15.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_15.setBounds(223, 424, 56, 58);
		contentPane.add(btnNewButton_15);
		
		btnNewButton_16 = new JButton("C");
		btnNewButton_16.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_16.setBounds(142, 149, 56, 58);
		contentPane.add(btnNewButton_16);
		
		btnNewButton_17 = new JButton("\u232b");
		btnNewButton_17.setFont(new Font("DejaVu Sans", Font.BOLD, 15));
		btnNewButton_17.setBounds(223, 149, 56, 58);
		contentPane.add(btnNewButton_17);

		setVisible(true);
	}
}
