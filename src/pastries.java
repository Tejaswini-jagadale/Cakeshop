import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class pastries extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pastries frame = new pastries();
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
	public pastries() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1200, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRs = new JLabel("Rs.119");
		lblRs.setForeground(Color.BLACK);
		lblRs.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRs.setBackground(Color.WHITE);
		lblRs.setBounds(211, 26, 69, 20);
		contentPane.add(lblRs);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setIcon(new ImageIcon(pastries.class.getResource("/pastries/1.Butterscotch.jpg")));
		label_1.setBounds(30, 16, 250, 181);
		contentPane.add(label_1);
		
		JLabel lblDelishPineapplePastries = new JLabel("Enchanting Butterscotch");
		lblDelishPineapplePastries.setForeground(new Color(128, 0, 128));
		lblDelishPineapplePastries.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		lblDelishPineapplePastries.setBounds(40, 194, 250, 37);
		contentPane.add(lblDelishPineapplePastries);
		
		JButton button = new JButton("Buy");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String cmd = e.getActionCommand();

		        if(cmd.equals("Buy"))
		        {
		           
		        	orderinfo oi=new orderinfo ();
		        	oi.setVisible(true);
		        	dispose();
		        }
			}
		});
		button.setFont(new Font("Ravie", Font.BOLD | Font.ITALIC, 15));
		button.setBounds(188, 230, 92, 29);
		contentPane.add(button);
		
		JLabel lblRs_1 = new JLabel("Rs.139");
		lblRs_1.setForeground(Color.BLACK);
		lblRs_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRs_1.setBackground(Color.WHITE);
		lblRs_1.setBounds(332, 177, 69, 20);
		contentPane.add(lblRs_1);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setIcon(new ImageIcon(pastries.class.getResource("/pastries/2.blueberry-pastries.jpg")));
		label_2.setBounds(325, 17, 250, 181);
		contentPane.add(label_2);
		
		JLabel lblSumptuousBlueberryPastries = new JLabel("Sumptuous Blueberry");
		lblSumptuousBlueberryPastries.setForeground(new Color(128, 0, 128));
		lblSumptuousBlueberryPastries.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		lblSumptuousBlueberryPastries.setBounds(342, 194, 250, 37);
		contentPane.add(lblSumptuousBlueberryPastries);
		
		JButton button_1 = new JButton("Buy");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String cmd = e.getActionCommand();

		        if(cmd.equals("Buy"))
		        {
		           
		        	orderinfo oi=new orderinfo ();
		        	oi.setVisible(true);
		        	dispose();
		        }
			}
		});
		button_1.setFont(new Font("Ravie", Font.BOLD | Font.ITALIC, 15));
		button_1.setBounds(483, 230, 92, 29);
		contentPane.add(button_1);
		
		JLabel lblRs_2 = new JLabel("Rs.109");
		lblRs_2.setForeground(Color.BLACK);
		lblRs_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRs_2.setBackground(Color.WHITE);
		lblRs_2.setBounds(799, 177, 69, 20);
		contentPane.add(lblRs_2);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setIcon(new ImageIcon(pastries.class.getResource("/pastries/3.healthful-fruit.jpg")));
		label_3.setBounds(618, 16, 250, 181);
		contentPane.add(label_3);
		
		JLabel lblHealthfulFruit = new JLabel("Healthful Fruit");
		lblHealthfulFruit.setForeground(new Color(128, 0, 128));
		lblHealthfulFruit.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		lblHealthfulFruit.setBounds(665, 194, 187, 37);
		contentPane.add(lblHealthfulFruit);
		
		JButton button_2 = new JButton("Buy");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String cmd = e.getActionCommand();

		        if(cmd.equals("Buy"))
		        {
		           
		        	orderinfo oi=new orderinfo ();
		        	oi.setVisible(true);
		        	dispose();
		        }
			}
		});
		button_2.setFont(new Font("Ravie", Font.BOLD | Font.ITALIC, 15));
		button_2.setBounds(776, 230, 92, 29);
		contentPane.add(button_2);
		
		JLabel lblRs_3 = new JLabel("Rs.135");
		lblRs_3.setForeground(Color.BLACK);
		lblRs_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRs_3.setBackground(Color.WHITE);
		lblRs_3.setBounds(1083, 177, 69, 20);
		contentPane.add(lblRs_3);
		
		JLabel label_4 = new JLabel("New label");
		label_4.setIcon(new ImageIcon(pastries.class.getResource("/pastries/4-mango.jpg")));
		label_4.setBounds(902, 16, 250, 181);
		contentPane.add(label_4);
		
		JLabel lblSatiatingMango = new JLabel("Satiating Mango");
		lblSatiatingMango.setForeground(new Color(128, 0, 128));
		lblSatiatingMango.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		lblSatiatingMango.setBounds(951, 194, 187, 37);
		contentPane.add(lblSatiatingMango);
		
		JButton button_3 = new JButton("Buy");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String cmd = e.getActionCommand();

		        if(cmd.equals("Buy"))
		        {
		           
		        	orderinfo oi=new orderinfo ();
		        	oi.setVisible(true);
		        	dispose();
		        }
			}
		});
		button_3.setFont(new Font("Ravie", Font.BOLD | Font.ITALIC, 15));
		button_3.setBounds(1060, 230, 92, 29);
		contentPane.add(button_3);
		
		JLabel lblRs_4 = new JLabel("Rs.155");
		lblRs_4.setForeground(Color.BLACK);
		lblRs_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRs_4.setBackground(Color.WHITE);
		lblRs_4.setBounds(40, 318, 69, 20);
		contentPane.add(lblRs_4);
		
		JLabel label_5 = new JLabel("New label");
		label_5.setIcon(new ImageIcon(pastries.class.getResource("/pastries/5.Blackforest.jpg")));
		label_5.setBounds(30, 288, 250, 181);
		contentPane.add(label_5);
		
		JLabel lblExtravagantBlackforest = new JLabel("Extravagant BlackForest");
		lblExtravagantBlackforest.setForeground(new Color(128, 0, 128));
		lblExtravagantBlackforest.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		lblExtravagantBlackforest.setBounds(30, 467, 250, 37);
		contentPane.add(lblExtravagantBlackforest);
		
		JButton button_4 = new JButton("Buy");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String cmd = e.getActionCommand();

		        if(cmd.equals("Buy"))
		        {
		           
		        	orderinfo oi=new orderinfo ();
		        	oi.setVisible(true);
		        	dispose();
		        }
			}
		});
		button_4.setFont(new Font("Ravie", Font.BOLD | Font.ITALIC, 15));
		button_4.setBounds(188, 498, 92, 29);
		contentPane.add(button_4);
		
		JLabel label = new JLabel("Rs.155");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		label.setBackground(Color.WHITE);
		label.setBounds(332, 423, 69, -106);
		contentPane.add(label);
		
		JLabel lblRs_5 = new JLabel("Rs.170");
		lblRs_5.setForeground(Color.BLACK);
		lblRs_5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRs_5.setBackground(Color.WHITE);
		lblRs_5.setBounds(332, 318, 69, 20);
		contentPane.add(lblRs_5);
		
		JLabel label_7 = new JLabel("New label");
		label_7.setIcon(new ImageIcon(pastries.class.getResource("/pastries/6.whiteforest.jpg")));
		label_7.setBounds(325, 288, 250, 181);
		contentPane.add(label_7);
		
		JLabel lblDecadentWhiteforest = new JLabel("Decadent WhiteForest");
		lblDecadentWhiteforest.setForeground(new Color(128, 0, 128));
		lblDecadentWhiteforest.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		lblDecadentWhiteforest.setBounds(356, 467, 236, 37);
		contentPane.add(lblDecadentWhiteforest);
		
		JButton button_5 = new JButton("Buy");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String cmd = e.getActionCommand();

		        if(cmd.equals("Buy"))
		        {
		           
		        	orderinfo oi=new orderinfo ();
		        	oi.setVisible(true);
		        	dispose();
		        }
			}
		});
		button_5.setFont(new Font("Ravie", Font.BOLD | Font.ITALIC, 15));
		button_5.setBounds(483, 498, 92, 29);
		contentPane.add(button_5);
		
		JLabel lblRs_6 = new JLabel("Rs.199");
		lblRs_6.setForeground(Color.BLACK);
		lblRs_6.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRs_6.setBackground(Color.WHITE);
		lblRs_6.setBounds(783, 318, 69, 20);
		contentPane.add(lblRs_6);
		
		JLabel label_8 = new JLabel("New label");
		label_8.setIcon(new ImageIcon(pastries.class.getResource("/pastries/7.RedVelvet.jpg")));
		label_8.setBounds(618, 288, 250, 181);
		contentPane.add(label_8);
		
		JLabel lblMouthwateringRedvelvet = new JLabel("Mouth-watering RedVelvet ");
		lblMouthwateringRedvelvet.setForeground(new Color(128, 0, 128));
		lblMouthwateringRedvelvet.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		lblMouthwateringRedvelvet.setBounds(618, 467, 257, 37);
		contentPane.add(lblMouthwateringRedvelvet);
		
		JButton button_6 = new JButton("Buy");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String cmd = e.getActionCommand();

		        if(cmd.equals("Buy"))
		        {
		           
		        	orderinfo oi=new orderinfo ();
		        	oi.setVisible(true);
		        	dispose();
		        }
			}
		});
		button_6.setFont(new Font("Ravie", Font.BOLD | Font.ITALIC, 15));
		button_6.setBounds(776, 498, 92, 29);
		contentPane.add(button_6);
		
		JLabel lblRs_7 = new JLabel("Rs.219");
		lblRs_7.setForeground(Color.BLACK);
		lblRs_7.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRs_7.setBackground(Color.WHITE);
		lblRs_7.setBounds(1069, 318, 69, 20);
		contentPane.add(lblRs_7);
		
		JLabel label_9 = new JLabel("New label");
		label_9.setIcon(new ImageIcon(pastries.class.getResource("/pastries/8.Chocomud.jpg")));
		label_9.setBounds(902, 288, 250, 181);
		contentPane.add(label_9);
		
		JLabel lblStellarChocolateMud = new JLabel("Stellar Chocolate Mud");
		lblStellarChocolateMud.setForeground(new Color(128, 0, 128));
		lblStellarChocolateMud.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		lblStellarChocolateMud.setBounds(902, 467, 257, 37);
		contentPane.add(lblStellarChocolateMud);
		
		JButton button_7 = new JButton("Buy");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String cmd = e.getActionCommand();

		        if(cmd.equals("Buy"))
		        {
		           
		        	orderinfo oi=new orderinfo ();
		        	oi.setVisible(true);
		        	dispose();
		        }
			}
		});
		button_7.setFont(new Font("Ravie", Font.BOLD | Font.ITALIC, 15));
		button_7.setBounds(1029, 498, 92, 29);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("Back");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String cmd = e.getActionCommand();

		        if(cmd.equals("Back"))
		        {
		           
		        	homepage hp=new homepage();
		        	hp.setVisible(true);
		        	dispose();
		        }
			}
			
		});
		button_8.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		button_8.setBounds(5, 531, 72, 29);
		contentPane.add(button_8);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String cmd = e.getActionCommand();

		        if(cmd.equals("Next"))
		        {
		           
		        	orderinfo oi=new orderinfo ();
		        	oi.setVisible(true);
		        	dispose();
		        }
			}
		});
		btnNext.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		btnNext.setBounds(1109, 531, 72, 29);
		contentPane.add(btnNext);
		
		JLabel lblIdPstc = new JLabel("ID : PstC1");
		lblIdPstc.setForeground(new Color(0, 128, 128));
		lblIdPstc.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblIdPstc.setBounds(30, 233, 132, 26);
		contentPane.add(lblIdPstc);
		
		JLabel lblIdPstc_1 = new JLabel("ID : PstC2");
		lblIdPstc_1.setForeground(new Color(0, 128, 128));
		lblIdPstc_1.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblIdPstc_1.setBounds(325, 233, 132, 26);
		contentPane.add(lblIdPstc_1);
		
		JLabel lblIdPstc_2 = new JLabel("ID : PstC3");
		lblIdPstc_2.setForeground(new Color(0, 128, 128));
		lblIdPstc_2.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblIdPstc_2.setBounds(618, 233, 132, 26);
		contentPane.add(lblIdPstc_2);
		
		JLabel lblIdPstc_3 = new JLabel("ID : PstC4");
		lblIdPstc_3.setForeground(new Color(0, 128, 128));
		lblIdPstc_3.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblIdPstc_3.setBounds(902, 233, 132, 26);
		contentPane.add(lblIdPstc_3);
		
		JLabel lblIdPstc_4 = new JLabel("ID : PstC5");
		lblIdPstc_4.setForeground(new Color(0, 128, 128));
		lblIdPstc_4.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblIdPstc_4.setBounds(30, 501, 132, 26);
		contentPane.add(lblIdPstc_4);
		
		JLabel lblIdPstc_5 = new JLabel("ID : PstC6");
		lblIdPstc_5.setForeground(new Color(0, 128, 128));
		lblIdPstc_5.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblIdPstc_5.setBounds(325, 501, 132, 26);
		contentPane.add(lblIdPstc_5);
		
		JLabel lblIdPstc_6 = new JLabel("ID : PstC7");
		lblIdPstc_6.setForeground(new Color(0, 128, 128));
		lblIdPstc_6.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblIdPstc_6.setBounds(618, 501, 132, 26);
		contentPane.add(lblIdPstc_6);
		
		JLabel lblIdPstc_7 = new JLabel("ID : PstC8");
		lblIdPstc_7.setForeground(new Color(0, 128, 128));
		lblIdPstc_7.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblIdPstc_7.setBounds(902, 501, 121, 26);
		contentPane.add(lblIdPstc_7);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(pastries.class.getResource("/pastries/Bakery Background.jpg")));
		lblNewLabel.setBounds(-15, 0, 1204, 559);
		contentPane.add(lblNewLabel);
	}

}
