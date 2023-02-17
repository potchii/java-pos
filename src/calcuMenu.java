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
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Cursor;

public class calcuMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calcuMenu frame = new calcuMenu();
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
	public calcuMenu() {
		setTitle("Menu");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Ernest\\eclipse-workspace\\SecondSemester\\img\\icons8-laptop-coding-100.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 681, 489);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(23, 25, 30));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MENU");
		lblNewLabel.setBorder(new MatteBorder(3, 0, 3, 0, (Color) new Color(255, 255, 255)));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Leelawadee UI", Font.BOLD, 36));
		lblNewLabel.setBounds(0, 69, 665, 99);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcuLogin main = new calcuLogin();
			    main.setVisible(true);
			    
			    dispose();
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Ernest\\eclipse-workspace\\SecondSemester\\img\\icons8-lock-30.png"));
		btnNewButton.setForeground(new Color(23, 25, 30));
		btnNewButton.setFont(new Font("Leelawadee UI", Font.BOLD, 12));
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(254, 271, 147, 41);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculatorFrontend main = new calculatorFrontend();
			    main.setVisible(true);
			    
			    dispose();
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Ernest\\eclipse-workspace\\SecondSemester\\img\\icons8-calculator-24.png"));
		btnNewButton_1.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_1.setForeground(new Color(23, 25, 30));
		btnNewButton_1.setFont(new Font("Leelawadee UI", Font.BOLD, 12));
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(254, 211, 147, 41);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				payroll main = new payroll();
			    main.setVisible(true);
			    
			    dispose();
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\Ernest\\eclipse-workspace\\SecondSemester\\img\\icons8-payroll-24.png"));
		btnNewButton_2.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_2.setForeground(new Color(23, 25, 30));
		btnNewButton_2.setFont(new Font("Leelawadee UI", Font.BOLD, 12));
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setBounds(254, 335, 147, 41);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_4 = new JLabel("© potchi.tech, 2023.");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Leelawadee UI", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(271, 425, 110, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Programmed by: Ernest Benitez");
		lblNewLabel_4_1_1.setForeground(Color.WHITE);
		lblNewLabel_4_1_1.setFont(new Font("Leelawadee UI", Font.PLAIN, 12));
		lblNewLabel_4_1_1.setBounds(250, 400, 165, 14);
		contentPane.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("EXERCISE 3");
		lblNewLabel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Leelawadee UI", Font.BOLD, 25));
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Ernest\\eclipse-workspace\\SecondSemester\\img\\icons8-laptop-coding-50.png"));
		lblNewLabel_1.setBounds(10, 11, 195, 47);
		contentPane.add(lblNewLabel_1);
	}

}
