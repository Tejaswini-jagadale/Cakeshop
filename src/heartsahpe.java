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

public class heartsahpe extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					heartsahpe frame = new heartsahpe();
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
	public heartsahpe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1200, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRs = new JLabel("Rs.749");
		lblRs.setBounds(214, 16, 69, 20);
		lblRs.setForeground(Color.BLACK);
		lblRs.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRs.setBackground(Color.WHITE);
		contentPane.add(lblRs);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setBounds(33, 16, 250, 181);
		label_1.setIcon(new ImageIcon(heartsahpe.class.getResource("/heartshape/1.double-heart-choco.jpg")));
		contentPane.add(label_1);
		
		JLabel lblAmoreMio = new JLabel("Amore Mio");
		lblAmoreMio.setBounds(81, 191, 133, 37);
		lblAmoreMio.setForeground(new Color(128, 0, 128));
		lblAmoreMio.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		contentPane.add(lblAmoreMio);
		
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
		button.setBounds(191, 223, 92, 29);
		button.setFont(new Font("Ravie", Font.BOLD | Font.ITALIC, 15));
		contentPane.add(button);
		
		JLabel lblRs_1 = new JLabel("Rs.1049");
		lblRs_1.setBounds(502, 16, 69, 20);
		lblRs_1.setForeground(Color.BLACK);
		lblRs_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRs_1.setBackground(Color.WHITE);
		contentPane.add(lblRs_1);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setBounds(321, 17, 250, 181);
		label_2.setIcon(new ImageIcon(heartsahpe.class.getResource("/heartshape/2.vanilla-strawberry.jpg")));
		contentPane.add(label_2);
		
		JLabel lblSecretConfession = new JLabel("Secret Confession");
		lblSecretConfession.setBounds(359, 191, 169, 37);
		lblSecretConfession.setForeground(new Color(128, 0, 128));
		lblSecretConfession.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		contentPane.add(lblSecretConfession);
		
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
		button_1.setBounds(479, 223, 92, 29);
		button_1.setFont(new Font("Ravie", Font.BOLD | Font.ITALIC, 15));
		contentPane.add(button_1);
		
		JLabel lblRs_2 = new JLabel("Rs.849");
		lblRs_2.setBounds(791, 16, 69, 20);
		lblRs_2.setForeground(Color.BLACK);
		lblRs_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRs_2.setBackground(Color.WHITE);
		contentPane.add(lblRs_2);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setBounds(610, 17, 250, 181);
		label_3.setIcon(new ImageIcon(heartsahpe.class.getResource("/heartshape/3.heart-shaped-black.jpg")));
		contentPane.add(label_3);
		
		JLabel lblTorridAffair = new JLabel("Torrid Affair");
		lblTorridAffair.setBounds(664, 191, 133, 37);
		lblTorridAffair.setForeground(new Color(128, 0, 128));
		lblTorridAffair.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		contentPane.add(lblTorridAffair);
		
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
		button_2.setBounds(768, 223, 92, 29);
		button_2.setFont(new Font("Ravie", Font.BOLD | Font.ITALIC, 15));
		contentPane.add(button_2);
		
		JLabel lblRs_3 = new JLabel("Rs.1149");
		lblRs_3.setBounds(1081, 16, 69, 20);
		lblRs_3.setForeground(Color.BLACK);
		lblRs_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRs_3.setBackground(Color.WHITE);
		contentPane.add(lblRs_3);
		
		JLabel label_4 = new JLabel("New label");
		label_4.setBounds(898, 16, 250, 181);
		label_4.setIcon(new ImageIcon(heartsahpe.class.getResource("/heartshape/4.heart-shaped-fruit.jpg")));
		contentPane.add(label_4);
		
		JLabel lblLusciousGooeyBliss = new JLabel("Luscious Gooey Bliss");
		lblLusciousGooeyBliss.setBounds(924, 191, 208, 37);
		lblLusciousGooeyBliss.setForeground(new Color(128, 0, 128));
		lblLusciousGooeyBliss.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		contentPane.add(lblLusciousGooeyBliss);
		
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
		button_3.setBounds(1058, 223, 92, 29);
		button_3.setFont(new Font("Ravie", Font.BOLD | Font.ITALIC, 15));
		contentPane.add(button_3);
		
		JLabel lblRs_4 = new JLabel("Rs.799");
		lblRs_4.setBounds(214, 281, 69, 20);
		lblRs_4.setForeground(Color.BLACK);
		lblRs_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRs_4.setBackground(Color.WHITE);
		contentPane.add(lblRs_4);
		
		JLabel label_5 = new JLabel("New label");
		label_5.setBounds(33, 281, 250, 181);
		label_5.setIcon(new ImageIcon(heartsahpe.class.getResource("/heartshape/5.heart-shaped red.jpg")));
		contentPane.add(label_5);
		
		JLabel lblBeMineForever = new JLabel("Be Mine Forever");
		lblBeMineForever.setBounds(68, 455, 181, 37);
		lblBeMineForever.setForeground(new Color(128, 0, 128));
		lblBeMineForever.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		contentPane.add(lblBeMineForever);
		
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
		button_4.setBounds(191, 485, 92, 29);
		button_4.setFont(new Font("Ravie", Font.BOLD | Font.ITALIC, 15));
		contentPane.add(button_4);
		
		JLabel lblRs_5 = new JLabel("Rs.779");
		lblRs_5.setBounds(502, 281, 69, 20);
		lblRs_5.setForeground(Color.BLACK);
		lblRs_5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRs_5.setBackground(Color.WHITE);
		contentPane.add(lblRs_5);
		
		JLabel label_6 = new JLabel("New label");
		label_6.setBounds(321, 282, 250, 181);
		label_6.setIcon(new ImageIcon(heartsahpe.class.getResource("/heartshape/6.heart-shaped-choco.jpg")));
		contentPane.add(label_6);
		
		JLabel lblHeartliciousPleasure = new JLabel("Heart-licious Pleasure");
		lblHeartliciousPleasure.setBounds(347, 455, 214, 37);
		lblHeartliciousPleasure.setForeground(new Color(128, 0, 128));
		lblHeartliciousPleasure.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		contentPane.add(lblHeartliciousPleasure);
		
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
		button_5.setBounds(479, 485, 92, 29);
		button_5.setFont(new Font("Ravie", Font.BOLD | Font.ITALIC, 15));
		contentPane.add(button_5);
		
		JLabel lblRs_6 = new JLabel("Rs.699");
		lblRs_6.setBounds(791, 281, 69, 20);
		lblRs_6.setForeground(Color.BLACK);
		lblRs_6.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRs_6.setBackground(Color.WHITE);
		contentPane.add(lblRs_6);
		
		JLabel label_7 = new JLabel("New label");
		label_7.setBounds(610, 281, 250, 181);
		label_7.setIcon(new ImageIcon(heartsahpe.class.getResource("/heartshape/7.heart-shaped-vanilla.jpg")));
		contentPane.add(label_7);
		
		JLabel lblFlo = new JLabel("Floral Fun Vanilla");
		lblFlo.setBounds(646, 455, 214, 37);
		lblFlo.setForeground(new Color(128, 0, 128));
		lblFlo.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		contentPane.add(lblFlo);
		
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
		button_6.setBounds(768, 485, 92, 29);
		button_6.setFont(new Font("Ravie", Font.BOLD | Font.ITALIC, 15));
		contentPane.add(button_6);
		
		JLabel lblRs_7 = new JLabel("Rs.1199");
		lblRs_7.setBounds(1081, 281, 69, 20);
		lblRs_7.setForeground(Color.BLACK);
		lblRs_7.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRs_7.setBackground(Color.WHITE);
		contentPane.add(lblRs_7);
		
		JLabel label_8 = new JLabel("New label");
		label_8.setBounds(898, 282, 250, 181);
		label_8.setIcon(new ImageIcon(heartsahpe.class.getResource("/heartshape/8.heart-shape-chocolate.jpg")));
		contentPane.add(label_8);
		
		JLabel lblExoticAffair = new JLabel("Exotic Affair");
		lblExoticAffair.setBounds(981, 455, 151, 37);
		lblExoticAffair.setForeground(new Color(128, 0, 128));
		lblExoticAffair.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		contentPane.add(lblExoticAffair);
		
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
		button_7.setBounds(1058, 485, 92, 29);
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
		
		JLabel lblIdHrtc = new JLabel("ID : HrtC1");
		lblIdHrtc.setForeground(new Color(0, 128, 128));
		lblIdHrtc.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblIdHrtc.setBounds(33, 226, 132, 26);
		contentPane.add(lblIdHrtc);
		
		JLabel lblIdHrtc_1 = new JLabel("ID : HrtC2");
		lblIdHrtc_1.setForeground(new Color(0, 128, 128));
		lblIdHrtc_1.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblIdHrtc_1.setBounds(321, 226, 132, 26);
		contentPane.add(lblIdHrtc_1);
		
		JLabel lblIdHrtc_2 = new JLabel("ID : HrtC3");
		lblIdHrtc_2.setForeground(new Color(0, 128, 128));
		lblIdHrtc_2.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblIdHrtc_2.setBounds(609, 226, 132, 26);
		contentPane.add(lblIdHrtc_2);
		
		JLabel lblIdHrtc_3 = new JLabel("ID : HrtC4");
		lblIdHrtc_3.setForeground(new Color(0, 128, 128));
		lblIdHrtc_3.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblIdHrtc_3.setBounds(898, 226, 132, 26);
		contentPane.add(lblIdHrtc_3);
		
		JLabel lblIdHrtc_4 = new JLabel("ID : HrtC5");
		lblIdHrtc_4.setForeground(new Color(0, 128, 128));
		lblIdHrtc_4.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblIdHrtc_4.setBounds(33, 488, 132, 26);
		contentPane.add(lblIdHrtc_4);
		
		JLabel lblIdHrtc_5 = new JLabel("ID : HrtC6");
		lblIdHrtc_5.setForeground(new Color(0, 128, 128));
		lblIdHrtc_5.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblIdHrtc_5.setBounds(331, 484, 132, 26);
		contentPane.add(lblIdHrtc_5);
		
		JLabel lblIdHrtc_6 = new JLabel("ID : HrtC7");
		lblIdHrtc_6.setForeground(new Color(0, 128, 128));
		lblIdHrtc_6.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblIdHrtc_6.setBounds(610, 488, 132, 26);
		contentPane.add(lblIdHrtc_6);
		
		JLabel lblIdHrtc_7 = new JLabel("ID : HrtC8");
		lblIdHrtc_7.setForeground(new Color(0, 128, 128));
		lblIdHrtc_7.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblIdHrtc_7.setBounds(898, 488, 132, 26);
		contentPane.add(lblIdHrtc_7);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(heartsahpe.class.getResource("/heartshape/images.jpg")));
		lblNewLabel.setBounds(0, 0, 1189, 575);
		contentPane.add(lblNewLabel);
	}
}
