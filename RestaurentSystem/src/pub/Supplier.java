package pub;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class Supplier {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Supplier window = new Supplier();
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
	public Supplier() {
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
		
		JLabel label = new JLabel("GRAND MANSION Restaurant");
		label.setFont(new Font("Tahoma", Font.BOLD, 25));
		label.setBounds(442, 13, 392, 44);
		frame.getContentPane().add(label);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 68, 1234, 9);
		frame.getContentPane().add(separator);
		
		JLabel lblNewLabel = new JLabel("SUPPLIERS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(540, 165, 113, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Upadate Supplier");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UpdateSup up = new UpdateSup();
				UpdateSup.main(null);
				frame.setVisible(false);
				
			}
		});
		btnNewButton_1.setBounds(949, 602, 145, 41);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Add Supplier");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AddSup sup = new AddSup ();
				AddSup.main(null);
				frame.setVisible(false);
			}
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(761, 602, 145, 41);
		frame.getContentPane().add(btnNewButton);
		
	
		try {
			Connection connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/restaurantsystem1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
					"root", "");

			String query = "select * from pub_supplier ";

			Statement sta = connection.createStatement();
			ResultSet rs = sta.executeQuery(query);

			String[] columns = {"Name", "Company", "Brand", "Phone" };
			DefaultTableModel tableModel = new DefaultTableModel(columns, 0);

			while (rs.next()) {
				String Name = rs.getString("Name");
				String company = rs.getString("Company");
				String brand = rs.getString("Brand");
				String phone = rs.getString("Phone");

				Object o[] = {Name, company, brand, phone };

				tableModel.addRow(new Object[] { Name, company, brand, phone });

				System.out.println( Name + "\t" + company + "\t" + brand + "\t" + phone);

			}
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(273, 239, 731, 283);
			frame.getContentPane().add(scrollPane);

			table = new JTable();

			table.setModel(tableModel);
			scrollPane.setViewportView(table);

			connection.close();
		} catch (Exception exception) {
			exception.printStackTrace();
		}

		
		JButton btnNewButton_3 = new JButton("Back");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AdminP pk = new AdminP();
				AdminP.main(null);
				frame.setVisible(false);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_3.setBounds(77, 115, 89, 44);
		frame.getContentPane().add(btnNewButton_3);
	}
}
