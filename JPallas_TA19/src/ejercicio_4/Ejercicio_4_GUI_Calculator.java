package ejercicio_4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;

public class Ejercicio_4_GUI_Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField calc_Screen;
	private JButton btn_8;
	private JButton btn_9;
	private JButton btn_4;
	private JButton btn_5;
	private JButton btn_6;
	private JButton btn_1;
	private JButton btn_2;
	private JButton btn_3;
	private JButton btn_0;
	private JButton btn_dot;
	private JButton btn_quit;
	private JButton btn_divide;
	private JButton btn_multiply;
	private JButton btn_subtract;
	private JButton btn_sum;
	private JButton btn_clear;
	private JButton btn_delete;

	/**
	 * Create the frame.
	 */
	public Ejercicio_4_GUI_Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 455, 583);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		calc_Screen = new JTextField();
		calc_Screen.setBounds(10, 11, 419, 58);
		contentPane.add(calc_Screen);
		calc_Screen.setColumns(10);

		JButton btn_7 = new JButton("7");
		btn_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn_7.setBounds(10, 217, 56, 58);
		contentPane.add(btn_7);

		btn_8 = new JButton("8");
		btn_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn_8.setBounds(76, 217, 56, 58);
		contentPane.add(btn_8);

		btn_9 = new JButton("9");
		btn_9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn_9.setBounds(142, 217, 56, 58);
		contentPane.add(btn_9);

		btn_4 = new JButton("4");
		btn_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn_4.setBounds(10, 286, 56, 58);
		contentPane.add(btn_4);

		btn_5 = new JButton("5");
		btn_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn_5.setBounds(76, 286, 56, 58);
		contentPane.add(btn_5);

		btn_6 = new JButton("6");
		btn_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn_6.setBounds(142, 286, 56, 58);
		contentPane.add(btn_6);

		btn_1 = new JButton("1");
		btn_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn_1.setBounds(10, 355, 56, 58);
		contentPane.add(btn_1);

		btn_2 = new JButton("2");
		btn_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn_2.setBounds(76, 355, 56, 58);
		contentPane.add(btn_2);

		btn_3 = new JButton("3");
		btn_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn_3.setBounds(142, 355, 56, 58);
		contentPane.add(btn_3);

		btn_0 = new JButton("0");
		btn_0.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn_0.setBounds(76, 424, 56, 58);
		contentPane.add(btn_0);

		btn_dot = new JButton(".");
		btn_dot.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn_dot.setBounds(142, 424, 56, 58);
		contentPane.add(btn_dot);

		btn_quit = new JButton("Exit");
		btn_quit.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn_quit.setBounds(10, 424, 56, 58);
		contentPane.add(btn_quit);

		btn_divide = new JButton("÷");
		btn_divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_divide.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn_divide.setBounds(218, 148, 56, 58);
		contentPane.add(btn_divide);

		btn_multiply = new JButton("x");
		btn_multiply.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn_multiply.setBounds(218, 217, 56, 58);
		contentPane.add(btn_multiply);

		btn_subtract = new JButton("—");
		btn_subtract.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btn_subtract.setBounds(218, 286, 56, 58);
		contentPane.add(btn_subtract);

		btn_sum = new JButton("+");
		btn_sum.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn_sum.setBounds(218, 355, 56, 58);
		contentPane.add(btn_sum);

		btn_clear = new JButton("C");
		btn_clear.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_clear.setBounds(76, 148, 56, 58);
		contentPane.add(btn_clear);

		btn_delete = new JButton("\u232b");
		btn_delete.setFont(new Font("DejaVu Sans", Font.BOLD, 15));
		btn_delete.setBounds(142, 148, 56, 58);
		contentPane.add(btn_delete);

		JButton btn_result = new JButton("=");
		btn_result.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btn_result.setBackground(new Color(144, 238, 144));
		btn_result.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn_result.setBounds(218, 424, 56, 58);
		contentPane.add(btn_result);

		setVisible(true);
	}
	
	
}
