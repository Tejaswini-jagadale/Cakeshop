import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class homepage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					homepage frame = new homepage();
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
	public homepage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1200, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0,0,0,0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("what's your special occasion");
		lblNewLabel.setForeground(Color.CYAN);
		lblNewLabel.setBounds(162, 36, 833, 63);
		lblNewLabel.setFont(new Font("Ravie", Font.BOLD | Font.ITALIC, 40));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(987, 2, 103, 116);
		lblNewLabel_1.setIcon(new ImageIcon(homepage.class.getResource("/img/Happy-Birthday.png")));
		contentPane.add(lblNewLabel_1);
		
		JLabel label = new JLabel("New label");
		label.setBounds(60, 2, 103, 116);
		label.setIcon(new ImageIcon(homepage.class.getResource("/img/Happy-Birthday.png")));
		contentPane.add(label);
		
		JLabel lblNewLabel_2 = new JLabel("Menu Card");
		lblNewLabel_2.setForeground(new Color(255, 0, 255));
		lblNewLabel_2.setBounds(519, 96, 207, 48);
		lblNewLabel_2.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_2.setIcon(new ImageIcon(homepage.class.getResource("/img/Start-Menu.png")));
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("CupCake");
		btnNewButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String cmd = e.getActionCommand();

		        if(cmd.equals("CupCake"))
		        {
		           
		        	cupcake ck=new cupcake();
		        	ck.setVisible(true);
		        	homepage.this.dispose();
		        }
			}
		});
		btnNewButton.setIcon(new ImageIcon(homepage.class.getResource("/img/cupcakeButton.png")));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnNewButton.setBounds(15, 178, 226, 48);
		contentPane.add(btnNewButton);
		
		JButton btnPastries = new JButton("Pastries");
		btnPastries.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String cmd = e.getActionCommand();

		        if(cmd.equals("Pastries"))
		        {
		           
		        	pastries p=new pastries();
		        	p.setVisible(true);
		        	homepage.this.dispose();
		        }
			}
		});
		btnPastries.setIcon(new ImageIcon(homepage.class.getResource("/img/Piece-of-cake-.png")));
		btnPastries.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnPastries.setBounds(386, 178, 225, 48);
		contentPane.add(btnPastries);
		
		JButton btnEgglessCake = new JButton("Eggless Cake");
		btnEgglessCake.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{

				String cmd = e.getActionCommand();

		        if(cmd.equals("Eggless Cake"))
		        {
		           
		        	egglesscake eg=new egglesscake ();
		        	eg.setVisible(true);
		        	homepage.this.dispose();
		        }
			}
		});
		btnEgglessCake.setIcon(new ImageIcon(homepage.class.getResource("/img/eggless cake.png")));
		btnEgglessCake.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnEgglessCake.setBounds(785, 167, 226, 48);
		contentPane.add(btnEgglessCake);
		
		JButton btnRegularCake = new JButton("Regular Cake");
		btnRegularCake.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				String cmd = e.getActionCommand();

		        if(cmd.equals("Regular Cake"))
		        {
		           
		        	regularcake rc=new regularcake();
		        	rc.setVisible(true);
		        	homepage.this.dispose();
		        }
			}
		});
		btnRegularCake.setIcon(new ImageIcon(homepage.class.getResource("/img/regular cake.png")));
		btnRegularCake.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnRegularCake.setBounds(865, 307, 225, 48);
		contentPane.add(btnRegularCake);
		
		JButton btnPartyCake = new JButton("Party Cake");
		btnPartyCake.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{

				String cmd = e.getActionCommand();

		        if(cmd.equals("Party Cake"))
		        {
		           
		        	partycake pc=new partycake();
		        	pc.setVisible(true);
		        	homepage.this.dispose();
		        }
				
			}
		});
		btnPartyCake.setIcon(new ImageIcon(homepage.class.getResource("/img/partycake.png")));
		btnPartyCake.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnPartyCake.setBounds(128, 307, 240, 48);
		contentPane.add(btnPartyCake);
		
		JButton btnPhotoCake = new JButton("Photo Cake");
		btnPhotoCake.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{

				String cmd = e.getActionCommand();

		        if(cmd.equals("Photo Cake"))
		        {
		           
		        	photocake pc=new photocake ();
		        	pc.setVisible(true);
		        	homepage.this.dispose();
		        }
			}
		});
		btnPhotoCake.setIcon(new ImageIcon(homepage.class.getResource("/img/photocake.png")));
		btnPhotoCake.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnPhotoCake.setBounds(720, 423, 240, 48);
		contentPane.add(btnPhotoCake);
		
		JButton btnHeartshapeCake = new JButton("Heart Shape Cake");
		btnHeartshapeCake.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{

				String cmd = e.getActionCommand();

		        if(cmd.equals("Heart Shape Cake"))
		        {
		           
		        	heartsahpe hs=new heartsahpe();
		        	hs.setVisible(true);
		        	homepage.this.dispose();
		        }
			}
		});
		btnHeartshapeCake.setIcon(new ImageIcon(homepage.class.getResource("/img/heartshape.png")));
		btnHeartshapeCake.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnHeartshapeCake.setBounds(486, 307, 240, 48);
		contentPane.add(btnHeartshapeCake);
		
		JButton btnDesignerCake = new JButton("Designer Cake");
		btnDesignerCake.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String cmd = e.getActionCommand();

		        if(cmd.equals("Designer Cake"))
		        {
		           
		        	designercake dc=new designercake();
		        	dc.setVisible(true);
		        	homepage.this.dispose();
		        }
			}
		});
		btnDesignerCake.setIcon(new ImageIcon(homepage.class.getResource("/img/desiner.png")));
		btnDesignerCake.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnDesignerCake.setBounds(328, 423, 240, 48);
		contentPane.add(btnDesignerCake);
		
		JButton btnNewButton_1 = new JButton("Next");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		btnNewButton_1.setBounds(1076, 515, 87, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String cmd = e.getActionCommand();

		        if(cmd.equals("Back"))
		        {
		           
		        	login l=new login();
		        	l.setVisible(true);
		        	dispose();
		        }
			}
		});
		btnBack.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		btnBack.setBounds(15, 515, 87, 29);
		contentPane.add(btnBack);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(homepage.class.getResource("/img/cupcakes-strawberries1.jpg")));
	
	
	
		lblNewLabel_3.setBounds(0, 2, 1189, 554);
		contentPane.add(lblNewLabel_3);
	}
}
