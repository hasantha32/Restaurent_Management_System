package logins;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JCalendar;
import java.awt.Button;

public class PanelDiscount extends JPanel {
	private JTextField textDiscount;
	private JTable tableDetails;
	private JTextField textItemID;

	/**
	 * Create the panel.
	 */
	public PanelDiscount() {
		setBounds(0,0,800,550);
		setLayout(null);
		setVisible(true);
		
		
		JComboBox comboBoxType = new JComboBox(); 
		comboBoxType.setModel(new DefaultComboBoxModel(new String[] {"Food", "Pub", "Reservation"}));

		comboBoxType.setBounds(40, 64, 145, 20);
		add(comboBoxType);
		
		textDiscount = new JTextField();
		textDiscount.setBackground(SystemColor.activeCaption);
		textDiscount.setBounds(548, 64, 125, 20);
		add(textDiscount);
		textDiscount.setColumns(10);
		
		JButton btnLoad = new JButton("LOAD");
		btnLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int typeNumber = comboBoxType.getSelectedIndex();
				System.out.println(typeNumber);
				
			try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurent_management","root","");
				Statement stmt = conn.createStatement();
			
				if(typeNumber == 0){
					String sqlX = "Select * from ordert where OType = 'food'";
					
					ResultSet rs = stmt.executeQuery(sqlX);
					
					DefaultTableModel tm = new DefaultTableModel();
					tm = (DefaultTableModel)tableDetails.getModel();
				
					for(int i=0; i<=tableDetails.getRowCount();i++){
					while(rs.next()){
						tm.addRow(new Object[]{
						
								rs.getInt(1),
								rs.getString(3),
								rs.getString(4),
		
					});
				}//while1
				}//for
				}//if
				
				if(typeNumber == 1){
					String sqlX = "Select * from ordert where OType = 'pub'";
					ResultSet rs = stmt.executeQuery(sqlX);
					
					DefaultTableModel tm = new DefaultTableModel();
					tm = (DefaultTableModel)tableDetails.getModel();
				
					for(int i=0; i<=tableDetails.getRowCount();i++){
					while(rs.next()){
						tm.addRow(new Object[]{
						
								rs.getInt(1),
								rs.getString(3),
								rs.getString(4),
		
					});
				}//while1
				}//for
				}//if
				
				if(typeNumber == 2){
					String sqlX = "Select * from ordert where OType = 'rese'";
					ResultSet rs = stmt.executeQuery(sqlX);
					
					DefaultTableModel tm = new DefaultTableModel();
					tm = (DefaultTableModel)tableDetails.getModel();
				
					for(int i=0; i<=tableDetails.getRowCount();i++){
					while(rs.next()){
						tm.addRow(new Object[]{
						
								rs.getInt(1),
								rs.getString(3),
								rs.getString(4),
		
					});
				}//while1
				}//for
				}//if
				conn.close();
				
			}catch(Exception x){
				System.out.println(x);
			}
				
		
			}});
		btnLoad.setBackground(Color.CYAN);
		btnLoad.setBounds(104, 114, 81, 30);
		add(btnLoad);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurent_management","root","");
					Statement load1 = conn.createStatement();
					String sql = "UPDATE billinventory SET discount="+textDiscount.getText().toString()+" WHERE ItemID="+textItemID.getText().toString()+"  ";
					load1.execute(sql);
				}catch(Exception insert){
					System.out.println(insert);
				}
				
				
			}
		});
		btnUpdate.setBackground(Color.CYAN);
		btnUpdate.setBounds(600, 283, 81, 30);
		add(btnUpdate);
		
		JButton btnDelete = new JButton("REFRESH");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//update_table();
			}
		});
		
		btnDelete.setBackground(Color.CYAN);
		btnDelete.setBounds(600, 426, 81, 30);
		add(btnDelete);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(40, 234, 439, 226);
		add(scrollPane);
		
		tableDetails = new JTable();
		tableDetails.setBorder(new LineBorder(new Color(0, 0, 0)));
		tableDetails.setModel(new DefaultTableModel(
			new Object[][] {
				
			},
			new String[] {
				"ItemID", "Type", "ItemName", "DiscountGiven"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tableDetails.getColumnModel().getColumn(3).setPreferredWidth(119);
		scrollPane.setViewportView(tableDetails);
		
		JLabel lblType = new JLabel("TYPE : ");
		lblType.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblType.setBounds(40, 27, 99, 26);
		add(lblType);
		
		JLabel lblItemId = new JLabel("ITEM ID :");
		lblItemId.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblItemId.setBounds(290, 33, 81, 14);
		add(lblItemId);
		
		JLabel lblNewDiscount = new JLabel("NEW DISCOUNT :");
		lblNewDiscount.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewDiscount.setBounds(548, 33, 133, 20);
		add(lblNewDiscount);
		
		textItemID = new JTextField();
		textItemID.setBounds(288, 64, 133, 20);
		add(textItemID);
		textItemID.setColumns(10);
		
		JButton btnInsert = new JButton("INSERT");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurent_management","root","");
				Statement load1 = conn.createStatement();
				String sql = "INSERT INTO discount(discount) VALUES('"+textDiscount.getText().toString()+"') WHERE ItemID="+textItemID.getText().toString()+"";
				load1.execute(sql);
				conn.close();
			}catch(Exception insert){
				System.out.println(insert);
			}
			
			}
		});
		btnInsert.setBounds(600, 218, 81, 30);
		add(btnInsert);
		
		JButton button = new JButton("DELETE");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		button.setBackground(Color.CYAN);
		button.setBounds(600, 354, 81, 30);
		add(button);
	}
}
