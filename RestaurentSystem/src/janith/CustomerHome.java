package janith;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import Customer.MainPage;
import Customer.Menu;
import Reservation.Select;
import feedback.Feedbacknreview;
import pub.exp;

import java.awt.Color;

public class CustomerHome {

	private JFrame frmCustomerHome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerHome window = new CustomerHome();
					window.frmCustomerHome.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CustomerHome() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCustomerHome = new JFrame();
		frmCustomerHome.getContentPane().setBackground(Color.BLACK);
		frmCustomerHome.setTitle("Customer Home");
		
		frmCustomerHome.setBounds(350, 150, 1250, 750);
		frmCustomerHome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCustomerHome.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Food");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Serif", Font.BOLD, 40));
		//Image photo1=new ImageIcon(this.getClass().getResource("/food.png")).getImage();
		//btnNewButton.setIcon(new ImageIcon(photo1));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu abc =new Menu();
				Menu.main(null);
				
			}
		});
		btnNewButton.setBounds(282, 174, 695, 65);
		frmCustomerHome.getContentPane().add(btnNewButton);
		
		JButton btnPub = new JButton("PUB");
		btnPub.setForeground(Color.WHITE);
		btnPub.setFont(new Font("Serif", Font.BOLD, 40));
		//Image photo=new ImageIcon(this.getClass().getResource("/pub.png")).getImage();
		//button.setIcon(new ImageIcon(photo));
		btnPub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp abc =new exp();
				exp.main(null);
				frmCustomerHome.setVisible(false);
			}
		});
		btnPub.setBounds(282, 252, 695, 70);
		frmCustomerHome.getContentPane().add(btnPub);
		
		JButton btnReservation = new JButton("Reservation");
		btnReservation.setForeground(Color.WHITE);
		btnReservation.setFont(new Font("Serif", Font.BOLD, 40));
		//Image photo3=new ImageIcon(this.getClass().getResource("/reservation.png")).getImage();
		//button_1.setIcon(new ImageIcon(photo3));
		btnReservation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Select abc =new Select();
				Select.main(null);
				frmCustomerHome.setVisible(false);
			}
		});
		btnReservation.setBounds(282, 412, 695, 65);
		frmCustomerHome.getContentPane().add(btnReservation);
		
		JButton btnFeedback = new JButton("Feedback");
		btnFeedback.setForeground(Color.WHITE);
		btnFeedback.setFont(new Font("Serif", Font.BOLD, 40));
		//Image photo4=new ImageIcon(this.getClass().getResource("/feedback.png")).getImage();
		//button_2.setIcon(new ImageIcon(photo4));
		btnFeedback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Feedbacknreview abc =new Feedbacknreview();
				Feedbacknreview.main(null);
				frmCustomerHome.setVisible(false);
			}
		});
		btnFeedback.setBounds(282, 334, 695, 65);
		frmCustomerHome.getContentPane().add(btnFeedback);
		
		JButton btnNewButton_1 = new JButton("<<<Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainPage abc =new MainPage();
				MainPage.main(null);
				frmCustomerHome.setVisible(false);
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Serif", Font.BOLD, 14));
		btnNewButton_1.setBounds(20, 645, 107, 37);
		frmCustomerHome.getContentPane().add(btnNewButton_1);
		
		JLabel jLabel1 = new JLabel();
		jLabel1.setText("WELCOME TO GRAND MENTION RESTAURENT");
		jLabel1.setForeground(Color.YELLOW);
		jLabel1.setFont(new Font("Sylfaen", Font.BOLD, 40));
		jLabel1.setBackground(Color.WHITE);
		jLabel1.setBounds(150, 65, 955, 48);
		frmCustomerHome.getContentPane().add(jLabel1);
	}
}
