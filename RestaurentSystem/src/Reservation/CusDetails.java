package Reservation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;

public class CusDetails {

	public static JFrame frame;
	private JTextField txtCustomerDetails;
	private JTextField textField;
	private JTextField textField_1;
	
	public static boolean bookingCreated = false;
	public static BookingModel createdBooking = new BookingModel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CusDetails window = new CusDetails();
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
	public CusDetails() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		System.out.println(bookingCreated);
		frame = 
				new JFrame();
		frame.setBounds(350, 150, 1250, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtCustomerDetails = new JTextField();
		txtCustomerDetails.setEditable(false);
		txtCustomerDetails.setBackground(new Color(127, 255, 0));
		txtCustomerDetails.setText("                                                      CUSTOMER DETAILS");
		txtCustomerDetails.setFont(new Font("Tahoma", Font.BOLD, 32));
		txtCustomerDetails.setBounds(12, 28, 1307, 46);
		frame.getContentPane().add(txtCustomerDetails);
		txtCustomerDetails.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(39, 121, 75, 37);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Address");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(39, 234, 85, 37);
		frame.getContentPane().add(lblNewLabel_1);
		
		/*JLabel lblNewLabel_2 = new JLabel("Payment Details");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(39, 326, 151, 37);
		frame.getContentPane().add(lblNewLabel_2);*/
		
		textField = new JTextField();
		textField.setBounds(210, 117, 906, 46);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(210, 217, 906, 73);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 2, 2);
		frame.getContentPane().add(scrollPane);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setBackground(new Color(147, 112, 219));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ReservationDetails.frame.setVisible(true);
				
				frame.setVisible(false);
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(78, 630, 112, 37);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Update Details");
		btnNewButton_2.setVisible(false);
		btnNewButton_2.setBackground(new Color(147, 112, 219));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Select.returnBooking.setCusName(textField.getText());
				Select.returnBooking.setAddress(textField_1.getText());

				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				
				String name = Select.returnBooking.getCusName();
				String address = Select.returnBooking.getAddress();
				String reservationName = Select.returnBooking.getReservationName();
				String checkIn = sdf.format(Select.returnBooking.getCheckIN());
				String checkOut = sdf.format(Select.returnBooking.getCheckOut());
				double total = Select.returnBooking.getTotal();
				
				dbconnector dbc=new dbconnector();
				
				dbc.updateBooking(name, address, reservationName, checkIn, checkOut, total, sdf.format(createdBooking.getCheckIN()));
				
				BillDetails bill = new BillDetails();
				BillDetails.main(null);
				
				frame.setVisible(false);
				
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.setBounds(389, 630, 170, 37);
		frame.getContentPane().add(btnNewButton_2);
		
		if(!bookingCreated) {
			JButton btnNewButton_1 = new JButton("Insert Details");
			btnNewButton_1.setBackground(new Color(147, 112, 219));
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					Select.returnBooking.setCusName(textField.getText());
					Select.returnBooking.setAddress(textField_1.getText());

					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
					
					String name = Select.returnBooking.getCusName();
					String address = Select.returnBooking.getAddress();
					String reservationName = Select.returnBooking.getReservationName();
					String checkIn = sdf.format(Select.returnBooking.getCheckIN());
					String checkOut = sdf.format(Select.returnBooking.getCheckOut());
					double total = Select.returnBooking.getTotal();
					
					createdBooking.setCusName(name);
					createdBooking.setAddress(address);
					createdBooking.setReservationName(reservationName);
					createdBooking.setCheckIN(Select.returnBooking.getCheckIN());
					createdBooking.setCheckOut(Select.returnBooking.getCheckOut());
					createdBooking.setTotal(total);
					
					dbconnector dbc=new dbconnector();
					
					dbc.createbooking(name, address, reservationName, checkIn, checkOut, total);
					
					btnNewButton_1.setVisible(false);
					btnNewButton_2.setVisible(true);
					
					BillDetails bill = new BillDetails();
					BillDetails.main(null);
					
					frame.setVisible(false);
					
				}
			});
			btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
			btnNewButton_1.setBounds(389, 630, 170, 37);
			frame.getContentPane().add(btnNewButton_1);
			
		}
		
			
		
		
		
		
	}
	
	
	
}
