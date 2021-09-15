import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Menu;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Panel;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;

public class Welcom 
{
	

	private JFrame frame1;
	
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcom window = new Welcom();
					window.frame1.setVisible(true);
					
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Welcom()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		
		
			
		
	
		frame1 = new JFrame("WELCOME_1");
		frame1.setBounds(0, 0, 1200, 600);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame1.setIconImage(Toolkit.getDefaultToolkit().getImage(Menu.class.getResource("/CakeShop/src/img/1.jpg")));
		frame1.getContentPane().setLayout(null);
		frame1.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Lotus Bakeshop");
		lblNewLabel_1.setBounds(580, 0, 583, 98);
		lblNewLabel_1.setLabelFor(frame1);
		lblNewLabel_1.setForeground(new Color(240, 248, 255));
		lblNewLabel_1.setFont(new Font("Ravie", Font.BOLD | Font.ITALIC, 49));
		frame1.getContentPane().add(lblNewLabel_1);
		/////////////////////////////////////////////////////////////////
		JButton btnNewButton = new JButton("Click Me");
		btnNewButton.setBounds(538, 451, 192, 63);
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				String cmd = e.getActionCommand();

		        if(cmd.equals("Click Me"))
		        {
		           
		        	login l=new login();
		        	l.setVisible(true);
		        	frame1.dispose();
		        	
		        }
			}

			
		});
	////////////////////////////////////////////////////////////////////////
		btnNewButton.setForeground(new Color(255, 255, 255));
	    btnNewButton.setBackground(new Color(0, 0, 0));
		
		btnNewButton.setFont(new Font("Snap ITC", Font.BOLD | Font.ITALIC, 26));
		frame1.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 1200, 567);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setIcon(new ImageIcon(Welcom.class.getResource("/img/1.jpg")));
		frame1.getContentPane().add(lblNewLabel);
	}
	
}
