package Reservation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.awt.event.ActionEvent;

public class ReservationDetails {

	public static JFrame frame;
	private JTextField txtReservationDetails;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	dbconnector dbc=new dbconnector();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReservationDetails window = new ReservationDetails();
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
	public ReservationDetails() {
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
		
		txtReservationDetails = new JTextField();
		txtReservationDetails.setEditable(false);
		txtReservationDetails.setFont(new Font("Tahoma", Font.BOLD, 32));
		txtReservationDetails.setText("                                       RESERVATION DETAILS");
		txtReservationDetails.setBackground(new Color(127, 255, 0));
		txtReservationDetails.setBounds(12, 30, 1283, 51);
		frame.getContentPane().add(txtReservationDetails);
		txtReservationDetails.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Reservation Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(40, 139, 159, 34);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Check In");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(40, 210, 101, 34);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Check Out");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(40, 276, 101, 40);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Payment Details");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(519, 347, 210, 34);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(225, 137, 1070, 40);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setText(Select.returnBooking.getReservationName());
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(224, 208, 1071, 40);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		textField_1.setText(sdf.format(Select.returnBooking.getCheckIN()));
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(225, 277, 1070, 40);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		textField_2.setText(sdf.format(Select.returnBooking.getCheckOut()));
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBounds(454, 394, 418, 40);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		double unitPrice = dbc.getUnitPrice(Select.returnBooking.getReservationName());
		textField_3.setText(Double.toString(unitPrice));
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setBounds(454, 447, 418, 38);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		LocalDateTime from = LocalDateTime.ofInstant(Select.returnBooking.getCheckIN().toInstant(), ZoneId.systemDefault());
		LocalDateTime to = LocalDateTime.ofInstant(Select.returnBooking.getCheckOut().toInstant(), ZoneId.systemDefault());
		int reserveDays = (int) Duration.between(from, to).toDays()+1;
		textField_4.setText(Integer.toString(reserveDays));
		
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
		

		btnNewButton = new JButton("Back");
		btnNewButton.setBackground(new Color(147, 112, 219));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Select.frame.setVisible(true);
				frame.setVisible(false);
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(139, 595, 122, 40);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("Proceed");
		btnNewButton_1.setBackground(new Color(147, 112, 219));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Select.returnBooking.setUnitPrice(unitPrice);
				Select.returnBooking.setDuration(reserveDays);
				Select.returnBooking.setTotal(total);

				if(CusDetails.createdBooking.getReservationName() == null ) {
					CusDetails cu = new CusDetails();
					CusDetails.main(null);
				}
				else {
					CusDetails.frame.setVisible(true);
				}
				frame.setVisible(false);
				
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(1018, 606, 128, 40);
		frame.getContentPane().add(btnNewButton_1);

	}
}
