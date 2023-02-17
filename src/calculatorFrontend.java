/*
 * @author Ernest Benitez
 * Github Repo link: https://github.com/potchii/java-pos
 */


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Cursor;

public class calculatorFrontend extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculatorFrontend frame = new calculatorFrontend();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the frame.
	 */
	public calculatorFrontend() {
		arithmetic functions = new arithmetic(); // instance for the math functions
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 409);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(23, 25, 30));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("EXERCISE 3");
		lblNewLabel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				calcuMenu main = new calcuMenu();
			    main.setVisible(true);
			    
			    dispose();
			}
		});
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Ernest\\eclipse-workspace\\SecondSemester\\img\\icons8-laptop-coding-50.png"));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Leelawadee UI", Font.BOLD, 25));
		lblNewLabel_1.setBounds(10, 11, 195, 47);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("CALCULATOR");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Leelawadee UI", Font.BOLD, 36));
		lblNewLabel.setBorder(new MatteBorder(3, 0, 3, 0, (Color) new Color(255, 255, 255)));
		lblNewLabel.setBounds(0, 69, 665, 99);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setMargin(new Insets(2, 4, 2, 2));
		textField.setForeground(Color.WHITE);
		textField.setColumns(10);
		textField.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		textField.setBackground(new Color(23, 25, 30));
		textField.setBounds(57, 225, 180, 32);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setMargin(new Insets(2, 4, 2, 2));
		textField_1.setForeground(Color.WHITE);
		textField_1.setColumns(10);
		textField_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		textField_1.setBackground(new Color(23, 25, 30));
		textField_1.setBounds(385, 225, 180, 32);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Integer 2\r\n");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Leelawadee UI", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(386, 171, 195, 47);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Integer 1");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Leelawadee UI", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBounds(57, 171, 105, 47);
		contentPane.add(lblNewLabel_1_1_1);
		
		JButton btnNewButton_1 = new JButton("+");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(textField.getText());
				double num2 = Double.parseDouble(textField_1.getText());
				double result = arithmetic.addition(num1, num2);
				
				String resultString = Double.toString(result);
				textField_2.setText(resultString);
				String resultMessage = "The result is " + resultString;
				JOptionPane.showMessageDialog(null, resultMessage);
			}
		});
		btnNewButton_1.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_1.setForeground(new Color(23, 25, 30));
		btnNewButton_1.setFont(new Font("Leelawadee UI", Font.BOLD, 20));
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(67, 268, 54, 41);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("-");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(textField.getText());
				double num2 = Double.parseDouble(textField_1.getText());
				double result = arithmetic.subtraction(num1, num2);
				
				String resultString = Double.toString(result);
				textField_2.setText(resultString);
				String resultMessage = "The result is " + resultString;
				JOptionPane.showMessageDialog(null, resultMessage);
			}
		});
		btnNewButton_1_1.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_1_1.setForeground(new Color(23, 25, 30));
		btnNewButton_1_1.setFont(new Font("Leelawadee UI", Font.BOLD, 20));
		btnNewButton_1_1.setBorder(null);
		btnNewButton_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1.setBounds(172, 268, 54, 41);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("*");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(textField.getText());
				double num2 = Double.parseDouble(textField_1.getText());
				double result = arithmetic.multplication(num1, num2);
				
				String resultString = Double.toString(result);
				textField_2.setText(resultString);
				String resultMessage = "The result is " + resultString;
				JOptionPane.showMessageDialog(null, resultMessage);
			}
		});
		btnNewButton_1_2.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_1_2.setForeground(new Color(23, 25, 30));
		btnNewButton_1_2.setFont(new Font("Leelawadee UI", Font.BOLD, 20));
		btnNewButton_1_2.setBorder(null);
		btnNewButton_1_2.setBackground(Color.WHITE);
		btnNewButton_1_2.setBounds(67, 318, 54, 41);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("/");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(textField.getText());
				double num2 = Double.parseDouble(textField_1.getText());
				double result = arithmetic.division(num1, num2);
				
				String resultString = Double.toString(result);
				textField_2.setText(resultString);
				String resultMessage = "The result is " + resultString;
				JOptionPane.showMessageDialog(null, resultMessage);
			}
		});
		btnNewButton_1_3.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_1_3.setForeground(new Color(23, 25, 30));
		btnNewButton_1_3.setFont(new Font("Leelawadee UI", Font.BOLD, 20));
		btnNewButton_1_3.setBorder(null);
		btnNewButton_1_3.setBackground(Color.WHITE);
		btnNewButton_1_3.setBounds(172, 318, 54, 41);
		contentPane.add(btnNewButton_1_3);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Answer");
		lblNewLabel_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1.setFont(new Font("Leelawadee UI", Font.BOLD, 20));
		lblNewLabel_1_1_1_1.setBounds(385, 262, 105, 47);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setMargin(new Insets(2, 4, 2, 2));
		textField_2.setForeground(Color.WHITE);
		textField_2.setColumns(10);
		textField_2.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		textField_2.setBackground(new Color(23, 25, 30));
		textField_2.setBounds(385, 313, 105, 32);
		contentPane.add(textField_2);
	}
}
