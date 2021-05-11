package feedback;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import models.Feedback;
import services.FeedbackService;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class insert {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					insert window = new insert();
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
	public insert() {
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
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setText("                                                                                      FEEDBACK");
		textField.setFont(new Font("Tahoma", Font.BOLD, 25));
		textField.setColumns(10);
		
		textField.setBounds(0, 25, 1412, 82);
		frame.getContentPane().add(textField);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel.setBounds(340, 174, 103, 26);
		frame.getContentPane().add(lblNewLabel);
		
		textField_1 = new JTextField();
		
		textField_1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
			}
		});
		textField_1.setColumns(10);
		textField_1.setBounds(529, 226, 493, 26);
		frame.getContentPane().add(textField_1);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblFirstName.setBounds(399, 223, 103, 26);
		frame.getContentPane().add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblLastName.setBounds(399, 287, 103, 26);
		frame.getContentPane().add(lblLastName);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(529, 287, 493, 26);
		frame.getContentPane().add(textField_2);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblEmail.setBounds(340, 379, 103, 26);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblYourFeedback = new JLabel("Your Feedback");
		lblYourFeedback.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblYourFeedback.setBounds(340, 506, 141, 26);
		frame.getContentPane().add(lblYourFeedback);
		
		JButton btnSubmitFeedback = new JButton("Submit Feedback");
		btnSubmitFeedback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String fname = textField_1.getText().toString();
				String lname = textField_2.getText().toString();
				String email = textField_3.getText().toString();
				String message = textField_4.getText().toString();
				
				if(fname.equals("") || lname.equals("") || email.contentEquals("") || message.equals("")) {
					JOptionPane.showMessageDialog(null, "Enter all feilds");
				}else {
					FeedbackService feedbackService = new FeedbackService();
					feedbackService.addFeedback(new Feedback(fname, lname, email, message));
					
					
					frame.setVisible(false);
					Feedback1 feedbac= new Feedback1();
					Feedback1.main(null);
					
					frame.setVisible(false);
				}
				
				
				
				
				
				
			}
		});
		btnSubmitFeedback.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnSubmitFeedback.setBounds(867, 634, 155, 37);
		frame.getContentPane().add(btnSubmitFeedback);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Feedbacknreview FandR = new Feedbacknreview();
				Feedbacknreview.main(null);
				frame.setVisible(false);
				
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBackground(new Color(189, 183, 107));
		btnNewButton_1.setBounds(1265, 133, 105, 32);
		frame.getContentPane().add(btnNewButton_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(529, 411, 493, 26);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(529, 520, 493, 73);
		frame.getContentPane().add(textField_4);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				Feedbacknreview jjkl = new Feedbacknreview();
				Feedbacknreview.main(null);
				frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(1104, 138, 97, 25);
		frame.getContentPane().add(btnNewButton);
	}
		
	
}