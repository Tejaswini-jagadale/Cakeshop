import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;

public class thanks extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					thanks frame = new thanks();
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
	public thanks() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1200, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 0, 128));
		panel.setForeground(new Color(255, 255, 255));
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(265, 16, 617, 97);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("Lotus Bakeshop");
		label.setForeground(new Color(240, 248, 255));
		label.setFont(new Font("Ravie", Font.BOLD | Font.ITALIC, 49));
		label.setBounds(28, 16, 555, 66);
		panel.add(label);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(224, 255, 255));
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(81, 143, 1009, 247);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Thank You For Your Order...");
		lblNewLabel.setFont(new Font("Lucida Calligraphy", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(232, 16, 591, 44);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ready To Deliver Your Happiness On Time");
		lblNewLabel_1.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setIcon(new ImageIcon(thanks.class.getResource("/thanku/42554-delivery-truck-icon.png")));
		lblNewLabel_1.setBounds(30, 191, 566, 56);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("100% on Time Delivery");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_2.setIcon(new ImageIcon(thanks.class.getResource("/thanku/thumb-up-icon.png")));
		lblNewLabel_2.setBounds(15, 95, 237, 56);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblPaymentProtection = new JLabel("Payment Protection");
		lblPaymentProtection.setIcon(new ImageIcon(thanks.class.getResource("/thanku/payment-icon.png")));
		lblPaymentProtection.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblPaymentProtection.setBounds(407, 95, 189, 56);
		panel_1.add(lblPaymentProtection);
		
		JLabel lblMillions = new JLabel("2 Millions Smiles Delivered");
		lblMillions.setIcon(new ImageIcon(thanks.class.getResource("/thanku/download.png")));
		lblMillions.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblMillions.setBounds(728, 95, 266, 56);
		panel_1.add(lblMillions);
		
		JLabel lblNewLabel_3 = new JLabel("Find Us");
		lblNewLabel_3.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		lblNewLabel_3.setBounds(874, 186, 102, 20);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon(thanks.class.getResource("/thanku/social-facebook-box-blue-icon.png")));
		lblNewLabel_4.setBounds(844, 210, 29, 37);
		panel_1.add(lblNewLabel_4);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setIcon(new ImageIcon(thanks.class.getResource("/thanku/Instagram-icon.png")));
		label_1.setBounds(888, 210, 29, 37);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setIcon(new ImageIcon(thanks.class.getResource("/thanku/Twitter-icon.png")));
		label_2.setBounds(936, 210, 29, 37);
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setIcon(new ImageIcon(thanks.class.getResource("/thanku/Linkedin-icon.png")));
		label_3.setBounds(980, 210, 29, 37);
		panel_1.add(label_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 245, 238));
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(277, 404, 568, 124);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblKnownUs = new JLabel("Known Us");
		lblKnownUs.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		lblKnownUs.setBounds(15, 16, 94, 20);
		panel_2.add(lblKnownUs);
		
		JLabel lblNewLabel_5 = new JLabel("Our Story");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_5.setBounds(15, 37, 69, 20);
		panel_2.add(lblNewLabel_5);
		
		JLabel lblContactUs = new JLabel("Contact Us");
		lblContactUs.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblContactUs.setBounds(15, 52, 94, 20);
		panel_2.add(lblContactUs);
		
		JLabel lblLocateUs = new JLabel("Locate Us");
		lblLocateUs.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblLocateUs.setBounds(15, 71, 94, 20);
		panel_2.add(lblLocateUs);
		
		JLabel lblBlog = new JLabel("Blog");
		lblBlog.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblBlog.setBounds(15, 88, 94, 20);
		panel_2.add(lblBlog);
		
		JLabel lblNeedHelp = new JLabel("Need Help");
		lblNeedHelp.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		lblNeedHelp.setBounds(175, 16, 94, 20);
		panel_2.add(lblNeedHelp);
		
		JLabel lblFqa = new JLabel("FQA");
		lblFqa.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblFqa.setBounds(175, 36, 69, 20);
		panel_2.add(lblFqa);
		
		JLabel lblCancellationAndRefund = new JLabel("Cancellation And Refund");
		lblCancellationAndRefund.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblCancellationAndRefund.setBounds(175, 51, 176, 20);
		panel_2.add(lblCancellationAndRefund);
		
		JLabel lblPrivacyPolice = new JLabel("Privacy Police");
		lblPrivacyPolice.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblPrivacyPolice.setBounds(175, 70, 102, 20);
		panel_2.add(lblPrivacyPolice);
		
		JLabel lblTermsAndCondition = new JLabel("Terms And Condition");
		lblTermsAndCondition.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblTermsAndCondition.setBounds(175, 87, 157, 20);
		panel_2.add(lblTermsAndCondition);
		
		JLabel lblSitemap = new JLabel("Sitemap");
		lblSitemap.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblSitemap.setBounds(175, 104, 80, 20);
		panel_2.add(lblSitemap);
		
		JLabel lblMoreInfo = new JLabel("More Info");
		lblMoreInfo.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		lblMoreInfo.setBounds(407, 16, 94, 20);
		panel_2.add(lblMoreInfo);
		
		JLabel lblCorporateCakes = new JLabel("Corporate Cakes");
		lblCorporateCakes.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblCorporateCakes.setBounds(407, 36, 123, 20);
		panel_2.add(lblCorporateCakes);
		
		JLabel lblCouponsOffers = new JLabel("Coupons & Offers");
		lblCouponsOffers.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblCouponsOffers.setBounds(407, 51, 123, 20);
		panel_2.add(lblCouponsOffers);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon(thanks.class.getResource("/thanku/footer-log.png")));
		lblNewLabel_6.setBounds(432, 71, 69, 53);
		panel_2.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon(thanks.class.getResource("/thanku/DESSERT_sweets_sugar.jpg")));
		lblNewLabel_7.setBounds(0, 0, 1200, 605);
		contentPane.add(lblNewLabel_7);
	}

}
