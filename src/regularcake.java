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

public class regularcake extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					regularcake frame = new regularcake();
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
	public regularcake() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1200, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRs = new JLabel("Rs.549");
		lblRs.setBounds(218, 27, 69, 20);
		lblRs.setForeground(Color.BLACK);
		lblRs.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRs.setBackground(Color.WHITE);
		contentPane.add(lblRs);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setBounds(27, 27, 250, 181);
		label_1.setIcon(new ImageIcon(regularcake.class.getResource("/regularcake/1.chocolate-vanilla-cake.jpg")));
		contentPane.add(label_1);
		
		JLabel lblEbonyAndLvory = new JLabel("Ebony And Lvory");
		lblEbonyAndLvory.setBounds(59, 201, 194, 37);
		lblEbonyAndLvory.setForeground(new Color(128, 0, 128));
		lblEbonyAndLvory.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		contentPane.add(lblEbonyAndLvory);
		
		JButton button = new JButton("Buy");
		button.addActionListener(new ActionListener() 
		{
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
		button.setBounds(184, 234, 92, 29);
		button.setFont(new Font("Ravie", Font.BOLD | Font.ITALIC, 15));
		contentPane.add(button);
		
		JLabel lblRs_1 = new JLabel("Rs.599");
		lblRs_1.setBounds(508, 27, 69, 20);
		lblRs_1.setForeground(Color.BLACK);
		lblRs_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRs_1.setBackground(Color.WHITE);
		contentPane.add(lblRs_1);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setBounds(318, 27, 250, 181);
		label_2.setIcon(new ImageIcon(regularcake.class.getResource("/regularcake/2.butterscotch-cake-A.jpg")));
		contentPane.add(label_2);
		
		JLabel lblButterscotchDelight = new JLabel("Butterscotch Delight");
		lblButterscotchDelight.setBounds(328, 201, 194, 37);
		lblButterscotchDelight.setForeground(new Color(128, 0, 128));
		lblButterscotchDelight.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		contentPane.add(lblButterscotchDelight);
		
		JButton button_1 = new JButton("Buy");
		button_1.addActionListener(new ActionListener()
	{
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
		button_1.setBounds(476, 234, 92, 29);
		button_1.setFont(new Font("Ravie", Font.BOLD | Font.ITALIC, 15));
		contentPane.add(button_1);
		
		JLabel lblRs_2 = new JLabel("Rs.619");
		lblRs_2.setBounds(798, 27, 69, 20);
		lblRs_2.setForeground(Color.BLACK);
		lblRs_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRs_2.setBackground(Color.WHITE);
		contentPane.add(lblRs_2);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setBounds(606, 27, 250, 181);
		label_3.setIcon(new ImageIcon(regularcake.class.getResource("/regularcake/3.red-velvet-choco.jpg")));
		contentPane.add(label_3);
		
		JLabel lblM = new JLabel("Magical Moments Red Velvet");
		lblM.setBounds(593, 201, 288, 37);
		lblM.setForeground(new Color(128, 0, 128));
		lblM.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		contentPane.add(lblM);
		
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
		button_2.setBounds(766, 234, 92, 29);
		button_2.setFont(new Font("Ravie", Font.BOLD | Font.ITALIC, 15));
		contentPane.add(button_2);
		
		JLabel lblRs_3 = new JLabel("Rs.849");
		lblRs_3.setBounds(1079, 45, 69, 20);
		lblRs_3.setForeground(Color.BLACK);
		lblRs_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRs_3.setBackground(Color.WHITE);
		contentPane.add(lblRs_3);
		
		JLabel label_4 = new JLabel("New label");
		label_4.setBounds(898, 28, 250, 181);
		label_4.setIcon(new ImageIcon(regularcake.class.getResource("/regularcake/4.black-forest-vegan-cake.jpg")));
		contentPane.add(label_4);
		
		JLabel lblDelishBrown = new JLabel("Delish Brown BlackForest  ");
		lblDelishBrown.setBounds(896, 201, 267, 37);
		lblDelishBrown.setForeground(new Color(128, 0, 128));
		lblDelishBrown.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		contentPane.add(lblDelishBrown);
		
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
		button_3.setBounds(1056, 234, 92, 29);
		button_3.setFont(new Font("Ravie", Font.BOLD | Font.ITALIC, 15));
		contentPane.add(button_3);
		
		JLabel lblRs_4 = new JLabel("Rs.699");
		lblRs_4.setBounds(208, 290, 69, 20);
		lblRs_4.setForeground(Color.BLACK);
		lblRs_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRs_4.setBackground(Color.WHITE);
		contentPane.add(lblRs_4);
		
		JLabel label_5 = new JLabel("New label");
		label_5.setBounds(27, 290, 250, 181);
		label_5.setIcon(new ImageIcon(regularcake.class.getResource("/regularcake/5.royal-cherry-cake-A.jpg")));
		contentPane.add(label_5);
		
		JLabel lblRoyalCherryindulgence = new JLabel("Royal Cherry-Indulgence");
		lblRoyalCherryindulgence.setBounds(27, 466, 240, 37);
		lblRoyalCherryindulgence.setForeground(new Color(128, 0, 128));
		lblRoyalCherryindulgence.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		contentPane.add(lblRoyalCherryindulgence);
		
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
		button_4.setBounds(185, 498, 92, 29);
		button_4.setFont(new Font("Ravie", Font.BOLD | Font.ITALIC, 15));
		contentPane.add(button_4);
		
		JLabel lblRs_5 = new JLabel("Rs.649");
		lblRs_5.setBounds(499, 290, 69, 20);
		lblRs_5.setForeground(Color.BLACK);
		lblRs_5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRs_5.setBackground(Color.WHITE);
		contentPane.add(lblRs_5);
		
		JLabel label_6 = new JLabel("New label");
		label_6.setBounds(318, 291, 250, 181);
		label_6.setIcon(new ImageIcon(regularcake.class.getResource("/regularcake/6.blueberry-cake.jpg")));
		contentPane.add(label_6);
		
		JLabel lblScrumptiousBlueberry = new JLabel("Scrumptious Blueberry");
		lblScrumptiousBlueberry.setBounds(328, 466, 240, 37);
		lblScrumptiousBlueberry.setForeground(new Color(128, 0, 128));
		lblScrumptiousBlueberry.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		contentPane.add(lblScrumptiousBlueberry);
		
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
		button_5.setBounds(476, 498, 92, 29);
		button_5.setFont(new Font("Ravie", Font.BOLD | Font.ITALIC, 15));
		contentPane.add(button_5);
		
		JLabel lblRs_6 = new JLabel("Rs.899");
		lblRs_6.setBounds(787, 290, 69, 20);
		lblRs_6.setForeground(Color.BLACK);
		lblRs_6.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRs_6.setBackground(Color.WHITE);
		contentPane.add(lblRs_6);
		
		JLabel label_7 = new JLabel("New label");
		label_7.setBounds(606, 291, 250, 181);
		label_7.setIcon(new ImageIcon(regularcake.class.getResource("/regularcake/7.being-coffee-holic.jpg")));
		contentPane.add(label_7);
		
		JLabel lblBeingCoffeeholic = new JLabel("Being Coffee Holic");
		lblBeingCoffeeholic.setBounds(642, 466, 203, 37);
		lblBeingCoffeeholic.setForeground(new Color(128, 0, 128));
		lblBeingCoffeeholic.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		contentPane.add(lblBeingCoffeeholic);
		
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
		button_6.setBounds(766, 498, 92, 29);
		button_6.setFont(new Font("Ravie", Font.BOLD | Font.ITALIC, 15));
		contentPane.add(button_6);
		
		JLabel lblRs_7 = new JLabel("Rs.999");
		lblRs_7.setBounds(1079, 290, 69, 20);
		lblRs_7.setForeground(Color.BLACK);
		lblRs_7.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRs_7.setBackground(Color.WHITE);
		contentPane.add(lblRs_7);
		
		JLabel label_8 = new JLabel("New label");
		label_8.setBounds(898, 290, 250, 181);
		label_8.setIcon(new ImageIcon(regularcake.class.getResource("/regularcake/8.couverture-chocolate-.jpg")));
		contentPane.add(label_8);
		
		JLabel lblChocoholix = new JLabel("Chocoholix Couverture ");
		lblChocoholix.setBounds(908, 466, 231, 37);
		lblChocoholix.setForeground(new Color(128, 0, 128));
		lblChocoholix.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		contentPane.add(lblChocoholix);
		
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
		button_7.setBounds(1023, 498, 80, 29);
		button_7.setFont(new Font("Ravie", Font.BOLD | Font.ITALIC, 15));
		contentPane.add(button_7);

		JButton button_8 = new JButton("Back");
		button_8.setBounds(5, 531, 72, 29);
		button_8.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		contentPane.add(button_8);
		button_8.addActionListener(new ActionListener() 
		{
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
		btnNext.setBounds(1109, 531, 72, 29);
		btnNext.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		contentPane.add(btnNext);
		
		JLabel lblNewLabel = new JLabel("ID : RegC1");
		lblNewLabel.setForeground(new Color(0, 128, 128));
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(27, 233, 132, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblIdRegc = new JLabel("ID : RegC2");
		lblIdRegc.setForeground(new Color(0, 128, 128));
		lblIdRegc.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblIdRegc.setBounds(328, 233, 132, 26);
		contentPane.add(lblIdRegc);
		
		JLabel lblIdRegc_1 = new JLabel("ID : RegC3");
		lblIdRegc_1.setForeground(new Color(0, 128, 128));
		lblIdRegc_1.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblIdRegc_1.setBounds(606, 233, 132, 26);
		contentPane.add(lblIdRegc_1);
		
		JLabel lblIdRegc_2 = new JLabel("ID : RegC4");
		lblIdRegc_2.setForeground(new Color(0, 128, 128));
		lblIdRegc_2.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblIdRegc_2.setBounds(896, 233, 132, 26);
		contentPane.add(lblIdRegc_2);
		
		JLabel lblIdRegc_3 = new JLabel("ID : RegC5");
		lblIdRegc_3.setForeground(new Color(0, 128, 128));
		lblIdRegc_3.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblIdRegc_3.setBounds(27, 501, 132, 26);
		contentPane.add(lblIdRegc_3);
		
		JLabel lblIdRegc_4 = new JLabel("ID : RegC6");
		lblIdRegc_4.setForeground(new Color(0, 128, 128));
		lblIdRegc_4.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblIdRegc_4.setBounds(318, 501, 132, 26);
		contentPane.add(lblIdRegc_4);
		
		JLabel lblIdRegc_5 = new JLabel("ID : RegC7");
		lblIdRegc_5.setForeground(new Color(0, 128, 128));
		lblIdRegc_5.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblIdRegc_5.setBounds(606, 501, 132, 26);
		contentPane.add(lblIdRegc_5);
		
		JLabel lblIdRegc_6 = new JLabel("ID : RegC8");
		lblIdRegc_6.setForeground(new Color(0, 128, 128));
		lblIdRegc_6.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblIdRegc_6.setBounds(898, 501, 132, 26);
		contentPane.add(lblIdRegc_6);
		
		JLabel lblNewLabel1 = new JLabel("New Label");
		lblNewLabel1.setIcon(new ImageIcon(regularcake.class.getResource("/regularcake/Plantillas Para Power.jpg")));
		
		lblNewLabel1.setBounds(0, 0, 1189, 567);
		contentPane.add(lblNewLabel1);
	}
}
