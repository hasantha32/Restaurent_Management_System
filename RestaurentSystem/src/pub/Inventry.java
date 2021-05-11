package pub;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;

import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.Statement;
import java.text.MessageFormat;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class Inventry {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inventry window = new Inventry();
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
	public Inventry() {
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

		JSeparator separator = new JSeparator();
		separator.setBounds(0, 68, 1234, 9);
		frame.getContentPane().add(separator);

		JLabel lblSpa = new JLabel("GRAND MANSION Restaurant");
		lblSpa.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblSpa.setBounds(417, 11, 392, 44);
		frame.getContentPane().add(lblSpa);

		JLabel lblNewLabel = new JLabel("Inventry");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(565, 96, 91, 35);
		frame.getContentPane().add(lblNewLabel);

		JButton btnNewButton = new JButton("Add ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AddM add = new AddM();
				AddM.main(null);
				frame.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(756, 628, 104, 35);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Upadate");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				UpdateM mm = new UpdateM();
				UpdateM.main(null);
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBounds(911, 628, 104, 35);
		frame.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_3 = new JButton("REPORT");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try{
	            	
	                
	                MessageFormat header = new MessageFormat("PUB Inventory Report|Grand Mantion Restaurent"
	                		+ ""
	                		+ ".");
	                MessageFormat footer = new MessageFormat("Page{0,number,integer}");
	                table.print(JTable.PrintMode.NORMAL, header, footer);
	            }catch(java.awt.print.PrinterException er){
	                System.err.format("Cannot print %s%n", er.getMessage());
	            }	
			}
		});
		btnNewButton_3.setBounds(1059, 627, 104, 35);
		frame.getContentPane().add(btnNewButton_3);

		try {
			Connection connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/restaurantsystem1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
					"root", "");

			String query = "select * from pubinventory ";

			Statement sta = connection.createStatement();
			ResultSet rs = sta.executeQuery(query);

			String[] columns = { "ItemName", "UPrice", "Type", "Quantity" };
			DefaultTableModel tableModel = new DefaultTableModel(columns, 0);

			while (rs.next()) {
				String ItemName = rs.getString("ItemName");
				String UPrice = rs.getString("UPrice");
				String Type = rs.getString("Type");
				String Quantity = rs.getString("Quantity");

				Object o[] = { ItemName, UPrice, Type, Quantity };

				tableModel.addRow(new Object[] { ItemName, UPrice, Type, Quantity });

				System.out.println(ItemName + "\t" + UPrice + "\t" + Type + "\t" + Quantity);

			}
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(100, 177, 1086, 375);
			frame.getContentPane().add(scrollPane);

			table = new JTable();

			table.setModel(tableModel);
			scrollPane.setViewportView(table);

			connection.close();
		} catch (Exception exception) {
			exception.printStackTrace();
		}

		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AdminP admi = new AdminP();
				AdminP.main(null);
				frame.setVisible(false);
			}
		});

		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2.setBounds(31, 87, 91, 44);
		frame.getContentPane().add(btnNewButton_2);

	}
}
