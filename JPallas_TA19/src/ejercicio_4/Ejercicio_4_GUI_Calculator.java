package ejercicio_4;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.SystemColor;

public class Ejercicio_4_GUI_Calculator extends JFrame {

	// Buttons and text fields to modify
	private JPanel contentPane;
	private JTextField textField_value_1;
	private JTextField textField_value_2;
	private JTextField textField_result;
	private JButton btn_quit;
	private JButton btn_divide;
	private JButton btn_multiply;
	private JButton btn_subtract;
	private JButton btn_sum;
	private JButton btn_about;
	private JLabel lbl_operator;

	// Calculator with GUI
	public Ejercicio_4_GUI_Calculator() {
		setTitle("Simple Calculator");
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(Ejercicio_4_GUI_Calculator.class.getResource("/ejercicio_3/icons/icon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 455, 369);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Operator label
		lbl_operator = new JLabel("?");
		lbl_operator.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl_operator.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_operator.setBounds(196, 27, 46, 25);
		contentPane.add(lbl_operator);

		// Result label
		JLabel lbl_result = new JLabel("Result");
		lbl_result.setBackground(SystemColor.menu);
		lbl_result.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lbl_result.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_result.setBounds(10, 77, 419, 25);
		contentPane.add(lbl_result);

		// Text field with first value
		textField_value_1 = new JTextField();
		textField_value_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_value_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_value_1.setColumns(10);
		textField_value_1.setBounds(10, 11, 187, 58);
		AbstractDocument doc1 = (AbstractDocument) textField_value_1.getDocument();
		doc1.setDocumentFilter(numfilter); // Filter non numeric values from being entered
		textField_value_1.getDocument().addDocumentListener(calc);
		contentPane.add(textField_value_1);

		// Text field with second value
		textField_value_2 = new JTextField();
		textField_value_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_value_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_value_2.setColumns(10);
		textField_value_2.setBounds(242, 11, 187, 58);
		AbstractDocument doc2 = (AbstractDocument) textField_value_2.getDocument();
		doc2.setDocumentFilter(numfilter); // Filter non numeric values from being entered
		textField_value_2.getDocument().addDocumentListener(calc);
		contentPane.add(textField_value_2);

		// Read only text field with result
		textField_result = new JTextField();
		textField_result.setEditable(false);
		textField_result.setHorizontalAlignment(SwingConstants.CENTER);
		textField_result.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_result.setColumns(10);
		textField_result.setBounds(10, 113, 419, 58);
		contentPane.add(textField_result);

		// Buttons
		// Button to quit
		btn_quit = new JButton("Exit");
		btn_quit.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn_quit.setBounds(75, 251, 122, 58);
		btn_quit.addActionListener(calc_Buttons);
		contentPane.add(btn_quit);

		// Button for operators sum, substract, multiply and divide
		btn_divide = new JButton("÷");
		btn_divide.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn_divide.setBounds(10, 182, 101, 58);
		btn_divide.addActionListener(calc_Buttons);
		contentPane.add(btn_divide);

		btn_multiply = new JButton("x");
		btn_multiply.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn_multiply.setBounds(121, 182, 96, 58);
		btn_multiply.addActionListener(calc_Buttons);
		contentPane.add(btn_multiply);

		btn_subtract = new JButton("—");
		btn_subtract.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btn_subtract.setBounds(232, 182, 96, 58);
		btn_subtract.addActionListener(calc_Buttons);
		contentPane.add(btn_subtract);

		btn_sum = new JButton("+");
		btn_sum.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn_sum.setBounds(338, 182, 91, 58);
		btn_sum.addActionListener(calc_Buttons);
		contentPane.add(btn_sum);

		// About the program button
		btn_about = new JButton("About");
		btn_about.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn_about.setBounds(244, 251, 122, 58);
		btn_about.addActionListener(calc_Buttons);
		contentPane.add(btn_about);

		setVisible(true);
	}

	// Action Listener for all the buttons, executing a different action
	// depending on the button pressed
	ActionListener calc_Buttons = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btn_sum) {
				lbl_operator.setText("+");
				calcResult();
			} else if (e.getSource() == btn_subtract) {
				lbl_operator.setText("-");
				calcResult();
			} else if (e.getSource() == btn_multiply) {
				lbl_operator.setText("*");
				calcResult();
			} else if (e.getSource() == btn_divide) {
				lbl_operator.setText("/");
				calcResult();
			} else if (e.getSource() == btn_about) {
				Ejercicio_4_About frame = new Ejercicio_4_About();
			} else if (e.getSource() == btn_quit) {
				System.exit(0);
			}

		}
	};

	// Document listener to update the result display
	DocumentListener calc = new DocumentListener() {

		public void insertUpdate(DocumentEvent e) {
			calcResult();
		}

		public void removeUpdate(DocumentEvent e) {
			calcResult();
		}

		public void changedUpdate(DocumentEvent e) {
			calcResult();
		}

	};

	// Filter that allows digits and dots to separate decimals
	DocumentFilter numfilter = new DocumentFilter() {
		public void replace(FilterBypass fb, int offset, int length, String string, AttributeSet attrs)
				throws BadLocationException {
			StringBuilder builder = new StringBuilder();
			for (int i = 0; i < string.length(); i++) {
				char ch = string.charAt(i);
				if (Character.isDigit(ch) || ch == '.') {
					builder.append(ch);
				}
			}
			super.replace(fb, offset, length, builder.toString(), attrs);
		}
	};

	// Function to calculate result depending on the chosen operator
	private void calcResult() {
		String s1 = textField_value_1.getText();
		String s2 = textField_value_2.getText();
		String operator = lbl_operator.getText();

		double v1 = s1.isEmpty() ? 0 : Double.parseDouble(s1);
		double v2 = s2.isEmpty() ? 0 : Double.parseDouble(s2);

		if (operator.equals("+")) {
			double result = v1 + v2;
			String sresult = String.valueOf(result);
			textField_result.setText(sresult);
		} else if (operator.equals("-")) {
			double result = v1 - v2;
			String sresult = String.valueOf(result);
			textField_result.setText(sresult);
		} else if (operator.equals("*")) {
			double result = v1 * v2;
			String sresult = String.valueOf(result);
			textField_result.setText(sresult);
		} else if (operator.equals("/")) {
			double result = v1 / v2;
			String sresult = String.valueOf(result);
			textField_result.setText(sresult);
		} else {
			textField_result.setText(s1 + " " + operator + " " + s2);
		}

	}

}
