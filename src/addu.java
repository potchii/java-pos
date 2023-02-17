import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Color;

public class addu extends JFrame {

	private JPanel contentPane;
	private JTextField txtnum1;
	private JTextField txtnum2;
	private JTextField textFieldans;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addu frame = new addu();
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
	public addu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtnum1 = new JTextField();
		txtnum1.setBackground(new Color(255, 128, 192));
		txtnum1.setBounds(49, 60, 150, 39);
		contentPane.add(txtnum1);
		txtnum1.setColumns(10);
		
		txtnum2 = new JTextField();
		txtnum2.setBackground(new Color(255, 128, 192));
		txtnum2.setBounds(245, 60, 150, 39);
		contentPane.add(txtnum2);
		txtnum2.setColumns(10);
		
		JButton BTNPlus = new JButton("+");
		BTNPlus.setBackground(new Color(255, 128, 128));
		BTNPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int total;
				int num1 = Integer.parseInt(txtnum1.getText());
				int num2 = Integer.parseInt(txtnum2.getText());
				total = num1 + num2;
				textFieldans.setText(Integer.toString(total));
				
							}
		});
		BTNPlus.setBounds(179, 105, 85, 21);
		contentPane.add(BTNPlus);
		
		JButton btnmnus = new JButton("-");
		btnmnus.setBackground(new Color(255, 128, 128));
		btnmnus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double total1;
				double num3 = Integer.parseInt(txtnum1.getText());
				double num4 = Integer.parseInt(txtnum2.getText());
				total1 = num3 - num4;
				textFieldans.setText(Double.toString(total1));				
			}
		});
		btnmnus.setBounds(179, 136, 85, 21);
		contentPane.add(btnmnus);
		
		JButton btnNewButton_2 = new JButton("*");
		btnNewButton_2.setBackground(new Color(255, 128, 128));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double total2;
				double num5 = Integer.parseInt(txtnum1.getText());
				double num6 = Integer.parseInt(txtnum1.getText());
				total2 = num5 * num6;
				textFieldans.setText(Double.toString(total2));				
			}
		});
		btnNewButton_2.setBounds(179, 167, 85, 21);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("/");
		btnNewButton_3.setBackground(new Color(255, 128, 128));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double total3;
				double num7 = Integer.parseInt(txtnum1.getText());
				double num8 = Integer.parseInt(txtnum1.getText());
				total3 = num7 - num8;
				textFieldans.setText(Double.toString(total3));				
			}
		});
		btnNewButton_3.setBounds(179, 198, 85, 21);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("Number 1:");
		lblNewLabel.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		lblNewLabel.setBounds(49, 46, 72, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Number 2:");
		lblNewLabel_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(245, 46, 61, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(">> Calculator Program <<");
		lblNewLabel_2.setFont(new Font("Snap ITC", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(107, 10, 214, 13);
		contentPane.add(lblNewLabel_2);
		
		textFieldans = new JTextField();
		textFieldans.setBackground(new Color(128, 128, 255));
		textFieldans.setBounds(215, 231, 142, 25);
		contentPane.add(textFieldans);
		textFieldans.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("The Answer is:");
		lblNewLabel_3.setFont(new Font("Stencil", Font.ITALIC, 13));
		lblNewLabel_3.setBounds(95, 229, 115, 31);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("EXIT");
		btnNewButton.setBackground(new Color(128, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ExitFrame Exit = new ExitFrame();
				Exit.setVisible(true);
			}
		});
		btnNewButton.setBounds(310, 136, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("MENU");
		btnNewButton_1.setBackground(new Color(128, 255, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenuFrame menu = new MainMenuFrame();
				menu.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(310, 167, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_4 = new JButton("PayRoll System");
		btnNewButton_4.setBackground(new Color(128, 255, 128));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setBounds(30, 136, 120, 31);
		contentPane.add(btnNewButton_4);
	}
}