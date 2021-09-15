import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;

public class orderinfo extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel model;
	private TableModel numCols;
	private JTextField date;
	private JTextField id;
	private JTextField caketype;
	private JTextField cakename;
	private JTextField price;
	private JTextField quantity;
	private JTextField amount;
	private JTable table_1;
	private JTextField total;
	private JTextField pay;
	private JTextField balance;
	private JTextField flavour;
	private JButton delete;
	//public JTextArea Bill;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					orderinfo frame = new orderinfo();
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

	
	public orderinfo()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1265, 662);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		DefaultTableModel model=new DefaultTableModel();
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(439, 0, 309, 51);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(new Color(224, 255, 255));
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Order Details");
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 25));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(15, 56, 919, 226);
		panel_1.setBackground(new Color(255, 240, 245));
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("*Date :-");
		lblNewLabel_1.setBounds(15, 16, 69, 20);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		panel_1.add(lblNewLabel_1);
		
		date = new JTextField();
		date.setBounds(15, 40, 146, 26);
		date.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0)
			{
				Calendar timer =Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat tDate =new SimpleDateFormat("dd-MMM-YYYY");
				tDate.format(timer.getTime());
				date.setText(String.valueOf(tDate.format(timer.getTime())));
			}
		});
		panel_1.add(date);
		date.setColumns(10);
		
		JLabel lblId = new JLabel("*Enter ID :-");
		lblId.setBounds(215, 16, 127, 20);
		lblId.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		panel_1.add(lblId);
		
		id = new JTextField();
		id.setBounds(215, 40, 102, 26);
		id.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent evt)
			{
				if (evt.getKeyCode()==KeyEvent.VK_ENTER)
				{
					
						try {
							Class.forName("com.mysql.cj.jdbc.Driver");
					 		System.out.println("Connecting to database");
					 		System.out.println("Connected sussfully");
						
					 		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cakeshop" ,"root" ,"teju");
					 		PreparedStatement ps= con.prepareStatement("select * from menucard where ID=?");
					 		
					 		ps.setString(01,id.getText());
					 		ResultSet rs=ps.executeQuery();
					 		
					 		if(rs.next()==false) 
					 		{
					 			JOptionPane.showMessageDialog( null, "Record Updated Succes102ully...");
					 		}
					 		else
					 		{
					 			String pCakeType=rs.getString("CakeType");
					 			String pCakeName=rs.getString("CakeName");
					 			String pPrice=rs.getString("Price");
					 			
					 			caketype.setText(pCakeType.trim());
					 			cakename.setText(pCakeName.trim());
					 			price.setText(pPrice.trim());
					 			
					 			
					 		}
							
						} 
						catch (ClassNotFoundException e)
						{
							System.out.println(e);
							e.printStackTrace();
						}
						catch (SQLException sql)
						{
							System.out.println(sql);
						}
					
				}
				
			}
		});
		panel_1.add(id);
		id.setColumns(10);
		
		JLabel Caketype = new JLabel("Cake Type :-");
		Caketype.setBounds(434, 16, 118, 20);
		Caketype.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		panel_1.add(Caketype);
		
		caketype = new JTextField();
		caketype.setBounds(434, 40, 187, 26);
		caketype.setColumns(10);
		panel_1.add(caketype);
		
		JLabel lblCakeName = new JLabel("Cake Name :-");
		lblCakeName.setBounds(665, 16, 118, 20);
		lblCakeName.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		panel_1.add(lblCakeName);
		
		cakename = new JTextField();
		cakename.setBounds(665, 40, 205, 26);
		cakename.setColumns(10);
		panel_1.add(cakename);
		
		JLabel lblPrice = new JLabel("Price :-");
		lblPrice.setBounds(15, 90, 69, 20);
		lblPrice.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		panel_1.add(lblPrice);
		
		price = new JTextField();
		price.setBounds(15, 118, 118, 26);
		price.setText("");
		price.setColumns(10);
		panel_1.add(price);
		
		JLabel lblFlavour = new JLabel("*Enter Flavour :-");
		lblFlavour.setBounds(215, 90, 157, 20);
		lblFlavour.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		panel_1.add(lblFlavour);
		
		flavour = new JTextField();
		flavour.setBounds(215, 118, 157, 26);
		flavour.setText("");
		flavour.setColumns(10);
		panel_1.add(flavour);
		
		JLabel lblQuantity = new JLabel("*Enter Quantity :-");
		lblQuantity.setBounds(434, 90, 168, 20);
		lblQuantity.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		panel_1.add(lblQuantity);
		
		quantity = new JTextField();
		quantity.setBounds(434, 118, 118, 26);
		quantity.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				int qut=Integer.parseInt(quantity.getText().toString());
				int prec=Integer.parseInt(price.getText());
				
				int tot=qut*prec;
				amount.setText(String.valueOf(tot));
			}
		});
		quantity.setText("");
		quantity.setColumns(10);
		panel_1.add(quantity);
		
		JLabel lblAmount = new JLabel("Amount :-");
		lblAmount.setBounds(665, 90, 102, 20);
		lblAmount.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		panel_1.add(lblAmount);
		
		amount = new JTextField();
		amount.setBounds(665, 118, 151, 26);
		amount.setText("");
		amount.setColumns(10);
		panel_1.add(amount);
		
		JButton add = new JButton("Add");
		add.setBounds(81, 169, 115, 41);
		add.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				try 
					{
					Class.forName("com.mysql.cj.jdbc.Driver");
			 		System.out.println("Connecting to database");
			 		System.out.println("Connected sussfully");
				
			 		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cakeshop" ,"root" ,"teju");
			 		PreparedStatement ps= con.prepareStatement("select * from menutable values(?,?,?,?,?,?,?,?)");
			 		
			 		ps.setString(1, date.getText());
			 		ps.setString(2, id.getText());			 		
			 		ps.setString(3, caketype.getText());
			 		ps.setString(4, cakename.getText());
			 		ps.setString(5, price.getText());
			 		ps.setString(6, flavour.getText());
			 		ps.setString(7, quantity.getText());
			 		ps.setString(8, amount.getText());
			 		
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
				model=(DefaultTableModel)table_1.getModel();
				model.addRow(new Object[]
						{
								date.getText(),
								id.getText(),
								caketype.getText(),
								cakename.getText(),
								price.getText(),
								flavour.getText(),
								quantity.getText(),
								amount.getText(),
								
				        		
				
				       
			   });
				int sum = 0;
				
				for(int i=0;i<table_1.getRowCount();i++)
				{
					sum=sum+Integer.parseInt(table_1.getValueAt(i, 7).toString());
				}
				total.setText(Integer.toString(sum));

				date.setText("");
				id.setText("");
				caketype.setText("");
				cakename.setText("");
				price.setText("");
				flavour.setText("");
				quantity.setText("");
				amount.setText("");
				id.requestFocus();
			 
			}
		}); 
		
		
		add.setFont(new Font("Elephant", Font.BOLD | Font.ITALIC, 25));
		panel_1.add(add);
		

		add.setFont(new Font("Elephant", Font.BOLD | Font.ITALIC, 25));
		panel_1.add(add);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				date.setText("");
				id.setText("");
				caketype.setText("");
				cakename.setText("");
				price.setText("");
				flavour.setText("");
				quantity.setText("");
				amount.setText("");
				
			}
		});
		btnClear.setFont(new Font("Elephant", Font.BOLD | Font.ITALIC, 25));
		btnClear.setBounds(378, 169, 115, 41);
		panel_1.add(btnClear);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(15, 298, 919, 203);
		contentPane.add(scrollPane);
		
		table_1 = new JTable();
		table_1.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		model = new DefaultTableModel();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Date", "ID", "Cake Type", "Cake Name", "Price", "Flavour", "Quantity", "Amount"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class, String.class, Integer.class, String.class, Integer.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(108, 538, 826, 68);
		panel_2.setBackground(new Color(255, 239, 213));
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Total :");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		lblNewLabel_2.setBounds(15, 16, 69, 20);
		panel_2.add(lblNewLabel_2);
		
		total = new JTextField();
		total.setBounds(85, 15, 104, 26);
		panel_2.add(total);
		total.setColumns(10);
		
		JLabel lblPay = new JLabel("*Pay :");
		lblPay.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		lblPay.setBounds(219, 9, 70, 34);
		panel_2.add(lblPay);
		
		pay = new JTextField();
		pay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Pay=Integer.parseInt(pay.getText().toString());
				int Total=Integer.parseInt(total.getText());
				
				int bal=Pay-Total;
				balance.setText(String.valueOf(bal));
			}
		});
		pay.setText("");
		pay.setColumns(10);
		pay.setBounds(288, 15, 104, 26);
		panel_2.add(pay);
		
		JLabel lblBalance = new JLabel("Balance :");
		lblBalance.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		lblBalance.setBounds(440, 16, 97, 20);
		panel_2.add(lblBalance);
		
		balance = new JTextField();
		balance.setColumns(10);
		balance.setBounds(536, 15, 104, 26);
		panel_2.add(balance);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(945, 122, 298, 397);
		contentPane.add(scrollPane_1);
		
		JTextArea Bill = new JTextArea();
		Bill.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		scrollPane_1.setViewportView(Bill);
		
		JButton btnReceipt = new JButton("Receipt");
		btnReceipt.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
					String ctotal= total.getText();
					String cpay= pay.getText();
					String cbalance= balance.getText();
					
					DefaultTableModel model=new DefaultTableModel();
					
					model=(DefaultTableModel)table_1.getModel();
					//==================================================================================
					Calendar timer =Calendar.getInstance();
					timer.getTime();
					
					SimpleDateFormat tTime =new SimpleDateFormat("HH:mm:ss");
					tTime.format(timer.getTime());
					
					SimpleDateFormat tDate =new SimpleDateFormat("dd-MMM-YYYY");
					tDate.format(timer.getTime());
					//====================================================================================
					
					
					
					
					Bill.setText(Bill.getText()+ "******  Payment Details  *******\n");
					
					
					Bill.setText(Bill.getText()+"\t" + "\t" + "Date:" +tDate.format(timer.getTime())+  "\n" );
					Bill.setText(Bill.getText()+"\t" + "\t" + "Time:" +tTime.format(timer.getTime())+  "\n" );
					
					
					Bill.setText(Bill.getText()+"ID" + "\t" + "Cake Name" + "\t" + "\t" + "Price" + "\t" + "Amount" + "\n");
					
					for(int i=0;i<table_1.getRowCount();i++)
					{
						String cid =(String)model.getValueAt(i, 1);
						String  cname=(String)model.getValueAt(i, 3);
						String cprice =(String)model.getValueAt(i, 4);
						String camount =(String)model.getValueAt(i, 7);
					
						Bill.setText(Bill.getText()+ cid  + "\t" + cname + "\t"  + cprice + "\t" + camount + "\n" );
					}
					Bill.setText(Bill.getText()+"\n");
					Bill.setText(Bill.getText()+"\n");
					Bill.setText(Bill.getText()+"\n");
					Bill.setText(Bill.getText()+"\n");
					
					
					Bill.setText(Bill.getText()+"\t" + "SubTotal :- " + ctotal +  "\n" );
					Bill.setText(Bill.getText()+"\t" + "Pay :- " + cpay +  "\n" );
					Bill.setText(Bill.getText()+"\t" + "Balance :- " + cbalance +  "\n" );
					
				
					Bill.setText(Bill.getText()+"\n\n" + "****** Thank You ******\n");
			
					
		        
			}
		});
		btnReceipt.setFont(new Font("Elephant", Font.BOLD | Font.ITALIC, 25));
		btnReceipt.setBounds(671, 14, 146, 41);
		panel_2.add(btnReceipt);
		
		JButton button = new JButton("Back");
		button.setBounds(0, 589, 72, 29);
		button.addActionListener(new ActionListener()
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
		button.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		contentPane.add(button);
		
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(1171, 589, 72, 29);
		btnNext.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{

				String cmd = e.getActionCommand();

		        if(cmd.equals("Next"))
		        {
		           
		        	shipping spp=new shipping();
		        	spp.setVisible(true);
		        	dispose();
		        }
			}
		});
		btnNext.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		contentPane.add(btnNext);
		
		JButton btnNewButton = new JButton("Delete Row");
		btnNewButton.setBounds(665, 175, 188, 29);
		panel_1.add(btnNewButton);
		btnNewButton.setFont(new Font("Elephant", Font.BOLD | Font.ITALIC, 25));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(967, 69, 246, 50);
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBackground(new Color(144, 238, 144));
		contentPane.add(panel_3);
		
		JLabel label = new JLabel("Payment Deatils");
		label.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 25));
		panel_3.add(label);
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				DefaultTableModel model=new DefaultTableModel();
				model=(DefaultTableModel)table_1.getModel();
				int i = table_1.getSelectedRow();
				model.removeRow(i);
			}
		});
		
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					Bill.print();
				}
				catch(PrinterException e1)
				{
					System.err.format("No Printer Found", e1.getMessage());
					
				}
			}
		});
		btnPrint.setFont(new Font("Elephant", Font.BOLD | Font.ITALIC, 25));
		btnPrint.setBounds(1023, 535, 127, 41);
		contentPane.add(btnPrint);

		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(orderinfo.class.getResource("/img/cake_berries.jpg")));
		
		lblNewLabel_3.setBounds(0, 0, 1265, 662);
		contentPane.add(lblNewLabel_3);
	}
}
