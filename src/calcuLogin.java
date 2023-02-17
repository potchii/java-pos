import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.border.MatteBorder;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Cursor;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calcuLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JPasswordField passwordField;
	private JLabel lblNewLabel_4;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calcuLogin frame = new calcuLogin();
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
	public calcuLogin() {
		setTitle("Login Page");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Ernest\\eclipse-workspace\\SecondSemester\\img\\icons8-laptop-coding-100.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 295, 544);
		contentPane = new JPanel();
		contentPane.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		contentPane.setBackground(new Color(23, 25, 30));
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Ernest\\eclipse-workspace\\SecondSemester\\img\\icons8-laptop-coding-64.png"));
		lblNewLabel.setBounds(99, 100, 69, 91);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("L O G I N");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Leelawadee UI", Font.BOLD, 20));
		lblNewLabel_1.setBounds(92, 191, 100, 27);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		textField.setBackground(new Color(23, 25, 30));
		textField.setMargin(new Insets(2, 4, 2, 2));
		textField.setForeground(new Color(255, 255, 255));
		textField.setColumns(10);
		textField.setBounds(62, 253, 147, 20);
		contentPane.add(textField);
		
		lblNewLabel_2 = new JLabel("Username");
		lblNewLabel_2.setFont(new Font("Leelawadee UI", Font.BOLD, 14));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(62, 229, 69, 14);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Password");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Leelawadee UI", Font.BOLD, 14));
		lblNewLabel_3.setBounds(62, 284, 69, 14);
		contentPane.add(lblNewLabel_3);
		
		passwordField = new JPasswordField();
		passwordField.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		passwordField.setBackground(new Color(23, 25, 30));
		passwordField.setBounds(62, 311, 147, 20);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("SIGN IN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userName = textField.getText();
				String password = passwordField.getText();
				if ((userName.contains("admin") && password.contains("Admin123")) ||
				    (userName.contains("user") && password.contains("1234")) ||
				    (userName.contains("Admin") && password.contains("123456789"))) {
				    menu main = new menu();
				    main.setVisible(true);
				    JOptionPane.showMessageDialog(contentPane, "Logged in as Admin.", "Login Authenticated", JOptionPane.PLAIN_MESSAGE);
				    // dispose the current frame
				    dispose();
				} else {
				    JOptionPane.showMessageDialog(contentPane, "Invalid details", "Error", JOptionPane.ERROR_MESSAGE);
				}


			}
		});
		btnNewButton.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton.setForeground(new Color(23, 25, 30));
		btnNewButton.setBorder(null);
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnNewButton.setFont(new Font("Leelawadee UI", Font.BOLD, 12));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(62, 354, 147, 41);
		contentPane.add(btnNewButton);
		
		lblNewLabel_4 = new JLabel("© potchi.tech, 2023.");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Leelawadee UI", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(80, 457, 110, 14);
		contentPane.add(lblNewLabel_4);
		
		label = new JLabel("New label");
		label.setBounds(60, 368, 46, 14);
		contentPane.add(label);
		
		JLabel lblNewLabel_4_1 = new JLabel("Programmed by: Ernest Benitez");
		lblNewLabel_4_1.setForeground(Color.WHITE);
		lblNewLabel_4_1.setFont(new Font("Leelawadee UI", Font.PLAIN, 12));
		lblNewLabel_4_1.setBounds(59, 432, 165, 14);
		contentPane.add(lblNewLabel_4_1);
		
		
	}
}
