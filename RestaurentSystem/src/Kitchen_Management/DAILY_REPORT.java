 package Kitchen_Management;

import java.awt.event.ItemEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.MessageFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.UIManager;

import DBConnection.DBC;

import javax.swing.JButton;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;

public class DAILY_REPORT extends javax.swing.JFrame {
Connection conn = null;
PreparedStatement pst = null;
ResultSet rs = null;
static int id; 
static String last_id;

    public DAILY_REPORT() {
    	getContentPane().setBackground(Color.GRAY);
        initComponents();
        conn = DBC.food_connection();
        
        quantity_not_enable();
        get_last_id();
       
    }
    public void clear(){
        jCheckBox1.setSelected(false);
        jTextField1.setText("");
        jTextField7.setText("");
        jCheckBox2.setSelected(false);
        jTextField2.setText("");
        jTextField8.setText("");
        jCheckBox3.setSelected(false);
        jTextField3.setText("");
        jTextField9.setText("");
        jCheckBox4.setSelected(false);
        jTextField4.setText("");
        jTextField10.setText("");
        jCheckBox5.setSelected(false);
        jTextField5.setText("");
        jTextField11.setText("");
        jCheckBox6.setSelected(false);
        jTextField6.setText("");
        jTextField12.setText("");
        jCheckBox7.setSelected(false);
        jTextField13.setText("");
        jTextField15.setText("");
        jCheckBox8.setSelected(false);
        jTextField14.setText("");
        jTextField16.setText("");
        jCheckBox9.setSelected(false);
        jTextField17.setText("");
        jTextField18.setText("");
        jCheckBox10.setSelected(false);
        jTextField20.setText("");
        jTextField19.setText("");
        jCheckBox11.setSelected(false);
        jTextField21.setText("");
        jTextField22.setText("");
        jCheckBox12.setSelected(false);
        jTextField23.setText("");
        jTextField29.setText("");
        jCheckBox13.setSelected(false);
        jTextField24.setText("");
        jTextField30.setText("");
        jCheckBox14.setSelected(false);
        jTextField25.setText("");
        jTextField31.setText("");
        jCheckBox15.setSelected(false);
        jTextField26.setText("");
        jTextField32.setText("");
        jCheckBox16.setSelected(false);
        jTextField27.setText("");
        jTextField33.setText("");
        jCheckBox17.setSelected(false);
        jTextField28.setText("");
        jTextField34.setText("");
        
 
    }
    public void get_last_id(){
        try{
            String sql = "select id from foods order by id desc limit 1";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next()){
                 last_id = rs.getString("id");
                 
                int getid = Integer.parseInt(last_id);
                id = getid+1;
               
            }else{
                id = 1;
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try{
                pst.close();
                rs.close();
            }catch(Exception e){
                
            }
        }
    }
    public void insert_rice(){
          try{
                      if(jTextField7.getText().equals("")){

                      }else{

                                    String sql = "insert into rice (id,type,price,quantity,amount) values(?,?,?,?,?)";
                                    pst=conn.prepareStatement(sql);
                                    pst.setString(1, String.valueOf(id));
                                    pst.setString(2, jLabel4.getText());
                                    pst.setString(3, jCheckBox1.getText());
                                    pst.setString(4, jTextField1.getText());
                                    pst.setString(5, jTextField7.getText());
                                    pst.execute();
                                   
                                 
                            }
                          }catch(Exception e){
                              JOptionPane.showMessageDialog(null, e );
                          }finally{
                        try{
                             pst.close();
                                    rs.close();
                        }catch(Exception e){
                            
                        }
                    }
                      try{
                      if(jTextField8.getText().equals("")){

                      }else{

                                    String sql = "insert into rice (id,type,price,quantity,amount) values(?,?,?,?,?)";
                                    pst=conn.prepareStatement(sql);
                                    pst.setString(1, String.valueOf(id));
                                    pst.setString(2, jLabel5.getText());
                                    pst.setString(3, jCheckBox2.getText());
                                    pst.setString(4, jTextField2.getText());
                                    pst.setString(5, jTextField8.getText());
                                    pst.execute();
                                  

                            }
                          }catch(Exception e){
                              JOptionPane.showMessageDialog(null, e);
                          }finally{
                        try{
                             pst.close();
                                    rs.close();
                        }catch(Exception e){
                            
                        }
                        
                        
                    }
                    
    }
    public void insert_grilled(){
                       
                                    try{
                      if(jTextField9.getText().equals("")){

                      }else{

                                    String sql = "insert into grilled (id,type,price,quantity,amount) values(?,?,?,?,?)";
                                    pst=conn.prepareStatement(sql);
                                    pst.setString(1, String.valueOf(id));
                                    pst.setString(2, jLabel8.getText());
                                    pst.setString(3, jCheckBox3.getText());
                                    pst.setString(4, jTextField3.getText());
                                    pst.setString(5, jTextField9.getText());
                                    pst.execute();
                                   

                            }
                          }catch(Exception e){
                              JOptionPane.showMessageDialog(null, e);
                          }finally{
                        try{
                             pst.close();
                                    rs.close();
                        }catch(Exception e){
                            
                        }
                    }
                                    
                                 try{
                      if(jTextField10.getText().equals("")){

                      }else{

                                    String sql = "insert into grilled (id,type,price,quantity,amount) values(?,?,?,?,?)";
                                    pst=conn.prepareStatement(sql);
                                    pst.setString(1, String.valueOf(id));
                                    pst.setString(2, jLabel11.getText());
                                    pst.setString(3, jCheckBox4.getText());
                                    pst.setString(4, jTextField4.getText());
                                    pst.setString(5, jTextField10.getText());
                                    pst.execute();
                                 

                            }
                          }catch(Exception e){
                              JOptionPane.showMessageDialog(null, e);
                          }finally{
                        try{
                             pst.close();
                                    rs.close();
                        }catch(Exception e){
                            
                        }
                    }
                                
                                 try{
                      if(jTextField11.getText().equals("")){

                      }else{

                                    String sql = "insert into grilled (id,type,price,quantity,amount) values(?,?,?,?,?)";
                                    pst=conn.prepareStatement(sql);
                                    pst.setString(1, String.valueOf(id));
                                    pst.setString(2, jLabel13.getText());
                                    pst.setString(3, jCheckBox5.getText());
                                    pst.setString(4, jTextField5.getText());
                                    pst.setString(5, jTextField11.getText());
                                    pst.execute();
                                   

                            }
                          }catch(Exception e){
                              JOptionPane.showMessageDialog(null, e);
                          }finally{
                        try{
                             pst.close();
                                    rs.close();
                        }catch(Exception e){
                            
                        }
                    }
                          
                                
                                 try{
                      if(jTextField12.getText().equals("")){

                      }else{

                                    String sql = "insert into grilled (id,type,price,quantity,amount) values(?,?,?,?,?)";
                                    pst=conn.prepareStatement(sql);
                                    pst.setString(1, String.valueOf(id));
                                    pst.setString(2, jLabel15.getText());
                                    pst.setString(3, jCheckBox6.getText());
                                    pst.setString(4, jTextField6.getText());
                                    pst.setString(5, jTextField12.getText());
                                    pst.execute();
                             

                            }
                          }catch(Exception e){
                              JOptionPane.showMessageDialog(null, e);
                          }finally{
                        try{
                             pst.close();
                                    rs.close();
                        }catch(Exception e){
                            
                        }
                    }
                           
    }
    public void insert_sinigang(){
                     try{
                      if(jTextField15.getText().equals("")){

                      }else{

                                    String sql = "insert into sinigang (id,type,price,quantity,amount) values(?,?,?,?,?)";
                                    pst=conn.prepareStatement(sql);
                                    pst.setString(1, String.valueOf(id));
                                    pst.setString(2, jLabel3.getText());
                                    pst.setString(3, jCheckBox7.getText());
                                    pst.setString(4, jTextField13.getText());
                                    pst.setString(5, jTextField15.getText());
                                    pst.execute();
                                    

                            }
                          }catch(Exception e){
                              JOptionPane.showMessageDialog(null, e);
                          }finally{
                        try{
                             pst.close();
                                    rs.close();
                        }catch(Exception e){
                            
                        }
                    }
                                 
                 try{
                      if(jTextField16.getText().equals("")){

                      }else{

                                    String sql = "insert into sinigang (id,type,price,quantity,amount) values(?,?,?,?,?)";
                                    pst=conn.prepareStatement(sql);
                                    pst.setString(1, String.valueOf(id));
                                    pst.setString(2, jLabel22.getText());
                                    pst.setString(3, jCheckBox8.getText());
                                    pst.setString(4, jTextField14.getText());
                                    pst.setString(5, jTextField16.getText());
                                    pst.execute();
                                    
                            }
                          }catch(Exception e){
                              JOptionPane.showMessageDialog(null, e);
                          }finally{
                        try{
                             pst.close();
                                    rs.close();
                        }catch(Exception e){
                            
                        }
                    }
    }
    public void insert_others(){
                           
                 try{
                      if(jTextField18.getText().equals("")){

                      }else{

                                    String sql = "insert into other (id,type,price,quantity,amount) values(?,?,?,?,?)";
                                    pst=conn.prepareStatement(sql);
                                    pst.setString(1, String.valueOf(id));
                                    pst.setString(2, jLabel27.getText());
                                    pst.setString(3, jCheckBox9.getText());
                                    pst.setString(4, jTextField17.getText());
                                    pst.setString(5, jTextField18.getText());
                                    pst.execute();
                                   

                            }
                          }catch(Exception e){
                              JOptionPane.showMessageDialog(null, e);
                          }finally{
                        try{
                             pst.close();
                                    rs.close();
                        }catch(Exception e){
                            
                        }
                    }
                 try{
                      if(jTextField19.getText().equals("")){

                      }else{

                                    String sql = "insert into other (id,type,price,quantity,amount) values(?,?,?,?,?)";
                                    pst=conn.prepareStatement(sql);
                                    pst.setString(1, String.valueOf(id));
                                    pst.setString(2, jLabel32.getText());
                                    pst.setString(3, jCheckBox10.getText());
                                    pst.setString(4, jTextField20.getText());
                                    pst.setString(5, jTextField19.getText());
                                    pst.execute();
                                 

                            }
                          }catch(Exception e){
                              JOptionPane.showMessageDialog(null, e);
                          }finally{
                        try{
                             pst.close();
                                    rs.close();
                        }catch(Exception e){
                            
                        }
                    }
                 
                     try{
                      if(jTextField22.getText().equals("")){

                      }else{

                                    String sql = "insert into other (id,type,price,quantity,amount) values(?,?,?,?,?)";
                                    pst=conn.prepareStatement(sql);
                                    pst.setString(1, String.valueOf(id));
                                    pst.setString(2, jLabel33.getText());
                                    pst.setString(3, jCheckBox11.getText());
                                    pst.setString(4, jTextField21.getText());
                                    pst.setString(5, jTextField22.getText());
                                    pst.execute();
                                    

                            }
                          }catch(Exception e){
                              JOptionPane.showMessageDialog(null, e);
                          }finally{
                        try{
                             pst.close();
                                    rs.close();
                        }catch(Exception e){
                            
                        }
                    }
    }
    public void insert_drinks(){
        try{
                      if(jTextField29.getText().equals("")){

                      }else{

                                    String sql = "insert into drinks (id,type,price,quantity,amount) values(?,?,?,?,?)";
                                    pst=conn.prepareStatement(sql);
                                    pst.setString(1, String.valueOf(id));
                                    pst.setString(2, jLabel36.getText());
                                    pst.setString(3, jCheckBox12.getText());
                                    pst.setString(4, jTextField23.getText());
                                    pst.setString(5, jTextField29.getText());
                                    pst.execute();
                                   
                            }
                          }catch(Exception e){
                              JOptionPane.showMessageDialog(null, e);
                          }finally{
                        try{
                             pst.close();
                                    rs.close();
                        }catch(Exception e){
                            
                        }
                    }
                            try{
                      if(jTextField31.getText().equals("")){

                      }else{

                                    String sql = "insert into drinks (id,type,price,quantity,amount) values(?,?,?,?,?)";
                                    pst=conn.prepareStatement(sql);
                                    pst.setString(1, String.valueOf(id));
                                    pst.setString(2, jLabel38.getText());
                                    pst.setString(3, jCheckBox14.getText());
                                    pst.setString(4, jTextField25.getText());
                                    pst.setString(5, jTextField31.getText());
                                    pst.execute();
                                   

                            }
                          }catch(Exception e){
                              JOptionPane.showMessageDialog(null, e);
                          }finally{
                        try{
                             pst.close();
                                    rs.close();
                        }catch(Exception e){
                            
                        }
                    }
                               try{
                      if(jTextField32.getText().equals("")){

                      }else{

                                    String sql = "insert into drinks (id,type,price,quantity,amount) values(?,?,?,?,?)";
                                    pst=conn.prepareStatement(sql);
                                    pst.setString(1, String.valueOf(id));
                                    pst.setString(2, jLabel39.getText());
                                    pst.setString(3, jCheckBox15.getText());
                                    pst.setString(4, jTextField26.getText());
                                    pst.setString(5, jTextField32.getText());
                                    pst.execute();
                                   

                            }
                          }catch(Exception e){
                              JOptionPane.showMessageDialog(null, e);
                          }finally{
                        try{
                             pst.close();
                                    rs.close();
                        }catch(Exception e){
                            
                        }
                    }
                               
                     try{
                      if(jTextField33.getText().equals("")){

                      }else{

                                    String sql = "insert into drinks (id,type,price,quantity,amount) values(?,?,?,?,?)";
                                    pst=conn.prepareStatement(sql);
                                    pst.setString(1, String.valueOf(id));
                                    pst.setString(2, jLabel40.getText());
                                    pst.setString(3, jCheckBox16.getText());
                                    pst.setString(4, jTextField27.getText());
                                    pst.setString(5, jTextField33.getText());
                                    pst.execute();
                                   

                            }
                          }catch(Exception e){
                              JOptionPane.showMessageDialog(null, e);
                          }finally{
                        try{
                             pst.close();
                                    rs.close();
                        }catch(Exception e){
                            
                        }
                    }
                     try{
                      if(jTextField34.getText().equals("")){

                      }else{

                                    String sql = "insert into drinks (id,type,price,quantity,amount) values(?,?,?,?,?)";
                                    pst=conn.prepareStatement(sql);
                                    pst.setString(1, String.valueOf(id));
                                    pst.setString(2, jLabel41.getText());
                                    pst.setString(3, jCheckBox17.getText());
                                    pst.setString(4, jTextField28.getText());
                                    pst.setString(5, jTextField34.getText());
                                    pst.execute();
                                    

                            }
                          }catch(Exception e){
                              JOptionPane.showMessageDialog(null, e);
                          }finally{
                        try{
                             pst.close();
                                    rs.close();
                        }catch(Exception e){
                            
                        }
                    }
    }
    public  void insert_items(){
                    try{
                      if(jTextField7.getText().equals("")){

                      }else{

                                    String sql = "insert into foods (id,type,price,quantity,amount) values(?,?,?,?,?)";
                                    pst=conn.prepareStatement(sql);
                                    pst.setString(1, String.valueOf(id));
                                    pst.setString(2, jLabel4.getText());
                                    pst.setString(3, jCheckBox1.getText());
                                    pst.setString(4, jTextField1.getText());
                                    pst.setString(5, jTextField7.getText());
                                    pst.execute();
                                   
                                 
                            }
                          }catch(Exception e){
                              JOptionPane.showMessageDialog(null, e );
                          }finally{
                        try{
                             pst.close();
                                    rs.close();
                        }catch(Exception e){
                            
                        }
                    }
                                  try{
                      if(jTextField8.getText().equals("")){

                      }else{

                                    String sql = "insert into foods (id,type,price,quantity,amount) values(?,?,?,?,?)";
                                    pst=conn.prepareStatement(sql);
                                    pst.setString(1, String.valueOf(id));
                                    pst.setString(2, jLabel5.getText());
                                    pst.setString(3, jCheckBox2.getText());
                                    pst.setString(4, jTextField2.getText());
                                    pst.setString(5, jTextField8.getText());
                                    pst.execute();
                                  

                            }
                          }catch(Exception e){
                              JOptionPane.showMessageDialog(null, e);
                          }finally{
                        try{
                             pst.close();
                                    rs.close();
                        }catch(Exception e){
                            
                        }
                        
                        
                    }
                    
                                  
                                    try{
                      if(jTextField9.getText().equals("")){

                      }else{

                                    String sql = "insert into foods (id,type,price,quantity,amount) values(?,?,?,?,?)";
                                    pst=conn.prepareStatement(sql);
                                    pst.setString(1, String.valueOf(id));
                                    pst.setString(2, jLabel8.getText());
                                    pst.setString(3, jCheckBox3.getText());
                                    pst.setString(4, jTextField3.getText());
                                    pst.setString(5, jTextField9.getText());
                                    pst.execute();
                                   

                            }
                          }catch(Exception e){
                              JOptionPane.showMessageDialog(null, e);
                          }finally{
                        try{
                             pst.close();
                                    rs.close();
                        }catch(Exception e){
                            
                        }
                    }
                                    
                                 try{
                      if(jTextField10.getText().equals("")){

                      }else{

                                    String sql = "insert into foods (id,type,price,quantity,amount) values(?,?,?,?,?)";
                                    pst=conn.prepareStatement(sql);
                                    pst.setString(1, String.valueOf(id));
                                    pst.setString(2, jLabel11.getText());
                                    pst.setString(3, jCheckBox4.getText());
                                    pst.setString(4, jTextField4.getText());
                                    pst.setString(5, jTextField10.getText());
                                    pst.execute();
                                 

                            }
                          }catch(Exception e){
                              JOptionPane.showMessageDialog(null, e);
                          }finally{
                        try{
                             pst.close();
                                    rs.close();
                        }catch(Exception e){
                            
                        }
                    }
                                
                                 try{
                      if(jTextField11.getText().equals("")){

                      }else{

                                    String sql = "insert into foods (id,type,price,quantity,amount) values(?,?,?,?,?)";
                                    pst=conn.prepareStatement(sql);
                                    pst.setString(1, String.valueOf(id));
                                    pst.setString(2, jLabel13.getText());
                                    pst.setString(3, jCheckBox5.getText());
                                    pst.setString(4, jTextField5.getText());
                                    pst.setString(5, jTextField11.getText());
                                    pst.execute();
                                   

                            }
                          }catch(Exception e){
                              JOptionPane.showMessageDialog(null, e);
                          }finally{
                        try{
                             pst.close();
                                    rs.close();
                        }catch(Exception e){
                            
                        }
                    }
                          
                                
                                 try{
                      if(jTextField12.getText().equals("")){

                      }else{

                                    String sql = "insert into foods (id,type,price,quantity,amount) values(?,?,?,?,?)";
                                    pst=conn.prepareStatement(sql);
                                    pst.setString(1, String.valueOf(id));
                                    pst.setString(2, jLabel15.getText());
                                    pst.setString(3, jCheckBox6.getText());
                                    pst.setString(4, jTextField6.getText());
                                    pst.setString(5, jTextField12.getText());
                                    pst.execute();
                             

                            }
                          }catch(Exception e){
                              JOptionPane.showMessageDialog(null, e);
                          }finally{
                        try{
                             pst.close();
                                    rs.close();
                        }catch(Exception e){
                            
                        }
                    }
                                 
                                 try{
                      if(jTextField15.getText().equals("")){

                      }else{

                                    String sql = "insert into foods (id,type,price,quantity,amount) values(?,?,?,?,?)";
                                    pst=conn.prepareStatement(sql);
                                    pst.setString(1, String.valueOf(id));
                                    pst.setString(2, jLabel3.getText());
                                    pst.setString(3, jCheckBox7.getText());
                                    pst.setString(4, jTextField13.getText());
                                    pst.setString(5, jTextField15.getText());
                                    pst.execute();
                                    

                            }
                          }catch(Exception e){
                              JOptionPane.showMessageDialog(null, e);
                          }finally{
                        try{
                             pst.close();
                                    rs.close();
                        }catch(Exception e){
                            
                        }
                    }
                                 
                 try{
                      if(jTextField16.getText().equals("")){

                      }else{

                                    String sql = "insert into foods (id,type,price,quantity,amount) values(?,?,?,?,?)";
                                    pst=conn.prepareStatement(sql);
                                    pst.setString(1, String.valueOf(id));
                                    pst.setString(2, jLabel22.getText());
                                    pst.setString(3, jCheckBox8.getText());
                                    pst.setString(4, jTextField14.getText());
                                    pst.setString(5, jTextField16.getText());
                                    pst.execute();
                                    
                            }
                          }catch(Exception e){
                              JOptionPane.showMessageDialog(null, e);
                          }finally{
                        try{
                             pst.close();
                                    rs.close();
                        }catch(Exception e){
                            
                        }
                    }
                                  
                 try{
                      if(jTextField18.getText().equals("")){

                      }else{

                                    String sql = "insert into foods (id,type,price,quantity,amount) values(?,?,?,?,?)";
                                    pst=conn.prepareStatement(sql);
                                    pst.setString(1, String.valueOf(id));
                                    pst.setString(2, jLabel27.getText());
                                    pst.setString(3, jCheckBox9.getText());
                                    pst.setString(4, jTextField17.getText());
                                    pst.setString(5, jTextField18.getText());
                                    pst.execute();
                                   

                            }
                          }catch(Exception e){
                              JOptionPane.showMessageDialog(null, e);
                          }finally{
                        try{
                             pst.close();
                                    rs.close();
                        }catch(Exception e){
                            
                        }
                    }
                 try{
                      if(jTextField19.getText().equals("")){

                      }else{

                                    String sql = "insert into foods (id,type,price,quantity,amount) values(?,?,?,?,?)";
                                    pst=conn.prepareStatement(sql);
                                    pst.setString(1, String.valueOf(id));
                                    pst.setString(2, jLabel32.getText());
                                    pst.setString(3, jCheckBox10.getText());
                                    pst.setString(4, jTextField20.getText());
                                    pst.setString(5, jTextField19.getText());
                                    pst.execute();
                                 

                            }
                          }catch(Exception e){
                              JOptionPane.showMessageDialog(null, e);
                          }finally{
                        try{
                             pst.close();
                                    rs.close();
                        }catch(Exception e){
                            
                        }
                    }
                 
                     try{
                      if(jTextField22.getText().equals("")){

                      }else{

                                    String sql = "insert into foods (id,type,price,quantity,amount) values(?,?,?,?,?)";
                                    pst=conn.prepareStatement(sql);
                                    pst.setString(1, String.valueOf(id));
                                    pst.setString(2, jLabel33.getText());
                                    pst.setString(3, jCheckBox11.getText());
                                    pst.setString(4, jTextField21.getText());
                                    pst.setString(5, jTextField22.getText());
                                    pst.execute();
                                    

                            }
                          }catch(Exception e){
                              JOptionPane.showMessageDialog(null, e);
                          }finally{
                        try{
                             pst.close();
                                    rs.close();
                        }catch(Exception e){
                            
                        }
                    }
                      try{
                      if(jTextField29.getText().equals("")){

                      }else{

                                    String sql = "insert into foods (id,type,price,quantity,amount) values(?,?,?,?,?)";
                                    pst=conn.prepareStatement(sql);
                                    pst.setString(1, String.valueOf(id));
                                    pst.setString(2, jLabel36.getText());
                                    pst.setString(3, jCheckBox12.getText());
                                    pst.setString(4, jTextField23.getText());
                                    pst.setString(5, jTextField29.getText());
                                    pst.execute();
                                   
                            }
                          }catch(Exception e){
                              JOptionPane.showMessageDialog(null, e);
                          }finally{
                        try{
                             pst.close();
                                    rs.close();
                        }catch(Exception e){
                            
                        }
                    }
                            try{
                      if(jTextField31.getText().equals("")){

                      }else{

                                    String sql = "insert into foods (id,type,price,quantity,amount) values(?,?,?,?,?)";
                                    pst=conn.prepareStatement(sql);
                                    pst.setString(1, String.valueOf(id));
                                    pst.setString(2, jLabel38.getText());
                                    pst.setString(3, jCheckBox14.getText());
                                    pst.setString(4, jTextField25.getText());
                                    pst.setString(5, jTextField31.getText());
                                    pst.execute();
                                   

                            }
                          }catch(Exception e){
                              JOptionPane.showMessageDialog(null, e);
                          }finally{
                        try{
                             pst.close();
                                    rs.close();
                        }catch(Exception e){
                            
                        }
                    }
                               try{
                      if(jTextField32.getText().equals("")){

                      }else{

                                    String sql = "insert into foods (id,type,price,quantity,amount) values(?,?,?,?,?)";
                                    pst=conn.prepareStatement(sql);
                                    pst.setString(1, String.valueOf(id));
                                    pst.setString(2, jLabel39.getText());
                                    pst.setString(3, jCheckBox15.getText());
                                    pst.setString(4, jTextField26.getText());
                                    pst.setString(5, jTextField32.getText());
                                    pst.execute();
                                   

                            }
                          }catch(Exception e){
                              JOptionPane.showMessageDialog(null, e);
                          }finally{
                        try{
                             pst.close();
                                    rs.close();
                        }catch(Exception e){
                            
                        }
                    }
                               
                     try{
                      if(jTextField33.getText().equals("")){

                      }else{

                                    String sql = "insert into foods (id,type,price,quantity,amount) values(?,?,?,?,?)";
                                    pst=conn.prepareStatement(sql);
                                    pst.setString(1, String.valueOf(id));
                                    pst.setString(2, jLabel40.getText());
                                    pst.setString(3, jCheckBox16.getText());
                                    pst.setString(4, jTextField27.getText());
                                    pst.setString(5, jTextField33.getText());
                                    pst.execute();
                                   

                            }
                          }catch(Exception e){
                              JOptionPane.showMessageDialog(null, e);
                          }finally{
                        try{
                             pst.close();
                                    rs.close();
                        }catch(Exception e){
                            
                        }
                    }
                     try{
                      if(jTextField34.getText().equals("")){

                      }else{

                                    String sql = "insert into foods (id,type,price,quantity,amount) values(?,?,?,?,?)";
                                    pst=conn.prepareStatement(sql);
                                    pst.setString(1, String.valueOf(id));
                                    pst.setString(2, jLabel41.getText());
                                    pst.setString(3, jCheckBox17.getText());
                                    pst.setString(4, jTextField28.getText());
                                    pst.setString(5, jTextField34.getText());
                                    pst.execute();
                                    

                            }
                          }catch(Exception e){
                              JOptionPane.showMessageDialog(null, e);
                          }finally{
                        try{
                             pst.close();
                                    rs.close();
                        }catch(Exception e){
                            
                        }
                    }
    }
    
  
   
  
  
 
    public void quantity_not_enable(){
        jTextField1.setEnabled(false);
        jTextField2.setEnabled(false);
        jTextField3.setEnabled(false);
        jTextField4.setEnabled(false);
        jTextField5.setEnabled(false);
        jTextField6.setEnabled(false);
        jTextField13.setEnabled(false);
        jTextField14.setEnabled(false);
        jTextField17.setEnabled(false);
        jTextField20.setEnabled(false);
        jTextField21.setEnabled(false);
        jTextField23.setEnabled(false);
        jTextField24.setEnabled(false);
        jTextField25.setEnabled(false);
        jTextField26.setEnabled(false);
        jTextField27.setEnabled(false);
        jTextField28.setEnabled(false);
    }
   
  
    @SuppressWarnings("unchecked")
   
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel1.setForeground(Color.WHITE);
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jTextField2 = new javax.swing.JTextField();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jCheckBox4 = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jCheckBox6 = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jCheckBox5 = new javax.swing.JCheckBox();
        jLabel15 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jCheckBox7 = new javax.swing.JCheckBox();
        jLabel26 = new javax.swing.JLabel();
        jCheckBox8 = new javax.swing.JCheckBox();
        jLabel24 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jCheckBox11 = new javax.swing.JCheckBox();
        jLabel29 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jCheckBox10 = new javax.swing.JCheckBox();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jCheckBox9 = new javax.swing.JCheckBox();
        jLabel34 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jCheckBox12 = new javax.swing.JCheckBox();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jTextField30 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jTextField29 = new javax.swing.JTextField();
        jCheckBox17 = new javax.swing.JCheckBox();
        jTextField26 = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jCheckBox14 = new javax.swing.JCheckBox();
        jLabel48 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jLabel49 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jTextField28 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jTextField32 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jTextField31 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jTextField34 = new javax.swing.JTextField();
        jCheckBox16 = new javax.swing.JCheckBox();
        jTextField25 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jTextField33 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Food Chain");
        setMinimumSize(new java.awt.Dimension(1368, 760));

        jLabel1.setFont(new java.awt.Font("Sylfaen", 0, 36)); // NOI18N
        jLabel1.setText("DAILY REPORT");

        jLabel2.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        jLabel2.setText("Print The Daily Report");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Rice", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sylfaen", 0, 18), new java.awt.Color(153, 0, 0))); // NOI18N

        jCheckBox1.setText(" 125.00");
        jCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox1MouseClicked(evt);
            }
        });
        jCheckBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox1ItemStateChanged(evt);
            }
        });
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {

            }
        });

        jCheckBox2.setText(" 150.00");
        jCheckBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox2ItemStateChanged(evt);
            }
        });

        jLabel5.setText("Plain Rice");

        jLabel7.setText("Quantity");

        jLabel4.setText("Fried Rice");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {

            }
        });

        jLabel6.setText("Quantity");

        jTextField7.setEditable(false);

        jTextField8.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel4)
        				.addComponent(jLabel5))
        			.addGap(18)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jCheckBox1)
        				.addComponent(jCheckBox2))
        			.addGap(29)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel6)
        				.addComponent(jLabel7))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(jTextField2, GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
        				.addComponent(jTextField1))
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(34)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(jLabel16, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 11, Short.MAX_VALUE)
        						.addComponent(jLabel17, Alignment.TRAILING, 0, 0, Short.MAX_VALUE)))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(7)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING, false)
        						.addComponent(jTextField7, Alignment.LEADING)
        						.addComponent(jTextField8, Alignment.LEADING))))
        			.addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel4)
        				.addComponent(jCheckBox1)
        				.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel6)
        				.addComponent(jLabel16, GroupLayout.PREFERRED_SIZE, 8, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jTextField7, GroupLayout.PREFERRED_SIZE, 6, GroupLayout.PREFERRED_SIZE))
        			.addGap(7)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel5)
        				.addComponent(jCheckBox2)
        				.addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel7)
        				.addComponent(jLabel17, GroupLayout.PREFERRED_SIZE, 9, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jTextField8, GroupLayout.PREFERRED_SIZE, 6, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap())
        );
        jPanel1.setLayout(jPanel1Layout);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Grilled", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sylfaen", 0, 18), new java.awt.Color(153, 0, 0))); // NOI18N

        jCheckBox4.setText(" 120.00");
        jCheckBox4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox4ItemStateChanged(evt);
            }
        });

        jLabel11.setText("Tangege  ");

        jLabel8.setText("Bangus");

        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {

            }
        });

        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {

            }
        });

        jCheckBox6.setText(" 100.00");
        jCheckBox6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox6ItemStateChanged(evt);
            }
        });

        jLabel13.setText("Pusit");

        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
         
            }
        });

        jLabel12.setText("Quantity");

        jCheckBox3.setText(" 85.00");
        jCheckBox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox3ItemStateChanged(evt);
            }
        });

        jLabel14.setText("Quantity");

        jLabel10.setText("Quantity");

        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {

            }
        });

        jLabel9.setText("Quantity");

        jCheckBox5.setText(" 100.00");
        jCheckBox5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox5ItemStateChanged(evt);
            }
        });

        jLabel15.setText("Tilapia   ");

        jTextField9.setEditable(false);

        jTextField10.setEditable(false);

        jTextField11.setEditable(false);

        jTextField12.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel15)
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel8)
        						.addComponent(jLabel13)
        						.addComponent(jLabel11))
        					.addGap(18)
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(jCheckBox3, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(jCheckBox4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(jCheckBox5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(jCheckBox6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        					.addGap(29)
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false)
        							.addGroup(jPanel2Layout.createSequentialGroup()
        								.addComponent(jLabel12)
        								.addPreferredGap(ComponentPlacement.RELATED)
        								.addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE))
        							.addGroup(jPanel2Layout.createSequentialGroup()
        								.addComponent(jLabel14)
        								.addPreferredGap(ComponentPlacement.RELATED)
        								.addComponent(jTextField6)))
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false)
        								.addGroup(jPanel2Layout.createSequentialGroup()
        									.addComponent(jLabel10)
        									.addPreferredGap(ComponentPlacement.RELATED)
        									.addComponent(jTextField4, GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
        								.addGroup(jPanel2Layout.createSequentialGroup()
        									.addComponent(jLabel9)
        									.addPreferredGap(ComponentPlacement.RELATED)
        									.addComponent(jTextField3)))
        							.addGap(5)))))
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addGap(24)
        							.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false)
        								.addComponent(jLabel21, 0, 0, Short.MAX_VALUE)
        								.addComponent(jLabel19, 0, 0, Short.MAX_VALUE)
        								.addComponent(jLabel18, GroupLayout.DEFAULT_SIZE, 9, Short.MAX_VALUE)
        								.addComponent(jLabel20, 0, 0, Short.MAX_VALUE)))
        						.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING, false)
        							.addComponent(jTextField12, Alignment.LEADING)
        							.addComponent(jTextField11, Alignment.LEADING))))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGap(7)
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING, false)
        						.addComponent(jTextField9, Alignment.LEADING)
        						.addComponent(jTextField10, Alignment.LEADING))))
        			.addGap(109))
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel8)
        						.addComponent(jCheckBox3)
        						.addComponent(jLabel9)
        						.addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel18, GroupLayout.PREFERRED_SIZE, 8, GroupLayout.PREFERRED_SIZE))
        					.addGap(7))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addComponent(jTextField9, GroupLayout.PREFERRED_SIZE, 8, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)))
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel11)
        				.addComponent(jCheckBox4)
        				.addComponent(jLabel10)
        				.addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel19, GroupLayout.PREFERRED_SIZE, 9, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jTextField10, GroupLayout.PREFERRED_SIZE, 7, GroupLayout.PREFERRED_SIZE))
        			.addGap(7)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel13)
        				.addComponent(jCheckBox5)
        				.addComponent(jLabel12)
        				.addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel20, GroupLayout.PREFERRED_SIZE, 9, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jTextField11, GroupLayout.PREFERRED_SIZE, 6, GroupLayout.PREFERRED_SIZE))
        			.addGap(7)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel15)
        				.addComponent(jCheckBox6)
        				.addComponent(jLabel14)
        				.addComponent(jTextField6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel21, GroupLayout.PREFERRED_SIZE, 9, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jTextField12, GroupLayout.PREFERRED_SIZE, 8, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap())
        );
        jPanel2.setLayout(jPanel2Layout);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sinigang", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sylfaen", 0, 18), new java.awt.Color(153, 0, 0))); // NOI18N

        jLabel22.setText("Hipon");

        jLabel23.setText("Quantity");

        jLabel3.setText("Bangus");

        jTextField15.setEditable(false);

        jTextField16.setEditable(false);

        jCheckBox7.setText(" 120.00");
        jCheckBox7.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox7ItemStateChanged(evt);
            }
        });

        jCheckBox8.setText(" 150.00");
        jCheckBox8.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox8ItemStateChanged(evt);
            }
        });

        jLabel24.setText("Quantity");

        jTextField13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {

            }
        });

        jTextField14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
  
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3Layout.setHorizontalGroup(
        	jPanel3Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel3Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel3)
        				.addComponent(jLabel22))
        			.addGap(18)
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(jCheckBox7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(jCheckBox8))
        			.addGap(29)
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING, false)
        				.addGroup(jPanel3Layout.createSequentialGroup()
        					.addComponent(jLabel23)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jTextField13))
        				.addGroup(jPanel3Layout.createSequentialGroup()
        					.addComponent(jLabel24)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jTextField14, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(jTextField15)
        				.addComponent(jTextField16))
        			.addGap(31)
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(jLabel25, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
        				.addComponent(jLabel26, Alignment.TRAILING, 0, 0, Short.MAX_VALUE))
        			.addGap(189))
        );
        jPanel3Layout.setVerticalGroup(
        	jPanel3Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel3Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel3)
        				.addComponent(jCheckBox7)
        				.addComponent(jLabel23)
        				.addComponent(jTextField13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel25, GroupLayout.PREFERRED_SIZE, 8, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jTextField15, GroupLayout.PREFERRED_SIZE, 8, GroupLayout.PREFERRED_SIZE))
        			.addGap(7)
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel22)
        				.addComponent(jCheckBox8)
        				.addComponent(jLabel24)
        				.addComponent(jTextField14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel26, GroupLayout.PREFERRED_SIZE, 9, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jTextField16, GroupLayout.PREFERRED_SIZE, 7, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap())
        );
        jPanel3.setLayout(jPanel3Layout);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Others", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sylfaen", 0, 18), new java.awt.Color(153, 0, 0))); // NOI18N

        jCheckBox11.setText(" 80.00");
        jCheckBox11.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox11ItemStateChanged(evt);
            }
        });

        jLabel28.setText("Quantity");

        jLabel27.setText("Baked Talaba  ");

        jTextField17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {

            }
        });

        jTextField22.setEditable(false);

        jCheckBox10.setText(" 50.00");
        jCheckBox10.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox10ItemStateChanged(evt);
            }
        });

        jLabel32.setText("Steamed Talaba   ");

        jLabel33.setText("Kinilaw ");

        jTextField20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
     
            }
        });

        jTextField18.setEditable(false);

        jCheckBox9.setText(" 100.00");
        jCheckBox9.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox9ItemStateChanged(evt);
            }
        });

        jTextField21.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
 
            }
        });

        jLabel35.setText("Quantity");

        jTextField19.setEditable(false);

        jLabel31.setText("Quantity");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4Layout.setHorizontalGroup(
        	jPanel4Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel4Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel27)
        				.addComponent(jLabel32)
        				.addComponent(jLabel33))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jCheckBox11)
        				.addComponent(jCheckBox9, Alignment.TRAILING)
        				.addComponent(jCheckBox10))
        			.addGap(29)
        			.addGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel35, Alignment.TRAILING)
        				.addComponent(jLabel28, Alignment.TRAILING)
        				.addComponent(jLabel31, Alignment.TRAILING))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jTextField20, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jTextField17, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jTextField21, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(jTextField22)
        				.addComponent(jTextField19)
        				.addComponent(jTextField18))
        			.addGap(23)
        			.addGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel4Layout.createSequentialGroup()
        					.addGap(29)
        					.addGroup(jPanel4Layout.createParallelGroup(Alignment.TRAILING, false)
        						.addComponent(jLabel30, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
        						.addComponent(jLabel29, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 8, Short.MAX_VALUE)))
        				.addGroup(Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
        					.addGap(29)
        					.addComponent(jLabel34, GroupLayout.PREFERRED_SIZE, 8, GroupLayout.PREFERRED_SIZE)))
        			.addGap(65))
        );
        jPanel4Layout.setVerticalGroup(
        	jPanel4Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel4Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel4Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel27)
        				.addComponent(jCheckBox9)
        				.addComponent(jLabel28)
        				.addComponent(jTextField17, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel29, GroupLayout.PREFERRED_SIZE, 8, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jTextField18, GroupLayout.PREFERRED_SIZE, 8, GroupLayout.PREFERRED_SIZE))
        			.addGap(7)
        			.addGroup(jPanel4Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel32)
        				.addComponent(jCheckBox10)
        				.addComponent(jLabel31)
        				.addComponent(jTextField20, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel30, GroupLayout.PREFERRED_SIZE, 4, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jTextField19, GroupLayout.PREFERRED_SIZE, 8, GroupLayout.PREFERRED_SIZE))
        			.addGap(7)
        			.addGroup(jPanel4Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel33)
        				.addComponent(jCheckBox11)
        				.addComponent(jLabel35)
        				.addComponent(jLabel34, GroupLayout.PREFERRED_SIZE, 9, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jTextField21, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jTextField22, GroupLayout.PREFERRED_SIZE, 7, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4.setLayout(jPanel4Layout);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Drinks", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sylfaen", 0, 18), new java.awt.Color(153, 0, 0))); // NOI18N

        jCheckBox12.setText(" 18.00");
        jCheckBox12.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox12ItemStateChanged(evt);
            }
        });

        jLabel41.setText("Mineral Water");

        jLabel42.setText("Quantity");

        jTextField30.setEditable(false);
        jTextField30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField30ActionPerformed(evt);
            }
        });

        jLabel47.setText("Quantity");

        jTextField23.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
        
            }
        });

        jLabel37.setText("Pepsi");

        jTextField29.setEditable(false);

        jCheckBox17.setText(" 15.00");
        jCheckBox17.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox17ItemStateChanged(evt);
            }
        });

        jTextField26.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
 
            }
        });

        jCheckBox14.setText(" 30.00");
        jCheckBox14.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox14ItemStateChanged(evt);
            }
        });

        jCheckBox13.setText(" 15.00");
        jCheckBox13.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox13ItemStateChanged(evt);
            }
        });

        jCheckBox15.setText(" 15.00");
        jCheckBox15.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox15ItemStateChanged(evt);
            }
        });

        jLabel38.setText("Pepsi Litro  ");

        jTextField28.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
             
            }
        });

        jLabel43.setText("Quantity");

        jTextField32.setEditable(false);

        jLabel39.setText("Sting  ");

        jLabel36.setText("Mountain Dew ");

        jLabel44.setText("Quantity");

        jTextField31.setEditable(false);

        jLabel40.setText("Tropicana ");

        jTextField34.setEditable(false);

        jCheckBox16.setText(" 15.00");
        jCheckBox16.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox16ItemStateChanged(evt);
            }
        });

        jTextField25.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
      
            }
        });

        jLabel46.setText("Quantity");

        jTextField33.setEditable(false);

        jTextField27.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
          
            }
        });

        jLabel45.setText("Quantity");

        jTextField24.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
        
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6Layout.setHorizontalGroup(
        	jPanel6Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel6Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel6Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel36)
        				.addComponent(jLabel37)
        				.addComponent(jLabel38)
        				.addComponent(jLabel39)
        				.addComponent(jLabel40)
        				.addComponent(jLabel41))
        			.addGap(18)
        			.addGroup(jPanel6Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jCheckBox12)
        				.addComponent(jCheckBox13)
        				.addComponent(jCheckBox14)
        				.addComponent(jCheckBox15)
        				.addComponent(jCheckBox16)
        				.addComponent(jCheckBox17))
        			.addGap(29)
        			.addGroup(jPanel6Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel42)
        				.addComponent(jLabel43)
        				.addComponent(jLabel44)
        				.addComponent(jLabel45)
        				.addComponent(jLabel46)
        				.addComponent(jLabel47))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel6Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jTextField24, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jTextField23, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jTextField25, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jTextField26, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jTextField27, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jTextField28, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel6Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel6Layout.createSequentialGroup()
        					.addGroup(jPanel6Layout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(jTextField33)
        						.addComponent(jTextField32)
        						.addComponent(jTextField30)
        						.addComponent(jTextField29)
        						.addComponent(jTextField31)
        						.addComponent(jTextField34))
        					.addGap(41)
        					.addGroup(jPanel6Layout.createParallelGroup(Alignment.TRAILING, false)
        						.addComponent(jLabel49, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
        						.addComponent(jLabel48, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 13, Short.MAX_VALUE)
        						.addComponent(jLabel50, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel51, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel52, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE)))
        				.addComponent(jLabel53, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE))
        			.addGap(110))
        );
        jPanel6Layout.setVerticalGroup(
        	jPanel6Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel6Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel6Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel36)
        				.addComponent(jCheckBox12)
        				.addComponent(jLabel42)
        				.addComponent(jTextField23, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel48, GroupLayout.PREFERRED_SIZE, 8, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jTextField29, GroupLayout.PREFERRED_SIZE, 8, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel6Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel37)
        				.addComponent(jCheckBox13)
        				.addComponent(jLabel43)
        				.addComponent(jTextField24, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel49, GroupLayout.PREFERRED_SIZE, 8, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jTextField30, GroupLayout.PREFERRED_SIZE, 9, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel6Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel38)
        				.addComponent(jCheckBox14)
        				.addComponent(jLabel44)
        				.addComponent(jTextField25, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel50, GroupLayout.PREFERRED_SIZE, 8, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jTextField31, GroupLayout.PREFERRED_SIZE, 8, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel6Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel39)
        				.addComponent(jCheckBox15)
        				.addComponent(jLabel45)
        				.addComponent(jTextField26, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel51, GroupLayout.PREFERRED_SIZE, 8, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jTextField32, GroupLayout.PREFERRED_SIZE, 11, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel6Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel40)
        				.addComponent(jCheckBox16)
        				.addComponent(jLabel46)
        				.addComponent(jTextField27, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel52, GroupLayout.PREFERRED_SIZE, 8, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jTextField33, GroupLayout.PREFERRED_SIZE, 8, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel6Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel41)
        				.addComponent(jCheckBox17)
        				.addComponent(jLabel47)
        				.addComponent(jTextField28, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel53, GroupLayout.PREFERRED_SIZE, 8, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jTextField34, GroupLayout.PREFERRED_SIZE, 8, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap())
        );
        jPanel6.setLayout(jPanel6Layout);
        setJMenuBar(jMenuBar1);
        
        JButton btnNewButton = new JButton("print");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		
				print printt=new print();
				print.main(null);
        	}
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        								.addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        								.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        							.addGap(83))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(btnNewButton)
        							.addGap(44)))
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jPanel6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(510)
        					.addComponent(jLabel1))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(529)
        					.addComponent(jLabel2)))
        			.addContainerGap(183, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel1)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jLabel2)
        			.addGap(22)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addGap(18)
        					.addComponent(jPanel6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addGap(18)
        					.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addGap(18)
        					.addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        			.addPreferredGap(ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
        			.addComponent(btnNewButton)
        			.addGap(75))
        );
        getContentPane().setLayout(layout);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
      
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox1ItemStateChanged

        if(evt.getStateChange() == ItemEvent.DESELECTED){
         //   System.out.println("Deselected!");
            jTextField1.setText("");
            jTextField7.setText("");
            jTextField1.setEnabled(false);
            
        }else{
             // System.out.println("Selected");
              jTextField1.setEnabled(true);
        }
    }//GEN-LAST:event_jCheckBox1ItemStateChanged

    private void jCheckBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox1MouseClicked
 
    }//GEN-LAST:event_jCheckBox1MouseClicked

    private void jCheckBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox2ItemStateChanged
    
        if(evt.getStateChange() == ItemEvent.DESELECTED){
         //   System.out.println("Deselected!");
            jTextField8.setText("");
            jTextField2.setText("");
            jTextField2.setEnabled(false);
        }else{
             // System.out.println("Selected");
              jTextField2.setEnabled(true);
        }
    }//GEN-LAST:event_jCheckBox2ItemStateChanged

    private void jCheckBox3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox3ItemStateChanged
       
        if(evt.getStateChange() == ItemEvent.DESELECTED){
         //   System.out.println("Deselected!");
            jTextField9.setText("");
            jTextField3.setText("");
            jTextField3.setEnabled(false);
        }else{
             // System.out.println("Selected");
              jTextField3.setEnabled(true);
        }
    }//GEN-LAST:event_jCheckBox3ItemStateChanged

    private void jCheckBox4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox4ItemStateChanged
       
        if(evt.getStateChange() == ItemEvent.DESELECTED){
         //   System.out.println("Deselected!");
            jTextField10.setText("");
            jTextField4.setText("");
            jTextField4.setEnabled(false);
        }else{
             // System.out.println("Selected");
              jTextField4.setEnabled(true);
        }
    }//GEN-LAST:event_jCheckBox4ItemStateChanged

    private void jCheckBox5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox5ItemStateChanged
       
        if(evt.getStateChange() == ItemEvent.DESELECTED){
         //   System.out.println("Deselected!");
            jTextField11.setText("");
            jTextField5.setText("");
            jTextField5.setEnabled(false);
        }else{
             // System.out.println("Selected");
              jTextField5.setEnabled(true);
        }
    }//GEN-LAST:event_jCheckBox5ItemStateChanged

    private void jCheckBox6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox6ItemStateChanged
      
        if(evt.getStateChange() == ItemEvent.DESELECTED){
         //   System.out.println("Deselected!");
            jTextField12.setText("");
            jTextField6.setText("");
            jTextField6.setEnabled(false);
        }else{
             // System.out.println("Selected");
              jTextField6.setEnabled(true);
        }
    }//GEN-LAST:event_jCheckBox6ItemStateChanged

    private void jCheckBox7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox7ItemStateChanged
        
        if(evt.getStateChange() == ItemEvent.DESELECTED){
         //   System.out.println("Deselected!");
            jTextField15.setText("");
            jTextField13.setText("");
            jTextField13.setEnabled(false);
        }else{
             // System.out.println("Selected");
              jTextField13.setEnabled(true);
        }
    }//GEN-LAST:event_jCheckBox7ItemStateChanged

    private void jCheckBox8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox8ItemStateChanged
      
        if(evt.getStateChange() == ItemEvent.DESELECTED){
         //   System.out.println("Deselected!");
            jTextField16.setText("");
            jTextField14.setText("");
            jTextField14.setEnabled(false);
        }else{
             // System.out.println("Selected");
              jTextField14.setEnabled(true);
        }
    }//GEN-LAST:event_jCheckBox8ItemStateChanged

    private void jCheckBox9ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox9ItemStateChanged
      
        if(evt.getStateChange() == ItemEvent.DESELECTED){
         //   System.out.println("Deselected!");
            jTextField18.setText("");
            jTextField17.setText("");
            jTextField17.setEnabled(false);
        }else{
             // System.out.println("Selected");
              jTextField17.setEnabled(true);
        }
    }//GEN-LAST:event_jCheckBox9ItemStateChanged

    private void jCheckBox10ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox10ItemStateChanged
      
        if(evt.getStateChange() == ItemEvent.DESELECTED){
         //   System.out.println("Deselected!");
            jTextField19.setText("");
            jTextField20.setText("");
            jTextField20.setEnabled(false);
        }else{
             // System.out.println("Selected");
              jTextField20.setEnabled(true);
        }
    }//GEN-LAST:event_jCheckBox10ItemStateChanged

    private void jCheckBox11ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox11ItemStateChanged
      
        if(evt.getStateChange() == ItemEvent.DESELECTED){
         //   System.out.println("Deselected!");
            jTextField22.setText("");
            jTextField21.setText("");
            jTextField21.setEnabled(false);
        }else{
             // System.out.println("Selected");
              jTextField21.setEnabled(true);
        }
    }//GEN-LAST:event_jCheckBox11ItemStateChanged

    private void jCheckBox12ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox12ItemStateChanged
      
        if(evt.getStateChange() == ItemEvent.DESELECTED){
         //   System.out.println("Deselected!");
            jTextField29.setText("");
            jTextField23.setText("");
            jTextField23.setEnabled(false);
        }else{
             // System.out.println("Selected");
              jTextField23.setEnabled(true);
        }
    }//GEN-LAST:event_jCheckBox12ItemStateChanged

    private void jCheckBox13ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox13ItemStateChanged
        
        if(evt.getStateChange() == ItemEvent.DESELECTED){
         //   System.out.println("Deselected!");
            jTextField30.setText("");
            jTextField24.setText("");
            jTextField24.setEnabled(false);
        }else{
             // System.out.println("Selected");
              jTextField24.setEnabled(true);
        }
    }//GEN-LAST:event_jCheckBox13ItemStateChanged

    private void jCheckBox14ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox14ItemStateChanged
       
        if(evt.getStateChange() == ItemEvent.DESELECTED){
         //   System.out.println("Deselected!");
            jTextField31.setText("");
            jTextField25.setText("");
            jTextField25.setEnabled(false);
        }else{
             // System.out.println("Selected");
              jTextField25.setEnabled(true);
        }
    }//GEN-LAST:event_jCheckBox14ItemStateChanged

    private void jCheckBox15ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox15ItemStateChanged
       
        if(evt.getStateChange() == ItemEvent.DESELECTED){
         //   System.out.println("Deselected!");
            jTextField32.setText("");
            jTextField26.setText("");
            jTextField26.setEnabled(false);
        }else{
             // System.out.println("Selected");
              jTextField26.setEnabled(true);
        }
    }//GEN-LAST:event_jCheckBox15ItemStateChanged

    private void jCheckBox16ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox16ItemStateChanged
        
        if(evt.getStateChange() == ItemEvent.DESELECTED){
         //   System.out.println("Deselected!");
            jTextField33.setText("");
            jTextField27.setText("");
            jTextField27.setEnabled(false);
        }else{
             // System.out.println("Selected");
              jTextField27.setEnabled(true);
        }
    }//GEN-LAST:event_jCheckBox16ItemStateChanged

    private void jCheckBox17ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox17ItemStateChanged
       
        if(evt.getStateChange() == ItemEvent.DESELECTED){
         //   System.out.println("Deselected!");
            jTextField34.setText("");
            jTextField28.setText("");
            jTextField28.setEnabled(false);
        }else{
             // System.out.println("Selected");
              jTextField28.setEnabled(true);
        }
    }//GEN-LAST:event_jCheckBox17ItemStateChanged

    private void jTextField30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField30ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
               /*if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }*/  UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DAILY_REPORT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DAILY_REPORT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DAILY_REPORT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DAILY_REPORT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DAILY_REPORT().setVisible(true);
            }
        });
    }
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
}





  
