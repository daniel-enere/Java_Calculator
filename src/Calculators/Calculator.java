package Calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	
	double results;
	double firstNum;
	double secondNum;
	String operations;
	String answer;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 264, 389);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.TRAILING);
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setBounds(10, 11, 227, 37);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnClearEntry = new JButton("CE");
		btnClearEntry.setBackground(new Color(51, 204, 204));
		btnClearEntry.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnClearEntry.setBounds(10, 54, 55, 45);
		frame.getContentPane().add(btnClearEntry);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textField.setText(null);
			}
		});
		btnClear.setBackground(new Color(51, 204, 204));
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnClear.setBounds(70, 54, 55, 45);
		frame.getContentPane().add(btnClear);
		
		JButton btnBackspace = new JButton("<<");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String backspace = null;
				
				if(textField.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length()-1);
					backspace = strB.toString();
					textField.setText(backspace);
				}
			}
		});
		btnBackspace.setBackground(new Color(51, 204, 204));
		btnBackspace.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBackspace.setBounds(130, 54, 55, 45);
		frame.getContentPane().add(btnBackspace);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "/";
			}
		});
		btnDivide.setBackground(new Color(255, 102, 0));
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDivide.setBounds(190, 53, 47, 50);
		frame.getContentPane().add(btnDivide);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber = textField.getText() + btn7.getText();
				textField.setText(EnterNumber);
			}
		});
		btn7.setBackground(new Color(51, 204, 204));
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(10, 108, 55, 50);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btn8.getText();
				textField.setText(EnterNumber);
			}
		});
		btn8.setBackground(new Color(51, 204, 204));
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(70, 108, 55, 50);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btn9.getText();
				textField.setText(EnterNumber);
			}
		});
		btn9.setBackground(new Color(51, 204, 204));
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(130, 108, 55, 50);
		frame.getContentPane().add(btn9);
		
		JButton btnMultiply = new JButton("x");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "*";
			}
		});
		btnMultiply.setBackground(new Color(255, 102, 0));
		btnMultiply.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnMultiply.setBounds(190, 108, 47, 50);
		frame.getContentPane().add(btnMultiply);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btn4.getText();
				textField.setText(EnterNumber);
			}
		});
		btn4.setBackground(new Color(51, 204, 204));
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(10, 163, 55, 50);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btn5.getText();
				textField.setText(EnterNumber);
			}
		});
		btn5.setBackground(new Color(51, 204, 204));
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(70, 163, 55, 50);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btn6.getText();
				textField.setText(EnterNumber);
			}
		});
		btn6.setBackground(new Color(51, 204, 204));
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(130, 163, 55, 50);
		frame.getContentPane().add(btn6);
		
		JButton btnSubtract = new JButton("-");
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "-";
			}
		});
		btnSubtract.setBackground(new Color(255, 102, 0));
		btnSubtract.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSubtract.setBounds(190, 163, 47, 50);
		frame.getContentPane().add(btnSubtract);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btn1.getText();
				textField.setText(EnterNumber);
			}
		});
		btn1.setBackground(new Color(51, 204, 204));
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(10, 218, 55, 50);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btn2.getText();
				textField.setText(EnterNumber);
			}
		});
		btn2.setBackground(new Color(51, 204, 204));
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(70, 218, 55, 50);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btn3.getText();
				textField.setText(EnterNumber);
			}
		});
		btn3.setBackground(new Color(51, 204, 204));
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(130, 218, 55, 50);
		frame.getContentPane().add(btn3);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "+";
			}
		});
		btnPlus.setBackground(new Color(255, 102, 0));
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnPlus.setBounds(190, 218, 47, 50);
		frame.getContentPane().add(btnPlus);
		
		JButton btnDelta = new JButton("+/-");
		btnDelta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = ops * (-1);
				textField.setText(String.valueOf(ops));
			}
		});
		btnDelta.setBackground(new Color(51, 204, 204));
		btnDelta.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnDelta.setBounds(10, 273, 55, 50);
		frame.getContentPane().add(btnDelta);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btn0.getText();
				textField.setText(EnterNumber);
			}
		});
		btn0.setBackground(new Color(51, 204, 204));
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(70, 273, 55, 50);
		frame.getContentPane().add(btn0);
		
		JButton btnDecimal = new JButton(".");
		btnDecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btnDecimal.getText();
				textField.setText(EnterNumber);
			}
		});
		btnDecimal.setBackground(new Color(51, 204, 204));
		btnDecimal.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDecimal.setBounds(130, 273, 55, 50);
		frame.getContentPane().add(btnDecimal);
		
		JButton btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String answer;
				secondNum = Double.parseDouble(textField.getText());
				
				if (operations == "+") {
					results = firstNum + secondNum;
					answer = String.format("%.2f", results);
					textField.setText(answer);
				}
				else if (operations == "-") {
					results = firstNum - secondNum;
					answer = String.format("%.2f", results);
					textField.setText(answer);
				}
				else if (operations == "*") {
					results = firstNum * secondNum;
					answer = String.format("%.2f", results);
					textField.setText(answer);
				}
				else if (operations == "/") {
					results = firstNum / secondNum;
					answer = String.format("%.2f", results);
					textField.setText(answer);
				}
				
			}
		});
		btnEquals.setBackground(new Color(255, 102, 0));
		btnEquals.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEquals.setBounds(190, 273, 47, 50);
		frame.getContentPane().add(btnEquals);
	}
}
