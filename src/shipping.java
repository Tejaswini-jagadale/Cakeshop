import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class shipping extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField address;
	private JTextField city;
	private JTextField state;
	private JTextField country;
	private JTextField zip;
	private JTextField mobile;
	private JTextField email;
	private JTable table;
	private JTextField date;
	private JTextField time;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					shipping frame = new shipping();
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
	public shipping() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1200, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(413, 3, 363, 50);
		panel.setBackground(new Color(224, 255, 255));
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Shipping Deatils");
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 30));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(15, 69, 1148, 225);
		panel_1.setBackground(new Color(255, 248, 220));
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Name :");
		lblNewLabel_1.setBounds(15, 16, 69, 20);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		panel_1.add(lblNewLabel_1);
		
		name = new JTextField();
		name.setBounds(137, 14, 200, 26);
		panel_1.add(name);
		name.setColumns(10);
		
		JLabel lblAddress = new JLabel("Address :");
		lblAddress.setBounds(15, 53, 87, 20);
		lblAddress.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		panel_1.add(lblAddress);
		
		address = new JTextField();
		address.setBounds(137, 51, 222, 26);
		address.setColumns(10);
		panel_1.add(address);
		
		JLabel lblCity = new JLabel("City :");
		lblCity.setBounds(478, 16, 50, 20);
		lblCity.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		panel_1.add(lblCity);
		
		city = new JTextField();
		city.setBounds(566, 14, 146, 26);
		city.setColumns(10);
		panel_1.add(city);
		
		JLabel lblState = new JLabel("State :");
		lblState.setBounds(478, 53, 56, 20);
		lblState.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		panel_1.add(lblState);
		
		state = new JTextField();
		state.setBounds(566, 51, 146, 26);
		state.setColumns(10);
		panel_1.add(state);
		
		JLabel lblCountry = new JLabel("Country :");
		lblCountry.setBounds(856, 16, 87, 20);
		lblCountry.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		panel_1.add(lblCountry);
		
		country = new JTextField();
		country.setBounds(979, 14, 146, 26);
		country.setColumns(10);
		panel_1.add(country);
		
		JLabel lblPostalCode = new JLabel("ZIP Code :");
		lblPostalCode.setBounds(843, 53, 100, 20);
		lblPostalCode.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		panel_1.add(lblPostalCode);
		
		zip = new JTextField();
		zip.setBounds(979, 51, 146, 26);
		zip.setColumns(10);
		panel_1.add(zip);
		
		JLabel lblMobileNo = new JLabel("Mobile No :");
		lblMobileNo.setBounds(15, 89, 107, 20);
		lblMobileNo.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		panel_1.add(lblMobileNo);
		
		mobile = new JTextField();
		mobile.setBounds(137, 87, 146, 26);
		mobile.setColumns(10);
		panel_1.add(mobile);
		
		JLabel lblEmailId = new JLabel("Email ID :");
		lblEmailId.setBounds(436, 89, 98, 20);
		lblEmailId.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		panel_1.add(lblEmailId);
		
		email = new JTextField();
		email.setBounds(566, 87, 222, 26);
		email.setColumns(10);
		panel_1.add(email);
		
		JLabel d_date = new JLabel("Delivery Date :");
		d_date.setBounds(237, 129, 130, 26);
		panel_1.add(d_date);
		d_date.setForeground(Color.BLACK);
		d_date.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		
		date = new JTextField();
		date.setBounds(368, 130, 146, 26);
		panel_1.add(date);
		date.setColumns(10);
		
		JLabel d_time = new JLabel("Delivery Time :");
		d_time.setBounds(608, 129, 139, 25);
		panel_1.add(d_time);
		d_time.setForeground(Color.BLACK);
		d_time.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		
		time = new JTextField();
		time.setBounds(745, 129, 146, 26);
		panel_1.add(time);
		time.setColumns(10);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.setBounds(316, 173, 115, 45);
		panel_1.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				try 
				{
				Class.forName("com.mysql.cj.jdbc.Driver");
		 		System.out.println("Connecting to database");
		 		System.out.println("Connected sussfully");
			
		 		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cakeshop" ,"root" ,"teju");
		 		PreparedStatement ps= con.prepareStatement("insert into shipping values(?,?,?,?,?,?,?,?,?,?)");
		 		
		 		ps.setString(1, name.getText());
		 		ps.setString(2, address.getText());			 		
		 		ps.setString(3, city.getText());
		 		ps.setString(4, state.getText());
		 		ps.setString(5, country.getText());
		 		ps.setString(6, zip.getText());
		 		ps.setString(7, mobile.getText());
		 		ps.setString(8, email.getText());
		 		ps.setString(9, date.getText());
		 		ps.setString(10, time.getText());
		 		
		 		
		 		int x=ps.executeUpdate();
		 		}
			
				catch(SQLException sql)
					{
					System.out.println(sql);
					}
				
			catch(Exception ae)
					{
					System.out.println(ae);
					}
			
			DefaultTableModel model=new DefaultTableModel();
			model=(DefaultTableModel)table.getModel();
			model.addRow(new Object[]
					{
							name.getText(),
							address.getText(),
							city.getText(),
							state.getText(),
							country.getText(),
							zip.getText(),
							mobile.getText(),
							email.getText(),
						 });
		}
	});
		btnNewButton.setFont(new Font("Agency FB", Font.BOLD | Font.ITALIC, 25));
		
		JLabel lblNewLabel_2 = new JLabel("*Place order by 8 PM for same-day delivery");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblNewLabel_2.setBounds(842, 195, 291, 20);
		panel_1.add(lblNewLabel_2);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) 
			{
				name.setText("");
			 	address.setText("");
			 	country.setText("");
				mobile.setText("");
				state.setText("");
				city.setText("");
				zip.setText("");
				email.setText("");
				date.setText("");
				time.setText("");
			
			}
		});
		btnClear.setFont(new Font("Agency FB", Font.BOLD | Font.ITALIC, 25));
		btnClear.setBounds(540, 173, 115, 45);
		panel_1.add(btnClear);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(15, 310, 1148, 205);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Address", "City", "State", "Country", "ZIP_Code", "Mobile_No", "Email_ID"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class, Integer.class, Integer.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table);
		

		
		JButton button = new JButton("Back");
		button.setBounds(5, 531, 72, 29);
		button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				String cmd = e.getActionCommand();

		        if(cmd.equals("Back"))
		        {

		        	orderinfo oi=new orderinfo ();
		        	oi.setVisible(true);
		        	dispose();
		        }
			}
		});
		button.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		contentPane.add(button);
		
		JButton button_1 = new JButton("Delete Row Data");
		button_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				DefaultTableModel model=new DefaultTableModel();
				model=(DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();
				model.removeRow(i);
			}
		});
		
		button_1.setFont(new Font("Eras Demi ITC", Font.BOLD | Font.ITALIC, 25));
		button_1.setBounds(439, 530, 275, 29);
		contentPane.add(button_1);
		
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(1109, 531, 72, 29);
		btnNext.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{

				String cmd = e.getActionCommand();

		        if(cmd.equals("Next"))
		        {
		           
		        	receipt rp=new receipt();
		        	
		        	String cname= name.getText();
					String cadd= address.getText();
					String ccity= city.getText();
					String cstate= state.getText();
					String ccountry= country.getText();
					String czip= zip.getText();
					String cmobile= mobile.getText();
					String cemail= email.getText();
					String cdate= date.getText();
					String ctime= time.getText();
					
					rp.Bill.setText("\n  Name  :-  " + "\t" + cname +  "\n" + " Address  :-  " + "\t" + cadd +  "\n" + "  City  :-  " + "\t" + ccity +  "\n" 
							+ "  State  :-  " + "\t" + cstate +  "\n" + "  Country  :-  " + "\t" + ccountry +  "\n" + "  Zip_Code  :-  " + "\t" + czip +  "\n"
							+ "  Mobile_No  :-  "  + cmobile +  "\n" + "  Email_ID  :-" + "\t" + cemail +  "\n" + "  Delivery DATE  :-  "  + cdate +  "\n"
							+ "  Delivery TIME  :-  "  + ctime +  "\n" + "\n\n    ********** THANK YOU *******\n");
	
		        	rp.setVisible(true);
		        	dispose();
		        }
			}
		});
		
		btnNext.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		contentPane.add(btnNext);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(shipping.class.getResource("/img/Sweets_Cake_2900x1859.jpg")));
		
		lblNewLabel_3.setBounds(0, 0, 1195, 570);
		contentPane.add(lblNewLabel_3);
		
	}
}
