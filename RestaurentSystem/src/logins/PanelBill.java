package logins;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class PanelBill extends JPanel {
	private JTable tableBill_1;
	private JTextField enterBill;
	private JTable tableBill_2;
	private JTable tableBill_3;

	/**
	 * Create the panel.
	 */
	public PanelBill() {
		setBounds(0,0,1750,550);
		setLayout(null);
		setVisible(true);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(38, 109, 752, 121);
		add(scrollPane);
		
		tableBill_1 = new JTable();
		tableBill_1.setBorder(new LineBorder(Color.BLACK));
		tableBill_1.setModel(new DefaultTableModel(
			new Object[][] {
	
			},
			new String[] {
				"BillID", "ItemID", "Item_Name", "Unit_Price", "Quantity", "Total", "Discount%", "TotalAfter"
			}
		) {
			Class[] columnTypes = new Class[] {
					Integer.class, Integer.class, String.class, Double.class, Integer.class, Double.class, Double.class, Double.class
			};
			
			//////I.class, I.class, String.class, i.class, d.class, i.class, Double.class, Double.class,Double.class
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tableBill_1.setBackground(SystemColor.scrollbar);
		scrollPane.setViewportView(tableBill_1);
		
		JButton button = new JButton("LOAD");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		try{
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurent_management","root","");
					
					Statement load1 = conn.createStatement();
					Statement loadx2 = conn.createStatement();
					
					String sql = "Select BillId,ItemID,ItemName,unitPrice,quantity,total,discount,totalAfter from billinventory where Type = 'food' AND BillId='"+enterBill.getText().toString()+"'";
					
					ResultSet rs = load1.executeQuery(sql);
			
							DefaultTableModel tm = new DefaultTableModel();
							tm = (DefaultTableModel)tableBill_1.getModel();
						
							while(rs.next()){//&& rsx2.next()
								tm.addRow(new Object[]{
										//	"BillID", "ItemID", "Item_Name", "Unit_Price", "Quantity", "Total", "Discount%", "TotalAfter"
										rs.getInt(1),
										rs.getInt(2),
										rs.getString(3),
										rs.getDouble(4),//UnitPrice
										rs.getInt(5),		
										rs.getDouble(6),	//Total
										rs.getDouble(7),//discount 11
										rs.getDouble(8),	
								});
						}//while1
					////I.class, I.class, String.class, S.class, d.class, i.class, Double.class, Double.class,Double.class
							
							tableBill_1.setModel(tm);

							
								Statement load3 = conn.createStatement();
								String sql3 = "Select * from order_table WHERE BillId='"+enterBill.getText().toString()+"'";
								ResultSet rs3 = load3.executeQuery(sql3);	
									
								DefaultTableModel table3 = new DefaultTableModel();
								table3 = (DefaultTableModel)tableBill_3.getModel();	
								while(rs3.next()){
									table3.addRow(new Object[]{
									/*"OrderID", "ItemName", "Quantity", "TotalPrice", "Type", "Discount%", "TotalAfter"
								//Integer.class, String.class, Integer.class, Double.class, String.class, Double.class, Double.class*/
										
											rs3.getInt(1),
											rs3.getString(3),
											rs3.getInt(2),
											rs3.getDouble(4),
											rs3.getString(5),
										/*	rs3.getDouble(7),
											rs3.getDouble(11),
											*/
								});
								}//for	
					
		}catch(Exception rs){
			System.out.println(rs);
		}
				
			}
		});
		button.setFont(new Font("Times New Roman", Font.BOLD, 11));
		button.setBounds(206, 30, 81, 30);
		add(button);
		
		JLabel label = new JLabel("Print Bill For Official Use :");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label.setBounds(534, 24, 165, 37);
		add(label);
		
		JButton button_1 = new JButton("PRINT");
		button_1.setForeground(Color.BLACK);
		button_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		button_1.setBounds(709, 27, 81, 30);
		add(button_1);
		
		enterBill = new JTextField();
		enterBill.setBackground(SystemColor.activeCaption);
		enterBill.setBounds(41, 30, 136, 30);
		add(enterBill);
		enterBill.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Enter Bill No :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel.setBounds(41, 11, 104, 14);
		add(lblNewLabel);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(38, 260, 752, 121);
		add(scrollPane_1);
		
		tableBill_2 = new JTable();
		tableBill_2.setBorder(new LineBorder(Color.BLACK));
		tableBill_2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"BillID", "ItemID", "ItemName", "No.Of_People", "Total", "Discount%", "TotalAfter"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, Integer.class, Double.class, Double.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tableBill_2.getColumnModel().getColumn(3).setPreferredWidth(95);
		scrollPane_1.setViewportView(tableBill_2);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(38, 420, 752, 121);
		add(scrollPane_2);
		
		tableBill_3 = new JTable();
		tableBill_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		tableBill_3.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"OrderID", "ItemName", "Quantity", "TotalPrice", "Type", "Discount%", "TotalAfter"
				//Integer.class, String.class, Integer.class, Double.class, String.class, Double.class, Double.class
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, Integer.class, Double.class, String.class, Double.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane_2.setViewportView(tableBill_3);
		
		JLabel lblBill = new JLabel("BILL");
		lblBill.setBounds(38, 420, 750, 119);
		add(lblBill);
		lblBill.setFont(new Font("Times New Roman", Font.BOLD, 45));
		
		JLabel label_1 = new JLabel("FOOD :");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_1.setBounds(35, 87, 92, 14);
		add(label_1);
		
		JLabel label_2 = new JLabel("RESERVATION :");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_2.setBounds(38, 246, 92, 14);
		add(label_2);
		
		JLabel label_3 = new JLabel("PUB :");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_3.setBounds(38, 395, 46, 14);
		add(label_3);
	}
}
