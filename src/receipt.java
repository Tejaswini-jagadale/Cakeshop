import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;
import javax.swing.JToolBar;
import javax.swing.JSlider;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;

public class receipt extends JFrame {

	private JPanel contentPane;
	private DefaultTableModel model;
	private JLabel total;
	private JLabel pay;
	private JLabel balance;
	private DefaultTableModel table_1;
	public JScrollPane scrollPane_1;
	public JTextArea Bill;
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					receipt frame = new receipt();
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
	public receipt() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1200, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(421, 16, 363, 50);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(new Color(224, 255, 255));
		contentPane.add(panel);
		
		JLabel lblBillingDeatils = new JLabel("Payment Deatils");
		lblBillingDeatils.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 30));
		panel.add(lblBillingDeatils);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(141, 92, 232, 50);
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBackground(new Color(240, 255, 240));
		contentPane.add(panel_2);
		
		JLabel lblShippingDeatils = new JLabel("Shipping Deatils");
		panel_2.add(lblShippingDeatils);
		lblShippingDeatils.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 25));
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(15, 145, 518, 350);
		contentPane.add(scrollPane_1);
		
		Bill = new JTextArea();
		Bill.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		scrollPane_1.setViewportView(Bill);
		
		JButton button = new JButton("Back");
		button.setBounds(4, 531, 72, 29);
		button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String cmd = e.getActionCommand();

		        if(cmd.equals("Back"))
		        {

		        	shipping sh=new shipping();
		        	sh.setVisible(true);
		        	dispose();
		        }
			}
		});
		button.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		contentPane.add(button);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 224));
		panel_1.setBounds(548, 145, 604, 350);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Credit Card");
		chckbxNewCheckBox.setBackground(new Color(128, 0, 128));
		chckbxNewCheckBox.setForeground(new Color(255, 255, 255));
		chckbxNewCheckBox.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 25));
		chckbxNewCheckBox.setBounds(45, 24, 199, 41);
		panel_1.add(chckbxNewCheckBox);
		
		JCheckBox chckbxDebitCard = new JCheckBox("Debit Card");
		chckbxDebitCard.setForeground(Color.WHITE);
		chckbxDebitCard.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 25));
		chckbxDebitCard.setBackground(new Color(128, 0, 128));
		chckbxDebitCard.setBounds(45, 113, 199, 41);
		panel_1.add(chckbxDebitCard);
		
		JCheckBox chckbxPaytm = new JCheckBox("Paytm");
		chckbxPaytm.setForeground(Color.WHITE);
		chckbxPaytm.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 25));
		chckbxPaytm.setBackground(new Color(128, 0, 128));
		chckbxPaytm.setBounds(45, 201, 129, 41);
		panel_1.add(chckbxPaytm);
		
		JCheckBox chckbxInternetBanking = new JCheckBox("Internet Banking");
		chckbxInternetBanking.setForeground(Color.WHITE);
		chckbxInternetBanking.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 25));
		chckbxInternetBanking.setBackground(new Color(128, 0, 128));
		chckbxInternetBanking.setBounds(331, 24, 262, 41);
		panel_1.add(chckbxInternetBanking);
		
		JCheckBox chckbxCashOnDelivery = new JCheckBox("Cash On Delivery");
		chckbxCashOnDelivery.setForeground(Color.WHITE);
		chckbxCashOnDelivery.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 25));
		chckbxCashOnDelivery.setBackground(new Color(128, 0, 128));
		chckbxCashOnDelivery.setBounds(331, 113, 262, 41);
		panel_1.add(chckbxCashOnDelivery);
		
		JCheckBox chckbxUpi = new JCheckBox("UPI");
		chckbxUpi.setForeground(Color.WHITE);
		chckbxUpi.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 25));
		chckbxUpi.setBackground(new Color(128, 0, 128));
		chckbxUpi.setBounds(331, 201, 135, 41);
		panel_1.add(chckbxUpi);
		
		JButton btnPayNow = new JButton("Pay Now");
		btnPayNow.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String cmd = e.getActionCommand();

		        if(cmd.equals("Pay Now"))
		        {

		        	thanks th=new thanks();
		        	th.setVisible(true);
		        	dispose();
		        }	
			}
		});
		btnPayNow.setFont(new Font("Elephant", Font.BOLD | Font.ITALIC, 25));
		btnPayNow.setBounds(219, 287, 186, 47);
		panel_1.add(btnPayNow);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBackground(new Color(240, 255, 240));
		panel_3.setBounds(734, 92, 232, 50);
		contentPane.add(panel_3);
		
		JLabel lblPaymentMethods = new JLabel("Payment Methods");
		lblPaymentMethods.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 25));
		panel_3.add(lblPaymentMethods);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(receipt.class.getResource("/img/Sweets_Cake_5184x3456.jpg")));
		lblNewLabel.setBounds(0, 0, 1200, 581);
		contentPane.add(lblNewLabel);
	}
}
