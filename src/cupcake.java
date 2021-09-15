import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JFormattedTextField;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class cupcake extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cupcake frame = new cupcake();
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
	public cupcake() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1200, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Rs.199");
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setBounds(15, 161, 69, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Overloaded Choco Cupcake");
		lblNewLabel_2.setForeground(new Color(128, 0, 128));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		lblNewLabel_2.setBounds(15, 197, 289, 37);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(cupcake.class.getResource("/cupcake/1.choco-cupcake.jpg")));
		lblNewLabel.setBounds(15, 16, 250, 181);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Buy");
		btnNewButton.addActionListener(new ActionListener() {
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
		btnNewButton.setFont(new Font("Ravie", Font.BOLD | Font.ITALIC, 15));
		btnNewButton.setBounds(173, 235, 92, 29);
		contentPane.add(btnNewButton);
		
		JLabel lblRs = new JLabel("Rs.249");
		lblRs.setForeground(Color.BLACK);
		lblRs.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRs.setBackground(Color.WHITE);
		lblRs.setBounds(503, 161, 69, 20);
		contentPane.add(lblRs);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setIcon(new ImageIcon(cupcake.class.getResource("/cupcake/2.pineapple-love.jpg")));
		label_1.setBounds(322, 16, 250, 181);
		contentPane.add(label_1);
		
		JLabel lblPineappleLove = new JLabel("Pineapple Love Cupcake");
		lblPineappleLove.setForeground(new Color(128, 0, 128));
		lblPineappleLove.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		lblPineappleLove.setBounds(332, 197, 250, 37);
		contentPane.add(lblPineappleLove);
		
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
		button.setBounds(480, 235, 92, 29);
		contentPane.add(button);
		
		JLabel lblRs_1 = new JLabel("Rs.280");
		lblRs_1.setForeground(Color.BLACK);
		lblRs_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRs_1.setBackground(Color.WHITE);
		lblRs_1.setBounds(711, 161, 69, 20);
		contentPane.add(lblRs_1);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setIcon(new ImageIcon(cupcake.class.getResource("/cupcake/3.Anniversary-CupCake.jpg")));
		label_2.setBounds(621, 16, 250, 181);
		contentPane.add(label_2);
		
		JLabel lblLusciouslyYours = new JLabel("Lusciously Yours Cupcake");
		lblLusciouslyYours.setForeground(new Color(128, 0, 128));
		lblLusciouslyYours.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		lblLusciouslyYours.setBounds(621, 197, 264, 37);
		contentPane.add(lblLusciouslyYours);
		
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
		button_1.setBounds(779, 235, 92, 29);
		contentPane.add(button_1);
		
		JLabel lblRs_2 = new JLabel("Rs.310");
		lblRs_2.setForeground(Color.BLACK);
		lblRs_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRs_2.setBackground(Color.WHITE);
		lblRs_2.setBounds(918, 161, 69, 20);
		contentPane.add(lblRs_2);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setIcon(new ImageIcon(cupcake.class.getResource("/cupcake/4.cutelicious-strawberry.jpg")));
		label_3.setBounds(913, 16, 250, 181);
		contentPane.add(label_3);
		
		JLabel lblCuteliciousStrawberryCupcake = new JLabel("Strawberry Kitty Cupcake");
		lblCuteliciousStrawberryCupcake.setForeground(new Color(128, 0, 128));
		lblCuteliciousStrawberryCupcake.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		lblCuteliciousStrawberryCupcake.setBounds(914, 197, 264, 37);
		contentPane.add(lblCuteliciousStrawberryCupcake);
		
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
		button_1.setFont(new Font("Ravie", Font.BOLD | Font.ITALIC, 15));
		button_1.setBounds(779, 235, 92, 29);
		contentPane.add(button_1);
		
		button_2.setFont(new Font("Ravie", Font.BOLD | Font.ITALIC, 15));
		button_2.setBounds(1071, 235, 92, 29);
		contentPane.add(button_2);
		
		JLabel lblRs_3 = new JLabel("Rs.299");
		lblRs_3.setForeground(Color.BLACK);
		lblRs_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRs_3.setBackground(Color.WHITE);
		lblRs_3.setBounds(64, 442, 69, 20);
		contentPane.add(lblRs_3);
		
		JLabel label_4 = new JLabel("New label");
		label_4.setIcon(new ImageIcon(cupcake.class.getResource("/cupcake/minion-cupcake.jpg")));
		label_4.setBounds(15, 281, 250, 181);
		contentPane.add(label_4);
		
		JLabel lblMinionCutenessCupcake = new JLabel("Minion Cuteness Cupcake");
		lblMinionCutenessCupcake.setForeground(new Color(128, 0, 128));
		lblMinionCutenessCupcake.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		lblMinionCutenessCupcake.setBounds(15, 463, 264, 37);
		contentPane.add(lblMinionCutenessCupcake);
		
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
		button_1.setFont(new Font("Ravie", Font.BOLD | Font.ITALIC, 15));
		button_1.setBounds(779, 235, 92, 29);
		contentPane.add(button_1);
		
		button_3.setFont(new Font("Ravie", Font.BOLD | Font.ITALIC, 15));
		button_3.setBounds(173, 498, 92, 29);
		contentPane.add(button_3);
		
		JLabel lblRs_4 = new JLabel("Rs.219");
		lblRs_4.setForeground(Color.BLACK);
		lblRs_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRs_4.setBackground(Color.WHITE);
		lblRs_4.setBounds(322, 441, 69, 20);
		contentPane.add(lblRs_4);
		
		JLabel label_5 = new JLabel("New label");
		label_5.setIcon(new ImageIcon(cupcake.class.getResource("/cupcake/6.radiant-red-velvet.jpg")));
		label_5.setBounds(322, 280, 250, 181);
		contentPane.add(label_5);
		
		JLabel lblRadiantRedVelvet = new JLabel("Radiant Red Velvet Cupcake");
		lblRadiantRedVelvet.setForeground(new Color(128, 0, 128));
		lblRadiantRedVelvet.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		lblRadiantRedVelvet.setBounds(305, 463, 289, 37);
		contentPane.add(lblRadiantRedVelvet);
		
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
		button_1.setFont(new Font("Ravie", Font.BOLD | Font.ITALIC, 15));
		button_1.setBounds(779, 235, 92, 29);
		contentPane.add(button_1);
		
		button_4.setFont(new Font("Ravie", Font.BOLD | Font.ITALIC, 15));
		button_4.setBounds(480, 498, 92, 29);
		contentPane.add(button_4);
		
		JLabel lblRs_5 = new JLabel("Rs.249");
		lblRs_5.setForeground(Color.BLACK);
		lblRs_5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRs_5.setBackground(Color.WHITE);
		lblRs_5.setBounds(621, 442, 69, 20);
		contentPane.add(lblRs_5);
		
		JLabel label_6 = new JLabel("New label");
		label_6.setIcon(new ImageIcon(cupcake.class.getResource("/cupcake/7.sumptuous-cupcake.jpg")));
		label_6.setBounds(621, 280, 250, 181);
		contentPane.add(label_6);
		
		JLabel lblSumptuousVanillaCupcake = new JLabel("Sumptuous Vanilla Cupcake");
		lblSumptuousVanillaCupcake.setForeground(new Color(128, 0, 128));
		lblSumptuousVanillaCupcake.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		lblSumptuousVanillaCupcake.setBounds(607, 463, 289, 37);
		contentPane.add(lblSumptuousVanillaCupcake);
		
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
		button_1.setFont(new Font("Ravie", Font.BOLD | Font.ITALIC, 15));
		button_1.setBounds(779, 235, 92, 29);
		contentPane.add(button_1);
		
		button_5.setFont(new Font("Ravie", Font.BOLD | Font.ITALIC, 15));
		button_5.setBounds(779, 498, 92, 29);
		contentPane.add(button_5);
		
		JLabel label = new JLabel("270");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		label.setBackground(Color.WHITE);
		label.setBounds(918, 430, 69, 20);
		contentPane.add(label);
		
		JLabel label_7 = new JLabel("New label");
		label_7.setIcon(new ImageIcon(cupcake.class.getResource("/cupcake/8.tender-peanut-butter.jpg")));
		label_7.setBounds(913, 281, 250, 181);
		contentPane.add(label_7);
		
		JLabel lblPeanutButterCupcake = new JLabel("Peanut Butter Cupcake");
		lblPeanutButterCupcake.setForeground(new Color(128, 0, 128));
		lblPeanutButterCupcake.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		lblPeanutButterCupcake.setBounds(923, 463, 240, 37);
		contentPane.add(lblPeanutButterCupcake);
		
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
		button_1.setFont(new Font("Ravie", Font.BOLD | Font.ITALIC, 15));
		button_1.setBounds(779, 235, 92, 29);
		contentPane.add(button_1);
		
		button_6.setFont(new Font("Ravie", Font.BOLD | Font.ITALIC, 15));
		button_6.setBounds(1038, 498, 83, 29);
		contentPane.add(button_6);
		
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
		btnNext.setBounds(1109, 531, 69, 29);
		contentPane.add(btnNext);
		
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
		
		JLabel lblIdCupc = new JLabel("ID : CupC1");
		lblIdCupc.setForeground(new Color(0, 128, 128));
		lblIdCupc.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblIdCupc.setBounds(15, 238, 132, 26);
		contentPane.add(lblIdCupc);
		
		JLabel lblIdCupc_1 = new JLabel("ID : CupC2");
		lblIdCupc_1.setForeground(new Color(0, 128, 128));
		lblIdCupc_1.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblIdCupc_1.setBounds(322, 234, 132, 26);
		contentPane.add(lblIdCupc_1);
		
		JLabel lblIdCupc_2 = new JLabel("ID : CupC3");
		lblIdCupc_2.setForeground(new Color(0, 128, 128));
		lblIdCupc_2.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblIdCupc_2.setBounds(621, 234, 132, 26);
		contentPane.add(lblIdCupc_2);
		
		JLabel lblIdCupc_3 = new JLabel("ID : CupC4");
		lblIdCupc_3.setForeground(new Color(0, 128, 128));
		lblIdCupc_3.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblIdCupc_3.setBounds(918, 235, 132, 26);
		contentPane.add(lblIdCupc_3);
		
		JLabel lblIdCupc_4 = new JLabel("ID : CupC5");
		lblIdCupc_4.setForeground(new Color(0, 128, 128));
		lblIdCupc_4.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblIdCupc_4.setBounds(15, 498, 132, 26);
		contentPane.add(lblIdCupc_4);
		
		JLabel lblIdPhc = new JLabel("ID : CupC6");
		lblIdPhc.setForeground(new Color(0, 128, 128));
		lblIdPhc.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblIdPhc.setBounds(322, 498, 132, 26);
		contentPane.add(lblIdPhc);
		
		JLabel lblIdCupc_5 = new JLabel("ID : CupC7");
		lblIdCupc_5.setForeground(new Color(0, 128, 128));
		lblIdCupc_5.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblIdCupc_5.setBounds(621, 498, 132, 26);
		contentPane.add(lblIdCupc_5);
		
		JLabel lblIdCupc_6 = new JLabel("ID : CupC8");
		lblIdCupc_6.setForeground(new Color(0, 128, 128));
		lblIdCupc_6.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblIdCupc_6.setBounds(913, 497, 125, 26);
		contentPane.add(lblIdCupc_6);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(cupcake.class.getResource("/img/500_.jpg")));
		lblNewLabel_3.setBounds(0, 0, 1178, 556);
		contentPane.add(lblNewLabel_3);
	}
}
