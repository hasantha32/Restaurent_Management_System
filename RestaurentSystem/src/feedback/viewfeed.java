package feedback;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JTable;

import net.proteanit.sql.DbUtils;

import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

public class viewfeed {

	private JFrame frame;
	private JTextField txtViewFeedback;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewfeed window = new viewfeed();
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
	public viewfeed() {
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
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(45, 122, 1140, 453);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "New column", "New column", "New column", "New column", "New column"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("REFRESH TABLE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
					
					String query="select * from feedbackorg ";
					PreparedStatement pst=connection.prepareStatement(query);
					ResultSet rs=pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
				}
				catch(Exception ex) {
					ex.printStackTrace();
				}

			}
		});
		btnNewButton.setBounds(511, 588, 172, 25);
		frame.getContentPane().add(btnNewButton);
		
		txtViewFeedback = new JTextField();
		
		txtViewFeedback.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtViewFeedback.setText("                                                                                    VIEW FEEDBACK");
		txtViewFeedback.setBounds(0, 23, 1401, 86);
		frame.getContentPane().add(txtViewFeedback);
		txtViewFeedback.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Feedbacknreview backsdf = new Feedbacknreview();
				Feedbacknreview.main(null);
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(511, 626, 175, 25);
		frame.getContentPane().add(btnNewButton_1);
		
Connection conn = null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant_management?useTimezone=true&serverTimezone=UTC","root","");
            System.out.println("Connected");
            Statement stmt = conn.createStatement();
            String sql;
            
         
            sql = "select * from feedbackorg";
            ResultSet R;
            R = stmt.executeQuery(sql);
            

        }catch (Exception e) {
			System.out.println(e.toString());
		}
        finally {
			
		}
	}
}
