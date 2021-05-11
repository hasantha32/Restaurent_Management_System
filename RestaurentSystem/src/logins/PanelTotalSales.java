package logins;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelTotalSales extends JPanel {
	private JTable tableFood;
	private JTable tableReservation;
	private JTable tablePUB;

	/**
	 * Create the panel.
	 */
	public PanelTotalSales() {
		setBounds(0,0,800,550);
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 164, 768, 96);
		add(scrollPane);
		
		tableFood = new JTable();
		tableFood.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Bill_ID", "Item_ID", "Item_Name", "UnitPrice", "Quantity", "Total", "Discount%", "TotalAfter"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, Double.class, Integer.class, Double.class, Double.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tableFood.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		tableFood.setBackground(Color.WHITE);
		tableFood.setForeground(Color.BLACK);
		scrollPane.setViewportView(tableFood);
		
		
		JButton btnNewButton_1 = new JButton("LOAD");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//dateChooserX
				
				
				
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnNewButton_1.setBounds(206, 30, 81, 30);
		add(btnNewButton_1);
		setVisible(true);
		
		JButton btnNewButton = new JButton("PRINT");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(709, 27, 81, 30);
		add(btnNewButton);
		
		JLabel lblPrintBill = new JLabel("Print Bill For Official Use :");
		lblPrintBill.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblPrintBill.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrintBill.setLabelFor(btnNewButton);
		lblPrintBill.setBounds(534, 27, 165, 37);
		add(lblPrintBill);
		
		JDateChooser dateChooserX = new JDateChooser();
		dateChooserX.setBounds(22, 34, 153, 30);
		add(dateChooserX);
		
		JLabel lblNewLabel = new JLabel("Enter Date :");
		lblNewLabel.setLabelFor(dateChooserX);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel.setBounds(22, 11, 113, 14);
		add(lblNewLabel);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(20, 300, 768, 89);
		add(scrollPane_1);
		
		tableReservation = new JTable();
		tableReservation.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"BillID", "Item_ID", "No.of.People", "Total", "Discount%", "TotalAfter"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, Double.class, Double.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tableReservation.setForeground(Color.BLACK);
		tableReservation.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		tableReservation.setBackground(Color.WHITE);
		scrollPane_1.setViewportView(tableReservation);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(22, 428, 768, 96);
		add(scrollPane_2);
		
		tablePUB = new JTable();
		tablePUB.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"BillID", "ItemID", "Item_Name", "Unit_Price", "Quantity", "Total", "Discount%", "TotalAfter"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, Double.class, Integer.class, Double.class, Double.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane_2.setViewportView(tablePUB);
		
		JLabel lblReservation = new JLabel("FOOD :");
		lblReservation.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblReservation.setLabelFor(tableFood);
		lblReservation.setBounds(22, 139, 92, 14);
		add(lblReservation);
		
		JLabel lblReservation_1 = new JLabel("RESERVATION :");
		lblReservation_1.setLabelFor(tableReservation);
		lblReservation_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblReservation_1.setBounds(22, 282, 92, 14);
		add(lblReservation_1);
		
		JLabel lblPub = new JLabel("PUB :");
		lblPub.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPub.setBounds(22, 403, 46, 14);
		add(lblPub);
		
		JLabel lblNetIncome = new JLabel("NET INCOME :");
		lblNetIncome.setBackground(Color.CYAN);
		lblNetIncome.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNetIncome.setBounds(144, 95, 113, 37);
		add(lblNetIncome);
		
		JLabel lblNetIncome0 = new JLabel("");
		lblNetIncome0.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNetIncome0.setLabelFor(lblNetIncome);
		lblNetIncome0.setBounds(267, 95, 92, 30);
		add(lblNetIncome0);
		
		JLabel lblNewLabel_1 = new JLabel("TOTAL DISCOUNT OFFERED :");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setBounds(401, 87, 203, 52);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setLabelFor(lblNewLabel_1);
		lblNewLabel_2.setBounds(614, 95, 85, 37);
		add(lblNewLabel_2);
		

	}
}
