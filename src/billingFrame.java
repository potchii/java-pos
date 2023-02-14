import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class billingFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txtid;
	private JTextField txt1st;
	private JTextField txt2nd;
	private JTextField esspresso1;
	private JTextField espresso2;
	private JTextField espresso3;
	private JTextField espresso4;
	private JTextField espresso5;
	private JTextField frp1;
	private JTextField frp2;
	private JTextField frp3;
	private JTextField frp4;
	private JTextField frp5;
	private JTextField tea1;
	private JTextField tea2;
	private JTextField tea3;
	private JTextField tea4;
	private JTextField tea5;
	private JTextField dssrt1;
	private JTextField dssrt2;
	private JTextField dssrt3;
	private JTextField dssrt4;
	private JTextField dssrt5;
	private JTextField espresso1_1;
	private JTextField espresso2_2;
	private JTextField espresso3_3;
	private JTextField espresso4_4;
	private JTextField espresso5_5;
	private JTextField frp1_1;
	private JTextField frp2_2;
	private JTextField frp3_3;
	private JTextField frp4_4;
	private JTextField frp5_5;
	private JTextField tea1_1;
	private JTextField tea2_2;
	private JTextField tea3_3;
	private JTextField tea4_4;
	private JTextField tea5_5;
	private JTextField dssrt1_1;
	private JTextField dssrt2_2;
	private JTextField dssrt3_3;
	private JTextField dssrt4_4;
	private JTextField dssrt5_5;
	private JTextField taxfield;
	private JTextField txttotaltax;
	private JTextField txttotal;

	/**
	 * Launch the application.
	 */
	
			
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					billingFrame frame = new billingFrame();
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
	public billingFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 775, 775);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 218, 185));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(244, 164, 96));
		panel.setBounds(34, 48, 705, 78);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Customer ID:");
		lblNewLabel.setFont(new Font("Microsoft Himalaya", Font.PLAIN, 20));
		lblNewLabel.setBounds(23, 10, 115, 21);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First Name:");
		lblNewLabel_1.setFont(new Font("Microsoft Himalaya", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(23, 20, 100, 42);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("Last Name:");
		lblNewLabel_3.setFont(new Font("Microsoft Himalaya", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(23, 51, 92, 21);
		panel.add(lblNewLabel_3);
		
		txtid = new JTextField();
		txtid.setBounds(133, 9, 241, 19);
		panel.add(txtid);
		txtid.setColumns(10);
		
		txt1st = new JTextField();
		txt1st.setEditable(false);
		txt1st.setEnabled(false);
		txt1st.setColumns(10);
		txt1st.setBounds(133, 30, 241, 19);
		panel.add(txt1st);
		
		txt2nd = new JTextField();
		txt2nd.setEnabled(false);
		txt2nd.setEditable(false);
		txt2nd.setColumns(10);
		txt2nd.setBounds(133, 50, 241, 19);
		panel.add(txt2nd);
		
		JLabel lblNewLabel_1_1 = new JLabel("Date:");
		lblNewLabel_1_1.setFont(new Font("Microsoft Himalaya", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(508, 10, 100, 42);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Time:");
		lblNewLabel_1_2.setFont(new Font("Microsoft Himalaya", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(508, 40, 100, 42);
		panel.add(lblNewLabel_1_2);
		
		JButton btnIdentify = new JButton("Identify");
		btnIdentify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name1 = txt1st.getText();
				String name2 = txt2nd.getText();
				String nameId= txtid.getText();
				
				if(nameId.contains("101")) {
					txt1st.setText("Moncito Glenn");
					txt2nd.setText("Hernandez");
				}
				else if (nameId.contains("102")) {
					txt1st.setText("Princess Arleen");
					txt2nd.setText("Zamora");
				}
				else if (nameId.contains("103")) {
					txt1st.setText("Lex");
					txt2nd.setText("Sabino");
				}
				else if (nameId.contains("104")) {
					txt1st.setText("Ernestine Gene");
					txt2nd.setText("Benitez");
				}
				else {
					txt1st.setText("INVALID NAME!");
					txt2nd.setText("INVALID SURNAME!");
				}
			
			}
		
		});
		btnIdentify.setFont(new Font("Stencil", Font.PLAIN, 15));
		btnIdentify.setBackground(new Color(222, 184, 135));
		btnIdentify.setBounds(384, 17, 102, 47);
		panel.add(btnIdentify);
		
		JPanel te = new JPanel();
		te.setBackground(new Color(244, 164, 96));
		te.setBounds(34, 148, 705, 449);
		contentPane.add(te);
		te.setLayout(null);
		
		JLabel lblNewLabel_1_4 = new JLabel("Espresso:");
		lblNewLabel_1_4.setFont(new Font("Microsoft Himalaya", Font.BOLD, 20));
		lblNewLabel_1_4.setBounds(23, 15, 154, 16);
		te.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Espresso Shot");
		lblNewLabel_1_4_1.setFont(new Font("Microsoft Himalaya", Font.PLAIN, 20));
		lblNewLabel_1_4_1.setBounds(22, 28, 100, 21);
		te.add(lblNewLabel_1_4_1);
		
		JLabel lblNewLabel_1_4_2 = new JLabel("Espresso Macchiato");
		lblNewLabel_1_4_2.setFont(new Font("Microsoft Himalaya", Font.PLAIN, 20));
		lblNewLabel_1_4_2.setBounds(22, 41, 118, 26);
		te.add(lblNewLabel_1_4_2);
		
		JLabel lblNewLabel_1_4_3 = new JLabel("Espresso Con Panna");
		lblNewLabel_1_4_3.setFont(new Font("Microsoft Himalaya", Font.PLAIN, 20));
		lblNewLabel_1_4_3.setBounds(22, 59, 155, 21);
		te.add(lblNewLabel_1_4_3);
		
		JLabel lblNewLabel_1_4_4 = new JLabel("Flat White");
		lblNewLabel_1_4_4.setFont(new Font("Microsoft Himalaya", Font.PLAIN, 20));
		lblNewLabel_1_4_4.setBounds(22, 77, 100, 16);
		te.add(lblNewLabel_1_4_4);
		
		JLabel lblNewLabel_1_4_5 = new JLabel("Cafe Misto");
		lblNewLabel_1_4_5.setFont(new Font("Microsoft Himalaya", Font.PLAIN, 20));
		lblNewLabel_1_4_5.setBounds(22, 90, 100, 21);
		te.add(lblNewLabel_1_4_5);
		
		JLabel lblNewLabel_1_4_6 = new JLabel("Teas & Refreshers:");
		lblNewLabel_1_4_6.setFont(new Font("Microsoft Himalaya", Font.BOLD, 20));
		lblNewLabel_1_4_6.setBounds(22, 227, 155, 21);
		te.add(lblNewLabel_1_4_6);
		
		JLabel lblNewLabel_1_4_6_1 = new JLabel("Frappucino:");
		lblNewLabel_1_4_6_1.setFont(new Font("Microsoft Himalaya", Font.BOLD, 20));
		lblNewLabel_1_4_6_1.setBounds(22, 121, 100, 16);
		te.add(lblNewLabel_1_4_6_1);
		
		JLabel lblNewLabel_1_4_6_2 = new JLabel("Coffe Jelly Frappucino");
		lblNewLabel_1_4_6_2.setFont(new Font("Microsoft Himalaya", Font.PLAIN, 20));
		lblNewLabel_1_4_6_2.setBounds(22, 134, 141, 34);
		te.add(lblNewLabel_1_4_6_2);
		
		JLabel lblNewLabel_1_4_6_3 = new JLabel("Java Chip Frappucino");
		lblNewLabel_1_4_6_3.setFont(new Font("Microsoft Himalaya", Font.PLAIN, 20));
		lblNewLabel_1_4_6_3.setBounds(22, 147, 155, 39);
		te.add(lblNewLabel_1_4_6_3);
		
		JLabel lblNewLabel_1_4_6_4 = new JLabel("Triple Mocha Frappucino");
		lblNewLabel_1_4_6_4.setFont(new Font("Microsoft Himalaya", Font.PLAIN, 20));
		lblNewLabel_1_4_6_4.setBounds(22, 165, 141, 33);
		te.add(lblNewLabel_1_4_6_4);
		
		JLabel lblNewLabel_1_4_6_5 = new JLabel("Dark Caramel Frappucino");
		lblNewLabel_1_4_6_5.setFont(new Font("Microsoft Himalaya", Font.PLAIN, 20));
		lblNewLabel_1_4_6_5.setBounds(22, 178, 183, 39);
		te.add(lblNewLabel_1_4_6_5);
		
		JLabel lblNewLabel_1_4_6_6 = new JLabel("Tea");
		lblNewLabel_1_4_6_6.setFont(new Font("Microsoft Himalaya", Font.PLAIN, 20));
		lblNewLabel_1_4_6_6.setBounds(22, 248, 100, 21);
		te.add(lblNewLabel_1_4_6_6);
		
		JLabel lblNewLabel_1_4_6_7 = new JLabel("White Mocha Frappucino");
		lblNewLabel_1_4_6_7.setFont(new Font("Microsoft Himalaya", Font.PLAIN, 20));
		lblNewLabel_1_4_6_7.setBounds(22, 196, 141, 33);
		te.add(lblNewLabel_1_4_6_7);
		
		JLabel lblNewLabel_1_4_6_8 = new JLabel("Iced Shaken Hibiscus Tea");
		lblNewLabel_1_4_6_8.setFont(new Font("Microsoft Himalaya", Font.PLAIN, 20));
		lblNewLabel_1_4_6_8.setBounds(22, 274, 169, 26);
		te.add(lblNewLabel_1_4_6_8);
		
		JLabel lblNewLabel_1_4_6_9 = new JLabel("Iced Shaken Teas");
		lblNewLabel_1_4_6_9.setFont(new Font("Microsoft Himalaya", Font.PLAIN, 20));
		lblNewLabel_1_4_6_9.setBounds(23, 258, 100, 26);
		te.add(lblNewLabel_1_4_6_9);
		
		JLabel lblNewLabel_1_4_6_10 = new JLabel("Iced Shaken Black Tea");
		lblNewLabel_1_4_6_10.setFont(new Font("Microsoft Himalaya", Font.PLAIN, 20));
		lblNewLabel_1_4_6_10.setBounds(23, 294, 154, 21);
		te.add(lblNewLabel_1_4_6_10);
		
		JLabel lblNewLabel_1_4_6_11 = new JLabel("Blueberry Licious Cheesecake");
		lblNewLabel_1_4_6_11.setFont(new Font("Microsoft Himalaya", Font.PLAIN, 20));
		lblNewLabel_1_4_6_11.setBounds(23, 356, 182, 21);
		te.add(lblNewLabel_1_4_6_11);
		
		JLabel lblNewLabel_1_4_6_12 = new JLabel("Iced Vanilla Cold Foam");
		lblNewLabel_1_4_6_12.setFont(new Font("Microsoft Himalaya", Font.PLAIN, 20));
		lblNewLabel_1_4_6_12.setBounds(22, 310, 195, 21);
		te.add(lblNewLabel_1_4_6_12);
		
		JLabel lblNewLabel_1_4_6_13 = new JLabel("Banoffee Pie");
		lblNewLabel_1_4_6_13.setFont(new Font("Microsoft Himalaya", Font.PLAIN, 20));
		lblNewLabel_1_4_6_13.setBounds(22, 363, 100, 36);
		te.add(lblNewLabel_1_4_6_13);
		
		JLabel lblNewLabel_1_4_6_14 = new JLabel("Desserts & Pasta:");
		lblNewLabel_1_4_6_14.setFont(new Font("Microsoft Himalaya", Font.BOLD, 20));
		lblNewLabel_1_4_6_14.setBounds(22, 332, 155, 21);
		te.add(lblNewLabel_1_4_6_14);
		
		JLabel lblNewLabel_1_4_6_13_1 = new JLabel("Meatball Pasta");
		lblNewLabel_1_4_6_13_1.setFont(new Font("Microsoft Himalaya", Font.PLAIN, 20));
		lblNewLabel_1_4_6_13_1.setBounds(22, 383, 100, 34);
		te.add(lblNewLabel_1_4_6_13_1);
		
		JLabel lblNewLabel_1_4_6_13_2 = new JLabel("Penne Pesto with Mushroom");
		lblNewLabel_1_4_6_13_2.setFont(new Font("Microsoft Himalaya", Font.PLAIN, 20));
		lblNewLabel_1_4_6_13_2.setBounds(22, 395, 183, 42);
		te.add(lblNewLabel_1_4_6_13_2);
		
		JLabel lblNewLabel_1_4_6_13_3 = new JLabel("Plant-Based Classic Lasagna");
		lblNewLabel_1_4_6_13_3.setFont(new Font("Microsoft Himalaya", Font.PLAIN, 20));
		lblNewLabel_1_4_6_13_3.setBounds(22, 409, 195, 49);
		te.add(lblNewLabel_1_4_6_13_3);
		
		JLabel lblNewLabel_1_4_7 = new JLabel("Price:");
		lblNewLabel_1_4_7.setFont(new Font("Microsoft Himalaya", Font.BOLD, 20));
		lblNewLabel_1_4_7.setBounds(318, 15, 79, 16);
		te.add(lblNewLabel_1_4_7);
		
		JLabel lblNewLabel_1_4_7_1 = new JLabel("Quantity:");
		lblNewLabel_1_4_7_1.setFont(new Font("Microsoft Himalaya", Font.BOLD, 20));
		lblNewLabel_1_4_7_1.setBounds(436, 15, 100, 16);
		te.add(lblNewLabel_1_4_7_1);
		
		JLabel lblNewLabel_1_4_7_1_1 = new JLabel("Sub-Total:");
		lblNewLabel_1_4_7_1_1.setFont(new Font("Microsoft Himalaya", Font.BOLD, 20));
		lblNewLabel_1_4_7_1_1.setBounds(567, 15, 154, 16);
		te.add(lblNewLabel_1_4_7_1_1);
		
		JLabel lblNewLabel_1_4_6_6_1 = new JLabel("100");
		lblNewLabel_1_4_6_6_1.setFont(new Font("Microsoft Himalaya", Font.PLAIN, 20));
		lblNewLabel_1_4_6_6_1.setBounds(318, 30, 100, 21);
		te.add(lblNewLabel_1_4_6_6_1);
		
		JLabel lblNewLabel_1_4_6_6_2 = new JLabel("120");
		lblNewLabel_1_4_6_6_2.setFont(new Font("Microsoft Himalaya", Font.PLAIN, 20));
		lblNewLabel_1_4_6_6_2.setBounds(318, 46, 100, 21);
		te.add(lblNewLabel_1_4_6_6_2);
		
		JLabel lblNewLabel_1_4_6_6_3 = new JLabel("120");
		lblNewLabel_1_4_6_6_3.setFont(new Font("Microsoft Himalaya", Font.PLAIN, 20));
		lblNewLabel_1_4_6_6_3.setBounds(318, 61, 100, 21);
		te.add(lblNewLabel_1_4_6_6_3);
		
		JLabel lblNewLabel_1_4_6_6_4 = new JLabel("180");
		lblNewLabel_1_4_6_6_4.setFont(new Font("Microsoft Himalaya", Font.PLAIN, 20));
		lblNewLabel_1_4_6_6_4.setBounds(318, 77, 100, 21);
		te.add(lblNewLabel_1_4_6_6_4);
		
		JLabel lblNewLabel_1_4_6_6_5 = new JLabel("180");
		lblNewLabel_1_4_6_6_5.setFont(new Font("Microsoft Himalaya", Font.PLAIN, 20));
		lblNewLabel_1_4_6_6_5.setBounds(318, 92, 100, 21);
		te.add(lblNewLabel_1_4_6_6_5);
		
		JLabel lblNewLabel_1_4_6_6_6 = new JLabel("210");
		lblNewLabel_1_4_6_6_6.setFont(new Font("Microsoft Himalaya", Font.PLAIN, 20));
		lblNewLabel_1_4_6_6_6.setBounds(318, 143, 100, 21);
		te.add(lblNewLabel_1_4_6_6_6);
		
		JLabel lblNewLabel_1_4_6_6_7 = new JLabel("210");
		lblNewLabel_1_4_6_6_7.setFont(new Font("Microsoft Himalaya", Font.PLAIN, 20));
		lblNewLabel_1_4_6_6_7.setBounds(318, 158, 100, 21);
		te.add(lblNewLabel_1_4_6_6_7);
		
		JLabel lblNewLabel_1_4_6_6_8 = new JLabel("200");
		lblNewLabel_1_4_6_6_8.setFont(new Font("Microsoft Himalaya", Font.PLAIN, 20));
		lblNewLabel_1_4_6_6_8.setBounds(318, 173, 100, 21);
		te.add(lblNewLabel_1_4_6_6_8);
		
		JLabel lblNewLabel_1_4_6_6_9 = new JLabel("200");
		lblNewLabel_1_4_6_6_9.setFont(new Font("Microsoft Himalaya", Font.PLAIN, 20));
		lblNewLabel_1_4_6_6_9.setBounds(318, 189, 100, 21);
		te.add(lblNewLabel_1_4_6_6_9);
		
		JLabel lblNewLabel_1_4_6_6_10 = new JLabel("200");
		lblNewLabel_1_4_6_6_10.setFont(new Font("Microsoft Himalaya", Font.PLAIN, 20));
		lblNewLabel_1_4_6_6_10.setBounds(318, 204, 100, 21);
		te.add(lblNewLabel_1_4_6_6_10);
		
		JLabel lblNewLabel_1_4_6_6_11 = new JLabel("120");
		lblNewLabel_1_4_6_6_11.setFont(new Font("Microsoft Himalaya", Font.PLAIN, 20));
		lblNewLabel_1_4_6_6_11.setBounds(318, 250, 100, 21);
		te.add(lblNewLabel_1_4_6_6_11);
		
		JLabel lblNewLabel_1_4_6_6_12 = new JLabel("180");
		lblNewLabel_1_4_6_6_12.setFont(new Font("Microsoft Himalaya", Font.PLAIN, 20));
		lblNewLabel_1_4_6_6_12.setBounds(318, 263, 100, 21);
		te.add(lblNewLabel_1_4_6_6_12);
		
		JLabel lblNewLabel_1_4_6_6_13 = new JLabel("180");
		lblNewLabel_1_4_6_6_13.setFont(new Font("Microsoft Himalaya", Font.PLAIN, 20));
		lblNewLabel_1_4_6_6_13.setBounds(318, 279, 100, 21);
		te.add(lblNewLabel_1_4_6_6_13);
		
		JLabel lblNewLabel_1_4_6_6_14 = new JLabel("200");
		lblNewLabel_1_4_6_6_14.setFont(new Font("Microsoft Himalaya", Font.PLAIN, 20));
		lblNewLabel_1_4_6_6_14.setBounds(318, 296, 100, 21);
		te.add(lblNewLabel_1_4_6_6_14);
		
		JLabel lblNewLabel_1_4_6_6_15 = new JLabel("200");
		lblNewLabel_1_4_6_6_15.setFont(new Font("Microsoft Himalaya", Font.PLAIN, 20));
		lblNewLabel_1_4_6_6_15.setBounds(318, 312, 100, 21);
		te.add(lblNewLabel_1_4_6_6_15);
		
		JLabel lblNewLabel_1_4_6_6_16 = new JLabel("120");
		lblNewLabel_1_4_6_6_16.setFont(new Font("Microsoft Himalaya", Font.PLAIN, 20));
		lblNewLabel_1_4_6_6_16.setBounds(318, 358, 100, 21);
		te.add(lblNewLabel_1_4_6_6_16);
		
		JLabel lblNewLabel_1_4_6_6_17 = new JLabel("100");
		lblNewLabel_1_4_6_6_17.setFont(new Font("Microsoft Himalaya", Font.PLAIN, 20));
		lblNewLabel_1_4_6_6_17.setBounds(318, 373, 100, 21);
		te.add(lblNewLabel_1_4_6_6_17);
		
		JLabel lblNewLabel_1_4_6_6_18 = new JLabel("200");
		lblNewLabel_1_4_6_6_18.setFont(new Font("Microsoft Himalaya", Font.PLAIN, 20));
		lblNewLabel_1_4_6_6_18.setBounds(318, 392, 100, 21);
		te.add(lblNewLabel_1_4_6_6_18);
		
		JLabel lblNewLabel_1_4_6_6_19 = new JLabel("200");
		lblNewLabel_1_4_6_6_19.setFont(new Font("Microsoft Himalaya", Font.PLAIN, 20));
		lblNewLabel_1_4_6_6_19.setBounds(318, 408, 100, 21);
		te.add(lblNewLabel_1_4_6_6_19);
		
		JLabel lblNewLabel_1_4_6_6_20 = new JLabel("200");
		lblNewLabel_1_4_6_6_20.setFont(new Font("Microsoft Himalaya", Font.PLAIN, 20));
		lblNewLabel_1_4_6_6_20.setBounds(318, 423, 100, 21);
		te.add(lblNewLabel_1_4_6_6_20);
		
		esspresso1 = new JTextField();
		esspresso1.setHorizontalAlignment(SwingConstants.CENTER);
		esspresso1.setBounds(436, 28, 60, 16);
		te.add(esspresso1);
		esspresso1.setColumns(10);
		
		espresso2 = new JTextField();
		espresso2.setHorizontalAlignment(SwingConstants.CENTER);
		espresso2.setColumns(10);
		espresso2.setBounds(436, 43, 60, 16);
		te.add(espresso2);
		
		espresso3 = new JTextField();
		espresso3.setHorizontalAlignment(SwingConstants.CENTER);
		espresso3.setColumns(10);
		espresso3.setBounds(436, 58, 60, 16);
		te.add(espresso3);
		
		espresso4 = new JTextField();
		espresso4.setHorizontalAlignment(SwingConstants.CENTER);
		espresso4.setColumns(10);
		espresso4.setBounds(436, 74, 60, 16);
		te.add(espresso4);
		
		espresso5 = new JTextField();
		espresso5.setHorizontalAlignment(SwingConstants.CENTER);
		espresso5.setColumns(10);
		espresso5.setBounds(436, 89, 60, 16);
		te.add(espresso5);
		
		frp1 = new JTextField();
		frp1.setHorizontalAlignment(SwingConstants.CENTER);
		frp1.setColumns(10);
		frp1.setBounds(436, 140, 60, 16);
		te.add(frp1);
		
		frp2 = new JTextField();
		frp2.setHorizontalAlignment(SwingConstants.CENTER);
		frp2.setColumns(10);
		frp2.setBounds(436, 155, 60, 16);
		te.add(frp2);
		
		frp3 = new JTextField();
		frp3.setHorizontalAlignment(SwingConstants.CENTER);
		frp3.setColumns(10);
		frp3.setBounds(436, 170, 60, 16);
		te.add(frp3);
		
		frp4 = new JTextField();
		frp4.setHorizontalAlignment(SwingConstants.CENTER);
		frp4.setColumns(10);
		frp4.setBounds(436, 186, 60, 16);
		te.add(frp4);
		
		frp5 = new JTextField();
		frp5.setHorizontalAlignment(SwingConstants.CENTER);
		frp5.setColumns(10);
		frp5.setBounds(436, 201, 60, 16);
		te.add(frp5);
		
		tea1 = new JTextField();
		tea1.setHorizontalAlignment(SwingConstants.CENTER);
		tea1.setColumns(10);
		tea1.setBounds(436, 247, 60, 16);
		te.add(tea1);
		
		tea2 = new JTextField();
		tea2.setHorizontalAlignment(SwingConstants.CENTER);
		tea2.setColumns(10);
		tea2.setBounds(436, 260, 60, 16);
		te.add(tea2);
		
		tea3 = new JTextField();
		tea3.setHorizontalAlignment(SwingConstants.CENTER);
		tea3.setColumns(10);
		tea3.setBounds(436, 276, 60, 16);
		te.add(tea3);
		
		tea4 = new JTextField();
		tea4.setHorizontalAlignment(SwingConstants.CENTER);
		tea4.setColumns(10);
		tea4.setBounds(436, 293, 60, 16);
		te.add(tea4);
		
		tea5 = new JTextField();
		tea5.setHorizontalAlignment(SwingConstants.CENTER);
		tea5.setColumns(10);
		tea5.setBounds(436, 309, 60, 16);
		te.add(tea5);
		
		dssrt1 = new JTextField();
		dssrt1.setHorizontalAlignment(SwingConstants.CENTER);
		dssrt1.setColumns(10);
		dssrt1.setBounds(436, 355, 60, 16);
		te.add(dssrt1);
		
		dssrt2 = new JTextField();
		dssrt2.setHorizontalAlignment(SwingConstants.CENTER);
		dssrt2.setColumns(10);
		dssrt2.setBounds(436, 370, 60, 16);
		te.add(dssrt2);
		
		dssrt3 = new JTextField();
		dssrt3.setHorizontalAlignment(SwingConstants.CENTER);
		dssrt3.setColumns(10);
		dssrt3.setBounds(436, 389, 60, 16);
		te.add(dssrt3);
		
		dssrt4 = new JTextField();
		dssrt4.setHorizontalAlignment(SwingConstants.CENTER);
		dssrt4.setColumns(10);
		dssrt4.setBounds(436, 405, 60, 16);
		te.add(dssrt4);
		
		dssrt5 = new JTextField();
		dssrt5.setHorizontalAlignment(SwingConstants.CENTER);
		dssrt5.setColumns(10);
		dssrt5.setBounds(436, 421, 60, 16);
		te.add(dssrt5);
		
		espresso1_1 = new JTextField();
		espresso1_1.setEnabled(false);
		espresso1_1.setEditable(false);
		espresso1_1.setHorizontalAlignment(SwingConstants.CENTER);
		espresso1_1.setColumns(10);
		espresso1_1.setBounds(567, 27, 60, 16);
		te.add(espresso1_1);
		
		espresso2_2 = new JTextField();
		espresso2_2.setHorizontalAlignment(SwingConstants.CENTER);
		espresso2_2.setEnabled(false);
		espresso2_2.setEditable(false);
		espresso2_2.setColumns(10);
		espresso2_2.setBounds(567, 43, 60, 16);
		te.add(espresso2_2);
		
		espresso3_3 = new JTextField();
		espresso3_3.setHorizontalAlignment(SwingConstants.CENTER);
		espresso3_3.setEnabled(false);
		espresso3_3.setEditable(false);
		espresso3_3.setColumns(10);
		espresso3_3.setBounds(567, 58, 60, 16);
		te.add(espresso3_3);
		
		espresso4_4 = new JTextField();
		espresso4_4.setHorizontalAlignment(SwingConstants.CENTER);
		espresso4_4.setEnabled(false);
		espresso4_4.setEditable(false);
		espresso4_4.setColumns(10);
		espresso4_4.setBounds(567, 74, 60, 16);
		te.add(espresso4_4);
		
		espresso5_5 = new JTextField();
		espresso5_5.setHorizontalAlignment(SwingConstants.CENTER);
		espresso5_5.setEnabled(false);
		espresso5_5.setEditable(false);
		espresso5_5.setColumns(10);
		espresso5_5.setBounds(567, 89, 60, 16);
		te.add(espresso5_5);
		
		frp1_1 = new JTextField();
		frp1_1.setHorizontalAlignment(SwingConstants.CENTER);
		frp1_1.setEnabled(false);
		frp1_1.setEditable(false);
		frp1_1.setColumns(10);
		frp1_1.setBounds(567, 140, 60, 16);
		te.add(frp1_1);
		
		frp2_2 = new JTextField();
		frp2_2.setHorizontalAlignment(SwingConstants.CENTER);
		frp2_2.setEnabled(false);
		frp2_2.setEditable(false);
		frp2_2.setColumns(10);
		frp2_2.setBounds(567, 155, 60, 16);
		te.add(frp2_2);
		
		frp3_3 = new JTextField();
		frp3_3.setHorizontalAlignment(SwingConstants.CENTER);
		frp3_3.setEnabled(false);
		frp3_3.setEditable(false);
		frp3_3.setColumns(10);
		frp3_3.setBounds(567, 170, 60, 16);
		te.add(frp3_3);
		
		frp4_4 = new JTextField();
		frp4_4.setHorizontalAlignment(SwingConstants.CENTER);
		frp4_4.setEnabled(false);
		frp4_4.setEditable(false);
		frp4_4.setColumns(10);
		frp4_4.setBounds(567, 186, 60, 16);
		te.add(frp4_4);
		
		frp5_5 = new JTextField();
		frp5_5.setHorizontalAlignment(SwingConstants.CENTER);
		frp5_5.setEnabled(false);
		frp5_5.setEditable(false);
		frp5_5.setColumns(10);
		frp5_5.setBounds(567, 201, 60, 16);
		te.add(frp5_5);
		
		tea1_1 = new JTextField();
		tea1_1.setHorizontalAlignment(SwingConstants.CENTER);
		tea1_1.setEnabled(false);
		tea1_1.setEditable(false);
		tea1_1.setColumns(10);
		tea1_1.setBounds(567, 247, 60, 16);
		te.add(tea1_1);
		
		tea2_2 = new JTextField();
		tea2_2.setHorizontalAlignment(SwingConstants.CENTER);
		tea2_2.setEnabled(false);
		tea2_2.setEditable(false);
		tea2_2.setColumns(10);
		tea2_2.setBounds(567, 260, 60, 16);
		te.add(tea2_2);
		
		tea3_3 = new JTextField();
		tea3_3.setHorizontalAlignment(SwingConstants.CENTER);
		tea3_3.setEnabled(false);
		tea3_3.setEditable(false);
		tea3_3.setColumns(10);
		tea3_3.setBounds(567, 276, 60, 16);
		te.add(tea3_3);
		
		tea4_4 = new JTextField();
		tea4_4.setHorizontalAlignment(SwingConstants.CENTER);
		tea4_4.setEnabled(false);
		tea4_4.setEditable(false);
		tea4_4.setColumns(10);
		tea4_4.setBounds(567, 293, 60, 16);
		te.add(tea4_4);
		
		tea5_5 = new JTextField();
		tea5_5.setHorizontalAlignment(SwingConstants.CENTER);
		tea5_5.setEnabled(false);
		tea5_5.setEditable(false);
		tea5_5.setColumns(10);
		tea5_5.setBounds(567, 309, 60, 16);
		te.add(tea5_5);
		
		dssrt1_1 = new JTextField();
		dssrt1_1.setHorizontalAlignment(SwingConstants.CENTER);
		dssrt1_1.setEnabled(false);
		dssrt1_1.setEditable(false);
		dssrt1_1.setColumns(10);
		dssrt1_1.setBounds(567, 355, 60, 16);
		te.add(dssrt1_1);
		
		dssrt2_2 = new JTextField();
		dssrt2_2.setHorizontalAlignment(SwingConstants.CENTER);
		dssrt2_2.setEnabled(false);
		dssrt2_2.setEditable(false);
		dssrt2_2.setColumns(10);
		dssrt2_2.setBounds(567, 370, 60, 16);
		te.add(dssrt2_2);
		
		dssrt3_3 = new JTextField();
		dssrt3_3.setHorizontalAlignment(SwingConstants.CENTER);
		dssrt3_3.setEnabled(false);
		dssrt3_3.setEditable(false);
		dssrt3_3.setColumns(10);
		dssrt3_3.setBounds(567, 389, 60, 16);
		te.add(dssrt3_3);
		
		dssrt4_4 = new JTextField();
		dssrt4_4.setHorizontalAlignment(SwingConstants.CENTER);
		dssrt4_4.setEnabled(false);
		dssrt4_4.setEditable(false);
		dssrt4_4.setColumns(10);
		dssrt4_4.setBounds(567, 406, 60, 16);
		te.add(dssrt4_4);
		
		dssrt5_5 = new JTextField();
		dssrt5_5.setHorizontalAlignment(SwingConstants.CENTER);
		dssrt5_5.setEnabled(false);
		dssrt5_5.setEditable(false);
		dssrt5_5.setColumns(10);
		dssrt5_5.setBounds(567, 422, 60, 16);
		te.add(dssrt5_5);
		
		JRadioButton es1 = new JRadioButton("New radio button");
		es1.setBackground(new Color(244, 164, 96));
		es1.setBounds(0, 28, 22, 16);
		te.add(es1);
		
		JRadioButton es2 = new JRadioButton("New radio button");
		es2.setBackground(new Color(244, 164, 96));
		es2.setBounds(0, 44, 22, 16);
		te.add(es2);
		
		JRadioButton es4 = new JRadioButton("New radio button");
		es4.setBackground(new Color(244, 164, 96));
		es4.setBounds(0, 75, 22, 16);
		te.add(es4);
		
		JRadioButton es3 = new JRadioButton("New radio button");
		es3.setBackground(new Color(244, 164, 96));
		es3.setBounds(0, 59, 22, 16);
		te.add(es3);
		
		JRadioButton es5 = new JRadioButton("New radio button");
		es5.setBackground(new Color(244, 164, 96));
		es5.setBounds(0, 90, 22, 16);
		te.add(es5);
		
		JRadioButton f1 = new JRadioButton("New radio button");
		f1.setBackground(new Color(244, 164, 96));
		f1.setBounds(0, 139, 22, 16);
		te.add(f1);
		
		JRadioButton f2 = new JRadioButton("New radio button");
		f2.setBackground(new Color(244, 164, 96));
		f2.setBounds(0, 156, 22, 16);
		te.add(f2);
		
		JRadioButton f3 = new JRadioButton("New radio button");
		f3.setBackground(new Color(244, 164, 96));
		f3.setBounds(0, 170, 22, 16);
		te.add(f3);
		
		JRadioButton f4 = new JRadioButton("New radio button");
		f4.setBackground(new Color(244, 164, 96));
		f4.setBounds(0, 187, 22, 16);
		te.add(f4);
		
		JRadioButton f5 = new JRadioButton("New radio button");
		f5.setBackground(new Color(244, 164, 96));
		f5.setBounds(0, 205, 22, 16);
		te.add(f5);
		
		JRadioButton t1 = new JRadioButton("New radio button");
		t1.setBackground(new Color(244, 164, 96));
		t1.setBounds(0, 246, 22, 16);
		te.add(t1);
		
		JRadioButton t2 = new JRadioButton("New radio button");
		t2.setBackground(new Color(244, 164, 96));
		t2.setBounds(0, 261, 22, 16);
		te.add(t2);
		
		JRadioButton t3 = new JRadioButton("New radio button");
		t3.setBackground(new Color(244, 164, 96));
		t3.setBounds(0, 277, 22, 16);
		te.add(t3);
		
		JRadioButton t4 = new JRadioButton("New radio button");
		t4.setBackground(new Color(244, 164, 96));
		t4.setBounds(0, 292, 22, 16);
		te.add(t4);
		
		JRadioButton t5 = new JRadioButton("New radio button");
		t5.setBackground(new Color(244, 164, 96));
		t5.setBounds(0, 308, 22, 16);
		te.add(t5);
		
		JRadioButton d1 = new JRadioButton("New radio button");
		d1.setBackground(new Color(244, 164, 96));
		d1.setBounds(0, 354, 22, 16);
		te.add(d1);
		
		JRadioButton d2 = new JRadioButton("New radio button");
		d2.setBackground(new Color(244, 164, 96));
		d2.setBounds(0, 369, 22, 16);
		te.add(d2);
		
		JRadioButton d3 = new JRadioButton("New radio button");
		d3.setBackground(new Color(244, 164, 96));
		d3.setBounds(0, 388, 22, 16);
		te.add(d3);
		
		JRadioButton d4 = new JRadioButton("New radio button");
		d4.setBackground(new Color(244, 164, 96));
		d4.setBounds(0, 404, 22, 16);
		te.add(d4);
		
		JRadioButton d5 = new JRadioButton("New radio button");
		d5.setBackground(new Color(244, 164, 96));
		d5.setBounds(0, 421, 22, 16);
		te.add(d5);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(244, 164, 96));
		panel_2.setBounds(34, 630, 705, 78);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1_4_6_14_1 = new JLabel("Tax:");
		lblNewLabel_1_4_6_14_1.setFont(new Font("Microsoft Himalaya", Font.BOLD, 20));
		lblNewLabel_1_4_6_14_1.setBounds(10, 31, 155, 21);
		panel_2.add(lblNewLabel_1_4_6_14_1);
		
		JLabel lblNewLabel_1_4_6_14_2 = new JLabel("Total Cost: w/ Tax:");
		lblNewLabel_1_4_6_14_2.setFont(new Font("Microsoft Himalaya", Font.BOLD, 20));
		lblNewLabel_1_4_6_14_2.setBounds(10, 46, 155, 21);
		panel_2.add(lblNewLabel_1_4_6_14_2);
		
		taxfield = new JTextField();
		taxfield.setHorizontalAlignment(SwingConstants.CENTER);
		taxfield.setEnabled(false);
		taxfield.setEditable(false);
		taxfield.setColumns(10);
		taxfield.setBounds(135, 31, 184, 16);
		panel_2.add(taxfield);
		
		txttotaltax = new JTextField();
		txttotaltax.setHorizontalAlignment(SwingConstants.CENTER);
		txttotaltax.setEnabled(false);
		txttotaltax.setEditable(false);
		txttotaltax.setColumns(10);
		txttotaltax.setBounds(135, 46, 184, 16);
		panel_2.add(txttotaltax);
		
		JButton btnLogIn = new JButton("Log In");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//loginFrame login = new loginFrame();
				//login.setVisible(true);
			}
		});
		btnLogIn.setBackground(new Color(222, 184, 135));
		btnLogIn.setBounds(581, 10, 102, 21);
		panel_2.add(btnLogIn);
		
		JButton btnMenu = new JButton("Menu");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//menuFrame menu = new menuFrame();
				//menu.setVisible(true);
			}
		});
		btnMenu.setBackground(new Color(222, 184, 135));
		btnMenu.setBounds(581, 29, 102, 21);
		panel_2.add(btnMenu);
		
		JButton btnPrint = new JButton("Print!");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
									
			}
		});
		btnPrint.setFont(new Font("Stencil", Font.PLAIN, 15));
		btnPrint.setBackground(new Color(222, 184, 135));
		btnPrint.setBounds(341, 23, 102, 38);
		panel_2.add(btnPrint);
		
		JButton btnExit = new JButton("Exit!");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnExit.setBackground(new Color(222, 184, 135));
		btnExit.setBounds(581, 47, 102, 21);
		panel_2.add(btnExit);
		
		JButton btnTotal = new JButton("Total!");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Espresso Declaration
				
				String esp1 = esspresso1.getText();
				String esp2 = espresso2.getText();
				String esp3 = espresso3.getText();
				String esp4 = espresso4.getText();
				String esp5 = espresso5.getText();
				
				// Espresso Declaration
				
				if (es1.isSelected()) {
					double express1 = Integer.parseInt(esspresso1.getText());
					double answer1 = express1 * 100;
					espresso1_1.setText(Double.toString(answer1));
				}
				if (es2.isSelected()) {
					double express2 = Integer.parseInt(espresso2.getText());
					double answer2 = express2 * 120;
					espresso2_2.setText(Double.toString(answer2));
				}
				if (es3.isSelected()) {
					double express3 = Integer.parseInt(espresso3.getText());
					double answer3 = express3 * 120;
					espresso3_3.setText(Double.toString(answer3));
				}
				if (es4.isSelected()) {
					double express4 = Integer.parseInt(espresso4.getText());
					double answer4 = express4 * 180;
					espresso4_4.setText(Double.toString(answer4));
				}
				if (es5.isSelected()) {
					double express5 = Integer.parseInt(espresso5.getText());
					double answer5 = express5 * 180;
					espresso5_5.setText(Double.toString(answer5));
				}
				
				// Frappucino Declaration
				
				if (f1.isSelected()) {
					double fr1 = Integer.parseInt(frp1.getText());
					double answer6 = fr1 * 210;
					frp1_1.setText(Double.toString(answer6));
				}
				if (f1.isSelected()) {
					double fr2 = Integer.parseInt(frp2.getText());
					double answer7 = fr2 * 210;
					frp2_2.setText(Double.toString(answer7));
				}
				if (f1.isSelected()) {
					double fr3 = Integer.parseInt(frp3.getText());
					double answer8 = fr3 * 200;
					frp3_3.setText(Double.toString(answer8));
				}
				if (f1.isSelected()) {
					double fr4 = Integer.parseInt(frp4.getText());
					double answer9 = fr4 * 200;
					frp4_4.setText(Double.toString(answer9));
				}
				if (f1.isSelected()) {
					double fr5 = Integer.parseInt(frp5.getText());
					double answer10 = fr5 * 200;
					frp5_5.setText(Double.toString(answer10));
				}
				
				// Tea Declarations
				
				if (t1.isSelected() ) {
					double tt1 = Integer.parseInt(tea1.getText());
					double answer11 = tt1 * 120;
					tea1_1.setText(Double.toString(answer11));
				}
				if (t2.isSelected() ) {
					double tt2 = Integer.parseInt(tea2.getText());
					double answer12 = tt2 * 180;
					tea2_2.setText(Double.toString(answer12));
				}
				if (t3.isSelected() ) {
					double tt3 = Integer.parseInt(tea3.getText());
					double answer13 = tt3 * 180;
					tea3_3.setText(Double.toString(answer13));
				}
				if (t4.isSelected() ) {
					double tt4 = Integer.parseInt(tea4.getText());
					double answer14 = tt4 * 200;
					tea4_4.setText(Double.toString(answer14));
				}
				if (t5.isSelected() ) {
					double tt5 = Integer.parseInt(tea5.getText());
					double answer15 = tt5 * 200;
					tea5_5.setText(Double.toString(answer15));
				}
				
				// Desserts Declarations
				
				if (d1.isSelected()) {
					double dd1 = Integer.parseInt(dssrt1.getText());
					double answer16 = dd1 * 120;
					dssrt1_1.setText(Double.toString(answer16));
				}
				if (d2.isSelected()) {
					double dd2 = Integer.parseInt(dssrt2.getText());
					double answer17 = dd2 * 100;
					dssrt2_2.setText(Double.toString(answer17));
				}
				if (d3.isSelected()) {
					double dd3 = Integer.parseInt(dssrt3.getText());
					double answer18 = dd3 * 200;
					dssrt3_3.setText(Double.toString(answer18));
				}
				if (d4.isSelected()) {
					double dd4 = Integer.parseInt(dssrt4.getText());
					double answer19 = dd4 * 200;
					dssrt4_4.setText(Double.toString(answer19));
				}
				if (d5.isSelected()) {
					double dd5 = Integer.parseInt(dssrt5.getText());
					double answer20 = dd5 * 200;
					dssrt5_5.setText(Double.toString(answer20));
				}
				
				// double finalTotal = answer1;
				
			}
		});
		btnTotal.setFont(new Font("Stencil", Font.PLAIN, 15));
		btnTotal.setBackground(new Color(222, 184, 135));
		btnTotal.setBounds(453, 23, 102, 38);
		panel_2.add(btnTotal);
		
		txttotal = new JTextField();
		txttotal.setHorizontalAlignment(SwingConstants.CENTER);
		txttotal.setEnabled(false);
		txttotal.setEditable(false);
		txttotal.setColumns(10);
		txttotal.setBounds(135, 17, 184, 16);
		panel_2.add(txttotal);
		
		JLabel lblNewLabel_1_4_6_14_1_1 = new JLabel("Total:");
		lblNewLabel_1_4_6_14_1_1.setFont(new Font("Microsoft Himalaya", Font.BOLD, 20));
		lblNewLabel_1_4_6_14_1_1.setBounds(10, 15, 155, 21);
		panel_2.add(lblNewLabel_1_4_6_14_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("- Caffeinator -");
		lblNewLabel_2.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_2.setFont(new Font("Vladimir Script", Font.BOLD, 30));
		lblNewLabel_2.setBounds(224, 10, 212, 37);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Billing System...");
		lblNewLabel_2_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_2_1.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		lblNewLabel_2_1.setBounds(392, 6, 212, 37);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("----- Order Here! -----");
		lblNewLabel_1_3.setBounds(319, 120, 144, 42);
		contentPane.add(lblNewLabel_1_3);
		lblNewLabel_1_3.setFont(new Font("Microsoft Himalaya", Font.BOLD, 20));
		
		JLabel lblNewLabel_1_3_1 = new JLabel("----- Tax & Total Sum -----");
		lblNewLabel_1_3_1.setFont(new Font("Microsoft Himalaya", Font.BOLD, 20));
		lblNewLabel_1_3_1.setBounds(310, 598, 188, 42);
		contentPane.add(lblNewLabel_1_3_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setBounds(34, 174, 22, 21);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("New check box");
		chckbxNewCheckBox_1.setBounds(34, 174, 22, 21);
		contentPane.add(chckbxNewCheckBox_1);
	}
}
