package feedback;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.UIManager;

import java.awt.Color;
import java.awt.Font;
import java.awt.Window;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Feedbacknreview {

	private JFrame frame;
	private JTextField txtFeedbackAndReviews;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Feedbacknreview window = new Feedbacknreview();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Feedbacknreview() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(350, 150, 1250, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtFeedbackAndReviews = new JTextField();
		txtFeedbackAndReviews.setEditable(false);
		txtFeedbackAndReviews.setText("                                                                              FEEDBACK & REVIEWS");
		txtFeedbackAndReviews.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtFeedbackAndReviews.setColumns(10);
		
		txtFeedbackAndReviews.setBounds(0, 27, 1412, 82);
		frame.getContentPane().add(txtFeedbackAndReviews);
		
		JButton btnNewButton = new JButton("Give Us Feedback");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				insert newinn = new insert();
				insert.main(null);
			
				frame.setVisible(false);
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(486, 220, 275, 46);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnGiveUsReviews = new JButton("Give Us Reviews");
		btnGiveUsReviews.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				review1 reviews = new review1();
				review1.main(null);
				
				frame.setVisible(false);
				
			}
		});
		btnGiveUsReviews.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnGiveUsReviews.setBounds(486, 307, 275, 40);
		frame.getContentPane().add(btnGiveUsReviews);
		
		JButton btnView = new JButton("View Feedback");
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				viewfeed view = new viewfeed();
				viewfeed.main(null);
				
				frame.setVisible(false);
				
			}
		});
		btnView.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnView.setBounds(486, 396, 275, 40);
		frame.getContentPane().add(btnView);
		
		JButton btnViewReviews = new JButton("View Reviews");
		btnViewReviews.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				viewreviews dsf = new viewreviews();
				viewreviews.main(null);
				
				frame.setVisible(false);
			}
		});
		btnViewReviews.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnViewReviews.setBounds(486, 483, 275, 40);
		frame.getContentPane().add(btnViewReviews);
		
		try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
               
                  UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Feedbacknreview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Feedbacknreview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Feedbacknreview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Feedbacknreview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

	}

}
