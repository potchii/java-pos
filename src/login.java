import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.SwingConstants;
import java.awt.Insets;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField txtEmail;
	private JLabel lblNewLabel_2;
	private JPasswordField passwordField;
	private JLabel lblNewLabel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setTitle("Roblox");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Ernest\\eclipse-workspace\\SecondSemester\\img\\icons8-roblox-48.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 244, 457);
		contentPane = new JPanel();
		contentPane.setFont(new Font("Segoe UI", Font.BOLD, 18));
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBackground(new Color(23, 25, 30));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sign in to");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
		lblNewLabel.setBounds(23, 132, 110, 67);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Roblox");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 24));
		lblNewLabel_1.setBounds(23, 170, 126, 39);
		contentPane.add(lblNewLabel_1);
		
		txtEmail = new JTextField();
		txtEmail.setMargin(new Insets(2, 4, 2, 2));
		txtEmail.setText("Username");
		txtEmail.setForeground(new Color(192, 192, 192));
		txtEmail.setBounds(23, 210, 147, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Ernest\\eclipse-workspace\\SecondSemester\\img\\icons8-roblox-48.png"));
		lblNewLabel_2.setBounds(66, 83, 63, 65);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userName = txtEmail.getText();
				String password = passwordField.getText(); // this gives a warning but it works
				if(userName.contains("admin") && password.contains("Admin123")) { // to-do : add more users, atleast 2
				menu main = new menu();
				main.setVisible(true);
				JOptionPane.showMessageDialog(contentPane, "Logged in as Admin.", "Login Authenticated", JOptionPane.PLAIN_MESSAGE);
				}
				else if (userName.contains("user") && password.contains("1234")) {
					menu main = new menu();
					main.setVisible(true);
					JOptionPane.showMessageDialog(contentPane, "Logged in as Admin.", "Login Authenticated", JOptionPane.PLAIN_MESSAGE);
				}
				else if (userName.contains("Admin") && password.contains("123456789")) {
					menu main = new menu();
					main.setVisible(true);
					JOptionPane.showMessageDialog(contentPane, "Logged in as Admin.", "Login Authenticated", JOptionPane.PLAIN_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(contentPane, "Invalid details", "Error", JOptionPane.ERROR_MESSAGE);
				}
 			}
		});
		btnNewButton.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(255, 0, 0));
		btnNewButton.setBorder(null);
		btnNewButton.setBounds(81, 297, 89, 23);
		contentPane.add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(23, 254, 147, 20);
		contentPane.add(passwordField);
		
		lblNewLabel_3 = new JLabel("© All rights reserved. Roblox, 2023.");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.PLAIN, 10));
		lblNewLabel_3.setBounds(23, 381, 189, 14);
		contentPane.add(lblNewLabel_3);
		
	}
}
