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

public class egglesscake extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					egglesscake frame = new egglesscake();
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
	public egglesscake() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1200, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRs = new JLabel("Rs.799");
		lblRs.setBounds(212, 16, 69, 20);
		lblRs.setForeground(Color.BLACK);
		lblRs.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRs.setBackground(Color.WHITE);
		contentPane.add(lblRs);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setBounds(31, 16, 250, 181);
		label_1.setIcon(new ImageIcon(egglesscake.class.getResource("/egglesscake/1.heartshaped.jpg")));
		contentPane.add(label_1);
		
		JLabel lblSnowKissed = new JLabel(" Snow Kissed Vanilla");
		lblSnowKissed.setBounds(41, 189, 220, 37);
		lblSnowKissed.setForeground(new Color(128, 0, 128));
		lblSnowKissed.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		contentPane.add(lblSnowKissed);
		
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
		button.setBounds(189, 224, 92, 29);
		button.setFont(new Font("Ravie", Font.BOLD | Font.ITALIC, 15));
		contentPane.add(button);
		
		JLabel lblRs_1 = new JLabel("Rs.1199");
		lblRs_1.setBounds(495, 16, 69, 20);
		lblRs_1.setForeground(Color.BLACK);
		lblRs_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRs_1.setBackground(Color.WHITE);
		contentPane.add(lblRs_1);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setBounds(320, 16, 250, 181);
		label_2.setIcon(new ImageIcon(egglesscake.class.getResource("/egglesscake/2.red-velvet-fruit.jpg")));
		contentPane.add(label_2);
		
		JLabel lblRedVelvetFruit = new JLabel("Luxurious Red Velvet Fruit");
		lblRedVelvetFruit.setBounds(310, 189, 275, 37);
		lblRedVelvetFruit.setForeground(new Color(128, 0, 128));
		lblRedVelvetFruit.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		contentPane.add(lblRedVelvetFruit);
		
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
		button_1.setBounds(478, 224, 92, 29);
		button_1.setFont(new Font("Ravie", Font.BOLD | Font.ITALIC, 15));
		contentPane.add(button_1);
		
		JLabel lblRs_2 = new JLabel("Rs.1049");
		lblRs_2.setBounds(788, 16, 69, 20);
		lblRs_2.setForeground(Color.BLACK);
		lblRs_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRs_2.setBackground(Color.WHITE);
		contentPane.add(lblRs_2);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setBounds(613, 16, 250, 181);
		label_3.setIcon(new ImageIcon(egglesscake.class.getResource("/egglesscake/3.funfetti-rainbow.jpg")));
		contentPane.add(label_3);
		
		JLabel lblFunfettiRainbowTower = new JLabel("Funfetti Rainbow Tower");
		lblFunfettiRainbowTower.setBounds(621, 189, 242, 37);
		lblFunfettiRainbowTower.setForeground(new Color(128, 0, 128));
		lblFunfettiRainbowTower.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		contentPane.add(lblFunfettiRainbowTower);
		
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
		button_2.setBounds(771, 224, 92, 29);
		button_2.setFont(new Font("Ravie", Font.BOLD | Font.ITALIC, 15));
		contentPane.add(button_2);
		
		JLabel lblRs_3 = new JLabel("Rs.679");
		lblRs_3.setBounds(1082, 16, 69, 20);
		lblRs_3.setForeground(Color.BLACK);
		lblRs_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRs_3.setBackground(Color.WHITE);
		contentPane.add(lblRs_3);
		
		JLabel label_4 = new JLabel("New label");
		label_4.setBounds(901, 16, 250, 181);
		label_4.setIcon(new ImageIcon(egglesscake.class.getResource("/egglesscake/4.snicker-chocolate.jpg")));
		contentPane.add(label_4);
		
		JLabel lblFuseFiesta = new JLabel("Fuse Fiesta Snicker Chocolate");
		lblFuseFiesta.setBounds(878, 189, 300, 37);
		lblFuseFiesta.setForeground(new Color(128, 0, 128));
		lblFuseFiesta.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		contentPane.add(lblFuseFiesta);
		
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
		button_3.setBounds(1059, 224, 92, 29);
		button_3.setFont(new Font("Ravie", Font.BOLD | Font.ITALIC, 15));
		contentPane.add(button_3);
		
		JLabel lblRs_4 = new JLabel("Rs.4499");
		lblRs_4.setBounds(212, 270, 69, 20);
		lblRs_4.setForeground(Color.BLACK);
		lblRs_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRs_4.setBackground(Color.WHITE);
		contentPane.add(lblRs_4);
		
		JLabel label_5 = new JLabel("New label");
		label_5.setBounds(31, 270, 250, 181);
		label_5.setIcon(new ImageIcon(egglesscake.class.getResource("/egglesscake/5.Two Layer PhotoCake.jpg")));
		contentPane.add(label_5);
		
		JLabel lblFloralDelightTwolay = new JLabel("Floral Delight Two-layered ");
		lblFloralDelightTwolay.setBounds(18, 446, 263, 37);
		lblFloralDelightTwolay.setForeground(new Color(128, 0, 128));
		lblFloralDelightTwolay.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		contentPane.add(lblFloralDelightTwolay);
		
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
		button_4.setBounds(189, 480, 92, 29);
		button_4.setFont(new Font("Ravie", Font.BOLD | Font.ITALIC, 15));
		contentPane.add(button_4);
		
		JLabel lblRs_5 = new JLabel("Rs.649");
		lblRs_5.setBounds(495, 270, 69, 20);
		lblRs_5.setForeground(Color.BLACK);
		lblRs_5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRs_5.setBackground(Color.WHITE);
		contentPane.add(lblRs_5);
		
		JLabel label_6 = new JLabel("New label");
		label_6.setBounds(320, 271, 250, 181);
		label_6.setIcon(new ImageIcon(egglesscake.class.getResource("/egglesscake/6.kiwi-fruit-cake.jpg")));
		contentPane.add(label_6);
		
		JLabel lblKiwiLu = new JLabel("Kiwi Licious Fruit");
		lblKiwiLu.setBounds(348, 446, 204, 37);
		lblKiwiLu.setForeground(new Color(128, 0, 128));
		lblKiwiLu.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		contentPane.add(lblKiwiLu);
		
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
		button_5.setBounds(478, 480, 92, 29);
		button_5.setFont(new Font("Ravie", Font.BOLD | Font.ITALIC, 15));
		contentPane.add(button_5);
		
		JLabel lblRs_6 = new JLabel("Rs.699");
		lblRs_6.setBounds(767, 283, 69, 20);
		lblRs_6.setForeground(Color.BLACK);
		lblRs_6.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRs_6.setBackground(Color.WHITE);
		contentPane.add(lblRs_6);
		
		JLabel label_7 = new JLabel("New label");
		label_7.setBounds(613, 269, 250, 181);
		label_7.setIcon(new ImageIcon(egglesscake.class.getResource("/egglesscake/7.orange-hollow.jpg")));
		contentPane.add(label_7);
		
		JLabel lblTropiliciousTreatOrange = new JLabel("Tropilicious Orange Hollow ");
		lblTropiliciousTreatOrange.setBounds(593, 446, 275, 37);
		lblTropiliciousTreatOrange.setForeground(new Color(128, 0, 128));
		lblTropiliciousTreatOrange.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		contentPane.add(lblTropiliciousTreatOrange);
		
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
		button_6.setBounds(771, 480, 92, 29);
		button_6.setFont(new Font("Ravie", Font.BOLD | Font.ITALIC, 15));
		contentPane.add(button_6);
		
		JLabel lblRs_7 = new JLabel("Rs.579");
		lblRs_7.setBounds(1082, 283, 69, 20);
		lblRs_7.setForeground(Color.BLACK);
		lblRs_7.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRs_7.setBackground(Color.WHITE);
		contentPane.add(lblRs_7);
		
		JLabel label_8 = new JLabel("New label");
		label_8.setBounds(901, 269, 250, 181);
		label_8.setIcon(new ImageIcon(egglesscake.class.getResource("/egglesscake/8.oreo-chocolate.jpg")));
		contentPane.add(label_8);
		
		JLabel lblOreoholicsDelightOreo = new JLabel("Oreoholic Delight Oreo");
		lblOreoholicsDelightOreo.setBounds(901, 446, 262, 37);
		lblOreoholicsDelightOreo.setForeground(new Color(128, 0, 128));
		lblOreoholicsDelightOreo.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		contentPane.add(lblOreoholicsDelightOreo);
		
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
		button_7.setBounds(1059, 480, 92, 29);
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
		           
		        	orderinfo oi=new orderinfo();
		        	oi.setVisible(true);
		        	dispose();
		        }
			}
		});
		btnNext.setBounds(1109, 531, 72, 29);
		btnNext.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		contentPane.add(btnNext);
		
		JLabel lblIdEglc = new JLabel("ID : EglC1");
		lblIdEglc.setForeground(new Color(0, 128, 128));
		lblIdEglc.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblIdEglc.setBounds(31, 227, 132, 26);
		contentPane.add(lblIdEglc);
		
		JLabel lblIdEglc_1 = new JLabel("ID : EglC2");
		lblIdEglc_1.setForeground(new Color(0, 128, 128));
		lblIdEglc_1.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblIdEglc_1.setBounds(320, 227, 132, 26);
		contentPane.add(lblIdEglc_1);
		
		JLabel lblIdEglc_2 = new JLabel("ID : EglC3");
		lblIdEglc_2.setForeground(new Color(0, 128, 128));
		lblIdEglc_2.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblIdEglc_2.setBounds(613, 227, 132, 26);
		contentPane.add(lblIdEglc_2);
		
		JLabel lblIdEglc_3 = new JLabel("ID : EglC4");
		lblIdEglc_3.setForeground(new Color(0, 128, 128));
		lblIdEglc_3.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblIdEglc_3.setBounds(901, 227, 132, 26);
		contentPane.add(lblIdEglc_3);
		
		JLabel lblIdEglc_4 = new JLabel("ID : EglC5");
		lblIdEglc_4.setForeground(new Color(0, 128, 128));
		lblIdEglc_4.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblIdEglc_4.setBounds(31, 483, 132, 26);
		contentPane.add(lblIdEglc_4);
		
		JLabel lblIdEglc_5 = new JLabel("ID : EglC6");
		lblIdEglc_5.setForeground(new Color(0, 128, 128));
		lblIdEglc_5.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblIdEglc_5.setBounds(320, 483, 132, 26);
		contentPane.add(lblIdEglc_5);
		
		JLabel lblIdEglc_6 = new JLabel("ID : EglC7");
		lblIdEglc_6.setForeground(new Color(0, 128, 128));
		lblIdEglc_6.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblIdEglc_6.setBounds(613, 483, 132, 26);
		contentPane.add(lblIdEglc_6);
		
		JLabel lblIdEglc_7 = new JLabel("ID : EglC8");
		lblIdEglc_7.setForeground(new Color(0, 128, 128));
		lblIdEglc_7.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblIdEglc_7.setBounds(901, 483, 132, 26);
		contentPane.add(lblIdEglc_7);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(egglesscake.class.getResource("/egglesscake/Home  Etchea Caf Bakery  Catering.png")));
		lblNewLabel.setBounds(-11, 0, 1199, 560);
		contentPane.add(lblNewLabel);
	}

}
