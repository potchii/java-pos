/*
 * @author Ernest Benitez
 * Github Repo link: https://github.com/potchii/java-pos
 */


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.border.MatteBorder;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Insets;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class payroll extends JFrame {

	private JPanel contentPane;
	private JTextField txt_days;
	private JTextField txt_rate;
	private JTextField txt_wtLoan;
	private JTextField txt_net;
	private JTextField txt_deduct;
	private JTextField txt_gross;
	private JTextField txt_pagibig;
	private JTextField txt_employeeName;
	private JTextField txt_employeeNum;
	private JTextField txt_sss;
	private JTextField txt_wtTax;
	private JTextField field_employeeName;
	private JTextField field_employeeNum;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					payroll frame = new payroll();
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
	public payroll() {
		setTitle("ITE103 Final Exam");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Ernest\\eclipse-workspace\\SecondSemester\\img\\icons8-laptop-coding-100.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 697, 676);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(23, 25, 30));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("ITE103 - Exercise 3");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				calcuMenu main = new calcuMenu();
			    main.setVisible(true);
			    
			    dispose();
			}
		});
		lblNewLabel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Ernest\\eclipse-workspace\\SecondSemester\\img\\icons8-laptop-coding-50.png"));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Leelawadee UI", Font.BOLD, 25));
		lblNewLabel_1.setBounds(20, 21, 292, 47);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblPayroll = new JLabel("PAYROLL");
		lblPayroll.setHorizontalAlignment(SwingConstants.CENTER);
		lblPayroll.setForeground(Color.WHITE);
		lblPayroll.setFont(new Font("Leelawadee UI", Font.BOLD, 36));
		lblPayroll.setBorder(new MatteBorder(3, 0, 3, 0, (Color) new Color(255, 255, 255)));
		lblPayroll.setBounds(0, 79, 665, 99);
		contentPane.add(lblPayroll);
		
		JLabel lblNewLabel_1_1 = new JLabel("Number of Days worked");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Leelawadee UI", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(20, 294, 149, 25);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel txt_tax = new JLabel("Withholding Tax");
		txt_tax.setForeground(Color.WHITE);
		txt_tax.setFont(new Font("Leelawadee UI", Font.BOLD, 12));
		txt_tax.setBounds(20, 405, 149, 25);
		contentPane.add(txt_tax);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Rate per Day");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Leelawadee UI", Font.BOLD, 12));
		lblNewLabel_1_1_1.setBounds(20, 319, 149, 25);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel txt_loan = new JLabel("Loan");
		txt_loan.setForeground(Color.WHITE);
		txt_loan.setFont(new Font("Leelawadee UI", Font.BOLD, 12));
		txt_loan.setBounds(20, 438, 149, 25);
		contentPane.add(txt_loan);
		
		field_employeeName = new JTextField();
		field_employeeName.setMargin(new Insets(2, 4, 2, 2));
		field_employeeName.setHorizontalAlignment(SwingConstants.CENTER);
		field_employeeName.setForeground(Color.WHITE);
		field_employeeName.setEditable(false);
		field_employeeName.setColumns(10);
		field_employeeName.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		field_employeeName.setBackground(new Color(23, 25, 30));
		field_employeeName.setBounds(516, 272, 105, 18);
		contentPane.add(field_employeeName);
		
		field_employeeNum = new JTextField();
		field_employeeNum.setMargin(new Insets(2, 4, 2, 2));
		field_employeeNum.setHorizontalAlignment(SwingConstants.CENTER);
		field_employeeNum.setForeground(Color.WHITE);
		field_employeeNum.setEditable(false);
		field_employeeNum.setColumns(10);
		field_employeeNum.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		field_employeeNum.setBackground(new Color(23, 25, 30));
		field_employeeNum.setBounds(516, 241, 105, 18);
		contentPane.add(field_employeeNum);
		
		txt_days = new JTextField();
		txt_days.setMargin(new Insets(2, 4, 2, 2));
		txt_days.setHorizontalAlignment(SwingConstants.CENTER);
		txt_days.setForeground(Color.WHITE);
		txt_days.setColumns(10);
		txt_days.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		txt_days.setBackground(new Color(23, 25, 30));
		txt_days.setBounds(179, 298, 105, 18);
		contentPane.add(txt_days);
		
		txt_rate = new JTextField();
		txt_rate.setMargin(new Insets(2, 4, 2, 2));
		txt_rate.setHorizontalAlignment(SwingConstants.CENTER);
		txt_rate.setForeground(Color.WHITE);
		txt_rate.setColumns(10);
		txt_rate.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		txt_rate.setBackground(new Color(23, 25, 30));
		txt_rate.setBounds(179, 322, 105, 18);
		contentPane.add(txt_rate);
		
		txt_employeeNum = new JTextField();
		txt_employeeNum.setMargin(new Insets(2, 4, 2, 2));
		txt_employeeNum.setHorizontalAlignment(SwingConstants.CENTER);
		txt_employeeNum.setForeground(Color.WHITE);
		txt_employeeNum.setColumns(10);
		txt_employeeNum.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		txt_employeeNum.setBackground(new Color(23, 25, 30));
		txt_employeeNum.setBounds(179, 241, 105, 18);
		contentPane.add(txt_employeeNum);
		
		txt_employeeName = new JTextField();
		txt_employeeName.setMargin(new Insets(2, 4, 2, 2));
		txt_employeeName.setHorizontalAlignment(SwingConstants.CENTER);
		txt_employeeName.setForeground(Color.WHITE);
		txt_employeeName.setColumns(10);
		txt_employeeName.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		txt_employeeName.setBackground(new Color(23, 25, 30));
		txt_employeeName.setBounds(179, 272, 105, 18);
		contentPane.add(txt_employeeName);
		
		txt_wtLoan = new JTextField();
		txt_wtLoan.setMargin(new Insets(2, 4, 2, 2));
		txt_wtLoan.setHorizontalAlignment(SwingConstants.CENTER);
		txt_wtLoan.setForeground(Color.WHITE);
		txt_wtLoan.setColumns(10);
		txt_wtLoan.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		txt_wtLoan.setBackground(new Color(23, 25, 30));
		txt_wtLoan.setBounds(179, 441, 105, 18);
		contentPane.add(txt_wtLoan);
		
		txt_net = new JTextField();
		txt_net.setEditable(false);
		txt_net.setMargin(new Insets(2, 4, 2, 2));
		txt_net.setHorizontalAlignment(SwingConstants.CENTER);
		txt_net.setForeground(Color.WHITE);
		txt_net.setColumns(10);
		txt_net.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		txt_net.setBackground(new Color(23, 25, 30));
		txt_net.setBounds(516, 347, 105, 18);
		contentPane.add(txt_net);
		
		txt_deduct = new JTextField();
		txt_deduct.setEditable(false);
		txt_deduct.setMargin(new Insets(2, 4, 2, 2));
		txt_deduct.setHorizontalAlignment(SwingConstants.CENTER);
		txt_deduct.setForeground(Color.WHITE);
		txt_deduct.setColumns(10);
		txt_deduct.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		txt_deduct.setBackground(new Color(23, 25, 30));
		txt_deduct.setBounds(516, 321, 105, 18);
		contentPane.add(txt_deduct);
		
		txt_gross = new JTextField();
		txt_gross.setEditable(false);
		txt_gross.setMargin(new Insets(2, 4, 2, 2));
		txt_gross.setHorizontalAlignment(SwingConstants.CENTER);
		txt_gross.setForeground(Color.WHITE);
		txt_gross.setColumns(10);
		txt_gross.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		txt_gross.setBackground(new Color(23, 25, 30));
		txt_gross.setBounds(516, 297, 105, 18);
		contentPane.add(txt_gross);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Net Pay");
		lblNewLabel_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_1.setFont(new Font("Leelawadee UI", Font.BOLD, 12));
		lblNewLabel_1_1_1_1_1.setBounds(357, 344, 149, 25);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Total Deductions");
		lblNewLabel_1_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_2.setFont(new Font("Leelawadee UI", Font.BOLD, 12));
		lblNewLabel_1_1_1_2.setBounds(357, 318, 149, 25);
		contentPane.add(lblNewLabel_1_1_1_2);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Gross Pay");
		lblNewLabel_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_2.setFont(new Font("Leelawadee UI", Font.BOLD, 12));
		lblNewLabel_1_1_2.setBounds(357, 293, 149, 25);
		contentPane.add(lblNewLabel_1_1_2);
		
		JButton btnNewButton_1 = new JButton("PROCEED");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double daysWorked = Double.parseDouble(txt_days.getText());
				double RatePerDay = Double.parseDouble(txt_rate.getText());
				double grossPay = daysWorked * RatePerDay;
				txt_gross.setText(Double.toString(grossPay));
				
				// deductions, wtTax = withholding tax
				double wtTax = Double.parseDouble(txt_wtTax.getText());
				double employeeLoan = Double.parseDouble(txt_wtLoan.getText());
				double sss = Double.parseDouble(txt_wtLoan.getText());
				double pagIbig = Double.parseDouble(txt_pagibig.getText());
				double deduction = employeeLoan + wtTax + sss + pagIbig;
				txt_deduct.setText(Double.toString(deduction));
				
				double netPay = grossPay - deduction;
				txt_net.setText(Double.toString(netPay));
				
				String employeeNum = txt_employeeNum.getText();
				if (!employeeNum.equals("101")) {
					JOptionPane.showMessageDialog(contentPane, "Invalid Employee ID", "Error", JOptionPane.ERROR_MESSAGE);
				}
				String employeeName = txt_employeeName.getText();
				field_employeeNum.setText(employeeNum);
				field_employeeName.setText(employeeName);
			}
		});
		btnNewButton_1.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_1.setForeground(new Color(23, 25, 30));
		btnNewButton_1.setFont(new Font("Leelawadee UI", Font.BOLD, 12));
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(505, 376, 116, 36);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("Pag-Ibig");
		lblNewLabel_1_1_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_2.setFont(new Font("Leelawadee UI", Font.BOLD, 12));
		lblNewLabel_1_1_1_1_2.setBounds(20, 465, 149, 25);
		contentPane.add(lblNewLabel_1_1_1_1_2);
		
		txt_pagibig = new JTextField();
		txt_pagibig.setMargin(new Insets(2, 4, 2, 2));
		txt_pagibig.setHorizontalAlignment(SwingConstants.CENTER);
		txt_pagibig.setForeground(Color.WHITE);
		txt_pagibig.setColumns(10);
		txt_pagibig.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		txt_pagibig.setBackground(new Color(23, 25, 30));
		txt_pagibig.setBounds(179, 468, 105, 18);
		contentPane.add(txt_pagibig);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("RESULTS");
		lblNewLabel_1_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_1_3.setFont(new Font("Leelawadee UI", Font.BOLD, 18));
		lblNewLabel_1_1_3.setBounds(357, 203, 149, 25);
		contentPane.add(lblNewLabel_1_1_3);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Programmed by: Ernest Benitez");
		lblNewLabel_4_1_1.setForeground(Color.WHITE);
		lblNewLabel_4_1_1.setFont(new Font("Leelawadee UI", Font.PLAIN, 12));
		lblNewLabel_4_1_1.setBounds(253, 574, 165, 14);
		contentPane.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4 = new JLabel("© potchi.tech, 2023.");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Leelawadee UI", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(277, 599, 110, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1_1_3_1 = new JLabel("EMPLOYEE INFORMATION");
		lblNewLabel_1_1_3_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_3_1.setFont(new Font("Leelawadee UI", Font.BOLD, 18));
		lblNewLabel_1_1_3_1.setBounds(20, 203, 238, 25);
		contentPane.add(lblNewLabel_1_1_3_1);
		
		JLabel lblNewLabel_1_1_4 = new JLabel("Employee Name");
		lblNewLabel_1_1_4.setForeground(Color.WHITE);
		lblNewLabel_1_1_4.setFont(new Font("Leelawadee UI", Font.BOLD, 12));
		lblNewLabel_1_1_4.setBounds(20, 268, 149, 25);
		contentPane.add(lblNewLabel_1_1_4);
		
		JLabel lblNewLabel_1_1_4_1 = new JLabel("Employee Number");
		lblNewLabel_1_1_4_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_4_1.setFont(new Font("Leelawadee UI", Font.BOLD, 12));
		lblNewLabel_1_1_4_1.setBounds(20, 237, 149, 25);
		contentPane.add(lblNewLabel_1_1_4_1);
		
		JLabel lblNewLabel_1_1_3_2 = new JLabel("SALARY DEDUCTIONS");
		lblNewLabel_1_1_3_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_3_2.setFont(new Font("Leelawadee UI", Font.BOLD, 18));
		lblNewLabel_1_1_3_2.setBounds(20, 369, 205, 25);
		contentPane.add(lblNewLabel_1_1_3_2);
		
		JLabel lblNewLabel_1_1_1_1_3 = new JLabel("SSS");
		lblNewLabel_1_1_1_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_3.setFont(new Font("Leelawadee UI", Font.BOLD, 12));
		lblNewLabel_1_1_1_1_3.setBounds(20, 490, 149, 25);
		contentPane.add(lblNewLabel_1_1_1_1_3);
		
		txt_sss = new JTextField();
		txt_sss.setMargin(new Insets(2, 4, 2, 2));
		txt_sss.setHorizontalAlignment(SwingConstants.CENTER);
		txt_sss.setForeground(Color.WHITE);
		txt_sss.setColumns(10);
		txt_sss.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		txt_sss.setBackground(new Color(23, 25, 30));
		txt_sss.setBounds(179, 493, 105, 18);
		contentPane.add(txt_sss);
		
		txt_wtTax = new JTextField();
		txt_wtTax.setMargin(new Insets(2, 4, 2, 2));
		txt_wtTax.setHorizontalAlignment(SwingConstants.CENTER);
		txt_wtTax.setForeground(Color.WHITE);
		txt_wtTax.setColumns(10);
		txt_wtTax.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		txt_wtTax.setBackground(new Color(23, 25, 30));
		txt_wtTax.setBounds(179, 409, 105, 18);
		contentPane.add(txt_wtTax);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Employee Name");
		lblNewLabel_1_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_2_1.setFont(new Font("Leelawadee UI", Font.BOLD, 12));
		lblNewLabel_1_1_2_1.setBounds(357, 268, 149, 25);
		contentPane.add(lblNewLabel_1_1_2_1);
		
		JLabel lblNewLabel_1_1_2_1_1 = new JLabel("Employee Number");
		lblNewLabel_1_1_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_2_1_1.setFont(new Font("Leelawadee UI", Font.BOLD, 12));
		lblNewLabel_1_1_2_1_1.setBounds(357, 237, 149, 25);
		contentPane.add(lblNewLabel_1_1_2_1_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Ernest\\eclipse-workspace\\SecondSemester\\img\\icons8-laptop-coding-50.png"));
		lblNewLabel.setBounds(308, 532, 65, 41);
		contentPane.add(lblNewLabel);
		
		JLabel txt_date_1 = new JLabel("PAYROLL OFFICER: JOHN DOE");
		txt_date_1.setForeground(Color.WHITE);
		txt_date_1.setFont(new Font("Leelawadee UI", Font.BOLD, 18));
		txt_date_1.setBounds(357, 435, 264, 25);
		contentPane.add(txt_date_1);
	}
}
