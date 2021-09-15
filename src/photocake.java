import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

public class photocake extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JScrollPane scrollPane;
	private DefaultTableModel model;
	private int columnTypes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					photocake frame = new photocake();
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
	public photocake() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1200, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRs = new JLabel("Rs.849");
		lblRs.setForeground(Color.BLACK);
		lblRs.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRs.setBackground(Color.WHITE);
		lblRs.setBounds(220, 16, 62, 20);
		contentPane.add(lblRs);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setIcon(new ImageIcon(photocake.class.getResource("/photocake/1.Bakingo-Mom-Dad.jpg")));
		label_1.setBounds(32, 16, 250, 181);
		contentPane.add(label_1);
		
		JLabel lblCustomAnniversaryCake = new JLabel("Custom Anniversary");
		lblCustomAnniversaryCake.setForeground(new Color(128, 0, 128));
		lblCustomAnniversaryCake.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		lblCustomAnniversaryCake.setBounds(67, 190, 215, 37);
		contentPane.add(lblCustomAnniversaryCake);
		
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
		button.setBounds(190, 222, 92, 29);
		contentPane.add(button);
		
		JLabel lblRs_1 = new JLabel("Rs.949");
		lblRs_1.setForeground(Color.BLACK);
		lblRs_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRs_1.setBackground(Color.WHITE);
		lblRs_1.setBounds(496, 16, 69, 20);
		contentPane.add(lblRs_1);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setIcon(new ImageIcon(photocake.class.getResource("/photocake/2.heart-shape-photo.jpg")));
		label_2.setBounds(315, 17, 250, 181);
		contentPane.add(label_2);
		
		JLabel lblLoveBlossomed = new JLabel("Love Blossomed");
		lblLoveBlossomed.setForeground(new Color(128, 0, 128));
		lblLoveBlossomed.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		lblLoveBlossomed.setBounds(357, 190, 173, 37);
		contentPane.add(lblLoveBlossomed);
		
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
		button_1.setFont(new Font("Ravie", Font.BOLD | Font.ITALIC, 15));
		button_1.setBounds(473, 222, 92, 29);
		contentPane.add(button_1);
		
		JLabel lblRs_2 = new JLabel("Rs.779");
		lblRs_2.setForeground(Color.BLACK);
		lblRs_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRs_2.setBackground(Color.WHITE);
		lblRs_2.setBounds(625, 16, 69, 20);
		contentPane.add(lblRs_2);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setIcon(new ImageIcon(photocake.class.getResource("/photocake/3.fathers day.jpg")));
		label_3.setBounds(601, 17, 250, 181);
		contentPane.add(label_3);
		
		JLabel lblFathersDayPoster = new JLabel("Fathers Day Poster Cake");
		lblFathersDayPoster.setForeground(new Color(128, 0, 128));
		lblFathersDayPoster.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		lblFathersDayPoster.setBounds(601, 190, 240, 37);
		contentPane.add(lblFathersDayPoster);
		
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
		button_2.setBounds(759, 222, 92, 29);
		contentPane.add(button_2);
		
		JLabel lblRs_3 = new JLabel("Rs.999");
		lblRs_3.setForeground(Color.BLACK);
		lblRs_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRs_3.setBackground(Color.WHITE);
		lblRs_3.setBounds(1071, 16, 69, 20);
		contentPane.add(lblRs_3);
		
		JLabel label_4 = new JLabel("New label");
		label_4.setIcon(new ImageIcon(photocake.class.getResource("/photocake/4.farewell-photo-cake.jpg")));
		label_4.setBounds(890, 17, 250, 181);
		contentPane.add(label_4);
		
		JLabel lblBonneChanceFarewell = new JLabel("Bonne Chance Farewell");
		lblBonneChanceFarewell.setForeground(new Color(128, 0, 128));
		lblBonneChanceFarewell.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		lblBonneChanceFarewell.setBounds(900, 190, 240, 37);
		contentPane.add(lblBonneChanceFarewell);
		
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
		button_3.setBounds(1048, 222, 92, 29);
		contentPane.add(button_3);
		
		JLabel lblRs_4 = new JLabel("Rs.1199");
		lblRs_4.setForeground(Color.BLACK);
		lblRs_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRs_4.setBackground(Color.WHITE);
		lblRs_4.setBounds(213, 279, 69, 20);
		contentPane.add(lblRs_4);
		
		JLabel label_5 = new JLabel("New label");
		label_5.setIcon(new ImageIcon(photocake.class.getResource("/photocake/5.farewell-photo-cake.jpg")));
		label_5.setBounds(32, 279, 250, 181);
		contentPane.add(label_5);
		
		JLabel lblBidYouFarewell = new JLabel("Bid You Farewell");
		lblBidYouFarewell.setForeground(new Color(128, 0, 128));
		lblBidYouFarewell.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		lblBidYouFarewell.setBounds(67, 454, 190, 37);
		contentPane.add(lblBidYouFarewell);
		
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
		button_4.setBounds(190, 484, 92, 29);
		contentPane.add(button_4);
		
		JLabel lblRs_5 = new JLabel("Rs.899");
		lblRs_5.setForeground(Color.BLACK);
		lblRs_5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRs_5.setBackground(Color.WHITE);
		lblRs_5.setBounds(496, 279, 69, 20);
		contentPane.add(lblRs_5);
		
		JLabel label_6 = new JLabel("New label");
		label_6.setIcon(new ImageIcon(photocake.class.getResource("/photocake/6.new-hope-phot0286flav.jpg")));
		label_6.setBounds(315, 280, 250, 181);
		contentPane.add(label_6);
		
		JLabel lblNewHope = new JLabel("New Hope Congratulation");
		lblNewHope.setForeground(new Color(128, 0, 128));
		lblNewHope.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		lblNewHope.setBounds(315, 454, 260, 37);
		contentPane.add(lblNewHope);
		
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
		button_5.setBounds(473, 484, 92, 29);
		contentPane.add(button_5);
		
		JLabel lblRs_6 = new JLabel("Rs.1299");
		lblRs_6.setForeground(Color.BLACK);
		lblRs_6.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRs_6.setBackground(Color.WHITE);
		lblRs_6.setBounds(782, 279, 69, 20);
		contentPane.add(lblRs_6);
		
		JLabel label_7 = new JLabel("New label");
		label_7.setIcon(new ImageIcon(photocake.class.getResource("/photocake/7.what-was-still.jpg")));
		label_7.setBounds(601, 280, 250, 181);
		contentPane.add(label_7);
		
		JLabel lblWhatWasstillIs = new JLabel("What Was,Still Is");
		lblWhatWasstillIs.setForeground(new Color(128, 0, 128));
		lblWhatWasstillIs.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		lblWhatWasstillIs.setBounds(641, 454, 190, 37);
		contentPane.add(lblWhatWasstillIs);
		
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
		button_6.setBounds(759, 484, 92, 29);
		contentPane.add(button_6);
		
		JLabel lblRs_7 = new JLabel("Rs.949");
		lblRs_7.setForeground(Color.BLACK);
		lblRs_7.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRs_7.setBackground(Color.WHITE);
		lblRs_7.setBounds(1071, 279, 69, 20);
		contentPane.add(lblRs_7);
		
		JLabel label_8 = new JLabel("New label");
		label_8.setIcon(new ImageIcon(photocake.class.getResource("/photocake/8.celestial-beauty.jpg")));
		label_8.setBounds(890, 280, 250, 181);
		contentPane.add(label_8);
		
		JLabel lblCelestialBeauty = new JLabel("Celestial Beauty");
		lblCelestialBeauty.setForeground(new Color(128, 0, 128));
		lblCelestialBeauty.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		lblCelestialBeauty.setBounds(939, 454, 157, 37);
		contentPane.add(lblCelestialBeauty);
		
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
		button_7.setBounds(1048, 484, 92, 29);
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
		
		JLabel lblIdPhc = new JLabel("ID : PhC1");
		lblIdPhc.setForeground(new Color(0, 128, 128));
		lblIdPhc.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblIdPhc.setBounds(32, 225, 132, 26);
		contentPane.add(lblIdPhc);
		
		JLabel lblIdPhc_1 = new JLabel("ID : PhC2");
		lblIdPhc_1.setForeground(new Color(0, 128, 128));
		lblIdPhc_1.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblIdPhc_1.setBounds(315, 225, 132, 26);
		contentPane.add(lblIdPhc_1);
		
		JLabel lblIdPhc_2 = new JLabel("ID : PhC3");
		lblIdPhc_2.setForeground(new Color(0, 128, 128));
		lblIdPhc_2.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblIdPhc_2.setBounds(601, 225, 132, 26);
		contentPane.add(lblIdPhc_2);
		
		JLabel lblIdPhc_3 = new JLabel("ID : PhC4");
		lblIdPhc_3.setForeground(new Color(0, 128, 128));
		lblIdPhc_3.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblIdPhc_3.setBounds(890, 225, 132, 26);
		contentPane.add(lblIdPhc_3);
		
		JLabel lblIdPhc_4 = new JLabel("ID : PhC5");
		lblIdPhc_4.setForeground(new Color(0, 128, 128));
		lblIdPhc_4.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblIdPhc_4.setBounds(32, 487, 132, 26);
		contentPane.add(lblIdPhc_4);
		
		JLabel lblIdPhc_5 = new JLabel("ID : PhC6");
		lblIdPhc_5.setForeground(new Color(0, 128, 128));
		lblIdPhc_5.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblIdPhc_5.setBounds(315, 487, 132, 26);
		contentPane.add(lblIdPhc_5);
		
		JLabel lblIdPhc_6 = new JLabel("ID : PhC7");
		lblIdPhc_6.setForeground(new Color(0, 128, 128));
		lblIdPhc_6.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblIdPhc_6.setBounds(601, 487, 132, 26);
		contentPane.add(lblIdPhc_6);
		
		JLabel lblIdPhc_7 = new JLabel("ID : PhC8");
		lblIdPhc_7.setForeground(new Color(0, 128, 128));
		lblIdPhc_7.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblIdPhc_7.setBounds(890, 487, 132, 26);
		contentPane.add(lblIdPhc_7);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(photocake.class.getResource("/photocake/s-o-c-i-a-l-c-u-t.jpg")));
		lblNewLabel.setBounds(0, 0, 1199, 574);
		contentPane.add(lblNewLabel);
		
	}

}
