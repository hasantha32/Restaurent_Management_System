package admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.MessageFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import net.proteanit.sql.DbUtils;
import DBConnection.DBC;
import java.awt.Color;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import Customer.Menu;
import java.awt.Font;

/**
 *
 * @author Mahendra
 */
public class print extends javax.swing.JFrame {
Connection conn = null;
PreparedStatement pst=null;
ResultSet rs=null;
   
//s}catch(java.awt.print.PrinterException e){
    public void update_table(){
 try{
           
	 String sql="select * from foods";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            try{
                
                MessageFormat header = new MessageFormat("Grand Mention");
                MessageFormat footer = new MessageFormat("Page{0,number,integer}");
                //jTable1.print(JTable.PrintMode.NORMAL, header, footer);
            }catch(Exception e){
           
                System.err.format("Cannot print %s%n", e.getMessage());
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
 
   }

    public print() {
    	//getContentPane().setBackground(Color.GRAY);
    	//setBackground(Color.LIGHT_GRAY);
        initComponents();
        conn = DBC.food_connection();
        update_table();
        
    }

    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTable1.setForeground(Color.BLACK);
        jTable1.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 13));
        jTable1.setBackground(Color.LIGHT_GRAY);
        jButton1 = new javax.swing.JButton();
        jButton1.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 13));
        jButton1.setForeground(Color.WHITE);
        jButton2 = new javax.swing.JButton();
        jButton2.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 13));
        jButton2.setForeground(Color.WHITE);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Customer transactions");
        setResizable(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Search ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Print");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jButton1)
        					.addPreferredGap(ComponentPlacement.RELATED, 535, Short.MAX_VALUE)
        					.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 369, GroupLayout.PREFERRED_SIZE)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(18)
        					.addComponent(jButton1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(18)
        					.addComponent(jButton2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        			.addContainerGap(43, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
        setLocationRelativeTo(null);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
      view_all_records view_all_records = new view_all_records();
      view_all_records.setVisible(true);
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        try{
                
                MessageFormat header = new MessageFormat("Grand Mention");
                MessageFormat footer = new MessageFormat("Page{0,number,integer}");
                jTable1.print(JTable.PrintMode.NORMAL, header, footer);
            }catch(java.awt.print.PrinterException e){
                System.err.format("Cannot print %s%n", e.getMessage());
            }
    }


    public static void main(String args[]) {
   
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
               UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(print.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(print.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(print.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(print.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
     

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new print().setVisible(true);
            }
        });
    }

   
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
