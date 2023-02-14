import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class billing extends JFrame {

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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					billing frame = new billing();
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
	public billing() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Ernest\\eclipse-workspace\\SecondSemester\\img\\icons8-roblox-48.png"));
		setTitle("Roblox - Checkout");
		setBackground(new Color(23, 25, 30));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 885, 796);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(23, 25, 30));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Customer ID");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(23, 11, 60, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblCustomerName = new JLabel("Customer Name");
		lblCustomerName.setForeground(Color.WHITE);
		lblCustomerName.setBounds(15, 39, 82, 14);
		contentPane.add(lblCustomerName);
		
		textField = new JTextField();
		textField.setBounds(107, 8, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(107, 36, 86, 20);
		contentPane.add(textField_1);
		
		JButton btnIdentify = new JButton("Identify");
		btnIdentify.setHorizontalTextPosition(SwingConstants.CENTER);
		btnIdentify.setForeground(Color.WHITE);
		btnIdentify.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnIdentify.setBorder(null);
		btnIdentify.setBackground(Color.RED);
		btnIdentify.setBounds(203, 5, 89, 51);
		contentPane.add(btnIdentify);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.WHITE);
		panel.setBorder(new MatteBorder(2, 0, 2, 0, (Color) new Color(0, 0, 0)));
		panel.setBackground(Color.WHITE);
		panel.setBounds(48, 126, 723, 7);
		contentPane.add(panel);
		
		JLabel lblShoppingCart = new JLabel("SHOPPING CART");
		lblShoppingCart.setIcon(new ImageIcon("C:\\Users\\Ernest\\eclipse-workspace\\SecondSemester\\img\\icons8-roblox-48.png"));
		lblShoppingCart.setForeground(Color.WHITE);
		lblShoppingCart.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblShoppingCart.setBounds(549, 47, 222, 51);
		contentPane.add(lblShoppingCart);
		
		JLabel lblNewLabel_1 = new JLabel("Date");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(711, 11, 60, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblCustomerName_1 = new JLabel("Time");
		lblCustomerName_1.setForeground(Color.WHITE);
		lblCustomerName_1.setBounds(711, 39, 27, 14);
		contentPane.add(lblCustomerName_1);
		
		JLabel lblNewLabel_2 = new JLabel("Items");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(48, 108, 60, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Amount");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(269, 108, 60, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Quantity");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(528, 109, 60, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Subtotal");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(711, 109, 60, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel100r = new JLabel("100");
		lblNewLabel100r.setIcon(new ImageIcon("C:\\Users\\Ernest\\eclipse-workspace\\SecondSemester\\img\\icons8-robux-24.png"));
		lblNewLabel100r.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel100r.setForeground(Color.WHITE);
		lblNewLabel100r.setFont(new Font("Leelawadee UI", Font.BOLD, 16));
		lblNewLabel100r.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		lblNewLabel100r.setBackground(Color.WHITE);
		lblNewLabel100r.setBounds(48, 144, 67, 31);
		contentPane.add(lblNewLabel100r);
		
		JLabel lblNewLabel_5_1 = new JLabel("PHP 49.00");
		lblNewLabel_5_1.setFont(new Font("Leelawadee UI", Font.BOLD, 16));
		lblNewLabel_5_1.setForeground(Color.WHITE);
		lblNewLabel_5_1.setBounds(243, 149, 86, 20);
		contentPane.add(lblNewLabel_5_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(528, 152, 44, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(699, 152, 60, 20);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel100r_1 = new JLabel("100");
		lblNewLabel100r_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel100r_1.setForeground(Color.WHITE);
		lblNewLabel100r_1.setFont(new Font("Leelawadee UI", Font.BOLD, 16));
		lblNewLabel100r_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		lblNewLabel100r_1.setBackground(Color.WHITE);
		lblNewLabel100r_1.setBounds(48, 186, 67, 31);
		contentPane.add(lblNewLabel100r_1);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("PHP 49.00");
		lblNewLabel_5_1_1.setForeground(Color.WHITE);
		lblNewLabel_5_1_1.setFont(new Font("Leelawadee UI", Font.BOLD, 16));
		lblNewLabel_5_1_1.setBounds(243, 191, 86, 20);
		contentPane.add(lblNewLabel_5_1_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(528, 194, 44, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(699, 194, 60, 20);
		contentPane.add(textField_5);
		
		JLabel lblNewLabel100r_2 = new JLabel("100");
		lblNewLabel100r_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel100r_2.setForeground(Color.WHITE);
		lblNewLabel100r_2.setFont(new Font("Leelawadee UI", Font.BOLD, 16));
		lblNewLabel100r_2.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		lblNewLabel100r_2.setBackground(Color.WHITE);
		lblNewLabel100r_2.setBounds(48, 228, 67, 31);
		contentPane.add(lblNewLabel100r_2);
		
		JLabel lblNewLabel_5_1_2 = new JLabel("PHP 49.00");
		lblNewLabel_5_1_2.setForeground(Color.WHITE);
		lblNewLabel_5_1_2.setFont(new Font("Leelawadee UI", Font.BOLD, 16));
		lblNewLabel_5_1_2.setBounds(243, 233, 86, 20);
		contentPane.add(lblNewLabel_5_1_2);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(528, 236, 44, 20);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(699, 236, 60, 20);
		contentPane.add(textField_7);
		
		JLabel lblNewLabel100r_3 = new JLabel("100");
		lblNewLabel100r_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel100r_3.setForeground(Color.WHITE);
		lblNewLabel100r_3.setFont(new Font("Leelawadee UI", Font.BOLD, 16));
		lblNewLabel100r_3.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		lblNewLabel100r_3.setBackground(Color.WHITE);
		lblNewLabel100r_3.setBounds(48, 270, 67, 31);
		contentPane.add(lblNewLabel100r_3);
		
		JLabel lblNewLabel_5_1_3 = new JLabel("PHP 49.00");
		lblNewLabel_5_1_3.setForeground(Color.WHITE);
		lblNewLabel_5_1_3.setFont(new Font("Leelawadee UI", Font.BOLD, 16));
		lblNewLabel_5_1_3.setBounds(243, 275, 86, 20);
		contentPane.add(lblNewLabel_5_1_3);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(528, 278, 44, 20);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(699, 278, 60, 20);
		contentPane.add(textField_9);
		
		JLabel lblNewLabel100r_4 = new JLabel("100");
		lblNewLabel100r_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel100r_4.setForeground(Color.WHITE);
		lblNewLabel100r_4.setFont(new Font("Leelawadee UI", Font.BOLD, 16));
		lblNewLabel100r_4.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		lblNewLabel100r_4.setBackground(Color.WHITE);
		lblNewLabel100r_4.setBounds(48, 312, 67, 31);
		contentPane.add(lblNewLabel100r_4);
		
		JLabel lblNewLabel_5_1_4 = new JLabel("PHP 49.00");
		lblNewLabel_5_1_4.setForeground(Color.WHITE);
		lblNewLabel_5_1_4.setFont(new Font("Leelawadee UI", Font.BOLD, 16));
		lblNewLabel_5_1_4.setBounds(243, 317, 86, 20);
		contentPane.add(lblNewLabel_5_1_4);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(528, 320, 44, 20);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(699, 320, 60, 20);
		contentPane.add(textField_11);
		
		JLabel lblNewLabel100r_5 = new JLabel("100");
		lblNewLabel100r_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel100r_5.setForeground(Color.WHITE);
		lblNewLabel100r_5.setFont(new Font("Leelawadee UI", Font.BOLD, 16));
		lblNewLabel100r_5.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		lblNewLabel100r_5.setBackground(Color.WHITE);
		lblNewLabel100r_5.setBounds(48, 354, 67, 31);
		contentPane.add(lblNewLabel100r_5);
		
		JLabel lblNewLabel_5_1_5 = new JLabel("PHP 49.00");
		lblNewLabel_5_1_5.setForeground(Color.WHITE);
		lblNewLabel_5_1_5.setFont(new Font("Leelawadee UI", Font.BOLD, 16));
		lblNewLabel_5_1_5.setBounds(243, 359, 86, 20);
		contentPane.add(lblNewLabel_5_1_5);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(528, 362, 44, 20);
		contentPane.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(699, 362, 60, 20);
		contentPane.add(textField_13);
		
		JLabel lblNewLabel100r_6 = new JLabel("100");
		lblNewLabel100r_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel100r_6.setForeground(Color.WHITE);
		lblNewLabel100r_6.setFont(new Font("Leelawadee UI", Font.BOLD, 16));
		lblNewLabel100r_6.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		lblNewLabel100r_6.setBackground(Color.WHITE);
		lblNewLabel100r_6.setBounds(48, 396, 67, 31);
		contentPane.add(lblNewLabel100r_6);
		
		JLabel lblNewLabel_5_1_6 = new JLabel("PHP 49.00");
		lblNewLabel_5_1_6.setForeground(Color.WHITE);
		lblNewLabel_5_1_6.setFont(new Font("Leelawadee UI", Font.BOLD, 16));
		lblNewLabel_5_1_6.setBounds(243, 401, 86, 20);
		contentPane.add(lblNewLabel_5_1_6);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(528, 404, 44, 20);
		contentPane.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(699, 404, 60, 20);
		contentPane.add(textField_15);
		
		JLabel lblNewLabel100r_7 = new JLabel("100");
		lblNewLabel100r_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel100r_7.setForeground(Color.WHITE);
		lblNewLabel100r_7.setFont(new Font("Leelawadee UI", Font.BOLD, 16));
		lblNewLabel100r_7.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		lblNewLabel100r_7.setBackground(Color.WHITE);
		lblNewLabel100r_7.setBounds(48, 438, 67, 31);
		contentPane.add(lblNewLabel100r_7);
		
		JLabel lblNewLabel_5_1_7 = new JLabel("PHP 49.00");
		lblNewLabel_5_1_7.setForeground(Color.WHITE);
		lblNewLabel_5_1_7.setFont(new Font("Leelawadee UI", Font.BOLD, 16));
		lblNewLabel_5_1_7.setBounds(243, 443, 86, 20);
		contentPane.add(lblNewLabel_5_1_7);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(528, 446, 44, 20);
		contentPane.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(699, 446, 60, 20);
		contentPane.add(textField_17);
		
		JLabel lblNewLabel100r_8 = new JLabel("100");
		lblNewLabel100r_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel100r_8.setForeground(Color.WHITE);
		lblNewLabel100r_8.setFont(new Font("Leelawadee UI", Font.BOLD, 16));
		lblNewLabel100r_8.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		lblNewLabel100r_8.setBackground(Color.WHITE);
		lblNewLabel100r_8.setBounds(48, 480, 67, 31);
		contentPane.add(lblNewLabel100r_8);
		
		JLabel lblNewLabel_5_1_8 = new JLabel("PHP 49.00");
		lblNewLabel_5_1_8.setForeground(Color.WHITE);
		lblNewLabel_5_1_8.setFont(new Font("Leelawadee UI", Font.BOLD, 16));
		lblNewLabel_5_1_8.setBounds(243, 485, 86, 20);
		contentPane.add(lblNewLabel_5_1_8);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(528, 488, 44, 20);
		contentPane.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(699, 488, 60, 20);
		contentPane.add(textField_19);
		
		JLabel lblNewLabel100r_9 = new JLabel("100");
		lblNewLabel100r_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel100r_9.setForeground(Color.WHITE);
		lblNewLabel100r_9.setFont(new Font("Leelawadee UI", Font.BOLD, 16));
		lblNewLabel100r_9.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		lblNewLabel100r_9.setBackground(Color.WHITE);
		lblNewLabel100r_9.setBounds(48, 522, 67, 31);
		contentPane.add(lblNewLabel100r_9);
		
		JLabel lblNewLabel_5_1_9 = new JLabel("PHP 49.00");
		lblNewLabel_5_1_9.setForeground(Color.WHITE);
		lblNewLabel_5_1_9.setFont(new Font("Leelawadee UI", Font.BOLD, 16));
		lblNewLabel_5_1_9.setBounds(243, 527, 86, 20);
		contentPane.add(lblNewLabel_5_1_9);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(528, 530, 44, 20);
		contentPane.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(699, 530, 60, 20);
		contentPane.add(textField_21);
		
		JButton btnIdentify_1 = new JButton(">");
		btnIdentify_1.setHorizontalTextPosition(SwingConstants.CENTER);
		btnIdentify_1.setForeground(Color.WHITE);
		btnIdentify_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnIdentify_1.setBorder(null);
		btnIdentify_1.setBackground(Color.RED);
		btnIdentify_1.setBounds(727, 592, 44, 31);
		contentPane.add(btnIdentify_1);
		
		JButton btnIdentify_1_1 = new JButton("<");
		btnIdentify_1_1.setHorizontalTextPosition(SwingConstants.CENTER);
		btnIdentify_1_1.setForeground(Color.WHITE);
		btnIdentify_1_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnIdentify_1_1.setBorder(null);
		btnIdentify_1_1.setBackground(Color.RED);
		btnIdentify_1_1.setBounds(673, 592, 44, 31);
		contentPane.add(btnIdentify_1_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("© All rights reserved. Roblox, 2023.");
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblNewLabel_3_1.setBounds(257, 698, 331, 35);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\Ernest\\eclipse-workspace\\SecondSemester\\img\\icons8-roblox-48.png"));
		lblNewLabel_6.setBounds(324, 649, 60, 51);
		contentPane.add(lblNewLabel_6);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setHorizontalTextPosition(SwingConstants.CENTER);
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnLogin.setBorder(null);
		btnLogin.setBackground(Color.RED);
		btnLogin.setBounds(673, 634, 98, 20);
		contentPane.add(btnLogin);
		
		JButton btnMenu = new JButton("Menu");
		btnMenu.setHorizontalTextPosition(SwingConstants.CENTER);
		btnMenu.setForeground(Color.WHITE);
		btnMenu.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnMenu.setBorder(null);
		btnMenu.setBackground(Color.RED);
		btnMenu.setBounds(673, 663, 98, 20);
		contentPane.add(btnMenu);
	}
}
