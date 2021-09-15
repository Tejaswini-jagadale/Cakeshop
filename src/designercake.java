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

public class designercake extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					designercake frame = new designercake();
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
	public designercake() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1200, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRs = new JLabel("Rs.2499");
		lblRs.setForeground(Color.BLACK);
		lblRs.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRs.setBackground(Color.WHITE);
		lblRs.setBounds(215, 16, 69, 20);
		contentPane.add(lblRs);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setIcon(new ImageIcon(designercake.class.getResource("/designercake/1.Theme-2.jpg")));
		label_1.setBounds(34, 16, 250, 181);
		contentPane.add(label_1);
		
		JLabel lblBabyShowerTheme = new JLabel("Baby Shower Theme");
		lblBabyShowerTheme.setForeground(new Color(128, 0, 128));
		lblBabyShowerTheme.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		lblBabyShowerTheme.setBounds(55, 189, 223, 37);
		contentPane.add(lblBabyShowerTheme);
		
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
		button.setBounds(192, 220, 92, 29);
		contentPane.add(button);
		
		JLabel lblRs_1 = new JLabel("Rs.4679");
		lblRs_1.setForeground(Color.BLACK);
		lblRs_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRs_1.setBackground(Color.WHITE);
		lblRs_1.setBounds(506, 16, 69, 20);
		contentPane.add(lblRs_1);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setIcon(new ImageIcon(designercake.class.getResource("/designercake/2.world-of-disney.jpg")));
		label_2.setBounds(325, 17, 250, 181);
		contentPane.add(label_2);
		
		JLabel lblWorldOfD = new JLabel("World Of Disney");
		lblWorldOfD.setForeground(new Color(128, 0, 128));
		lblWorldOfD.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		lblWorldOfD.setBounds(361, 189, 185, 37);
		contentPane.add(lblWorldOfD);
		
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
		button_1.setBounds(483, 220, 92, 29);
		contentPane.add(button_1);
		
		JLabel lblRs_2 = new JLabel("Rs.3489");
		lblRs_2.setForeground(Color.BLACK);
		lblRs_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRs_2.setBackground(Color.WHITE);
		lblRs_2.setBounds(796, 16, 69, 20);
		contentPane.add(lblRs_2);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setIcon(new ImageIcon(designercake.class.getResource("/designercake/3.barbie-bash.jpg")));
		label_3.setBounds(615, 16, 250, 181);
		contentPane.add(label_3);
		
		JLabel lblBarbieBash = new JLabel("Barbie Bash");
		lblBarbieBash.setForeground(new Color(128, 0, 128));
		lblBarbieBash.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		lblBarbieBash.setBounds(676, 189, 142, 37);
		contentPane.add(lblBarbieBash);
		
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
		button_2.setBounds(773, 220, 92, 29);
		contentPane.add(button_2);
		
		JLabel lblRs_3 = new JLabel("Rs.2749");
		lblRs_3.setForeground(Color.BLACK);
		lblRs_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRs_3.setBackground(Color.WHITE);
		lblRs_3.setBounds(1080, 16, 69, 20);
		contentPane.add(lblRs_3);
		
		JLabel label_4 = new JLabel("New label");
		label_4.setIcon(new ImageIcon(designercake.class.getResource("/designercake/4.car-theme-.jpg")));
		label_4.setBounds(899, 17, 250, 181);
		contentPane.add(label_4);
		
		JLabel lblMcqueenRacer = new JLabel("McQueen Racer");
		lblMcqueenRacer.setForeground(new Color(128, 0, 128));
		lblMcqueenRacer.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		lblMcqueenRacer.setBounds(948, 189, 168, 37);
		contentPane.add(lblMcqueenRacer);
		
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
		button_3.setBounds(1057, 220, 92, 29);
		contentPane.add(button_3);
		
		JLabel lblRs_4 = new JLabel("Rs.3699");
		lblRs_4.setForeground(Color.BLACK);
		lblRs_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRs_4.setBackground(Color.WHITE);
		lblRs_4.setBounds(215, 281, 69, 20);
		contentPane.add(lblRs_4);
		
		JLabel label_5 = new JLabel("New label");
		label_5.setIcon(new ImageIcon(designercake.class.getResource("/designercake/5.spiderman.jpg")));
		label_5.setBounds(34, 277, 250, 181);
		contentPane.add(label_5);
		
		JLabel lblAdventurousSpiderman = new JLabel("Adventurous Spiderman");
		lblAdventurousSpiderman.setForeground(new Color(128, 0, 128));
		lblAdventurousSpiderman.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		lblAdventurousSpiderman.setBounds(55, 449, 240, 37);
		contentPane.add(lblAdventurousSpiderman);
		
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
		button_4.setBounds(192, 485, 92, 29);
		contentPane.add(button_4);
		
		JLabel lblRs_5 = new JLabel("Rs.4799");
		lblRs_5.setForeground(Color.BLACK);
		lblRs_5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRs_5.setBackground(Color.WHITE);
		lblRs_5.setBounds(506, 281, 69, 20);
		contentPane.add(lblRs_5);
		
		JLabel label_6 = new JLabel("New label");
		label_6.setIcon(new ImageIcon(designercake.class.getResource("/designercake/6.the-jungle-safari.jpg")));
		label_6.setBounds(325, 277, 250, 181);
		contentPane.add(label_6);
		
		JLabel lblTheJungalSafari = new JLabel("The Jungle Safari");
		lblTheJungalSafari.setForeground(new Color(128, 0, 128));
		lblTheJungalSafari.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		lblTheJungalSafari.setBounds(361, 449, 193, 37);
		contentPane.add(lblTheJungalSafari);
		
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
		button_5.setBounds(483, 485, 92, 29);
		contentPane.add(button_5);
		
		JLabel lblRs_6 = new JLabel("Rs.2699");
		lblRs_6.setForeground(Color.BLACK);
		lblRs_6.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRs_6.setBackground(Color.WHITE);
		lblRs_6.setBounds(796, 282, 69, 20);
		contentPane.add(lblRs_6);
		
		JLabel label_7 = new JLabel("New label");
		label_7.setIcon(new ImageIcon(designercake.class.getResource("/designercake/7.minion-theme-cake-1.jpg")));
		label_7.setBounds(615, 277, 250, 181);
		contentPane.add(label_7);
		
		JLabel lblMinionsDespicableDelight = new JLabel("Minion's despicable Delight");
		lblMinionsDespicableDelight.setForeground(new Color(128, 0, 128));
		lblMinionsDespicableDelight.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		lblMinionsDespicableDelight.setBounds(607, 449, 271, 37);
		contentPane.add(lblMinionsDespicableDelight);
		
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
		button_6.setBounds(773, 485, 92, 29);
		contentPane.add(button_6);
		
		JLabel lblRs_7 = new JLabel("Rs.2999");
		lblRs_7.setForeground(Color.BLACK);
		lblRs_7.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRs_7.setBackground(Color.WHITE);
		lblRs_7.setBounds(1080, 281, 69, 20);
		contentPane.add(lblRs_7);
		
		JLabel label_8 = new JLabel("New label");
		label_8.setIcon(new ImageIcon(designercake.class.getResource("/designercake/8.Avengers Poster Cake.jpg")));
		label_8.setBounds(899, 277, 250, 181);
		contentPane.add(label_8);
		
		JLabel lblAvengersHeros = new JLabel("Avengers Heros");
		lblAvengersHeros.setForeground(new Color(128, 0, 128));
		lblAvengersHeros.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		lblAvengersHeros.setBounds(936, 449, 185, 37);
		contentPane.add(lblAvengersHeros);
		
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
		button_7.setBounds(1057, 485, 92, 29);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("Back");
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
		
		JLabel lblIdDsgc = new JLabel("ID : DsgC1");
		lblIdDsgc.setForeground(new Color(0, 128, 128));
		lblIdDsgc.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblIdDsgc.setBounds(34, 223, 132, 26);
		contentPane.add(lblIdDsgc);
		
		JLabel lblIdDsgc_1 = new JLabel("ID : DsgC2");
		lblIdDsgc_1.setForeground(new Color(0, 128, 128));
		lblIdDsgc_1.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblIdDsgc_1.setBounds(325, 223, 132, 26);
		contentPane.add(lblIdDsgc_1);
		
		JLabel lblIdDsgc_2 = new JLabel("ID : DsgC3");
		lblIdDsgc_2.setForeground(new Color(0, 128, 128));
		lblIdDsgc_2.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblIdDsgc_2.setBounds(615, 223, 132, 26);
		contentPane.add(lblIdDsgc_2);
		
		JLabel lblIdDsgc_3 = new JLabel("ID : DsgC4");
		lblIdDsgc_3.setForeground(new Color(0, 128, 128));
		lblIdDsgc_3.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblIdDsgc_3.setBounds(899, 223, 132, 26);
		contentPane.add(lblIdDsgc_3);
		
		JLabel lblIdDsgc_4 = new JLabel("ID : DsgC5");
		lblIdDsgc_4.setForeground(new Color(0, 128, 128));
		lblIdDsgc_4.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblIdDsgc_4.setBounds(34, 488, 132, 26);
		contentPane.add(lblIdDsgc_4);
		
		JLabel lblIdDsgc_5 = new JLabel("ID : DsgC6");
		lblIdDsgc_5.setForeground(new Color(0, 128, 128));
		lblIdDsgc_5.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblIdDsgc_5.setBounds(325, 488, 132, 26);
		contentPane.add(lblIdDsgc_5);
		
		JLabel lblIdDsgc_6 = new JLabel("ID : DsgC7");
		lblIdDsgc_6.setForeground(new Color(0, 128, 128));
		lblIdDsgc_6.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblIdDsgc_6.setBounds(615, 484, 132, 26);
		contentPane.add(lblIdDsgc_6);
		
		JLabel lblIdDsgc_7 = new JLabel("ID : DsgC8");
		lblIdDsgc_7.setForeground(new Color(0, 128, 128));
		lblIdDsgc_7.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblIdDsgc_7.setBounds(899, 488, 132, 26);
		contentPane.add(lblIdDsgc_7);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(designercake.class.getResource("/designercake/deva-williams.jpg")));
		lblNewLabel.setBounds(0, 0, 1199, 565);
		contentPane.add(lblNewLabel);
	}

}
