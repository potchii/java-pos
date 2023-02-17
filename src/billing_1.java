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
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class billing_1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_24;
	private JTextField textField_23;
	
	public void Clock(JLabel lblNewLabel_1, JLabel lblCustomerName_1) {
	    Thread clock = new Thread() {
	        public void run() {
	            try {
	                for (;;) {
	                    Calendar der = new GregorianCalendar();
	                    int day = der.get(Calendar.DAY_OF_MONTH);
	                    int month = der.get(Calendar.MONTH);
	                    int year = der.get(Calendar.YEAR);

	                    int sec = der.get(Calendar.SECOND);
	                    int min = der.get(Calendar.MINUTE);
	                    int hr = der.get(Calendar.HOUR);

	                    lblNewLabel_1.setText("Date: " + (month + 1) + '/' + day + '/' + year);
	                    lblCustomerName_1.setText("Time: " + hr + ':' + min + ':' + sec);

	                    sleep(1000);
	                }
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	    };
	    clock.start();
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					billing_1 frame = new billing_1();
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
	public billing_1() {
		//String[] items = {"2,500 Robux", "2,750 Robux", "4,500 Robux", "4,850 Robux", "5,100 Robux", "5,500 Robux", "6,000 Robux", "6,350 Robux", "10,000 Robux", "22,500 Robux"};
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Ernest\\eclipse-workspace\\SecondSemester\\img\\icons8-roblox-48.png"));
		setTitle("Roblox - Shopping Cart");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 884, 796);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(23, 25, 30));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Customer ID");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(29, 17, 60, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblCustomerName = new JLabel("Customer Name");
		lblCustomerName.setForeground(Color.WHITE);
		lblCustomerName.setBounds(21, 45, 82, 14);
		contentPane.add(lblCustomerName);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(113, 14, 86, 20);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(113, 42, 86, 20);
		contentPane.add(textField_1);
		
		JButton btnIdentify = new JButton("Identify");
		btnIdentify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String customer[] = {"Princess Zamora", "Victor Balalong", "Skerdi Manalo"};
				
				switch (textField.getText()) {
				
				case "101":
					textField_1.setText(customer[0]);
					break;
				case "102":
					textField_1.setText(customer[1]);
					break;
				case "103":
					textField_1.setText(customer[2]);
					break;
				default:
					JOptionPane.showMessageDialog(contentPane, "Invalid User ID!", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnIdentify.setHorizontalTextPosition(SwingConstants.CENTER);
		btnIdentify.setForeground(Color.WHITE);
		btnIdentify.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnIdentify.setBorder(null);
		btnIdentify.setBackground(Color.RED);
		btnIdentify.setBounds(209, 11, 89, 51);
		contentPane.add(btnIdentify);
		
		JLabel lblShoppingCart = new JLabel("CHECKOUT");
		lblShoppingCart.setIcon(new ImageIcon("C:\\Users\\Ernest\\eclipse-workspace\\SecondSemester\\img\\icons8-roblox-48.png"));
		lblShoppingCart.setForeground(Color.WHITE);
		lblShoppingCart.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblShoppingCart.setBounds(616, 53, 222, 51);
		contentPane.add(lblShoppingCart);
		
		JLabel lblCustomerName_1 = new JLabel("Time");
		lblCustomerName_1.setForeground(Color.WHITE);
		lblCustomerName_1.setBounds(663, 45, 102, 14);
		contentPane.add(lblCustomerName_1);
		
		JLabel lblNewLabel_1 = new JLabel("Date");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(663, 17, 102, 14);
		contentPane.add(lblNewLabel_1);
		
		Clock(lblNewLabel_1, lblCustomerName_1);
			
		JLabel lblNewLabel_2 = new JLabel("Items");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(54, 114, 60, 14);
		contentPane.add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.WHITE);
		panel.setBorder(new MatteBorder(2, 0, 2, 0, (Color) new Color(0, 0, 0)));
		panel.setBackground(Color.WHITE);
		panel.setBounds(54, 132, 723, 7);
		contentPane.add(panel);
		
		JLabel lblNewLabel_3 = new JLabel("Amount");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(275, 114, 60, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Quantity");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(534, 115, 60, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Subtotal");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(717, 115, 60, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel100r = new JLabel("2,500");
		lblNewLabel100r.setIcon(new ImageIcon("C:\\Users\\Ernest\\eclipse-workspace\\SecondSemester\\img\\icons8-robux-24.png"));
		lblNewLabel100r.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel100r.setForeground(Color.WHITE);
		lblNewLabel100r.setFont(new Font("Leelawadee UI", Font.BOLD, 16));
		lblNewLabel100r.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		lblNewLabel100r.setBackground(Color.WHITE);
		lblNewLabel100r.setBounds(54, 150, 82, 31);
		contentPane.add(lblNewLabel100r);
		
		JLabel lblNewLabel_5_1 = new JLabel("PHP 1,999.00");
		lblNewLabel_5_1.setForeground(Color.WHITE);
		lblNewLabel_5_1.setFont(new Font("Leelawadee UI", Font.BOLD, 16));
		lblNewLabel_5_1.setBounds(249, 155, 98, 20);
		contentPane.add(lblNewLabel_5_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(534, 158, 44, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(705, 158, 60, 20);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel100r_1 = new JLabel("2,750");
		lblNewLabel100r_1.setIcon(new ImageIcon("C:\\Users\\Ernest\\eclipse-workspace\\SecondSemester\\img\\icons8-robux-24.png"));
		lblNewLabel100r_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel100r_1.setForeground(Color.WHITE);
		lblNewLabel100r_1.setFont(new Font("Leelawadee UI", Font.BOLD, 16));
		lblNewLabel100r_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		lblNewLabel100r_1.setBackground(Color.WHITE);
		lblNewLabel100r_1.setBounds(54, 192, 82, 31);
		contentPane.add(lblNewLabel100r_1);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("PHP 2,149.00");
		lblNewLabel_5_1_1.setForeground(Color.WHITE);
		lblNewLabel_5_1_1.setFont(new Font("Leelawadee UI", Font.BOLD, 16));
		lblNewLabel_5_1_1.setBounds(249, 197, 98, 20);
		contentPane.add(lblNewLabel_5_1_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(534, 200, 44, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(705, 200, 60, 20);
		contentPane.add(textField_5);
		
		JLabel lblNewLabel100r_2 = new JLabel("4,500");
		lblNewLabel100r_2.setIcon(new ImageIcon("C:\\Users\\Ernest\\eclipse-workspace\\SecondSemester\\img\\icons8-robux-24.png"));
		lblNewLabel100r_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel100r_2.setForeground(Color.WHITE);
		lblNewLabel100r_2.setFont(new Font("Leelawadee UI", Font.BOLD, 16));
		lblNewLabel100r_2.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		lblNewLabel100r_2.setBackground(Color.WHITE);
		lblNewLabel100r_2.setBounds(54, 234, 82, 31);
		contentPane.add(lblNewLabel100r_2);
		
		JLabel lblNewLabel_5_1_2 = new JLabel("PHP 2,490.00");
		lblNewLabel_5_1_2.setForeground(Color.WHITE);
		lblNewLabel_5_1_2.setFont(new Font("Leelawadee UI", Font.BOLD, 16));
		lblNewLabel_5_1_2.setBounds(249, 239, 98, 20);
		contentPane.add(lblNewLabel_5_1_2);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(534, 242, 44, 20);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(705, 242, 60, 20);
		contentPane.add(textField_7);
		
		JLabel lblNewLabel100r_3 = new JLabel("4,850");
		lblNewLabel100r_3.setIcon(new ImageIcon("C:\\Users\\Ernest\\eclipse-workspace\\SecondSemester\\img\\icons8-robux-24.png"));
		lblNewLabel100r_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel100r_3.setForeground(Color.WHITE);
		lblNewLabel100r_3.setFont(new Font("Leelawadee UI", Font.BOLD, 16));
		lblNewLabel100r_3.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		lblNewLabel100r_3.setBackground(Color.WHITE);
		lblNewLabel100r_3.setBounds(54, 276, 82, 31);
		contentPane.add(lblNewLabel100r_3);
		
		JLabel lblNewLabel_5_1_3 = new JLabel("PHP 2,749.00");
		lblNewLabel_5_1_3.setForeground(Color.WHITE);
		lblNewLabel_5_1_3.setFont(new Font("Leelawadee UI", Font.BOLD, 16));
		lblNewLabel_5_1_3.setBounds(249, 281, 98, 20);
		contentPane.add(lblNewLabel_5_1_3);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(534, 284, 44, 20);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBounds(705, 284, 60, 20);
		contentPane.add(textField_9);
		
		JLabel lblNewLabel100r_4 = new JLabel("5,100");
		lblNewLabel100r_4.setIcon(new ImageIcon("C:\\Users\\Ernest\\eclipse-workspace\\SecondSemester\\img\\icons8-robux-24.png"));
		lblNewLabel100r_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel100r_4.setForeground(Color.WHITE);
		lblNewLabel100r_4.setFont(new Font("Leelawadee UI", Font.BOLD, 16));
		lblNewLabel100r_4.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		lblNewLabel100r_4.setBackground(Color.WHITE);
		lblNewLabel100r_4.setBounds(54, 318, 82, 31);
		contentPane.add(lblNewLabel100r_4);
		
		JLabel lblNewLabel_5_1_4 = new JLabel("PHP 2,999.00");
		lblNewLabel_5_1_4.setForeground(Color.WHITE);
		lblNewLabel_5_1_4.setFont(new Font("Leelawadee UI", Font.BOLD, 16));
		lblNewLabel_5_1_4.setBounds(249, 323, 98, 20);
		contentPane.add(lblNewLabel_5_1_4);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(534, 326, 44, 20);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setEditable(false);
		textField_11.setColumns(10);
		textField_11.setBounds(705, 326, 60, 20);
		contentPane.add(textField_11);
		
		JLabel lblNewLabel100r_5 = new JLabel("5,500");
		lblNewLabel100r_5.setIcon(new ImageIcon("C:\\Users\\Ernest\\eclipse-workspace\\SecondSemester\\img\\icons8-robux-24.png"));
		lblNewLabel100r_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel100r_5.setForeground(Color.WHITE);
		lblNewLabel100r_5.setFont(new Font("Leelawadee UI", Font.BOLD, 16));
		lblNewLabel100r_5.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		lblNewLabel100r_5.setBackground(Color.WHITE);
		lblNewLabel100r_5.setBounds(54, 360, 82, 31);
		contentPane.add(lblNewLabel100r_5);
		
		JLabel lblNewLabel_5_1_5 = new JLabel("PHP 3,249.00");
		lblNewLabel_5_1_5.setForeground(Color.WHITE);
		lblNewLabel_5_1_5.setFont(new Font("Leelawadee UI", Font.BOLD, 16));
		lblNewLabel_5_1_5.setBounds(249, 365, 98, 20);
		contentPane.add(lblNewLabel_5_1_5);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(534, 368, 44, 20);
		contentPane.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setEditable(false);
		textField_13.setColumns(10);
		textField_13.setBounds(705, 368, 60, 20);
		contentPane.add(textField_13);
		
		JLabel lblNewLabel100r_6 = new JLabel("6,000");
		lblNewLabel100r_6.setIcon(new ImageIcon("C:\\Users\\Ernest\\eclipse-workspace\\SecondSemester\\img\\icons8-robux-24.png"));
		lblNewLabel100r_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel100r_6.setForeground(Color.WHITE);
		lblNewLabel100r_6.setFont(new Font("Leelawadee UI", Font.BOLD, 16));
		lblNewLabel100r_6.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		lblNewLabel100r_6.setBackground(Color.WHITE);
		lblNewLabel100r_6.setBounds(54, 402, 82, 31);
		contentPane.add(lblNewLabel100r_6);
		
		JLabel lblNewLabel_5_1_6 = new JLabel("PHP 3,749.00");
		lblNewLabel_5_1_6.setForeground(Color.WHITE);
		lblNewLabel_5_1_6.setFont(new Font("Leelawadee UI", Font.BOLD, 16));
		lblNewLabel_5_1_6.setBounds(249, 407, 98, 20);
		contentPane.add(lblNewLabel_5_1_6);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(534, 410, 44, 20);
		contentPane.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setEditable(false);
		textField_15.setColumns(10);
		textField_15.setBounds(705, 410, 60, 20);
		contentPane.add(textField_15);
		
		JLabel lblNewLabel100r_7 = new JLabel("6,350");
		lblNewLabel100r_7.setIcon(new ImageIcon("C:\\Users\\Ernest\\eclipse-workspace\\SecondSemester\\img\\icons8-robux-24.png"));
		lblNewLabel100r_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel100r_7.setForeground(Color.WHITE);
		lblNewLabel100r_7.setFont(new Font("Leelawadee UI", Font.BOLD, 16));
		lblNewLabel100r_7.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		lblNewLabel100r_7.setBackground(Color.WHITE);
		lblNewLabel100r_7.setBounds(54, 444, 82, 31);
		contentPane.add(lblNewLabel100r_7);
		
		JLabel lblNewLabel_5_1_7 = new JLabel("PHP 3,999.00");
		lblNewLabel_5_1_7.setForeground(Color.WHITE);
		lblNewLabel_5_1_7.setFont(new Font("Leelawadee UI", Font.BOLD, 16));
		lblNewLabel_5_1_7.setBounds(249, 449, 98, 20);
		contentPane.add(lblNewLabel_5_1_7);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(534, 452, 44, 20);
		contentPane.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setEditable(false);
		textField_17.setColumns(10);
		textField_17.setBounds(705, 452, 60, 20);
		contentPane.add(textField_17);
		
		JLabel lblNewLabel100r_8 = new JLabel("10,000");
		lblNewLabel100r_8.setIcon(new ImageIcon("C:\\Users\\Ernest\\eclipse-workspace\\SecondSemester\\img\\icons8-robux-24.png"));
		lblNewLabel100r_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel100r_8.setForeground(Color.WHITE);
		lblNewLabel100r_8.setFont(new Font("Leelawadee UI", Font.BOLD, 16));
		lblNewLabel100r_8.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		lblNewLabel100r_8.setBackground(Color.WHITE);
		lblNewLabel100r_8.setBounds(54, 486, 82, 31);
		contentPane.add(lblNewLabel100r_8);
		
		JLabel lblNewLabel_5_1_8 = new JLabel("PHP 4,990.00");
		lblNewLabel_5_1_8.setForeground(Color.WHITE);
		lblNewLabel_5_1_8.setFont(new Font("Leelawadee UI", Font.BOLD, 16));
		lblNewLabel_5_1_8.setBounds(249, 491, 98, 20);
		contentPane.add(lblNewLabel_5_1_8);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(534, 494, 44, 20);
		contentPane.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setEditable(false);
		textField_19.setColumns(10);
		textField_19.setBounds(705, 494, 60, 20);
		contentPane.add(textField_19);
		
		JLabel lblNewLabel100r_9 = new JLabel("22,500");
		lblNewLabel100r_9.setIcon(new ImageIcon("C:\\Users\\Ernest\\eclipse-workspace\\SecondSemester\\img\\icons8-robux-24.png"));
		lblNewLabel100r_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel100r_9.setForeground(Color.WHITE);
		lblNewLabel100r_9.setFont(new Font("Leelawadee UI", Font.BOLD, 16));
		lblNewLabel100r_9.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		lblNewLabel100r_9.setBackground(Color.WHITE);
		lblNewLabel100r_9.setBounds(54, 528, 82, 31);
		contentPane.add(lblNewLabel100r_9);
		
		JLabel lblNewLabel_5_1_9 = new JLabel("PHP 9,990.00");
		lblNewLabel_5_1_9.setForeground(Color.WHITE);
		lblNewLabel_5_1_9.setFont(new Font("Leelawadee UI", Font.BOLD, 16));
		lblNewLabel_5_1_9.setBounds(249, 533, 98, 20);
		contentPane.add(lblNewLabel_5_1_9);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(534, 536, 44, 20);
		contentPane.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setEditable(false);
		textField_21.setColumns(10);
		textField_21.setBounds(705, 536, 60, 20);
		contentPane.add(textField_21);
		
		JButton btnIdentify_1_1 = new JButton("<");
		btnIdentify_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				billing main = new billing();
				main.setVisible(true);
			}
		});
		btnIdentify_1_1.setHorizontalTextPosition(SwingConstants.CENTER);
		btnIdentify_1_1.setForeground(Color.WHITE);
		btnIdentify_1_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnIdentify_1_1.setBorder(null);
		btnIdentify_1_1.setBackground(Color.RED);
		btnIdentify_1_1.setBounds(679, 590, 44, 31);
		contentPane.add(btnIdentify_1_1);
		
		JButton btnIdentify_1 = new JButton(">");
		btnIdentify_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(contentPane, "You are in the last page. You may not browse any further.", "ERROR", JOptionPane.ERROR_MESSAGE);
			}
		});
		btnIdentify_1.setHorizontalTextPosition(SwingConstants.CENTER);
		btnIdentify_1.setForeground(Color.WHITE);
		btnIdentify_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnIdentify_1.setBorder(null);
		btnIdentify_1.setBackground(Color.RED);
		btnIdentify_1.setBounds(733, 590, 44, 31);
		contentPane.add(btnIdentify_1);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setHorizontalTextPosition(SwingConstants.CENTER);
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnLogin.setBorder(null);
		btnLogin.setBackground(Color.RED);
		btnLogin.setBounds(679, 632, 98, 20);
		contentPane.add(btnLogin);
		
		JButton btnMenu = new JButton("Menu");
		btnMenu.setHorizontalTextPosition(SwingConstants.CENTER);
		btnMenu.setForeground(Color.WHITE);
		btnMenu.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnMenu.setBorder(null);
		btnMenu.setBackground(Color.RED);
		btnMenu.setBounds(679, 661, 98, 20);
		contentPane.add(btnMenu);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\Ernest\\eclipse-workspace\\SecondSemester\\img\\icons8-roblox-48.png"));
		lblNewLabel_6.setBounds(330, 647, 60, 51);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_3_1 = new JLabel("© All rights reserved. Roblox, 2023.");
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblNewLabel_3_1.setBounds(263, 696, 331, 35);
		contentPane.add(lblNewLabel_3_1);
		
		JCheckBox[] checkboxes = new JCheckBox[10]; // create an array of 10 checkboxes

		checkboxes[0] = new JCheckBox("");
		checkboxes[0].setBackground(new Color(23, 25, 30));
		checkboxes[0].setBounds(23, 144, 20, 31);
		contentPane.add(checkboxes[0]);

		checkboxes[1] = new JCheckBox("");
		checkboxes[1].setBackground(new Color(23, 25, 30));
		checkboxes[1].setBounds(22, 193, 20, 31);
		contentPane.add(checkboxes[1]);

		checkboxes[2] = new JCheckBox("");
		checkboxes[2].setBackground(new Color(23, 25, 30));
		checkboxes[2].setBounds(23, 235, 20, 31);
		contentPane.add(checkboxes[2]);

		checkboxes[3] = new JCheckBox("");
		checkboxes[3].setBackground(new Color(23, 25, 30));
		checkboxes[3].setBounds(22, 270, 20, 31);
		contentPane.add(checkboxes[3]);

		checkboxes[4] = new JCheckBox("");
		checkboxes[4].setBackground(new Color(23, 25, 30));
		checkboxes[4].setBounds(22, 312, 20, 31);
		contentPane.add(checkboxes[4]);

		checkboxes[5] = new JCheckBox("");
		checkboxes[5].setBackground(new Color(23, 25, 30));
		checkboxes[5].setBounds(23, 354, 20, 31);
		contentPane.add(checkboxes[5]);

		checkboxes[6] = new JCheckBox("");
		checkboxes[6].setBackground(new Color(23, 25, 30));
		checkboxes[6].setBounds(23, 396, 20, 31);
		contentPane.add(checkboxes[6]);

		checkboxes[7] = new JCheckBox("");
		checkboxes[7].setBackground(new Color(23, 25, 30));
		checkboxes[7].setBounds(23, 438, 20, 31);
		contentPane.add(checkboxes[7]);

		checkboxes[8] = new JCheckBox("");
		checkboxes[8].setBackground(new Color(23, 25, 30));
		checkboxes[8].setBounds(23, 480, 20, 31);
		contentPane.add(checkboxes[8]);

		checkboxes[9] = new JCheckBox("");
		checkboxes[9].setBackground(new Color(23, 25, 30));
		checkboxes[9].setBounds(23, 516, 20, 31);
		contentPane.add(checkboxes[9]);
		
		JLabel lblTotal = new JLabel("COST");
		lblTotal.setFont(new Font("Leelawadee UI", Font.BOLD, 14));
		lblTotal.setForeground(Color.WHITE);
		lblTotal.setBounds(482, 598, 44, 14);
		contentPane.add(lblTotal);
		
		textField_22 = new JTextField();
		textField_22.setEditable(false);
		textField_22.setColumns(10);
		textField_22.setBounds(534, 597, 98, 20);
		contentPane.add(textField_22);
		
		JLabel lblTotal_1_1 = new JLabel("TAX");
		lblTotal_1_1.setForeground(Color.WHITE);
		lblTotal_1_1.setFont(new Font("Leelawadee UI", Font.BOLD, 14));
		lblTotal_1_1.setBounds(482, 624, 44, 14);
		contentPane.add(lblTotal_1_1);
		
		textField_24 = new JTextField();
		textField_24.setEditable(false);
		textField_24.setColumns(10);
		textField_24.setBounds(534, 623, 98, 20);
		contentPane.add(textField_24);
		
		JLabel lblTotal_1_1_1 = new JLabel("TOTAL COST");
		lblTotal_1_1_1.setForeground(Color.WHITE);
		lblTotal_1_1_1.setFont(new Font("Leelawadee UI", Font.BOLD, 14));
		lblTotal_1_1_1.setBounds(440, 648, 86, 14);
		contentPane.add(lblTotal_1_1_1);
		
		textField_23 = new JTextField();
		textField_23.setEditable(false);
		textField_23.setColumns(10);
		textField_23.setBounds(534, 647, 98, 20);
		contentPane.add(textField_23);
		
		
		JButton btnCompute = new JButton("Compute");
		btnCompute.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int[] quantity = new int[10];
				double[] answer = new double[10]; // subtotal
				double totalCost1= 0;
				String itemList = "";
				String[] item = new String[10];

				if (checkboxes[0].isSelected()) { // checkboxes[] = 1st 10 checkboxes, checkboxes1[] = 2nd 10 checkboxes
					quantity[0] = Integer.parseInt(textField_2.getText());
					answer[0] = quantity[0] * 1999.00;
					textField_3.setText(Double.toString(answer[0]));
				}
				if (checkboxes[1].isSelected()) {
					quantity[1] = Integer.parseInt(textField_4.getText());
					answer[1] = quantity[1] * 2149.00;
					textField_5.setText(Double.toString(answer[1]));
				}
				if (checkboxes[2].isSelected()) {
					quantity[2] = Integer.parseInt(textField_6.getText());
					answer[2] = quantity[2] * 2490.00;
					textField_7.setText(Double.toString(answer[2]));
				}
				if (checkboxes[3].isSelected()) {
					quantity[3] = Integer.parseInt(textField_8.getText());
					answer[3] = quantity[3] * 2749.00;
					textField_9.setText(Double.toString(answer[3]));
				}
				if (checkboxes[4].isSelected()) {
					quantity[4] = Integer.parseInt(textField_10.getText());
					answer[4] = quantity[4] * 2999.00;
					textField_11.setText(Double.toString(answer[4]));
				}
				if (checkboxes[5].isSelected()) {
					quantity[5] = Integer.parseInt(textField_12.getText());
					answer[5] = quantity[5] * 3249.00;
					textField_13.setText(Double.toString(answer[5]));
				}
				if (checkboxes[6].isSelected()) {
					quantity[6] = Integer.parseInt(textField_14.getText());
					answer[6] = quantity[6] * 3749.00;
					textField_15.setText(Double.toString(answer[6]));
				}
				if (checkboxes[7].isSelected()) {
					quantity[7] = Integer.parseInt(textField_16.getText());
					answer[7] = quantity[7] * 3999.00;
					textField_17.setText(Double.toString(answer[7]));
				}
				if (checkboxes[8].isSelected()) {
					quantity[8] = Integer.parseInt(textField_18.getText());
					answer[8] = quantity[8] * 4990.00;
					textField_19.setText(Double.toString(answer[8]));
				}
				if (checkboxes[9].isSelected()) {
					quantity[9] = Integer.parseInt(textField_20.getText());
					answer[9] = quantity[9] * 9990.00;
					textField_21.setText(Double.toString(answer[9]));
				}
				

				// COST COMPUTATION
				double total = 0.0;
				for (int i = 0; i < answer.length; i++) {
				    total += answer[i];
				}
				textField_22.setText(Double.toString(total));
				
				// TAX COMPUTATION
				double tax = total * .12; // 12% tax
				textField_24.setText(Double.toString(tax));
				
				// TOTAL COST COMCPUTATION
				double totalCost = total + tax;
				textField_23.setText(Double.toString(totalCost));
				
				if (textField_22.getText().equals("0.0") && textField_24.getText().equals("0.0") && textField_23.getText().equals("0.0")) {
				    JOptionPane.showMessageDialog(contentPane, "Please purchase item(s) to proceed!", "Error", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		btnCompute.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCompute.setForeground(Color.WHITE);
		btnCompute.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnCompute.setBorder(null);
		btnCompute.setBackground(Color.RED);
		btnCompute.setBounds(534, 678, 98, 20);
		contentPane.add(btnCompute);
		
		// checkboxes[] = 1st 10 checkboxes, checkboxes1[] = 2nd 10 checkboxes
		JButton btnReceipt = new JButton("Receipt");
		btnReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (checkboxes[0].isSelected()) { 
					JOptionPane.showMessageDialog(null, "");
				}
				if (checkboxes[1].isSelected()) {
				}
				if (checkboxes[2].isSelected()) {
				}
				if (checkboxes[3].isSelected()) {
				}
				if (checkboxes[4].isSelected()) {
				}
				if (checkboxes[5].isSelected()) {
				}
				if (checkboxes[6].isSelected()) {
				}
				if (checkboxes[7].isSelected()) {
				}
				if (checkboxes[8].isSelected()) {
				}
				if (checkboxes[9].isSelected()) {
				}
			}
		});
		btnReceipt.setHorizontalTextPosition(SwingConstants.CENTER);
		btnReceipt.setForeground(Color.WHITE);
		btnReceipt.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnReceipt.setBorder(null);
		btnReceipt.setBackground(Color.RED);
		btnReceipt.setBounds(534, 703, 98, 20);
		contentPane.add(btnReceipt);
	}
}
