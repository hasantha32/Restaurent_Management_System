package Kitchen_Management;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

public class COOKS_DETAILS_HOMEPAGE {

	private JFrame frame;
	private JTextField txtKitchenManagement;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					COOKS_DETAILS_HOMEPAGE window = new COOKS_DETAILS_HOMEPAGE();
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
	public COOKS_DETAILS_HOMEPAGE() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(105, 105, 105));
		frame.setBounds(100, 100, 1825, 995);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
	
		
		
		
		
		JButton btnNewButton_1_1_1 = new JButton("LOGOUT");
		
		
		
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int a =JOptionPane.showConfirmDialog(btnNewButton_1_1_1,"Are you sure");
				if(a==JOptionPane.YES_OPTION) {
				LOGIN logout=new LOGIN();
				LOGIN.main(null);
				frame.setVisible(false);
				}else {
					
				}
			}
		});
		
		
		
		btnNewButton_1_1_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1_1_1.setBackground(SystemColor.activeCaption);
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_1_1.setBounds(1616, 28, 158, 55);
		frame.getContentPane().add(btnNewButton_1_1_1);
		
		
		
		
		
		
		
		
		
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Times New Roman", Font.BOLD, 40));
		textField_3.setColumns(10);
		textField_3.setBackground(Color.BLACK);
		textField_3.setBounds(0, 0, 1807, 8);
		frame.getContentPane().add(textField_3);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Times New Roman", Font.BOLD, 40));
		textField_2.setColumns(10);
		textField_2.setBackground(Color.BLACK);
		textField_2.setBounds(0, 96, 1807, 14);
		frame.getContentPane().add(textField_2);
		
		txtKitchenManagement = new JTextField();
		txtKitchenManagement.setForeground(Color.RED);
		txtKitchenManagement.setHorizontalAlignment(SwingConstants.CENTER);
		txtKitchenManagement.setText("VIEW COOKS DETAILS");
		txtKitchenManagement.setFont(new Font("Times New Roman", Font.BOLD, 40));
		txtKitchenManagement.setBackground(Color.DARK_GRAY);
		txtKitchenManagement.setBounds(0, 0, 1807, 110);
		frame.getContentPane().add(txtKitchenManagement);
		txtKitchenManagement.setColumns(10);
		
		
		
		JButton btnNewButton = new JButton("SEARCH");
		
		
		
		
		
		
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				SEARCH search=new SEARCH();
				SEARCH.main(null);
				
				
			}
			
		});
		
		
		
		
		
		
		
		
		
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(0, 109, 313, 49);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ADD RECIPES");
		
		
		
		
		
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ADD_RECIPES details=new ADD_RECIPES();
				ADD_RECIPES.main(null);
				frame.setVisible(false);
				
			}
			
		});
		
		
		
		
		
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBackground(new Color(105, 105, 105));
		btnNewButton_1.setBounds(0, 159, 313, 49);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_2 = new JButton("UPDATE RECIPES");
		
		
		
		
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				UPDATE_RECIPES update=new UPDATE_RECIPES();
				UPDATE_RECIPES.main(null);
				
				frame.setVisible(false);
				
			}
			
		});
		
		
		
		
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_2.setBounds(0, 208, 313, 49);
		frame.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_1_2_1_1 = new JButton("DAILY REPORT");
		
		
		
		
		
		btnNewButton_1_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				DAILY_REPORT details=new DAILY_REPORT();
				DAILY_REPORT.main(null);
				
			}
			
		});
		
		
		
		
		btnNewButton_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_2_1_1.setBounds(0, 365, 313, 49);
		frame.getContentPane().add(btnNewButton_1_2_1_1);
		
		JButton btnNewButton_1_2_2_1 = new JButton("VIEW ORDERS");
		
		
		
		
		btnNewButton_1_2_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				VIEW_ORDERS details=new VIEW_ORDERS();
				VIEW_ORDERS.main(null);
				frame.setVisible(false);
				
			}
			
		});
		
		
		
		
		btnNewButton_1_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_2_2_1.setBounds(0, 415, 313, 49);
		frame.getContentPane().add(btnNewButton_1_2_2_1);
		
		JButton btnNewButton_1_1 = new JButton("DELETE RECIPES");
		
		
		
		
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				DELETE_RECIPES delete=new DELETE_RECIPES();
				DELETE_RECIPES.main(null);
				frame.setVisible(false);
				
			}
			
		});
		
		
		
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_1.setBounds(0, 258, 313, 49);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2_1 = new JButton("VIEW COOKS DETAILS");
		btnNewButton_1_2_1.setForeground(Color.RED);
		
		
		
		
		btnNewButton_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				COOKS_DETAILS_HOMEPAGE details=new COOKS_DETAILS_HOMEPAGE();
				COOKS_DETAILS_HOMEPAGE.main(null);
				frame.setVisible(false);
			}
			
		});
		
		
		
		btnNewButton_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_2_1.setBounds(0, 308, 313, 55);
		frame.getContentPane().add(btnNewButton_1_2_1);
		
		
		
	
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Times New Roman", Font.BOLD, 40));
		textField.setColumns(10);
		textField.setBackground(Color.DARK_GRAY);
		textField.setBounds(0, 838, 1807, 110);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Times New Roman", Font.BOLD, 40));
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(0, 0, 0));
		textField_1.setBounds(0, 813, 1807, 25);
		frame.getContentPane().add(textField_1);
		
		JButton btnNewButton_2_1 = new JButton("View Details");
		


		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
				
				try {

					Class.forName("com.mysql.jdbc.Driver");
					Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
					String query="select * from cooks ";
					PreparedStatement pst=connection.prepareStatement(query);
					ResultSet rs=pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));

					}
					catch(Exception e) {
					e.printStackTrace();
					}
				
				
				
				
	
			}
			
		});
		

		
		
		
		
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton_2_1.setBackground(Color.GRAY);
		btnNewButton_2_1.setBounds(765, 694, 349, 65);
		frame.getContentPane().add(btnNewButton_2_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(481, 197, 944, 458);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"ID", "Name", "Email", "Address"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(15);
		table.getColumnModel().getColumn(1).setMinWidth(45);
		scrollPane.setViewportView(table);
		
		JButton btnNewButton_1_2_2_1_1 = new JButton("");
		btnNewButton_1_2_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_2_2_1_1.setBounds(0, 466, 313, 346);
		frame.getContentPane().add(btnNewButton_1_2_2_1_1);
		

	}
}
