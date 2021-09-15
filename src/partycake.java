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

public class partycake extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					partycake frame = new partycake();
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
	public partycake() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1200, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRs = new JLabel("Rs.4999");
		lblRs.setBounds(210, 16, 69, 20);
		lblRs.setForeground(Color.BLACK);
		lblRs.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRs.setBackground(Color.WHITE);
		contentPane.add(lblRs);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setBounds(35, 16, 250, 181);
		label_1.setIcon(new ImageIcon(partycake.class.getResource("/partycake/1=3-tier-blackforest cake.jpg")));
		contentPane.add(label_1);
		
		JLabel lbltierBlackforest = new JLabel("3-Tier BlackForest Cake");
		lbltierBlackforest.setBounds(45, 190, 258, 37);
		lbltierBlackforest.setForeground(new Color(128, 0, 128));
		lbltierBlackforest.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		contentPane.add(lbltierBlackforest);
		
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
		button.setBounds(193, 222, 92, 29);
		button.setFont(new Font("Ravie", Font.BOLD | Font.ITALIC, 15));
		contentPane.add(button);
		
		JLabel lblRs_1 = new JLabel("Rs.5999");
		lblRs_1.setBounds(497, 16, 69, 20);
		lblRs_1.setForeground(Color.BLACK);
		lblRs_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRs_1.setBackground(Color.WHITE);
		contentPane.add(lblRs_1);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setBounds(327, 17, 250, 181);
		label_2.setIcon(new ImageIcon(partycake.class.getResource("/partycake/2=4-tier-designer-party-cake-.jpg")));
		contentPane.add(label_2);
		
		JLabel lbltierBloomingLove = new JLabel("4-Tier Blooming Love Cake");
		lbltierBloomingLove.setBounds(318, 190, 275, 37);
		lbltierBloomingLove.setForeground(new Color(128, 0, 128));
		lbltierBloomingLove.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		contentPane.add(lbltierBloomingLove);
		
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
		button_1.setBounds(485, 222, 92, 29);
		button_1.setFont(new Font("Ravie", Font.BOLD | Font.ITALIC, 15));
		contentPane.add(button_1);
		
		JLabel lblRs_2 = new JLabel("Rs.5599");
		lblRs_2.setBounds(789, 16, 69, 20);
		lblRs_2.setForeground(Color.BLACK);
		lblRs_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRs_2.setBackground(Color.WHITE);
		contentPane.add(lblRs_2);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setBounds(618, 17, 250, 181);
		label_3.setIcon(new ImageIcon(partycake.class.getResource("/partycake/3=3-tier-chocolate-truffle-cake.jpg")));
		contentPane.add(label_3);
		
		JLabel lbltierCake = new JLabel("3-Tier Chocosea Truffle Cake");
		lbltierCake.setBounds(602, 190, 291, 37);
		lbltierCake.setForeground(new Color(128, 0, 128));
		lbltierCake.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		contentPane.add(lbltierCake);
		
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
		button_2.setBounds(776, 222, 92, 29);
		button_2.setFont(new Font("Ravie", Font.BOLD | Font.ITALIC, 15));
		contentPane.add(button_2);
		
		JLabel lblRs_3 = new JLabel("Rs.6099");
		lblRs_3.setBounds(1079, 16, 69, 20);
		lblRs_3.setForeground(Color.BLACK);
		lblRs_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRs_3.setBackground(Color.WHITE);
		contentPane.add(lblRs_3);
		
		JLabel label_4 = new JLabel("New label");
		label_4.setBounds(908, 17, 250, 181);
		label_4.setIcon(new ImageIcon(partycake.class.getResource("/partycake/4=three-tier-designer.jpg")));
		contentPane.add(label_4);
		
		JLabel lbltierHeacake = new JLabel("3-Tier Hearty Love Cake");
		lbltierHeacake.setBounds(918, 190, 245, 37);
		lbltierHeacake.setForeground(new Color(128, 0, 128));
		lbltierHeacake.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		contentPane.add(lbltierHeacake);
		
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
		button_3.setBounds(1066, 222, 92, 29);
		button_3.setFont(new Font("Ravie", Font.BOLD | Font.ITALIC, 15));
		contentPane.add(button_3);
		
		JLabel lblRs_4 = new JLabel("Rs.6699");
		lblRs_4.setBounds(210, 272, 69, 20);
		lblRs_4.setForeground(Color.BLACK);
		lblRs_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRs_4.setBackground(Color.WHITE);
		contentPane.add(lblRs_4);
		
		JLabel label_5 = new JLabel("New label");
		label_5.setBounds(35, 268, 250, 181);
		label_5.setIcon(new ImageIcon(partycake.class.getResource("/partycake/5=3-tier-anniversary-cake.jpg")));
		contentPane.add(label_5);
		
		JLabel lbltierTangerineShades = new JLabel("3-Tier Tangerine Shades Cake");
		lbltierTangerineShades.setBounds(15, 441, 299, 37);
		lbltierTangerineShades.setForeground(new Color(128, 0, 128));
		lbltierTangerineShades.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		contentPane.add(lbltierTangerineShades);
		
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
		button_4.setBounds(193, 475, 92, 29);
		button_4.setFont(new Font("Ravie", Font.BOLD | Font.ITALIC, 15));
		contentPane.add(button_4);
		
		JLabel lblRs_5 = new JLabel("Rs.6999");
		lblRs_5.setBounds(497, 272, 69, 20);
		lblRs_5.setForeground(Color.BLACK);
		lblRs_5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRs_5.setBackground(Color.WHITE);
		contentPane.add(lblRs_5);
		
		JLabel label_6 = new JLabel("New label");
		label_6.setBounds(327, 267, 250, 181);
		label_6.setIcon(new ImageIcon(partycake.class.getResource("/partycake/6=four-tier-party-cake.jpg")));
		contentPane.add(label_6);
		
		JLabel lbltierPartyCake = new JLabel("4-Tier Party Cake");
		lbltierPartyCake.setBounds(358, 441, 193, 37);
		lbltierPartyCake.setForeground(new Color(128, 0, 128));
		lbltierPartyCake.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		contentPane.add(lbltierPartyCake);
		
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
		button_5.setBounds(485, 475, 92, 29);
		button_5.setFont(new Font("Ravie", Font.BOLD | Font.ITALIC, 15));
		contentPane.add(button_5);
		
		JLabel lblRs_6 = new JLabel("Rs.7599");
		lblRs_6.setBounds(789, 272, 69, 20);
		lblRs_6.setForeground(Color.BLACK);
		lblRs_6.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRs_6.setBackground(Color.WHITE);
		contentPane.add(lblRs_6);
		
		JLabel label_7 = new JLabel("New label");
		label_7.setBounds(618, 267, 250, 181);
		label_7.setIcon(new ImageIcon(partycake.class.getResource("/partycake/7=4-tier-anniversary-cake.jpg")));
		contentPane.add(label_7);
		
		JLabel lbltierAnniversaryCake = new JLabel("4-Tier Anniversary Cake");
		lbltierAnniversaryCake.setBounds(618, 441, 250, 37);
		lbltierAnniversaryCake.setForeground(new Color(128, 0, 128));
		lbltierAnniversaryCake.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		contentPane.add(lbltierAnniversaryCake);
		
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
		button_6.setBounds(776, 475, 92, 29);
		button_6.setFont(new Font("Ravie", Font.BOLD | Font.ITALIC, 15));
		contentPane.add(button_6);
		
		JLabel lblRs_7 = new JLabel("Rs.7999");
		lblRs_7.setBounds(1079, 267, 69, 20);
		lblRs_7.setForeground(Color.BLACK);
		lblRs_7.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRs_7.setBackground(Color.WHITE);
		contentPane.add(lblRs_7);
		
		JLabel label_8 = new JLabel("New label");
		label_8.setBounds(908, 267, 250, 181);
		label_8.setIcon(new ImageIcon(partycake.class.getResource("/partycake/8=3-tier-vanilla-party-cake-.jpg")));
		contentPane.add(label_8);
		
		JLabel lbltierPurePerfection = new JLabel("3-Tier Pure Perfection Cake");
		lbltierPurePerfection.setBounds(893, 441, 275, 37);
		lbltierPurePerfection.setForeground(new Color(128, 0, 128));
		lbltierPurePerfection.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		contentPane.add(lbltierPurePerfection);
		
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
		button_7.setBounds(1066, 475, 92, 29);
		button_7.setFont(new Font("Ravie", Font.BOLD | Font.ITALIC, 15));
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("Back");
		button_8.setBounds(5, 531, 72, 29);
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
		btnNext.setBounds(1109, 531, 72, 29);
		btnNext.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		contentPane.add(btnNext);
		
		JLabel lblIdPrtc = new JLabel("ID : PrtC1");
		lblIdPrtc.setForeground(new Color(0, 128, 128));
		lblIdPrtc.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblIdPrtc.setBounds(35, 225, 132, 26);
		contentPane.add(lblIdPrtc);
		
		JLabel lblIdPrtc_1 = new JLabel("ID : PrtC2");
		lblIdPrtc_1.setForeground(new Color(0, 128, 128));
		lblIdPrtc_1.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblIdPrtc_1.setBounds(328, 222, 132, 26);
		contentPane.add(lblIdPrtc_1);
		
		JLabel lblIdPrtc_2 = new JLabel("ID : PrtC3");
		lblIdPrtc_2.setForeground(new Color(0, 128, 128));
		lblIdPrtc_2.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblIdPrtc_2.setBounds(628, 222, 132, 26);
		contentPane.add(lblIdPrtc_2);
		
		JLabel lblIdPrtc_3 = new JLabel("ID : PrtC4");
		lblIdPrtc_3.setForeground(new Color(0, 128, 128));
		lblIdPrtc_3.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblIdPrtc_3.setBounds(908, 225, 132, 26);
		contentPane.add(lblIdPrtc_3);
		
		JLabel lblIdPrtc_4 = new JLabel("ID : PrtC5");
		lblIdPrtc_4.setForeground(new Color(0, 128, 128));
		lblIdPrtc_4.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblIdPrtc_4.setBounds(35, 478, 132, 26);
		contentPane.add(lblIdPrtc_4);
		
		JLabel lblIdPrtc_5 = new JLabel("ID : PrtC6");
		lblIdPrtc_5.setForeground(new Color(0, 128, 128));
		lblIdPrtc_5.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblIdPrtc_5.setBounds(327, 475, 132, 26);
		contentPane.add(lblIdPrtc_5);
		
		JLabel lblIdPrtc_6 = new JLabel("ID : PrtC7");
		lblIdPrtc_6.setForeground(new Color(0, 128, 128));
		lblIdPrtc_6.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblIdPrtc_6.setBounds(618, 478, 132, 26);
		contentPane.add(lblIdPrtc_6);
		
		JLabel lblIdPrtc_7 = new JLabel("ID : PrtC8");
		lblIdPrtc_7.setForeground(new Color(0, 128, 128));
		lblIdPrtc_7.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblIdPrtc_7.setBounds(908, 478, 132, 26);
		contentPane.add(lblIdPrtc_7);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(partycake.class.getResource("/partycake/Barbecue Background Picture.jpg")));
		lblNewLabel.setBounds(-14, 0, 1204, 571);
		contentPane.add(lblNewLabel);
	}

}
