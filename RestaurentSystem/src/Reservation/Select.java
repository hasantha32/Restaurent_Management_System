
package Reservation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;
import java.sql.DriverManager;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.awt.event.ActionEvent;

//import com.mysql.jdbc.Connection;
//import com.mysql.jdbc.Statement;
import com.toedter.calendar.JDateChooser;

public class Select {

	protected static final JTextComponent CheckIn = null;
	protected static final JTextComponent CheckOut = null;
	public static JFrame frame;
	private JTextField txtReservationManagement;
	
	public static BookingModel returnBooking = new BookingModel();
	
    dbconnector dbc=new dbconnector();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Select window = new Select();
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
	public Select() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame =  new JFrame();
		frame.setBounds(350, 150, 1250, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtReservationManagement = new JTextField();
		txtReservationManagement.setEditable(false);
		txtReservationManagement.setBackground(new Color(127, 255, 0));
		txtReservationManagement.setFont(new Font("Tahoma", Font.BOLD, 28));
		txtReservationManagement.setText("                                                       RESERVATION MANAGEMENT");
		txtReservationManagement.setBounds(0, 57, 1303, 80);
		frame.getContentPane().add(txtReservationManagement);
		txtReservationManagement.setColumns(10);
		
		JLabel lblNewLabel = new JLabel(" Reservation Type");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(164, 252, 168, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Reservation");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(195, 369, 168, 18);
		frame.getContentPane().add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"<None>","Hall", "Table", "Pool"}));
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setBounds(389, 245, 755, 42);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
//		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Table 1", "Table 2", "Table 3", "Table 4", "Table 5", "Table 6"}));
		comboBox_1.setBackground(new Color(255, 255, 255));
		comboBox_1.setBounds(389, 343, 755, 42);
		frame.getContentPane().add(comboBox_1);
		comboBox_1.setEnabled(false);
		
		JLabel lblNewLabel_3 = new JLabel("Check In");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setBounds(162, 558, 123, 25);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Check Out");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4.setBounds(800, 572, 123, 16);
		frame.getContentPane().add(lblNewLabel_4);
		
		JButton btnNewButton_2 = new JButton("Book");
		btnNewButton_2.setBackground(new Color(147, 112, 219));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_2.setBounds(527, 649, 193, 35);
		frame.getContentPane().add(btnNewButton_2);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(276, 548, 132, 35);
		dateChooser.getJCalendar().setMinSelectableDate(new Date());
		frame.getContentPane().add(dateChooser);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(920, 558, 132, 36);
		dateChooser_1.getJCalendar().setMinSelectableDate(new Date());
		frame.getContentPane().add(dateChooser_1);
		
		
		 //define models here for each selection
	    final DefaultComboBoxModel hallModel = new DefaultComboBoxModel(new String[]{"<None>","Hall Araliya", "Hall Gardiniya", "Hall Rose","Hall Lily"});
	    final DefaultComboBoxModel tableModel = new DefaultComboBoxModel(new String[]{"<None>","Table 1", "Table 2", "Table 3", "Table 4", "Table 5", "Table 6"});
	    final DefaultComboBoxModel poolModel = new DefaultComboBoxModel(new String[]{"<None>","Pool"});

	    
	    comboBox.addActionListener (new ActionListener () {
	        public void actionPerformed(ActionEvent e) {
	            if ("Hall".equals(comboBox.getSelectedItem())){
	                //set the appropriate model here
	            	comboBox_1.setEnabled(true);
	            	comboBox_1.setModel(hallModel);
	            } else if ("Table".equals(comboBox.getSelectedItem())) {
	            	comboBox_1.setEnabled(true);
	            	comboBox_1.setModel(tableModel);  
	            } else if ("Pool".equals(comboBox.getSelectedItem())) {
	            	comboBox_1.setEnabled(true);
	            	comboBox_1.setModel(poolModel);
	            } else {
	            	comboBox_1.setEnabled(false);
	            }
	        }
	    });
	    
	    comboBox_1.addActionListener (new ActionListener () {
	        public void actionPerformed(ActionEvent e) {
	        	ArrayList<Date[]> dateRangeList = new ArrayList<>();
	    		dateRangeList = dbc.getBookedDates(comboBox_1.getSelectedItem().toString());
	    		
	    		for (Date[] dates : dateRangeList){
	    			RangeEvaluator evaluator = new RangeEvaluator();
					evaluator.setStartDate(dates[0]);
					evaluator.setEndDate(dates[1]);

					dateChooser.getJCalendar().getDayChooser().addDateEvaluator(evaluator);
					dateChooser_1.getJCalendar().getDayChooser().addDateEvaluator(evaluator);
	    		}
	        	
	        }
	    });
	    
	    
	    
	    BookingModel bookingModel = new BookingModel();
	    
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(comboBox.getSelectedItem() == "") {
					JOptionPane.showMessageDialog(frame,
						    "Please fill Reservation type field",
						    "Field Required",
						    JOptionPane.ERROR_MESSAGE);
				} else if (comboBox_1.getSelectedItem() == null) {
					JOptionPane.showMessageDialog(frame,
						    "Please fill item field",
						    "Field Required",
						    JOptionPane.ERROR_MESSAGE);
				} else if (dateChooser.getDate() == null) {
					JOptionPane.showMessageDialog(frame,
						    "Please fill Check In date",
						    "Field Required",
						    JOptionPane.ERROR_MESSAGE);
				} else if (dateChooser_1.getDate() == null) {
					JOptionPane.showMessageDialog(frame,
						    "Please fill Check out date",
						    "Field Required",
						    JOptionPane.ERROR_MESSAGE);
				} else {
					
					bookingModel.setReservationType(comboBox.getSelectedItem().toString());
					bookingModel.setReservationName(comboBox_1.getSelectedItem().toString());
					bookingModel.setCheckIN(dateChooser.getDate());
					bookingModel.setCheckOut(dateChooser_1.getDate());
					
					returnBooking = bookingModel;

					comboBox.setEnabled(false);
					comboBox_1.setEnabled(false);

					ReservationDetails dlts = new ReservationDetails();
					ReservationDetails.main(null);
					
					frame.setVisible(false);
				}
				
			}
		});
	}
}
