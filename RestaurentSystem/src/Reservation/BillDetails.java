package Reservation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;

public class BillDetails {

	private JFrame frame;
	private JTextField txtBillDetails;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_5;
	private JTextField textField_3;
	private JTextField textField_2;
	private JTextField textField_4;

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	dbconnector dbc=new dbconnector();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BillDetails window = new BillDetails();
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
	public BillDetails() {
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
		
		txtBillDetails = new JTextField();
		txtBillDetails.setEditable(false);
		txtBillDetails.setBackground(new Color(127, 255, 0));
		txtBillDetails.setFont(new Font("Tahoma", Font.BOLD, 35));
		txtBillDetails.setText("                                         BILL DETAILS");
		txtBillDetails.setBounds(12, 29, 1281, 49);
		frame.getContentPane().add(txtBillDetails);
		txtBillDetails.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(36, 138, 80, 35);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Address");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(38, 256, 95, 35);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Payment Details");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(36, 339, 136, 35);
		frame.getContentPane().add(lblNewLabel_2);
		
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setBounds(454, 447, 418, 38);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		LocalDateTime from = LocalDateTime.ofInstant(Select.returnBooking.getCheckIN().toInstant(), ZoneId.systemDefault());
		LocalDateTime to = LocalDateTime.ofInstant(Select.returnBooking.getCheckOut().toInstant(), ZoneId.systemDefault());
		int reserveDays = (int) Duration.between(from, to).toDays()+1;
		textField_4.setText(Integer.toString(reserveDays));
		
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBounds(454, 394, 418, 40);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		double unitPrice = dbc.getUnitPrice(Select.returnBooking.getReservationName());
		textField_3.setText(Double.toString(unitPrice));
		
		
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setBounds(454, 504, 418, 34);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		double total = unitPrice * reserveDays;
		textField_5.setText(Double.toString(total));
		
		JLabel lblNewLabel_4 = new JLabel("Rate Per Day");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(283, 402, 159, 22);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Days");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(283, 447, 67, 38);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Total");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6.setBounds(283, 504, 84, 34);
		frame.getContentPane().add(lblNewLabel_6);
		
		
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(207, 138, 922, 35);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setText(Select.returnBooking.getCusName());
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(207, 242, 922, 65);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		textField_1.setText(Select.returnBooking.getAddress());
		
		JButton btnNewButton = new JButton("Print Bill");
		btnNewButton.setBackground(new Color(147, 112, 219));
		
			
		
		
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(800, 630, 170, 37);
		frame.getContentPane().add(btnNewButton);
		
		
		
		
		JButton btnNewButton_2 = new JButton("Delete Reservation");
		btnNewButton_2.setBackground(new Color(147, 112, 219));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_2.setBounds(500, 630, 210, 37);
		frame.getContentPane().add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dbc.deletebooking(Select.returnBooking.getReservationName(),sdf.format(Select.returnBooking.getCheckIN()));
			}
		});
		
		JButton btnNewButton_3 = new JButton("Back");
		btnNewButton_3.setBackground(new Color(147, 112, 219));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CusDetails.frame.setVisible(true);
				
				frame.setVisible(false);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_3.setBounds(250, 630, 170, 37);
		frame.getContentPane().add(btnNewButton_3);
	}
		
	
	
	
	
	
	}


