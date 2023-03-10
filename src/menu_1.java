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
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import javax.swing.border.BevelBorder;
import java.awt.ComponentOrientation;
import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class menu_1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu frame = new menu();
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
	public menu_1() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Ernest\\eclipse-workspace\\SecondSemester\\img\\icons8-roblox-48.png"));
		setTitle("Roblox - Pricing");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 891, 801);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(23, 25, 30));
		contentPane.setBorder(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setForeground(new Color(255, 255, 255));
		panel.setBorder(new MatteBorder(2, 0, 2, 0, (Color) new Color(0, 0, 0)));
		panel.setBounds(64, 116, 723, 7);
		contentPane.add(panel);
		
		JLabel lblNewLabel699 = new JLabel("PHP 699.00");
		lblNewLabel699.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel699.setForeground(Color.WHITE);
		lblNewLabel699.setFont(new Font("Leelawadee UI", Font.BOLD, 20));
		lblNewLabel699.setBounds(80, 145, 119, 49);
		contentPane.add(lblNewLabel699);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("750");
		lblNewLabel_1_1_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1_1_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		lblNewLabel_1_1_1.setIcon(new ImageIcon("C:\\Users\\Ernest\\eclipse-workspace\\SecondSemester\\img\\icons8-robux-24.png"));
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Leelawadee UI", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBounds(320, 145, 119, 49);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Robux Packages");
		lblNewLabel_1_2.setHorizontalTextPosition(SwingConstants.LEFT);
		lblNewLabel_1_2.setIcon(null);
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Leelawadee UI", Font.PLAIN, 18));
		lblNewLabel_1_2.setBounds(298, 67, 182, 49);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Subscribe 'n Get More");
		lblNewLabel_1_2_1.setIcon(new ImageIcon("C:\\Users\\Ernest\\eclipse-workspace\\SecondSemester\\img\\icons8-question-mark-sign-for-help-and-support-section-12.png"));
		lblNewLabel_1_2_1.setHorizontalTextPosition(SwingConstants.LEFT);
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1.setFont(new Font("Leelawadee UI", Font.PLAIN, 18));
		lblNewLabel_1_2_1.setBounds(554, 67, 217, 49);
		contentPane.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("N/A");
		lblNewLabel_1_1_2.setIcon(null);
		lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_2.setFont(new Font("Leelawadee UI", Font.BOLD, 20));
		lblNewLabel_1_1_2.setBounds(576, 145, 151, 49);
		contentPane.add(lblNewLabel_1_1_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(Color.WHITE);
		panel_1.setBorder(new MatteBorder(2, 0, 2, 0, (Color) new Color(0, 0, 0)));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(64, 205, 723, 7);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("PHP 999.00");
		lblNewLabel_1_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_1_3.setFont(new Font("Leelawadee UI", Font.BOLD, 20));
		lblNewLabel_1_1_3.setBounds(80, 234, 119, 49);
		contentPane.add(lblNewLabel_1_1_3);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("1,200");
		lblNewLabel_1_1_1_1.setIcon(new ImageIcon("C:\\Users\\Ernest\\eclipse-workspace\\SecondSemester\\img\\icons8-robux-24.png"));
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1.setFont(new Font("Leelawadee UI", Font.BOLD, 20));
		lblNewLabel_1_1_1_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		lblNewLabel_1_1_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1_1_1.setBounds(320, 234, 119, 49);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("1,600/month");
		lblNewLabel_1_1_2_1.setIcon(new ImageIcon("C:\\Users\\Ernest\\eclipse-workspace\\SecondSemester\\img\\icons8-robuxwhite-24.png"));
		lblNewLabel_1_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_2_1.setFont(new Font("Leelawadee UI", Font.BOLD, 20));
		lblNewLabel_1_1_2_1.setBounds(576, 234, 157, 49);
		contentPane.add(lblNewLabel_1_1_2_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setForeground(Color.WHITE);
		panel_1_1.setBorder(new MatteBorder(2, 0, 2, 0, (Color) new Color(0, 0, 0)));
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBounds(64, 294, 723, 7);
		contentPane.add(panel_1_1);
		
		JLabel lblNewLabel_1_1_3_1 = new JLabel("PHP 1,299.00");
		lblNewLabel_1_1_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_3_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_3_1.setFont(new Font("Leelawadee UI", Font.BOLD, 20));
		lblNewLabel_1_1_3_1.setBounds(80, 323, 126, 49);
		contentPane.add(lblNewLabel_1_1_3_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("1,500");
		lblNewLabel_1_1_1_1_1.setIcon(new ImageIcon("C:\\Users\\Ernest\\eclipse-workspace\\SecondSemester\\img\\icons8-robux-24.png"));
		lblNewLabel_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_1.setFont(new Font("Leelawadee UI", Font.BOLD, 20));
		lblNewLabel_1_1_1_1_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		lblNewLabel_1_1_1_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1_1_1_1.setBounds(320, 323, 119, 49);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_2_1_1 = new JLabel("N/A");
		lblNewLabel_1_1_2_1_1.setIcon(null);
		lblNewLabel_1_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_2_1_1.setFont(new Font("Leelawadee UI", Font.BOLD, 20));
		lblNewLabel_1_1_2_1_1.setBounds(576, 323, 151, 49);
		contentPane.add(lblNewLabel_1_1_2_1_1);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setForeground(Color.WHITE);
		panel_1_1_1.setBorder(new MatteBorder(2, 0, 2, 0, (Color) new Color(0, 0, 0)));
		panel_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1.setBounds(64, 383, 723, 7);
		contentPane.add(panel_1_1_1);
		
		JLabel lblNewLabel_1_1_3_1_1 = new JLabel("PHP 1,699.00");
		lblNewLabel_1_1_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_3_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_3_1_1.setFont(new Font("Leelawadee UI", Font.BOLD, 20));
		lblNewLabel_1_1_3_1_1.setBounds(80, 412, 126, 49);
		contentPane.add(lblNewLabel_1_1_3_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("2,000");
		lblNewLabel_1_1_1_1_1_1.setIcon(new ImageIcon("C:\\Users\\Ernest\\eclipse-workspace\\SecondSemester\\img\\icons8-robux-24.png"));
		lblNewLabel_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Leelawadee UI", Font.BOLD, 20));
		lblNewLabel_1_1_1_1_1_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		lblNewLabel_1_1_1_1_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1_1_1_1_1.setBounds(320, 412, 119, 49);
		contentPane.add(lblNewLabel_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_2_1_1_1 = new JLabel("N/A");
		lblNewLabel_1_1_2_1_1_1.setIcon(null);
		lblNewLabel_1_1_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_2_1_1_1.setFont(new Font("Leelawadee UI", Font.BOLD, 20));
		lblNewLabel_1_1_2_1_1_1.setBounds(576, 412, 151, 49);
		contentPane.add(lblNewLabel_1_1_2_1_1_1);
		
		JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setForeground(Color.WHITE);
		panel_1_1_1_1.setBorder(new MatteBorder(2, 0, 2, 0, (Color) new Color(0, 0, 0)));
		panel_1_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1_1.setBounds(64, 472, 723, 7);
		contentPane.add(panel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_3_1_1_1 = new JLabel("PHP 1,999.00");
		lblNewLabel_1_1_3_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_3_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_3_1_1_1.setFont(new Font("Leelawadee UI", Font.BOLD, 20));
		lblNewLabel_1_1_3_1_1_1.setBounds(80, 501, 126, 49);
		contentPane.add(lblNewLabel_1_1_3_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("2,500");
		lblNewLabel_1_1_1_1_1_1_1.setIcon(new ImageIcon("C:\\Users\\Ernest\\eclipse-workspace\\SecondSemester\\img\\icons8-robux-24.png"));
		lblNewLabel_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Leelawadee UI", Font.BOLD, 20));
		lblNewLabel_1_1_1_1_1_1_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		lblNewLabel_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1_1_1_1_1_1.setBounds(320, 501, 119, 49);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_2_1_1_1_1 = new JLabel("N/A");
		lblNewLabel_1_1_2_1_1_1_1.setIcon(null);
		lblNewLabel_1_1_2_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_2_1_1_1_1.setFont(new Font("Leelawadee UI", Font.BOLD, 20));
		lblNewLabel_1_1_2_1_1_1_1.setBounds(576, 501, 151, 49);
		contentPane.add(lblNewLabel_1_1_2_1_1_1_1);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Buy Robux");
		lblNewLabel_1_2_2.setIcon(new ImageIcon("C:\\Users\\Ernest\\eclipse-workspace\\SecondSemester\\img\\icons8-roblox-48.png"));
		lblNewLabel_1_2_2.setHorizontalTextPosition(SwingConstants.RIGHT);
		lblNewLabel_1_2_2.setForeground(Color.WHITE);
		lblNewLabel_1_2_2.setFont(new Font("Leelawadee UI", Font.PLAIN, 18));
		lblNewLabel_1_2_2.setBounds(64, 66, 182, 49);
		contentPane.add(lblNewLabel_1_2_2);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setForeground(Color.WHITE);
		panel_1_2.setBorder(new MatteBorder(2, 0, 2, 0, (Color) new Color(0, 0, 0)));
		panel_1_2.setBackground(Color.WHITE);
		panel_1_2.setBounds(64, 561, 723, 7);
		contentPane.add(panel_1_2);
		
		JLabel lblNewLabel_1_1_3_2 = new JLabel("PHP 2,149.00");
		lblNewLabel_1_1_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_3_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_3_2.setFont(new Font("Leelawadee UI", Font.BOLD, 20));
		lblNewLabel_1_1_3_2.setBounds(80, 590, 126, 49);
		contentPane.add(lblNewLabel_1_1_3_2);
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("2,750");
		lblNewLabel_1_1_1_1_2.setIcon(new ImageIcon("C:\\Users\\Ernest\\eclipse-workspace\\SecondSemester\\img\\icons8-robux-24.png"));
		lblNewLabel_1_1_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_2.setFont(new Font("Leelawadee UI", Font.BOLD, 20));
		lblNewLabel_1_1_1_1_2.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		lblNewLabel_1_1_1_1_2.setBackground(Color.WHITE);
		lblNewLabel_1_1_1_1_2.setBounds(320, 590, 119, 49);
		contentPane.add(lblNewLabel_1_1_1_1_2);
		
		JLabel lblNewLabel_1_1_2_1_2 = new JLabel("N/A");
		lblNewLabel_1_1_2_1_2.setIcon(null);
		lblNewLabel_1_1_2_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_2_1_2.setFont(new Font("Leelawadee UI", Font.BOLD, 20));
		lblNewLabel_1_1_2_1_2.setBounds(576, 590, 157, 49);
		contentPane.add(lblNewLabel_1_1_2_1_2);
		
		JButton btnIdentify_1_1 = new JButton("<");
		btnIdentify_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu main = new menu();
				main.setVisible(true);
			}
		});
		btnIdentify_1_1.setHorizontalTextPosition(SwingConstants.CENTER);
		btnIdentify_1_1.setForeground(Color.WHITE);
		btnIdentify_1_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnIdentify_1_1.setBorder(null);
		btnIdentify_1_1.setBackground(Color.RED);
		btnIdentify_1_1.setBounds(689, 668, 44, 31);
		contentPane.add(btnIdentify_1_1);
		
		JButton btnIdentify_1 = new JButton(">");
		btnIdentify_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu_2 main = new menu_2();
				main.setVisible(true);
			}
		});
		btnIdentify_1.setHorizontalTextPosition(SwingConstants.CENTER);
		btnIdentify_1.setForeground(Color.WHITE);
		btnIdentify_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnIdentify_1.setBorder(null);
		btnIdentify_1.setBackground(Color.RED);
		btnIdentify_1.setBounds(743, 668, 44, 31);
		contentPane.add(btnIdentify_1);
	}
}
