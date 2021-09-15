
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

public class login extends JFrame 
{

	private JTextField email;
	private JTextField password;
	private JTextField name_field;
	private JTextField address_field;
	private JTextField country_field;
	private JTextField mobile_field;
	private JTextField password_field;
	private JTextField con_pass_field;
	private JTextField gender_field;
	private JTextField email_field;
	private JPanel panel;
	private JPanel contentPane;
	
	
/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
					frame.setVisible(true);
					}
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.*/
	
public login()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1200, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome To The House Of Cake");
		lblNewLabel.setBounds(158, 28, 787, 51);
		lblNewLabel.setForeground(new Color(75, 0, 130));
		lblNewLabel.setFont(new Font("Ravie", Font.BOLD | Font.ITALIC, 35));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(95, 10, 65, 74);
		lblNewLabel_1.setIcon(new ImageIcon(login.class.getResource("/img/Chef-icon.png")));
		contentPane.add(lblNewLabel_1);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setBounds(934, 9, 65, 74);
		label_1.setIcon(new ImageIcon(login.class.getResource("/img/Chef-icon.png")));
		contentPane.add(label_1);
		
		JLabel lblNewLabel_2 = new JLabel("Email / Mob");
		lblNewLabel_2.setBounds(797, 196, 253, 41);
		lblNewLabel_2.setBackground(new Color(0, 255, 255));
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Wide Latin", Font.BOLD | Font.ITALIC, 20));
		contentPane.add(lblNewLabel_2);
		
		email = new JTextField();
		email.setBounds(782, 236, 381, 41);
		contentPane.add(email);
		email.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(797, 293, 270, 41);
		lblPassword.setForeground(Color.BLACK);
		lblPassword.setFont(new Font("Wide Latin", Font.BOLD | Font.ITALIC, 20));
		contentPane.add(lblPassword);	
		
		
		password = new JPasswordField();
		password.setBounds(782, 331, 381, 41);
		contentPane.add(password);
		password.setColumns(10);
		
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(913, 108, 97, 87);
		lblNewLabel_3.setIcon(new ImageIcon(login.class.getResource("/img/Login-icon.png")));
		contentPane.add(lblNewLabel_3);
	
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(209, 99, 133, 104);
		lblNewLabel_4.setIcon(new ImageIcon(login.class.getResource("/img/Login-Registration-icon.png")));
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Sing Up");
		btnNewButton.setBounds(219, 207, 117, 41);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String cmd = e.getActionCommand();

		        if(cmd.equals("Create Account"))
		        {
		        	panel.setVisible(true);
		    		
		        }
				
			}
		});
		
		contentPane.add(btnNewButton);
		
		panel = new JPanel();
		panel.setBounds(15, 264, 699, 265);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
		panel.setVisible(false);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("Name :-");
		lblNewLabel_7.setBounds(15, 16, 57, 20);
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		panel.add(lblNewLabel_7);
		
		name_field = new JTextField();
		name_field.setBounds(74, 16, 227, 20);
		panel.add(name_field);
		name_field.setColumns(10);
		
		JLabel lblAddress = new JLabel("Address :-");
		lblAddress.setBounds(15, 52, 65, 20);
		lblAddress.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		panel.add(lblAddress);
		
		address_field = new JTextField();
		address_field.setBounds(84, 52, 249, 41);
		address_field.setColumns(10);
		panel.add(address_field);
		
		JLabel lblGender = new JLabel("Gender :-");
		lblGender.setBounds(15, 106, 65, 20);
		lblGender.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		panel.add(lblGender);
		
		gender_field = new JTextField();
		gender_field.setBounds(84, 109, 114, 20);
		gender_field.setColumns(10);
		panel.add(gender_field);
		
		JLabel lblCountry = new JLabel("Country :-");
		lblCountry.setBounds(15, 142, 65, 20);
		lblCountry.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		panel.add(lblCountry);
		
		country_field = new JTextField();
		country_field.setBounds(84, 141, 114, 20);
		country_field.setColumns(10);
		panel.add(country_field);
		
		JLabel lblMobno = new JLabel("Mob_No :-");
		lblMobno.setBounds(15, 178, 71, 20);
		lblMobno.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		panel.add(lblMobno);
		
		mobile_field = new JTextField();
		mobile_field.setBounds(84, 177, 156, 20);
		mobile_field.setColumns(10);
		panel.add(mobile_field);
		
		JLabel lblPassword_1 = new JLabel("Password");
		lblPassword_1.setBounds(410, 80, 81, 20);
		lblPassword_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		panel.add(lblPassword_1);
		
		password_field = new JTextField();
		password_field.setBounds(410, 101, 197, 29);
		panel.add(password_field);
		password_field.setColumns(10);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password");
		lblConfirmPassword.setBounds(410, 142, 134, 20);
		lblConfirmPassword.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		panel.add(lblConfirmPassword);
		
		con_pass_field = new JTextField();
		con_pass_field.setBounds(410, 161, 197, 29);
		con_pass_field.setColumns(10);
		panel.add(con_pass_field);
		
		
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(410, 15, 57, 20);
		lblEmail.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		panel.add(lblEmail);
		
		email_field = new JTextField();
		email_field.setBounds(410, 35, 274, 29);
		email_field.setColumns(10);
		panel.add(email_field);
	
	
		
	
		
		JButton btnNewButton_1 = new JButton("Submit");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		btnNewButton_1.setBounds(15, 220, 88, 29);
		panel.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
			
				try 
			 	{
			 		Class.forName("com.mysql.cj.jdbc.Driver");
			 		System.out.println("Connecting to database");
			 		System.out.println("Connected sussfully");
				
			 		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_registration" ,"root" ,"teju");
			 		PreparedStatement ps= con.prepareStatement("insert into memberinfotable values(?,?,?,?,?,?,?,?)");
			 		ps.setString(1, name_field.getText());
			 		ps.setString(2, address_field.getText());
			 		ps.setString(3, gender_field.getText());
			 		ps.setString(4, country_field.getText());
			 		ps.setString(5, mobile_field.getText());
			 		ps.setString(6, email_field.getText());
			 		ps.setString(7, password_field.getText());
			 		ps.setString(8, con_pass_field.getText());
			 		
			 	
			 		 int x = ps.executeUpdate();
			 		 if(x>0)
			 		 {
			 			 System.out.println("Registration submitted successfully..");
			 		 }
			 		 else
			 		 {
			 			 System.out.println("Registration Failed...");
			 		 }
			 		
			 		
				}
			 	
				
				catch(SQLException sql)
				{
					System.out.println(sql);
				}


					catch(Exception e)
					{
						 
						System.out.println(e);
					}
				}
		});
	
		
		JButton delete = new JButton("Delete");
        delete.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		delete.setBounds(137, 220, 88, 29);
		panel.add(delete);
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try 
			 	{
					
					
			 		Class.forName("com.mysql.cj.jdbc.Driver");
			 		System.out.println("Connecting to database");
			 		System.out.println("Connected sussfully");
			 		
			 		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_registration" ,"root" ,"teju");
			 		PreparedStatement ps1=conn.prepareStatement("Delete from memberinfotable where name=?");  
	                ps1.setString(1,name_field.getText());  
	                int x=ps1.executeUpdate();
	                
	                if(x>0)
			 		 {
			 			 JOptionPane.showMessageDialog(null, "Record Deleted Successfully...");
			 			
			 		 }
			 		 else
			 		 {
			 			JOptionPane.showMessageDialog(null, "Invalid Record...");
			 		 }
			 		
					}
	        
			 	
				
				catch(SQLException sql)
				{
					System.out.println(sql);
				}


					catch(Exception e1)
					{
						 
						System.out.println(e1);
					}
							
			}
		});
	
		
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		btnUpdate.setBounds(251, 220, 88, 29);
		panel.add(btnUpdate);
		
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try 
			 	{
					
					
			 		Class.forName("com.mysql.cj.jdbc.Driver");
			 		System.out.println("Connecting to database");
			 		System.out.println("Connected sussfully");
			 		
			 		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_registration" ,"root" ,"teju");
			 		PreparedStatement ps1=conn.prepareStatement("Update memberinfotable set address=?, gender=?, country=?, mobile=?, email=?, password=?, confirm_password=? where name=?");
			 		
			 	
			 	    ps1.setString(1, gender_field.getText());
			 	    ps1.setString(2, address_field.getText());
			 	    ps1.setString(3, country_field.getText());
			 		ps1.setString(4, mobile_field.getText());
			 		ps1.setString(5, email_field.getText());
			 		ps1.setString(6, password_field.getText());
			 		ps1.setString(7, con_pass_field.getText());
			 	    ps1.setString(8,name_field.getText());
			 	   int x=ps1.executeUpdate();
			 	   
			 	 if(x>0)
			 		 {
			 			 JOptionPane.showMessageDialog(null, "Record Updated Successfully...");
			 			
			 		 }
			 		 else
			 		 {
			 			JOptionPane.showMessageDialog(null, "Invalid Record...");
			 		 }
			 		
					}
	        
			 	
				
				catch(SQLException sql)
				{
					System.out.println(sql);
				}


					catch(Exception e1)
					{
						 
						System.out.println(e1);
					}
							
			}
		});
	
		
		JButton btnClear = new JButton("Clear");
		btnClear.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		btnClear.setBounds(360, 220, 88, 29);
		panel.add(btnClear);
		btnClear.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				name_field.setText("");
			 	address_field.setText("");
			 	country_field.setText("");
				mobile_field.setText("");
				password_field.setText("");
				con_pass_field.setText("");
				gender_field.setText("");
				email_field.setText("");
			
			 }
		});
		
		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		btnExit.setBounds(474, 220, 88, 29);
		panel.add(btnExit);
		btnExit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			
			 }
		});
		JButton btnDisplay = new JButton("Display");
		btnDisplay.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		btnDisplay.setBounds(584, 220, 88, 29);
		panel.add(btnDisplay);
		btnDisplay.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				  try{
						
				 		Class.forName("com.mysql.cj.jdbc.Driver");
				 		System.out.println("Connecting to database");
				 		System.out.println("Connected sussfully");
				 		
				 		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_registration" ,"root" ,"teju");
				 		PreparedStatement ps = conn.prepareStatement("select * from memberinfotable");
					  
				 		ResultSet rs = ps.executeQuery();
						while(rs.next())
						{
							System.out.println("\n Name: "+rs.getString(1)+"\n Address: "+rs.getString(2)+"\n Country: "+rs.getString(3)+"\n Gender: "+rs.getString(4)+"\n Mobile: "+rs.getString(5)+"\n Password: "+rs.getString(6)+"\n Confirm_Password: "+rs.getString(7)+"\n Email: "+rs.getString(8));
							System.out.println("------------------------------");
						}
					}

					catch(SQLException sql)
					{
						System.out.println(sql);
					}


						catch(Exception e1)
						{
							 
							System.out.println(e1);
						}
	
			 }
		});
		
		
		
		JButton btnLogin = new JButton("LogIn");
		btnLogin.setIcon(new ImageIcon(login.class.getResource("/img/Ok-icon.png")));

		btnLogin.setBounds(894, 449, 140, 51);
		btnLogin.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		contentPane.add(btnLogin);
		
		btnLogin.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try 
			 	{
					if (email != null && password != null)
					{
			 		Class.forName("com.mysql.cj.jdbc.Driver");
			 		System.out.println("Connecting to database");
			 		System.out.println("Connected sussfully");
				
			 		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_registration" ,"root" ,"teju");

                   PreparedStatement ps1=conn.prepareStatement(  "select * from memberinfotable where email=? and password=?");  
                   ps1.setString(1,email.getText());  
                   ps1.setString(2,password.getText());  
                   ResultSet rs=ps1.executeQuery();
                   
			 		
			 	    if(rs.next())
			 		 {
			 			 JOptionPane.showMessageDialog(null, "Login successfully...");
			 			 new homepage().setVisible(true);
			 		 }
			 		 else
			 		 {
			 			JOptionPane.showMessageDialog(null, "Login Failed...");
			 		 }
			 		
					}
				
			}
				
				catch(SQLException sql)
				{
					System.out.println(sql);
				}


					catch(Exception e1)
					{
						 
						System.out.println(e1);
					}
				
			
					dispose();		
			}
		});
	
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(729, 236, 52, 41);
		lblNewLabel_5.setIcon(new ImageIcon(login.class.getResource("/img/App-login-manager-icon.png")));
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(729, 331, 47, 41);
		lblNewLabel_6.setIcon(new ImageIcon(login.class.getResource("/img/Register-icon.png")));
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setIcon(new ImageIcon(login.class.getResource("/img/cupcake-high-.jpg")));
		
		lblNewLabel_9.setBounds(-11, 0, 1199, 558);
		contentPane.add(lblNewLabel_9);
		
		
	}
}
