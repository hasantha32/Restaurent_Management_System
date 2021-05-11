package Customer;
import java.awt.event.ItemEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.MessageFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import DBConnection.DBC;
import admin.Login;

import javax.swing.UIManager;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends javax.swing.JFrame {
Connection conn = null;
PreparedStatement pst = null;
ResultSet rs = null;
static int id;
static int ORDER;
static int Orderi; 
static int orderid;
static int idR;
static int idr;
static int idr2;
static int idd;
static int idd1;
static int idd2;
static int idd3;
static int idd4;
static int ids;
static int ids1;
static int idg;
static int idg1;
static int idg2;
static int idg3;
static int idg4;
static int idg5;
static int ido;
static int ido1;
static int ido2;
static int ido3;


static String last_ido;
static String last_ido1;
static String last_ido2;
static String last_ido3;
static String last_id;
static String last_idr;
static String last_idr2;
static String last_idd;
static String last_idd1;
static String last_idd2;
static String last_idd3;
static String last_idd4;
static String last_ids;
static String last_ids1;
static String last_idg;
static String last_idg1;
static String last_idg2;
static String last_idg3;
static String last_idg4;
static String last_idg5;
static String last_orderid;

    public Menu() {
    	//getContentPane().setBackground(Color.GRAY);
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
        
        jTextField35.setText("");
        jTextField36.setText("");
        jTextField37.setText("");
    }
  public void get_last_id(){
	  
	  
	  
	  
	  
	  
	  
	  /////////////////////////////////////
        try{
            String sql = "select Order_Num from foodorder order by Order_Num desc limit 1";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next()){
                 last_id = rs.getString("Order_Num");
                 
                int getid = Integer.parseInt(last_id);
                Orderi = getid+1;
               
            }else{
            	Orderi = 1;
            }
        }catch(Exception e){
            //JOptionPane.showMessageDialog(null, e);
        }finally{
            try{
                pst.close();
                rs.close();
            }catch(Exception e){
                
            }
        }
        //////////rice/////
        try{
            String sqlr = "select id from rice order by id desc limit 1";
            pst=conn.prepareStatement(sqlr);
            rs=pst.executeQuery();
            if(rs.next()){
                 last_idr = rs.getString("id");
                 last_idr2=rs.getString("id");
                 
                int getid = Integer.parseInt(last_idr);
                idr = getid+1;
                
                int getidr = Integer.parseInt(last_idr2);
                idr2 = getidr+2;
               
            }else{
                idr = 1;
                idr2= 2;
            }
        }catch(Exception e){
            //JOptionPane.showMessageDialog(null, e);
        }finally{
            try{
                pst.close();
                rs.close();
            }catch(Exception e){
                
            }
        }
        ////drinks//////
        try{
            String sqld = "select id from drinks order by id desc limit 1";
            pst=conn.prepareStatement(sqld);
            rs=pst.executeQuery();
            if(rs.next()){
                 last_idd = rs.getString("id");
                 last_idd1=rs.getString("id");
                 last_idd2=rs.getString("id");
                 last_idd3=rs.getString("id");
                 last_idd4=rs.getString("id");
                 
                int getidd = Integer.parseInt(last_idd);
                idd = getidd+1;
                
                int getidd1 = Integer.parseInt(last_idd1);
                idd1 = getidd1+2;
                
                int getidd2 = Integer.parseInt(last_idd2);
                idd2 = getidd2+3;
                
                int getidd3 = Integer.parseInt(last_idd3);
                idd3 = getidd3+4;
                
                int getidd4 = Integer.parseInt(last_idd4);
                idd4 = getidd4+5;
               
            }else{
                idd = 1;
                idd1=2;
                idd2=3;
                idd3=4;
                idd4=5;
            }
        }catch(Exception e){
            //JOptionPane.showMessageDialog(null, e);
        }finally{
            try{
                pst.close();
                rs.close();
            }catch(Exception e){
                
            }
        }
        //////grilled///
        try{
            String sqlg = "select id from grilled order by id desc limit 1";
            pst=conn.prepareStatement(sqlg);
            rs=pst.executeQuery();
            if(rs.next()){
                 last_idg = rs.getString("id");
                 last_idg1 = rs.getString("id");
                 last_idg2 = rs.getString("id");
                 last_idg3 = rs.getString("id");
               
                 
                int getid = Integer.parseInt(last_idg);
                idg = getid+1;
                
                int getid1 = Integer.parseInt(last_idg1);
                idg1 = getid1+1;
                
                int getid2 = Integer.parseInt(last_idg2);
                idg2 = getid2+1;
                
                int getid3 = Integer.parseInt(last_idg3);
                idg3 = getid3+1;
                
                int getid4 = Integer.parseInt(last_idg4);
                idg4 = getid4+1;
               
                int getid5 = Integer.parseInt(last_idg5);
                idg5 = getid5+1;
                
            }else{
                idg = 1;
                idg1=2;
                idg2=3;
                idg3=4;
                idg4=5;
                idg5=6;
                
            }
        }catch(Exception e){
            //JOptionPane.showMessageDialog(null, e);
        }finally{
            try{
                pst.close();
                rs.close();
            }catch(Exception e){
                
            }
        }
        /////sinigang////////
        try{
            String sqls = "select id from sinigang order by id desc limit 1";
            pst=conn.prepareStatement(sqls);
            rs=pst.executeQuery();
            if(rs.next()){
                 last_ids = rs.getString("id");
                 last_ids1 = rs.getString("id");
                 
                int getid = Integer.parseInt(last_ids);
                ids = getid+1;
                
                int getids = Integer.parseInt(last_ids1);
                ids1 = getids+2;
               
            }else{
                ids = 1;
                ids1=2;
            }
        }catch(Exception e){
            //JOptionPane.showMessageDialog(null, e);
        }finally{
            try{
                pst.close();
                rs.close();
            }catch(Exception e){
                
            }
        }
        
        /////other///////
        try{
            String sqls = "select id from sinigang order by id desc limit 1";
            pst=conn.prepareStatement(sqls);
            rs=pst.executeQuery();
            if(rs.next()){
                 last_ido = rs.getString("id");
                 last_ido1 = rs.getString("id");
                 last_ido2 = rs.getString("id");
                 last_ido3 = rs.getString("id");
                 
                int getido = Integer.parseInt(last_ido);
                ido = getido+1;
                
                int getido1 = Integer.parseInt(last_ido1);
                ido1 = getido1+2;
                
                int getido2 = Integer.parseInt(last_ido2);
                ido2 = getido2+3;
                
                int getido3 = Integer.parseInt(last_ido3);
                ido3 = getido3+4;
                
               
            }else{
                ido = 1;
                ido1=2;
                ido2=3;
                ido3=4;
            }
        }catch(Exception e){
            //JOptionPane.showMessageDialog(null, e);
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
                                   pst.setString(1, String.valueOf(idr));
                                    pst.setString(2, jLabel4.getText());
                                    pst.setString(3, jCheckBox1.getText());
                                    pst.setString(4, jTextField1.getText());
                                    pst.setString(5, jTextField7.getText());
                                    pst.execute();
                                   
                                 
                            }
                          }catch(Exception e){
                              //JOptionPane.showMessageDialog(null, e );
                          }finally{
                        try{
                             pst.close();
                                    rs.close();
                        }catch(Exception e){
                            
                        }
                    }
          //////////////////////////////////////
      

          
          /////////////////////////////
                      try{
                      if(jTextField8.getText().equals("")){

                      }else{
                    	                     	

                                    String sql = "insert into rice (id,type,price,quantity,amount) values(?,?,?,?,?)";
                                    pst=conn.prepareStatement(sql);
                                   pst.setString(1, String.valueOf(idr2));
                                    pst.setString(2, jLabel5.getText());
                                    pst.setString(3, jCheckBox2.getText());
                                    pst.setString(4, jTextField2.getText());
                                    pst.setString(5, jTextField8.getText());
                                    pst.execute();
                                  

                            }
                          }catch(Exception e){
                              //JOptionPane.showMessageDialog(null, e);
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
                                    pst.setString(1, String.valueOf(idg4));
                                    pst.setString(2, jLabel8.getText());
                                    pst.setString(3, jCheckBox3.getText());
                                    pst.setString(4, jTextField3.getText());
                                    pst.setString(5, jTextField9.getText());
                                    pst.execute();
                                   

                            }
                          }catch(Exception e){
                             // JOptionPane.showMessageDialog(null, e);
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
                                    pst.setString(1, String.valueOf(idg1));
                                    pst.setString(2, jLabel11.getText());
                                    pst.setString(3, jCheckBox4.getText());
                                    pst.setString(4, jTextField4.getText());
                                    pst.setString(5, jTextField10.getText());
                                    pst.execute();
                                 

                            }
                          }catch(Exception e){
                             // JOptionPane.showMessageDialog(null, e);
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
                                   pst.setString(1, String.valueOf(idg2));
                                    pst.setString(2, jLabel13.getText());
                                    pst.setString(3, jCheckBox5.getText());
                                    pst.setString(4, jTextField5.getText());
                                    pst.setString(5, jTextField11.getText());
                                    pst.execute();
                                   

                            }
                          }catch(Exception e){
                              //JOptionPane.showMessageDialog(null, e);
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
                                    pst.setString(1, String.valueOf(idg3));
                                    pst.setString(2, jLabel15.getText());
                                    pst.setString(3, jCheckBox6.getText());
                                    pst.setString(4, jTextField6.getText());
                                    pst.setString(5, jTextField12.getText());
                                    pst.execute();
                             

                            }
                          }catch(Exception e){
                             // JOptionPane.showMessageDialog(null, e);
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
                                    pst.setString(1, String.valueOf(ids));
                                    pst.setString(2, jLabel3.getText());
                                    pst.setString(3, jCheckBox7.getText());
                                    pst.setString(4, jTextField13.getText());
                                    pst.setString(5, jTextField15.getText());
                                    pst.execute();
                                    

                            }
                          }catch(Exception e){
                             // JOptionPane.showMessageDialog(null, e);
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
                                    pst.setString(1, String.valueOf(ids1));
                                    pst.setString(2, jLabel22.getText());
                                    pst.setString(3, jCheckBox8.getText());
                                    pst.setString(4, jTextField14.getText());
                                    pst.setString(5, jTextField16.getText());
                                    pst.execute();
                                    
                            }
                          }catch(Exception e){
                             // JOptionPane.showMessageDialog(null, e);
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
                                    pst.setString(1, String.valueOf(ido));
                                    pst.setString(2, jLabel27.getText());
                                    pst.setString(3, jCheckBox9.getText());
                                    pst.setString(4, jTextField17.getText());
                                    pst.setString(5, jTextField18.getText());
                                    pst.execute();
                                   

                            }
                          }catch(Exception e){
                             // JOptionPane.showMessageDialog(null, e);
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
                                    pst.setString(1, String.valueOf(ido1));
                                    pst.setString(2, jLabel32.getText());
                                    pst.setString(3, jCheckBox10.getText());
                                    pst.setString(4, jTextField20.getText());
                                    pst.setString(5, jTextField19.getText());
                                    pst.execute();
                                 

                            }
                          }catch(Exception e){
                              //JOptionPane.showMessageDialog(null, e);
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
                                    pst.setString(1, String.valueOf(ido2));
                                    pst.setString(2, jLabel33.getText());
                                    pst.setString(3, jCheckBox11.getText());
                                    pst.setString(4, jTextField21.getText());
                                    pst.setString(5, jTextField22.getText());
                                    pst.execute();
                                    

                            }
                          }catch(Exception e){
                              //JOptionPane.showMessageDialog(null, e);
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
                                   pst.setString(1, String.valueOf(idd));
                                    pst.setString(2, jLabel36.getText());
                                    pst.setString(3, jCheckBox12.getText());
                                    pst.setString(4, jTextField23.getText());
                                    pst.setString(5, jTextField29.getText());
                                    pst.execute();
                                   
                            }
                          }catch(Exception e){
                              //JOptionPane.showMessageDialog(null, e);
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
                                    pst.setString(1, String.valueOf(idd1));
                                    pst.setString(2, jLabel38.getText());
                                    pst.setString(3, jCheckBox14.getText());
                                    pst.setString(4, jTextField25.getText());
                                    pst.setString(5, jTextField31.getText());
                                    pst.execute();
                                   

                            }
                          }catch(Exception e){
                             // JOptionPane.showMessageDialog(null, e);
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
                                    pst.setString(1, String.valueOf(idd2));
                                    pst.setString(2, jLabel39.getText());
                                    pst.setString(3, jCheckBox15.getText());
                                    pst.setString(4, jTextField26.getText());
                                    pst.setString(5, jTextField32.getText());
                                    pst.execute();
                                   

                            }
                          }catch(Exception e){
                             // JOptionPane.showMessageDialog(null, e);
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
                                    pst.setString(1, String.valueOf(idd3));
                                    pst.setString(2, jLabel40.getText());
                                    pst.setString(3, jCheckBox16.getText());
                                    pst.setString(4, jTextField27.getText());
                                    pst.setString(5, jTextField33.getText());
                                    pst.execute();
                                   

                            }
                          }catch(Exception e){
                              //JOptionPane.showMessageDialog(null, e);
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
                                    pst.setString(1, String.valueOf(idd4));
                                    pst.setString(2, jLabel41.getText());
                                    pst.setString(3, jCheckBox17.getText());
                                    pst.setString(4, jTextField28.getText());
                                    pst.setString(5, jTextField34.getText());
                                    pst.execute();
                                    

                            }
                          }catch(Exception e){
                             // JOptionPane.showMessageDialog(null, e);
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
                    	//////
                      if(jTextField7.getText().equals("")){

                      }else{

                    	
                                    String sql = "insert into foods (id,type,price,quantity,amount) values(?,?,?,?,?)";
                                    pst=conn.prepareStatement(sql);
                                    pst.setString(1, String.valueOf(idr));
                                    pst.setString(2, jLabel4.getText());
                                    pst.setString(3, jCheckBox1.getText());
                                    pst.setString(4, jTextField1.getText());
                                    pst.setString(5, jTextField7.getText());
                                    pst.execute();
                                    
                                   ///////////////////////////////////////////////////////////////////
                                   
                                    Class.forName("com.mysql.jdbc.Driver");
            						Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1","root","");
            						
                                    String sqli="insert into ordert (Order_Num,ItemName) values(?,?)";
                                    pst=conn.prepareStatement(sqli);
                                    pst.setString(1, String.valueOf(Orderi));
                                    pst.setString(2, jLabel4.getText());
                                    pst.execute();
                                    
                                	
            					
            						
            					
                                    /////////////////////////////////////////////////////////////////
                                   
                                 
                            }
                          }catch(Exception e){
                             // JOptionPane.showMessageDialog(null, e );
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
                                    pst.setString(1, String.valueOf(idr2));
                                    pst.setString(2, jLabel5.getText());
                                    pst.setString(3, jCheckBox2.getText());
                                    pst.setString(4, jTextField2.getText());
                                    pst.setString(5, jTextField8.getText());
                                    pst.execute();
                                  

                            }
                          }catch(Exception e){
                              //JOptionPane.showMessageDialog(null, e);
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
                                    pst.setString(1, String.valueOf(idd));
                                    pst.setString(2, jLabel8.getText());
                                    pst.setString(3, jCheckBox3.getText());
                                    pst.setString(4, jTextField3.getText());
                                    pst.setString(5, jTextField9.getText());
                                    pst.execute();
                                   

                            }
                          }catch(Exception e){
                              //JOptionPane.showMessageDialog(null, e);
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
                                    pst.setString(1, String.valueOf(idd1));
                                    pst.setString(2, jLabel11.getText());
                                    pst.setString(3, jCheckBox4.getText());
                                    pst.setString(4, jTextField4.getText());
                                    pst.setString(5, jTextField10.getText());
                                    pst.execute();
                                 

                            }
                          }catch(Exception e){
                              //JOptionPane.showMessageDialog(null, e);
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
                                    pst.setString(1, String.valueOf(idd2));
                                    pst.setString(2, jLabel13.getText());
                                    pst.setString(3, jCheckBox5.getText());
                                    pst.setString(4, jTextField5.getText());
                                    pst.setString(5, jTextField11.getText());
                                    pst.execute();
                                   

                            }
                          }catch(Exception e){
                             // JOptionPane.showMessageDialog(null, e);
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
                                    pst.setString(1, String.valueOf(idd3));
                                    pst.setString(2, jLabel15.getText());
                                    pst.setString(3, jCheckBox6.getText());
                                    pst.setString(4, jTextField6.getText());
                                    pst.setString(5, jTextField12.getText());
                                    pst.execute();
                             

                            }
                          }catch(Exception e){
                             /// JOptionPane.showMessageDialog(null, e);
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
                                    pst.setString(1, String.valueOf(idd4));
                                    pst.setString(2, jLabel3.getText());
                                    pst.setString(3, jCheckBox7.getText());
                                    pst.setString(4, jTextField13.getText());
                                    pst.setString(5, jTextField15.getText());
                                    pst.execute();
                                    

                            }
                          }catch(Exception e){
                             // JOptionPane.showMessageDialog(null, e);
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
                                    pst.setString(1, String.valueOf(ido2));
                                    pst.setString(2, jLabel22.getText());
                                    pst.setString(3, jCheckBox8.getText());
                                    pst.setString(4, jTextField14.getText());
                                    pst.setString(5, jTextField16.getText());
                                    pst.execute();
                                    
                            }
                          }catch(Exception e){
                             // JOptionPane.showMessageDialog(null, e);
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
                                    pst.setString(1, String.valueOf(idg));
                                    pst.setString(2, jLabel27.getText());
                                    pst.setString(3, jCheckBox9.getText());
                                    pst.setString(4, jTextField17.getText());
                                    pst.setString(5, jTextField18.getText());
                                    pst.execute();
                                   

                            }
                          }catch(Exception e){
                              //JOptionPane.showMessageDialog(null, e);
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
                                    pst.setString(1, String.valueOf(idg1));
                                    pst.setString(2, jLabel32.getText());
                                    pst.setString(3, jCheckBox10.getText());
                                    pst.setString(4, jTextField20.getText());
                                    pst.setString(5, jTextField19.getText());
                                    pst.execute();
                                 

                            }
                          }catch(Exception e){
                              //JOptionPane.showMessageDialog(null, e);
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
                                    pst.setString(1, String.valueOf(idg2));
                                    pst.setString(2, jLabel33.getText());
                                    pst.setString(3, jCheckBox11.getText());
                                    pst.setString(4, jTextField21.getText());
                                    pst.setString(5, jTextField22.getText());
                                    pst.execute();
                                    

                            }
                          }catch(Exception e){
                             // JOptionPane.showMessageDialog(null, e);
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
                                    pst.setString(1, String.valueOf(idg3));
                                    pst.setString(2, jLabel36.getText());
                                    pst.setString(3, jCheckBox12.getText());
                                    pst.setString(4, jTextField23.getText());
                                    pst.setString(5, jTextField29.getText());
                                    pst.execute();
                                   
                            }
                          }catch(Exception e){
                              //JOptionPane.showMessageDialog(null, e);
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
                                    pst.setString(1, String.valueOf(ids));
                                    pst.setString(2, jLabel38.getText());
                                    pst.setString(3, jCheckBox14.getText());
                                    pst.setString(4, jTextField25.getText());
                                    pst.setString(5, jTextField31.getText());
                                    pst.execute();
                                   

                            }
                          }catch(Exception e){
                              //JOptionPane.showMessageDialog(null, e);
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
                                    pst.setString(1, String.valueOf(ids1));
                                    pst.setString(2, jLabel39.getText());
                                    pst.setString(3, jCheckBox15.getText());
                                    pst.setString(4, jTextField26.getText());
                                    pst.setString(5, jTextField32.getText());
                                    pst.execute();
                                   

                            }
                          }catch(Exception e){
                              //JOptionPane.showMessageDialog(null, e);
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
                                    pst.setString(1, String.valueOf(ido));
                                    pst.setString(2, jLabel40.getText());
                                    pst.setString(3, jCheckBox16.getText());
                                    pst.setString(4, jTextField27.getText());
                                    pst.setString(5, jTextField33.getText());
                                    pst.execute();
                                   

                            }
                          }catch(Exception e){
                              //JOptionPane.showMessageDialog(null, e);
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
                                    pst.setString(1, String.valueOf(ido1));
                                    pst.setString(2, jLabel41.getText());
                                    pst.setString(3, jCheckBox17.getText());
                                    pst.setString(4, jTextField28.getText());
                                    pst.setString(5, jTextField34.getText());
                                    pst.execute();
                                    

                            }
                          }catch(Exception e){
                              //JOptionPane.showMessageDialog(null, e);
                          }finally{
                        try{
                             pst.close();
                                    rs.close();
                        }catch(Exception e){
                            
                        }
                    }
                     
    }
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
  /*  public void insertorders() {
    	
    	try {

      	  Class.forName("com.mysql.jdbc.Driver");
			Connection connn=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1","root","");
			String sqli="insert into foodorder (Order_Num,item1,item2,item3,item4,item5,item6,item7,item8,item9,item10,item11,item12,item13,item14,item15,item16) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			 pst=connn.prepareStatement(sqli);
			 pst.setString(1, String.valueOf(Orderi));
			 if(jTextField7.getText()!=("")) {
				 pst.setString(2, jLabel4.getText()); 
			 }
			 if(jTextField8.getText()!=("")) {
				 pst.setString(3, jLabel5.getText());
			 }
			 if(jTextField9.getText()!=("")) {
				 pst.setString(4, jLabel8.getText());
			 }
			 if(jTextField10.getText()!=("")) {
				 pst.setString(5,jLabel11.getText());
			 }
			 if(jTextField11.getText()!=("")) {
				 pst.setString(6, jLabel13.getText());
			 }
			 if(jTextField12.getText()!=("")) {
				 pst.setString(7, jLabel15.getText());
			 }
			 if(jTextField15.getText()!=("")) {
				 pst.setString(8, jLabel3.getText());
			 }
			 if(jTextField16.getText()!=("")) {
				 pst.setString(9, jLabel3.getText());
			 }
			 if(jTextField18.getText()!=("")) {
				 pst.setString(10, jLabel22.getText());
			 }
			 if(jTextField19.getText()!=("")) {
				 pst.setString(11, jLabel27.getText());
			 }
			 if(jTextField22.getText()!=("")) {
				 pst.setString(12, jLabel32.getText());
			 }
			  if(jTextField29.getText()!=("")) {
				  pst.setString(13, jLabel33.getText());
			  }
			  if(jTextField31.getText()!=("")) {
				  pst.setString(14, jLabel36.getText());
			  }
			  if(jTextField32.getText()!=("")) {
				  pst.setString(15, jLabel36.getText());
			  }
			  if(jTextField33.getText()!=("")) {
				  pst.setString(16, jLabel38.getText());
			  }
			  if(jTextField34.getText()!=("")) {
				  pst.setString(2, jCheckBox15.getText());
			  }
    	}catch(Exception e){
    		
    		
    	}
    	
    	
    	
    }
    
    
    
    
    
    */
    
    
    
    
    
    
  ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  
 
    /*public void insertorders() {
    	

        try{
        	//////
          if(jTextField7.getText().equals("")){

          }else{

        	
        	  Class.forName("com.mysql.jdbc.Driver");
  			Connection connn=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1","root","");
  			//,item4,item5,item6,item7,item8,item9,item10,item11,item12,item13,item14,item15,item16
  		 String sqli="insert into foodorder (Order_Num,item1,orderID) values(?,?,?)";
           pst=connn.prepareStatement(sqli);
           pst.setString(1, String.valueOf(Orderi));
           pst.setString(2, jLabel4.getText());
           pst.setString(3, String.valueOf(ORDER));
          // pst.setString(3, jLabel5.getText());
           //pst.setString(4, jLabel8.getText());
         // pst.setString(5, jLabel11.getText());
          // pst.setString(6, jLabel13.getText());
          //pst.setString(7, jLabel15.getText());
          //  pst.setString(8, jLabel3.getText());
          //  pst.setString(9, jLabel22.getText());
          //  pst.setString(10, jLabel27.getText());
          //  pst.setString(11, jLabel32.getText());
          //  pst.setString(12, jLabel33.getText());
          // pst.setString(13, jLabel36.getText());
            // pst.setString(14, jLabel38.getText());
            // pst.setString(15, jCheckBox15.getText());
            // pst.setString(16, jLabel40.getText());
             //pst.setString(17, jLabel41.getText());
           
           pst.execute();
                     
                }
              }catch(Exception e){
                 // JOptionPane.showMessageDialog(null, e );
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
        	  
        

        	  Class.forName("com.mysql.jdbc.Driver");
  			Connection connn=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1","root","");
  			//,item4,item5,item6,item7,item8,item9,item10,item11,item12,item13,item14,item15,item16
  		 String sqli="insert into foodorder (Order_Num,item2,orderID) values(?,?,?)";
           pst=connn.prepareStatement(sqli);
           pst.setString(1, String.valueOf(Orderi));
       
          
           pst.setString(2, jLabel5.getText());
           pst.setString(3, String.valueOf(ORDER));
           //pst.setString(4, jLabel8.getText());
         // pst.setString(5, jLabel11.getText());
          // pst.setString(6, jLabel13.getText());
          //pst.setString(7, jLabel15.getText());
          //  pst.setString(8, jLabel3.getText());
          //  pst.setString(9, jLabel22.getText());
          //  pst.setString(10, jLabel27.getText());
          //  pst.setString(11, jLabel32.getText());
          //  pst.setString(12, jLabel33.getText());
          // pst.setString(13, jLabel36.getText());
            // pst.setString(14, jLabel38.getText());
            // pst.setString(15, jCheckBox15.getText());
            // pst.setString(16, jLabel40.getText());
             //pst.setString(17, jLabel41.getText());

                }
              }catch(Exception e){
                  //JOptionPane.showMessageDialog(null, e);
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

        	  Class.forName("com.mysql.jdbc.Driver");
  			Connection connn=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1","root","");
  			//,item4,item5,item6,item7,item8,item9,item10,item11,item12,item13,item14,item15,item16
  		 String sqli="insert into foodorder (Order_Num,item3,orderID) values(?,?,?)";
           pst=connn.prepareStatement(sqli);
           pst.setString(1, String.valueOf(Orderi));
           pst.setString(2, jLabel8.getText());
           pst.setString(3, String.valueOf(ORDER));
           //
         // pst.setString(5, jLabel11.getText());
          // pst.setString(6, jLabel13.getText());
          //pst.setString(7, jLabel15.getText());
          //  pst.setString(8, jLabel3.getText());
          //  pst.setString(9, jLabel22.getText());
          //  pst.setString(10, jLabel27.getText());
          //  pst.setString(11, jLabel32.getText());
          //  pst.setString(12, jLabel33.getText());
          // pst.setString(13, jLabel36.getText());
            // pst.setString(14, jLabel38.getText());
            // pst.setString(15, jCheckBox15.getText());
            // pst.setString(16, jLabel40.getText());
             //pst.setString(17, jLabel41.getText());

                       

                }
              }catch(Exception e){
                  //JOptionPane.showMessageDialog(null, e);
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

        	  

        	  Class.forName("com.mysql.jdbc.Driver");
  			Connection connn=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1","root","");
  			//,item4,item5,item6,item7,item8,item9,item10,item11,item12,item13,item14,item15,item16
  		 String sqli="insert into foodorder (Order_Num,item4,orderID) values(?,?,?)";
           pst=connn.prepareStatement(sqli);
           pst.setString(1, String.valueOf(Orderi));
           pst.setString(2, jLabel11.getText());
           pst.setString(3, String.valueOf(ORDER));
           //
         // 
          // pst.setString(6, jLabel13.getText());
          //pst.setString(7, jLabel15.getText());
          //  pst.setString(8, jLabel3.getText());
          //  pst.setString(9, jLabel22.getText());
          //  pst.setString(10, jLabel27.getText());
          //  pst.setString(11, jLabel32.getText());
          //  pst.setString(12, jLabel33.getText());
          // pst.setString(13, jLabel36.getText());
            // pst.setString(14, jLabel38.getText());
            // pst.setString(15, jCheckBox15.getText());
            // pst.setString(16, jLabel40.getText());
             //pst.setString(17, jLabel41.getText());

                       

                }
              }catch(Exception e){
                  //JOptionPane.showMessageDialog(null, e);
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

        	  Class.forName("com.mysql.jdbc.Driver");
    			Connection connn=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1","root","");
    			//,item4,item5,item6,item7,item8,item9,item10,item11,item12,item13,item14,item15,item16
    		 String sqli="insert into foodorder (Order_Num,item5,orderID) values(?,?,?)";
             pst=connn.prepareStatement(sqli);
             pst.setString(1, String.valueOf(Orderi));
             pst.setString(2, jLabel13.getText());
             pst.setString(3, String.valueOf(ORDER));
             //
           // 
            // 
            //pst.setString(7, jLabel15.getText());
            //  pst.setString(8, jLabel3.getText());
            //  pst.setString(9, jLabel22.getText());
            //  pst.setString(10, jLabel27.getText());
            //  pst.setString(11, jLabel32.getText());
            //  pst.setString(12, jLabel33.getText());
            // pst.setString(13, jLabel36.getText());
              // pst.setString(14, jLabel38.getText());
              // pst.setString(15, jCheckBox15.getText());
              // pst.setString(16, jLabel40.getText());
               //pst.setString(17, jLabel41.getText());


                }
              }catch(Exception e){
                 // JOptionPane.showMessageDialog(null, e);
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
        	  
        	 
        	  Class.forName("com.mysql.jdbc.Driver");
  			Connection connn=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1","root","");
  			//,item4,item5,item6,item7,item8,item9,item10,item11,item12,item13,item14,item15,item16
  		 String sqli="insert into foodorder (Order_Num,item6,orderID) values(?,?,?)";
           pst=connn.prepareStatement(sqli);
           pst.setString(1, String.valueOf(Orderi));
           pst.setString(2, jLabel15.getText());
           pst.setString(3, String.valueOf(ORDER));
           //
         // 
          // 
          //
          //  pst.setString(8, jLabel3.getText());
          //  pst.setString(9, jLabel22.getText());
          //  pst.setString(10, jLabel27.getText());
          //  pst.setString(11, jLabel32.getText());
          //  pst.setString(12, jLabel33.getText());
          // pst.setString(13, jLabel36.getText());
            // pst.setString(14, jLabel38.getText());
            // pst.setString(15, jCheckBox15.getText());
            // pst.setString(16, jLabel40.getText());
             //pst.setString(17, jLabel41.getText());


                }
              }catch(Exception e){
                 /// JOptionPane.showMessageDialog(null, e);
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
        	  
        	  
        	  Class.forName("com.mysql.jdbc.Driver");
    			Connection connn=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1","root","");
    			//,item4,item5,item6,item7,item8,item9,item10,item11,item12,item13,item14,item15,item16
    		 String sqli="insert into foodorder (Order_Num,item7,orderID) values(?,?,?)";
             pst=connn.prepareStatement(sqli);
             pst.setString(1, String.valueOf(Orderi));
             pst.setString(2, jLabel3.getText());
             pst.setString(3, String.valueOf(ORDER));
             //
           // 
            // 
            //
            //  pst.setString(8, jLabel3.getText());
            //  pst.setString(9, jLabel22.getText());
            //  pst.setString(10, jLabel27.getText());
            //  pst.setString(11, jLabel32.getText());
            //  pst.setString(12, jLabel33.getText());
            // pst.setString(13, jLabel36.getText());
              // pst.setString(14, jLabel38.getText());
              // pst.setString(15, jCheckBox15.getText());
              // pst.setString(16, jLabel40.getText());
               //pst.setString(17, jLabel41.getText());
                        

                }
              }catch(Exception e){
                 // JOptionPane.showMessageDialog(null, e);
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

        	  Class.forName("com.mysql.jdbc.Driver");
  			Connection connn=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1","root","");
  			//,item4,item5,item6,item7,item8,item9,item10,item11,item12,item13,item14,item15,item16
  		 String sqli="insert into foodorder (Order_Num,item8,orderID) values(?,?,?)";
           pst=connn.prepareStatement(sqli);
           pst.setString(1, String.valueOf(Orderi));
           pst.setString(2, jLabel3.getText());
           pst.setString(3, String.valueOf(ORDER));
           //
         // 
          // 
          //
          //  
          //  pst.setString(9, jLabel22.getText());
          //  pst.setString(10, jLabel27.getText());
          //  pst.setString(11, jLabel32.getText());
          //  pst.setString(12, jLabel33.getText());
          // pst.setString(13, jLabel36.getText());
            // pst.setString(14, jLabel38.getText());
            // pst.setString(15, jCheckBox15.getText());
            // pst.setString(16, jLabel40.getText());
             //pst.setString(17, jLabel41.getText());
                        
                }
              }catch(Exception e){
                 // JOptionPane.showMessageDialog(null, e);
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

        	  Class.forName("com.mysql.jdbc.Driver");
    			Connection connn=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1","root","");
    			//,item4,item5,item6,item7,item8,item9,item10,item11,item12,item13,item14,item15,item16
    		 String sqli="insert into foodorder (Order_Num,item9,orderID) values(?,?,?)";
             pst=connn.prepareStatement(sqli);
             pst.setString(1, String.valueOf(Orderi));
             pst.setString(2, jLabel22.getText());
             pst.setString(3, String.valueOf(ORDER));
             //
           // 
            // 
            //
            //  
            //  
            //  pst.setString(10, jLabel27.getText());
            //  pst.setString(11, jLabel32.getText());
            //  pst.setString(12, jLabel33.getText());
            // pst.setString(13, jLabel36.getText());
              // pst.setString(14, jLabel38.getText());
              // pst.setString(15, jCheckBox15.getText());
              // pst.setString(16, jLabel40.getText());
               //pst.setString(17, jLabel41.getText());
                          
                       

                }
              }catch(Exception e){
                  //JOptionPane.showMessageDialog(null, e);
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
        	  Class.forName("com.mysql.jdbc.Driver");
    			Connection connn=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1","root","");
    			//,item4,item5,item6,item7,item8,item9,item10,item11,item12,item13,item14,item15,item16
    		 String sqli="insert into foodorder (Order_Num,item10,orderID) values(?,?,?)";
             pst=connn.prepareStatement(sqli);
             pst.setString(1, String.valueOf(Orderi));
             pst.setString(2, jLabel27.getText());
             pst.setString(3, String.valueOf(ORDER));
             //
           // 
            // 
            //
            //  
            //  
            //  
            //  pst.setString(11, jLabel32.getText());
            //  pst.setString(12, jLabel33.getText());
            // pst.setString(13, jLabel36.getText());
              // pst.setString(14, jLabel38.getText());
              // pst.setString(15, jCheckBox15.getText());
              // pst.setString(16, jLabel40.getText());
               //pst.setString(17, jLabel41.getText());
                     

                }
              }catch(Exception e){
                  //JOptionPane.showMessageDialog(null, e);
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

        	  Class.forName("com.mysql.jdbc.Driver");
  			Connection connn=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1","root","");
  			//,item4,item5,item6,item7,item8,item9,item10,item11,item12,item13,item14,item15,item16
  		 String sqli="insert into foodorder (Order_Num,item11,orderID) values(?,?,?)";
           pst=connn.prepareStatement(sqli);
           pst.setString(1, String.valueOf(Orderi));
           pst.setString(2, jLabel32.getText());
           pst.setString(3, String.valueOf(ORDER));
           //
         // 
          // 
          //
          //  
          //  
          //  
          //  
          //  pst.setString(12, jLabel33.getText());
          // pst.setString(13, jLabel36.getText());
            // pst.setString(14, jLabel38.getText());
            // pst.setString(15, jCheckBox15.getText());
            // pst.setString(16, jLabel40.getText());
             //pst.setString(17, jLabel41.getText());
                   

                }
              }catch(Exception e){
                 // JOptionPane.showMessageDialog(null, e);
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


        	  Class.forName("com.mysql.jdbc.Driver");
  			Connection connn=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1","root","");
  			//,item4,item5,item6,item7,item8,item9,item10,item11,item12,item13,item14,item15,item16
  		 String sqli="insert into foodorder (Order_Num,item12,orderID) values(?,?,?)";
           pst=connn.prepareStatement(sqli);
           pst.setString(1, String.valueOf(Orderi));
           pst.setString(2, jLabel33.getText());
           pst.setString(3, String.valueOf(ORDER));
           //
         // 
          // 
          //
          //  
          //  
          //  
          //  
          //  
          // pst.setString(13, jLabel36.getText());
            // pst.setString(14, jLabel38.getText());
            // pst.setString(15, jCheckBox15.getText());
            // pst.setString(16, jLabel40.getText());
             //pst.setString(17, jLabel41.getText());
                   

                       
                }
              }catch(Exception e){
                  //JOptionPane.showMessageDialog(null, e);
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
        	  
        	

        	  Class.forName("com.mysql.jdbc.Driver");
  			Connection connn=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1","root","");
  			//,item4,item5,item6,item7,item8,item9,item10,item11,item12,item13,item14,item15,item16
  		 String sqli="insert into foodorder (Order_Num,item13,orderID) values(?,?,?)";
           pst=connn.prepareStatement(sqli);
           pst.setString(1, String.valueOf(Orderi));
           pst.setString(2, jLabel36.getText());
           pst.setString(3, String.valueOf(ORDER));
           //
         // 
          // 
          //
          //  
          //  
          //  
          //  
          //  
          // pst.setString(13, jLabel36.getText());
            // pst.setString(14, jLabel38.getText());
            // pst.setString(15, jCheckBox15.getText());
            // pst.setString(16, jLabel40.getText());
             //pst.setString(17, jLabel41.getText());
                   

                       

                }
              }catch(Exception e){
                  //JOptionPane.showMessageDialog(null, e);
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
        	  
        	 
         	  Class.forName("com.mysql.jdbc.Driver");
    			Connection connn=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1","root","");
    			//,item4,item5,item6,item7,item8,item9,item10,item11,item12,item13,item14,item15,item16
    		 String sqli="insert into foodorder (Order_Num,item14,orderID) values(?,?,?)";
             pst=connn.prepareStatement(sqli);
             pst.setString(1, String.valueOf(Orderi));
             pst.setString(2, jLabel36.getText());
             pst.setString(3, String.valueOf(ORDER));
             //
           // 
            // 
            //
            //  
            //  
            //  
            //  
            //  
            // 
              // pst.setString(14, jLabel38.getText());
              // pst.setString(15, jCheckBox15.getText());
              // pst.setString(16, jLabel40.getText());
               //pst.setString(17, jLabel41.getText());
                     
                       

                }
              }catch(Exception e){
                  //JOptionPane.showMessageDialog(null, e);
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
        	

        	  Class.forName("com.mysql.jdbc.Driver");
  			Connection connn=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1","root","");
  			//,item4,item5,item6,item7,item8,item9,item10,item11,item12,item13,item14,item15,item16
  		 String sqli="insert into foodorder (Order_Num,item15,orderID) values(?,?,?)";
           pst=connn.prepareStatement(sqli);
           pst.setString(1, String.valueOf(Orderi));
           pst.setString(2, jLabel38.getText());
           pst.setString(3, String.valueOf(ORDER));
           //
         // 
          // 
          //
          //  
          //  
          //  
          //  
          //  
          // 
            // pst.setString(14, jLabel38.getText());
            // pst.setString(15, jCheckBox15.getText());
            // pst.setString(16, jLabel40.getText());
             //pst.setString(17, jLabel41.getText());
                   
                }
              }catch(Exception e){
                  //JOptionPane.showMessageDialog(null, e);
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

        	  Class.forName("com.mysql.jdbc.Driver");
    			Connection connn=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1","root","");
    			//,item4,item5,item6,item7,item8,item9,item10,item11,item12,item13,item14,item15,item16
    		 String sqli="insert into foodorder (Order_Num,item16,orderID) values(?,?,?)";
             pst=connn.prepareStatement(sqli);
             pst.setString(1, String.valueOf(Orderi));
             pst.setString(2, jCheckBox15.getText());
             pst.setString(3, String.valueOf(ORDER));
             //
           // 
            // 
            //
            //  
            //  
            //  
            //  
            //  
            // 
              // pst.setString(14, jLabel38.getText());
              // pst.setString(15, jCheckBox15.getText());
              // pst.setString(16, jLabel40.getText());
               //pst.setString(17, jLabel41.getText());
                     

                }
              }catch(Exception e){
                  //JOptionPane.showMessageDialog(null, e);
              }finally{
            try{
                 pst.close();
                        rs.close();
            }catch(Exception e){
                
            }
        }
         

    	
    }
    
    
    
    */
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////
 
   
    
    //////////////////////////////////////////////////////////////////////
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
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel1.setBackground(Color.WHITE);
        jLabel1.setForeground(Color.BLACK);
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setBackground(Color.WHITE);
        jLabel2.setForeground(Color.BLACK);
        jPanel1 = new javax.swing.JPanel();
        jPanel1.setBackground(Color.LIGHT_GRAY);
        jCheckBox1 = new javax.swing.JCheckBox();
        jTextField2 = new javax.swing.JTextField();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel5.setForeground(Color.BLACK);
        jLabel7 = new javax.swing.JLabel();
        jLabel7.setForeground(Color.BLACK);
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setForeground(Color.BLACK);
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel6.setForeground(Color.BLACK);
        jLabel16 = new javax.swing.JLabel();
        jLabel16.setForeground(Color.BLACK);
        jLabel17 = new javax.swing.JLabel();
        jLabel17.setForeground(Color.BLACK);
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel2.setBackground(Color.LIGHT_GRAY);
        jCheckBox4 = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel11.setForeground(Color.BLACK);
        jLabel8 = new javax.swing.JLabel();
        jLabel8.setForeground(Color.BLACK);
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jCheckBox6 = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel13.setForeground(Color.BLACK);
        jTextField5 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel12.setForeground(Color.BLACK);
        jCheckBox3 = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        jLabel14.setForeground(Color.BLACK);
        jLabel10 = new javax.swing.JLabel();
        jLabel10.setForeground(Color.BLACK);
        jTextField6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel9.setForeground(Color.BLACK);
        jCheckBox5 = new javax.swing.JCheckBox();
        jLabel15 = new javax.swing.JLabel();
        jLabel15.setForeground(Color.BLACK);
        jTextField9 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel18.setForeground(Color.BLACK);
        jLabel19 = new javax.swing.JLabel();
        jLabel19.setForeground(Color.BLACK);
        jLabel20 = new javax.swing.JLabel();
        jLabel20.setForeground(Color.BLACK);
        jLabel21 = new javax.swing.JLabel();
        jLabel21.setForeground(Color.BLACK);
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel3.setBackground(Color.LIGHT_GRAY);
        jLabel22 = new javax.swing.JLabel();
        jLabel22.setForeground(Color.BLACK);
        jLabel23 = new javax.swing.JLabel();
        jLabel23.setForeground(Color.BLACK);
        jLabel25 = new javax.swing.JLabel();
        jLabel25.setForeground(Color.BLACK);
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setForeground(Color.BLACK);
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jCheckBox7 = new javax.swing.JCheckBox();
        jLabel26 = new javax.swing.JLabel();
        jLabel26.setForeground(Color.BLACK);
        jCheckBox8 = new javax.swing.JCheckBox();
        jLabel24 = new javax.swing.JLabel();
        jLabel24.setForeground(Color.BLACK);
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel4.setBackground(Color.LIGHT_GRAY);
        jCheckBox11 = new javax.swing.JCheckBox();
        jLabel29 = new javax.swing.JLabel();
        jLabel29.setForeground(Color.BLACK);
        jLabel28 = new javax.swing.JLabel();
        jLabel28.setForeground(Color.BLACK);
        jLabel27 = new javax.swing.JLabel();
        jLabel27.setForeground(Color.BLACK);
        jTextField17 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jCheckBox10 = new javax.swing.JCheckBox();
        jLabel32 = new javax.swing.JLabel();
        jLabel32.setForeground(Color.BLACK);
        jLabel33 = new javax.swing.JLabel();
        jLabel33.setForeground(Color.BLACK);
        jTextField20 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jCheckBox9 = new javax.swing.JCheckBox();
        jLabel34 = new javax.swing.JLabel();
        jLabel34.setForeground(Color.BLACK);
        jTextField21 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel35.setForeground(Color.BLACK);
        jTextField19 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel31.setForeground(Color.BLACK);
        jLabel30 = new javax.swing.JLabel();
        jLabel30.setForeground(Color.BLACK);
        jPanel6 = new javax.swing.JPanel();
        jPanel6.setBackground(Color.LIGHT_GRAY);
        jCheckBox12 = new javax.swing.JCheckBox();
        jLabel41 = new javax.swing.JLabel();
        jLabel41.setForeground(Color.BLACK);
        jLabel42 = new javax.swing.JLabel();
        jLabel42.setForeground(Color.BLACK);
        jTextField30 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jLabel47.setForeground(Color.BLACK);
        jTextField23 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel37.setForeground(Color.BLACK);
        jTextField29 = new javax.swing.JTextField();
        jCheckBox17 = new javax.swing.JCheckBox();
        jTextField26 = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jLabel51.setForeground(Color.BLACK);
        jCheckBox14 = new javax.swing.JCheckBox();
        jLabel48 = new javax.swing.JLabel();
        jLabel48.setForeground(Color.BLACK);
        jLabel52 = new javax.swing.JLabel();
        jLabel52.setForeground(Color.BLACK);
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jLabel49 = new javax.swing.JLabel();
        jLabel49.setForeground(Color.BLACK);
        jLabel53 = new javax.swing.JLabel();
        jLabel53.setForeground(Color.BLACK);
        jLabel38 = new javax.swing.JLabel();
        jLabel38.setForeground(Color.BLACK);
        jTextField28 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel43.setForeground(Color.BLACK);
        jTextField32 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel39.setForeground(Color.BLACK);
        jLabel36 = new javax.swing.JLabel();
        jLabel36.setForeground(Color.BLACK);
        jLabel44 = new javax.swing.JLabel();
        jLabel44.setForeground(Color.BLACK);
        jTextField31 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel40.setForeground(Color.BLACK);
        jTextField34 = new javax.swing.JTextField();
        jCheckBox16 = new javax.swing.JCheckBox();
        jTextField25 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jLabel46.setForeground(Color.BLACK);
        jTextField33 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel45.setForeground(Color.BLACK);
        jLabel50 = new javax.swing.JLabel();
        jLabel50.setForeground(Color.BLACK);
        jTextField24 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton1.setForeground(Color.BLACK);
        jButton1.setBackground(Color.LIGHT_GRAY);
        jTextField35 = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jLabel54.setForeground(Color.BLACK);
        jLabel55 = new javax.swing.JLabel();
        jLabel55.setForeground(Color.BLACK);
        jTextField36 = new javax.swing.JTextField();
        jTextField37 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Customer menu");
        setMinimumSize(new java.awt.Dimension(1368, 760));

        jLabel1.setFont(new java.awt.Font("Sylfaen", 0, 36));
        jLabel1.setText("WELCOME TO GRAND MENTION");

        jLabel2.setFont(new java.awt.Font("Sylfaen", 0, 24));
        jLabel2.setText("Choose Your Order");

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
                jTextField2KeyReleased(evt);
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
                jTextField1KeyReleased(evt);
            }
        });

        jLabel6.setText("Quantity");

        jLabel16.setText("Amount");

        jLabel17.setText("Amount");

        jTextField7.setEditable(false);

        jTextField8.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jCheckBox1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel16)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jCheckBox2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel17)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

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
                jTextField3KeyReleased(evt);
            }
        });

        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField4KeyReleased(evt);
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
                jTextField5KeyReleased(evt);
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
                jTextField6KeyReleased(evt);
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

        jLabel18.setText("Amount");

        jLabel19.setText("Amount");

        jLabel20.setText("Amount");

        jLabel21.setText("Amount");

        jTextField10.setEditable(false);

        jTextField11.setEditable(false);

        jTextField12.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel13)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCheckBox3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField6)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField3)))
                                .addGap(5, 5, 5)))))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel18)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextField11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField9, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField12))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jCheckBox3)
                    .addComponent(jLabel9)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jCheckBox4)
                    .addComponent(jLabel10)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jCheckBox5)
                    .addComponent(jLabel12)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jCheckBox6)
                    .addComponent(jLabel14)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Soup", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sylfaen", 0, 18), new java.awt.Color(153, 0, 0))); // NOI18N

        jLabel22.setText("Hipon");

        jLabel23.setText("Quantity");

        jLabel25.setText("Amount");

        jLabel3.setText("Bangus");

        jTextField15.setEditable(false);

        jTextField16.setEditable(false);

        jCheckBox7.setText(" 120.00");
        jCheckBox7.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox7ItemStateChanged(evt);
            }
        });

        jLabel26.setText("Amount");

        jCheckBox8.setText(" 150.00");
        jCheckBox8.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox8ItemStateChanged(evt);
            }
        });

        jLabel24.setText("Quantity");

        jTextField13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField13KeyReleased(evt);
            }
        });

        jTextField14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField14KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel22))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCheckBox7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox8))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField13))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField15))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jCheckBox7)
                    .addComponent(jLabel23)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jCheckBox8)
                    .addComponent(jLabel24)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Others", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sylfaen", 0, 18), new java.awt.Color(153, 0, 0))); // NOI18N

        jCheckBox11.setText(" 80.00");
        jCheckBox11.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox11ItemStateChanged(evt);
            }
        });

        jLabel29.setText("Amount");

        jLabel28.setText("Quantity");

        jLabel27.setText("Baked Talaba  ");

        jTextField17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField17KeyReleased(evt);
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
                jTextField20KeyReleased(evt);
            }
        });

        jTextField18.setEditable(false);

        jCheckBox9.setText(" 100.00");
        jCheckBox9.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox9ItemStateChanged(evt);
            }
        });

        jLabel34.setText("Amount");

        jTextField21.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField21KeyReleased(evt);
            }
        });

        jLabel35.setText("Quantity");

        jTextField19.setEditable(false);

        jLabel31.setText("Quantity");

        jLabel30.setText("Amount");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox11)
                    .addComponent(jCheckBox9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckBox10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34)
                            .addComponent(jLabel30))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jCheckBox9)
                    .addComponent(jLabel28)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jCheckBox10)
                    .addComponent(jLabel31)
                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(jCheckBox11)
                    .addComponent(jLabel35)
                    .addComponent(jLabel34)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
                jTextField23KeyReleased(evt);
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
                jTextField26KeyReleased(evt);
            }
        });

        jLabel51.setText("Amount");

        jCheckBox14.setText(" 30.00");
        jCheckBox14.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox14ItemStateChanged(evt);
            }
        });

        jLabel48.setText("Amount");

        jLabel52.setText("Amount");

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

        jLabel49.setText("Amount");

        jLabel53.setText("Amount");

        jLabel38.setText("Pepsi Litro  ");

        jTextField28.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField28KeyReleased(evt);
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

        jCheckBox16.setText(" 150.00");
        jCheckBox16.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox16ItemStateChanged(evt);
            }
        });

        jTextField25.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField25KeyReleased(evt);
            }
        });

        jLabel46.setText("Quantity");

        jTextField33.setEditable(false);

        jTextField27.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField27KeyReleased(evt);
            }
        });

        jLabel45.setText("Quantity");

        jLabel50.setText("Amount");

        jTextField24.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField24KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36)
                    .addComponent(jLabel37)
                    .addComponent(jLabel38)
                    .addComponent(jLabel39)
                    .addComponent(jLabel40)
                    .addComponent(jLabel41))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox12)
                    .addComponent(jCheckBox13)
                    .addComponent(jCheckBox14)
                    .addComponent(jCheckBox15)
                    .addComponent(jCheckBox16)
                    .addComponent(jCheckBox17))
                .addGap(29, 29, 29)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel42)
                    .addComponent(jLabel43)
                    .addComponent(jLabel44)
                    .addComponent(jLabel45)
                    .addComponent(jLabel46)
                    .addComponent(jLabel47))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel53)
                    .addComponent(jLabel52)
                    .addComponent(jLabel51)
                    .addComponent(jLabel50)
                    .addComponent(jLabel49)
                    .addComponent(jLabel48))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(jCheckBox12)
                    .addComponent(jLabel42)
                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48)
                    .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(jCheckBox13)
                    .addComponent(jLabel43)
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49)
                    .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(jCheckBox14)
                    .addComponent(jLabel44)
                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50)
                    .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(jCheckBox15)
                    .addComponent(jLabel45)
                    .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51)
                    .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(jCheckBox16)
                    .addComponent(jLabel46)
                    .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel52)
                    .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(jCheckBox17)
                    .addComponent(jLabel47)
                    .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53)
                    .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jButton1.setText("Calculate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField35.setEditable(false);
        jTextField35.setFont(new java.awt.Font("Sylfaen", 0, 24)); 
        jTextField35.setForeground(new java.awt.Color(102, 0, 0));

        jLabel54.setText("Entered Cash");

        jLabel55.setText("Change");
        setJMenuBar(jMenuBar1);
        
        JButton btnNewButton = new JButton("Admin panel");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		
        		
        		Login login=new Login();
        		Login.main(null);
        	}
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(83)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jPanel6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        								.addComponent(jLabel54)
        								.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
        								.addComponent(jLabel55))
        							.addGap(29)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        								.addComponent(jTextField35, GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
        								.addComponent(jTextField36)
        								.addComponent(jTextField37))))
        					.addContainerGap(119, Short.MAX_VALUE))
        				.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED, 344, Short.MAX_VALUE)
        					.addComponent(jLabel1)
        					.addGap(336))
        				.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        					.addComponent(jLabel2)
        					.addGap(519))))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(28)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jLabel1)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jLabel2))
        				.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addGap(18)
        					.addComponent(jPanel6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jTextField35, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addGap(18)
        					.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addGap(18)
        					.addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel54)
        				.addComponent(jTextField36, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel55)
        				.addComponent(jTextField37, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(46, Short.MAX_VALUE))
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
    }

    private void jCheckBox3ItemStateChanged(java.awt.event.ItemEvent evt) {
       
        if(evt.getStateChange() == ItemEvent.DESELECTED){
         //   System.out.println("Deselected!");
            jTextField9.setText("");
            jTextField3.setText("");
            jTextField3.setEnabled(false);
        }else{
             // System.out.println("Selected");
              jTextField3.setEnabled(true);
        }
    }

    private void jCheckBox4ItemStateChanged(java.awt.event.ItemEvent evt) {
       
        if(evt.getStateChange() == ItemEvent.DESELECTED){
         //   System.out.println("Deselected!");
            jTextField10.setText("");
            jTextField4.setText("");
            jTextField4.setEnabled(false);
        }else{
             // System.out.println("Selected");
              jTextField4.setEnabled(true);
        }
    }

    private void jCheckBox5ItemStateChanged(java.awt.event.ItemEvent evt) {
       
        if(evt.getStateChange() == ItemEvent.DESELECTED){
         //   System.out.println("Deselected!");
            jTextField11.setText("");
            jTextField5.setText("");
            jTextField5.setEnabled(false);
        }else{
             // System.out.println("Selected");
              jTextField5.setEnabled(true);
        }
    }

    private void jCheckBox6ItemStateChanged(java.awt.event.ItemEvent evt) {
      
        if(evt.getStateChange() == ItemEvent.DESELECTED){
         //   System.out.println("Deselected!");
            jTextField12.setText("");
            jTextField6.setText("");
            jTextField6.setEnabled(false);
        }else{
             // System.out.println("Selected");
              jTextField6.setEnabled(true);
        }
    }

    private void jCheckBox7ItemStateChanged(java.awt.event.ItemEvent evt) {
        
        if(evt.getStateChange() == ItemEvent.DESELECTED){
         //   System.out.println("Deselected!");
            jTextField15.setText("");
            jTextField13.setText("");
            jTextField13.setEnabled(false);
        }else{
             // System.out.println("Selected");
              jTextField13.setEnabled(true);
        }
    }

    private void jCheckBox8ItemStateChanged(java.awt.event.ItemEvent evt) {
      
        if(evt.getStateChange() == ItemEvent.DESELECTED){
         //   System.out.println("Deselected!");
            jTextField16.setText("");
            jTextField14.setText("");
            jTextField14.setEnabled(false);
        }else{
             // System.out.println("Selected");
              jTextField14.setEnabled(true);
        }
    }

    private void jCheckBox9ItemStateChanged(java.awt.event.ItemEvent evt) {
      
        if(evt.getStateChange() == ItemEvent.DESELECTED){
         //   System.out.println("Deselected!");
            jTextField18.setText("");
            jTextField17.setText("");
            jTextField17.setEnabled(false);
        }else{
             // System.out.println("Selected");
              jTextField17.setEnabled(true);
        }
    }

    private void jCheckBox10ItemStateChanged(java.awt.event.ItemEvent evt) {
      
        if(evt.getStateChange() == ItemEvent.DESELECTED){
         //   System.out.println("Deselected!");
            jTextField19.setText("");
            jTextField20.setText("");
            jTextField20.setEnabled(false);
        }else{
             // System.out.println("Selected");
              jTextField20.setEnabled(true);
        }
    }

    private void jCheckBox11ItemStateChanged(java.awt.event.ItemEvent evt) {
      
        if(evt.getStateChange() == ItemEvent.DESELECTED){
         //   System.out.println("Deselected!");
            jTextField22.setText("");
            jTextField21.setText("");
            jTextField21.setEnabled(false);
        }else{
             // System.out.println("Selected");
              jTextField21.setEnabled(true);
        }
    }

    private void jCheckBox12ItemStateChanged(java.awt.event.ItemEvent evt) {
      
        if(evt.getStateChange() == ItemEvent.DESELECTED){
         //   System.out.println("Deselected!");
            jTextField29.setText("");
            jTextField23.setText("");
            jTextField23.setEnabled(false);
        }else{
             // System.out.println("Selected");
              jTextField23.setEnabled(true);
        }
    }

    private void jCheckBox13ItemStateChanged(java.awt.event.ItemEvent evt) {
        
        if(evt.getStateChange() == ItemEvent.DESELECTED){
         //   System.out.println("Deselected!");
            jTextField30.setText("");
            jTextField24.setText("");
            jTextField24.setEnabled(false);
        }else{
             // System.out.println("Selected");
              jTextField24.setEnabled(true);
        }
    }

    private void jCheckBox14ItemStateChanged(java.awt.event.ItemEvent evt) {
       
        if(evt.getStateChange() == ItemEvent.DESELECTED){
         //   System.out.println("Deselected!");
            jTextField31.setText("");
            jTextField25.setText("");
            jTextField25.setEnabled(false);
        }else{
             // System.out.println("Selected");
              jTextField25.setEnabled(true);
        }
    }

    private void jCheckBox15ItemStateChanged(java.awt.event.ItemEvent evt) {
       
        if(evt.getStateChange() == ItemEvent.DESELECTED){
         //   System.out.println("Deselected!");
            jTextField32.setText("");
            jTextField26.setText("");
            jTextField26.setEnabled(false);
        }else{
             // System.out.println("Selected");
              jTextField26.setEnabled(true);
        }
    }

    private void jCheckBox16ItemStateChanged(java.awt.event.ItemEvent evt) {
        
        if(evt.getStateChange() == ItemEvent.DESELECTED){
         //   System.out.println("Deselected!");
            jTextField33.setText("");
            jTextField27.setText("");
            jTextField27.setEnabled(false);
        }else{
             // System.out.println("Selected");
              jTextField27.setEnabled(true);
        }
    }

    private void jCheckBox17ItemStateChanged(java.awt.event.ItemEvent evt) {
       
        if(evt.getStateChange() == ItemEvent.DESELECTED){
         //   System.out.println("Deselected!");
            jTextField34.setText("");
            jTextField28.setText("");
            jTextField28.setEnabled(false);
        }else{
             // System.out.println("Selected");
              jTextField28.setEnabled(true);
        }
    }

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {

        try{
        if(jTextField1.getText().length()>4){
          JOptionPane.showMessageDialog(null, "Only 4 digits are allowed","ERROR",JOptionPane.ERROR_MESSAGE);
          jTextField1.setText(null);
        }
        if(jTextField1.getText().equals("")){
            jTextField7.setText(null);
        }else{
        String quantity_get = jTextField1.getText();
     int quantity = Integer.parseInt(quantity_get);
     int amount = quantity * 125;
     jTextField7.setText(String.valueOf(amount));
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Invalid input");
             jTextField1.setText(null);
                   jTextField7.setText(null);
        }
    }

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {
      try{
        if(jTextField2.getText().length()>4){
          JOptionPane.showMessageDialog(null, "Only 4 digits are allowed","ERROR",JOptionPane.ERROR_MESSAGE);
          jTextField2.setText(null);
        }
        if(jTextField2.getText().equals("")){
            jTextField8.setText(null);
        }else{
        String quantity_get = jTextField2.getText();
     int quantity = Integer.parseInt(quantity_get);
     int amount = quantity * 150;
     jTextField8.setText(String.valueOf(amount));
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Invalid input");
             jTextField2.setText(null);
              jTextField8.setText(null);
        }
    }

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {
       try{
        if(jTextField3.getText().length()>4){
          JOptionPane.showMessageDialog(null, "Only 4 digits are allowed","ERROR",JOptionPane.ERROR_MESSAGE);
          jTextField3.setText(null);
        }
        if(jTextField3.getText().equals("")){
            jTextField9.setText(null);
        }else{
        String quantity_get = jTextField3.getText();
     int quantity = Integer.parseInt(quantity_get);
     int amount = quantity * 85;
     jTextField9.setText(String.valueOf(amount));
        }
          }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Invalid input");
             jTextField3.setText(null);
               jTextField9.setText(null);
        }
    }

    private void jTextField4KeyReleased(java.awt.event.KeyEvent evt) {
      try{
        if(jTextField4.getText().length()>4){
          JOptionPane.showMessageDialog(null, "Only 4 digits are allowed","ERROR",JOptionPane.ERROR_MESSAGE);
          jTextField4.setText(null);
        }
        if(jTextField4.getText().equals("")){
            jTextField10.setText(null);
        }else{
        String quantity_get = jTextField4.getText();
     int quantity = Integer.parseInt(quantity_get);
     int amount = quantity * 120;
     jTextField10.setText(String.valueOf(amount));
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Invalid input");
             jTextField4.setText(null);
              jTextField10.setText(null);
        }
    }

    private void jTextField5KeyReleased(java.awt.event.KeyEvent evt) {
       try{
        if(jTextField5.getText().length()>4){
          JOptionPane.showMessageDialog(null, "Only 4 digits are allowed","ERROR",JOptionPane.ERROR_MESSAGE);
          jTextField5.setText(null);
        }    
        if(jTextField5.getText().equals("")){
                jTextField11.setText(null);
            }else{
        String quantity_get = jTextField5.getText();
     int quantity = Integer.parseInt(quantity_get);
     int amount = quantity * 100;
     jTextField11.setText(String.valueOf(amount));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Invalid input");
             jTextField5.setText(null);
                 jTextField11.setText(null);
        }
    }

    private void jTextField6KeyReleased(java.awt.event.KeyEvent evt) {
     try{
        if(jTextField6.getText().length()>4){
          JOptionPane.showMessageDialog(null, "Only 4 digits are allowed","ERROR",JOptionPane.ERROR_MESSAGE);
          jTextField6.setText(null);
        }
        if(jTextField6.getText().equals("")){
            jTextField12.setText(null);
        }else{
        String quantity_get = jTextField6.getText();
     int quantity = Integer.parseInt(quantity_get);
     int amount = quantity * 100;
     jTextField12.setText(String.valueOf(amount));
        }
         }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Invalid input");
             jTextField6.setText(null);
               jTextField12.setText(null);
        }
    }

    private void jTextField13KeyReleased(java.awt.event.KeyEvent evt) {
      try{
        if(jTextField13.getText().length()>4){
          JOptionPane.showMessageDialog(null, "Only 4 digits are allowed","ERROR",JOptionPane.ERROR_MESSAGE);
          jTextField13.setText(null);
        }
        if(jTextField13.getText().equals("")){
            jTextField15.setText(null);
        }else{
        String quantity_get = jTextField13.getText();
     int quantity = Integer.parseInt(quantity_get);
     int amount = quantity * 120;
     jTextField15.setText(String.valueOf(amount));
        }
         }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Invalid input");
             jTextField13.setText(null);
                jTextField15.setText(null);
        }
    }

    private void jTextField14KeyReleased(java.awt.event.KeyEvent evt) {
     try{
        if(jTextField14.getText().length()>4){
          JOptionPane.showMessageDialog(null, "Only 4 digits are allowed","ERROR",JOptionPane.ERROR_MESSAGE);
          jTextField14.setText(null);
        }
        if(jTextField14.getText().equals("")){
            jTextField16.setText(null);
        } else{
        String quantity_get = jTextField14.getText();
     int quantity = Integer.parseInt(quantity_get);
     int amount = quantity * 150;
     jTextField16.setText(String.valueOf(amount));
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Invalid input");
             jTextField14.setText(null);
              jTextField16.setText(null);
        }
    }

    private void jTextField17KeyReleased(java.awt.event.KeyEvent evt) {
      try{
        if(jTextField17.getText().length()>4){
          JOptionPane.showMessageDialog(null, "Only 4 digits are allowed","ERROR",JOptionPane.ERROR_MESSAGE);
          jTextField17.setText(null);
        }
        if(jTextField17.getText().equals("")){
            jTextField18.setText(null);
        }else{
        String quantity_get = jTextField17.getText();
     int quantity = Integer.parseInt(quantity_get);
     int amount = quantity * 100;
     jTextField18.setText(String.valueOf(amount));
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Invalid input");
             jTextField17.setText(null);
               jTextField18.setText(null);
        }
    }

    private void jTextField20KeyReleased(java.awt.event.KeyEvent evt) {
        try{
        if(jTextField20.getText().length()>4){
          JOptionPane.showMessageDialog(null, "Only 4 digits are allowed","ERROR",JOptionPane.ERROR_MESSAGE);
          jTextField20.setText(null);
        }    
        if(jTextField20.getText().equals("")){
                jTextField19.setText(null);
            }else{
        String quantity_get = jTextField20.getText();
     int quantity = Integer.parseInt(quantity_get);
     int amount = quantity * 50;
     jTextField19.setText(String.valueOf(amount));
            }
         }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Invalid input");
             jTextField20.setText(null);
             jTextField19.setText(null);
        }
    }

    private void jTextField21KeyReleased(java.awt.event.KeyEvent evt) {
      try{
        if(jTextField21.getText().length()>4){
          JOptionPane.showMessageDialog(null, "Only 4 digits are allowed","ERROR",JOptionPane.ERROR_MESSAGE);
          jTextField21.setText(null);
        }
        if(jTextField21.getText().equals("")){
            jTextField22.setText(null);
        }else{
        String quantity_get = jTextField21.getText();
     int quantity = Integer.parseInt(quantity_get);
     int amount = quantity * 80;
     jTextField22.setText(String.valueOf(amount));
    }
           }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Invalid input");
             jTextField21.setText(null);
               jTextField22.setText(null);
        }
    }

    private void jTextField23KeyReleased(java.awt.event.KeyEvent evt) {
      try{
        if(jTextField23.getText().length()>4){
          JOptionPane.showMessageDialog(null, "Only 4 digits are allowed","ERROR",JOptionPane.ERROR_MESSAGE);
          jTextField23.setText(null);
        }
        if(jTextField23.getText().equals("")){
            jTextField29.setText(null);
        }else{
        String quantity_get = jTextField23.getText();
     int quantity = Integer.parseInt(quantity_get);
     int amount = quantity * 18;
     jTextField29.setText(String.valueOf(amount));
        }
         }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Invalid input");
             jTextField23.setText(null);
               jTextField29.setText(null);
        }
    }

    private void jTextField24KeyReleased(java.awt.event.KeyEvent evt) {
    try{
        if(jTextField24.getText().length()>4){
          JOptionPane.showMessageDialog(null, "Only 4 digits are allowed","ERROR",JOptionPane.ERROR_MESSAGE);
          jTextField24.setText(null);
        }
        if(jTextField24.getText().equals("")){
           jTextField30.setText(null);
       }else{
        String quantity_get = jTextField24.getText();
     int quantity = Integer.parseInt(quantity_get);
     int amount = quantity * 15;
     jTextField30.setText(String.valueOf(amount));
       }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Invalid input");
             jTextField24.setText(null);
               jTextField30.setText(null);
        }
    }

    private void jTextField25KeyReleased(java.awt.event.KeyEvent evt) {
       try{
        if(jTextField25.getText().length()>4){
          JOptionPane.showMessageDialog(null, "Only 4 digits are allowed","ERROR",JOptionPane.ERROR_MESSAGE);
          jTextField25.setText(null);
        }
        if(jTextField25.getText().equals("")){
            jTextField31.setText(null);
        } else{
        String quantity_get = jTextField25.getText();
     int quantity = Integer.parseInt(quantity_get);
     int amount = quantity * 30;
     jTextField31.setText(String.valueOf(amount));
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Invalid input");
             jTextField25.setText(null);
                  jTextField31.setText(null);
        }
    }

    private void jTextField26KeyReleased(java.awt.event.KeyEvent evt) {
      try{
        if(jTextField26.getText().length()>4){
          JOptionPane.showMessageDialog(null, "Only 4 digits are allowed","ERROR",JOptionPane.ERROR_MESSAGE);
          jTextField26.setText(null);
        }
        if(jTextField26.getText().equals("")){
            jTextField32.setText(null);
        }else{
        String quantity_get = jTextField26.getText();
     int quantity = Integer.parseInt(quantity_get);
     int amount = quantity * 15;
     jTextField32.setText(String.valueOf(amount));
        }
           }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Invalid input");
             jTextField26.setText(null);
                         jTextField32.setText(null);
        }
    }//GEN-LAST:event_jTextField26KeyReleased

    private void jTextField27KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField27KeyReleased
      try{
        if(jTextField27.getText().length()>4){
          JOptionPane.showMessageDialog(null, "Only 4 digits are allowed","ERROR",JOptionPane.ERROR_MESSAGE);
          jTextField27.setText(null);
        }
        if(jTextField27.getText().equals("")){
           jTextField33.setText(null);
       }else{
        String quantity_get = jTextField27.getText();
     int quantity = Integer.parseInt(quantity_get);
     int amount = quantity * 15;
     jTextField33.setText(String.valueOf(amount));
       }  }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Invalid input");
             jTextField27.setText(null);
                  jTextField33.setText(null);
        }
    }

    private void jTextField28KeyReleased(java.awt.event.KeyEvent evt) {
      try{
        if(jTextField28.getText().length()>4){
          JOptionPane.showMessageDialog(null, "Only 4 digits are allowed","ERROR",JOptionPane.ERROR_MESSAGE);
          jTextField28.setText(null);
        }
        if(jTextField28.getText().equals("")){
           jTextField34.setText(null);
       }else{
            String quantity_get = jTextField28.getText();
     int quantity = Integer.parseInt(quantity_get);
     int amount = quantity * 15;
     jTextField34.setText(String.valueOf(amount));
       }}catch(Exception e){
            JOptionPane.showMessageDialog(null, "Invalid input");
             jTextField28.setText(null);
              jTextField34.setText(null);
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        int    v1 = 0 ;  
        int    v2  ;
        int    v3;
        int    v4;
        int    v5;
        int    v6;
        int    v7;
        int    v8;
        int    v9;
        int    v10;
        int    v11;
        int    v12;
        int    v13;
        int    v14;
        int    v15;
        int    v16;
        int    v17;
                
     
             if(jTextField7.getText().equals("")){
           
            jTextField7.setText(null);
             v1 = 0; 
        }else{
               v1 = Integer.parseInt(jTextField7.getText());  
        }
        
       
        if(jTextField8.getText().equals("")){
           
            jTextField8.setText(null);
             v2 = 0;
        }else{
                v2 = Integer.parseInt(jTextField8.getText()) ;
        }
        if(jTextField9.getText().equals("")){
   
            jTextField9.setText(null);
                     v3 = 0;
        }else{
             v3 = Integer.parseInt(jTextField9.getText()) ;  
        }
         if(jTextField10.getText().equals("")){
           
            jTextField10.setText(null);
             v4 = 0;
        }else{
                       
   v4 =  Integer.parseInt(jTextField10.getText());  
         }
          if(jTextField11.getText().equals("")){
         
            jTextField11.setText(null);
               v5 = 0;
        }else{
              v5 =  Integer.parseInt(jTextField11.getText()) ;     
          }
           if(jTextField12.getText().equals("")){
          
            jTextField12.setText(null);
              v6 = 0;
        }else{
                 v6 =   Integer.parseInt(jTextField12.getText()) ;    
           }
            if(jTextField15.getText().equals("")){
          
            jTextField15.setText(null);
              v7 = 0;
        }else{
                   
  v7 =   Integer.parseInt(jTextField15.getText()) ;    
            }
             if(jTextField16.getText().equals("")){
          
            jTextField16.setText(null);
              v8 = 0;
        }else{
                v8 =   Integer.parseInt(jTextField16.getText()) ;     
             }
              if(jTextField18.getText().equals("")){
        
            jTextField18.setText(null);
                v9 = 0;
        }else{
               v9 =   Integer.parseInt(jTextField18.getText()) ;     
              }
               if(jTextField19.getText().equals("")){
      
            jTextField19.setText(null);
                  v10 = 0;
        }else{
                  v10 =  Integer.parseInt(jTextField19.getText()) ;      
               }
                if(jTextField22.getText().equals("")){
        
            jTextField22.setText(null);
                v11 = 0;
        }else{
                v11 =  Integer.parseInt(jTextField22.getText()) ;       
                }
                 if(jTextField29.getText().equals("")){
          
            jTextField29.setText(null);
              v12 = 0;
        }else{
                   v12 =  Integer.parseInt(jTextField29.getText()) ;      
                 }
                  if(jTextField30.getText().equals("")){
           
            jTextField30.setText(null);
             v13 = 0;
        }else{
                       v13 =  Integer.parseInt(jTextField30.getText()) ;   
                  }
                   if(jTextField31.getText().equals("")){
      
            jTextField31.setText(null);
                  v14 = 0;
        }else{
                          v14 =  Integer.parseInt(jTextField31.getText()) ;  
                   }
                    if(jTextField32.getText().equals("")){
          
            jTextField32.setText(null);
              v15 = 0;
        }else{
                         v15 =  Integer.parseInt(jTextField32.getText()) ; 
                    }
                     if(jTextField33.getText().equals("")){
            
            jTextField33.setText(null);
            v16 = 0;
        }else{
                          v16 =  Integer.parseInt(jTextField33.getText()) ; 
                     }
                      if(jTextField34.getText().equals("")){
          
            jTextField34.setText(null);
              v17 = 0;
        }else{
                           v17 =  Integer.parseInt(jTextField34.getText()) ;  
                      }
      
        

        try{
            
                   double total_amount = v1+v2+v3+v4+v5+v6+v7+v8+v9+v10+v11+v12+v13+v14+v15+v16+v17;
                   

                	  
            if(total_amount==0){
           JOptionPane.showMessageDialog(null, "Total amount is 0");
            }else{
         
        jTextField35.setText(String.valueOf(total_amount));
        double customer_cash = 0;
                   try{  
                       String input = JOptionPane.showInputDialog(null,"Please enter customer cash","Customer cash",JOptionPane.INFORMATION_MESSAGE);
        
                      customer_cash = Double.parseDouble(input); 
                  
                     while(total_amount>customer_cash) {
                    	 JOptionPane.showMessageDialog(null, "Customer cash is not enough! Try again");
                    	 String reinput = JOptionPane.showInputDialog(null,"Please enter customer cash","Customer cash",JOptionPane.INFORMATION_MESSAGE);
                         
                         customer_cash = Double.parseDouble(reinput); 
                     }
                      
                     double change = customer_cash  - total_amount;
                     jTextField37.setText(String.valueOf(change));
                     jTextField36.setText(String.valueOf(customer_cash));
                     
          
                     
                     
                     ////
                     
                   
                    
                   	  
            
                     
                     String sql = "insert into  foodorder (orderID,total) values(?,?)";
                     pst=conn.prepareStatement(sql);
                    pst.setString(1, String.valueOf(id));
                     //pst.setString(2, jTextField35.getText());
                    pst.setString(2, String.valueOf(total_amount));
                     
                     
                     
                     
   //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                    
                    try{
                        String sqli = "select orderID from foodorder order by orderID desc limit 1";
                        pst=conn.prepareStatement(sqli);
                        rs=pst.executeQuery();
                        if(rs.next()){
                             last_id = rs.getString("orderID");
                             
                            int getid = Integer.parseInt(last_id);
                            ORDER = getid+1;
                           
                        }else{
                      	  ORDER = 1;
                        }
                    }catch(Exception e){
                        //JOptionPane.showMessageDialog(null, e);
                    }finally{
                        try{
                            pst.close();
                            rs.close();
                        }catch(Exception e){
                            
                        }
                    }

                	
                    	double uprice=125;
                	

                    try{
                    	//////
                      if(jTextField7.getText().equals("")){

                      }else{

                    	
                    	  Class.forName("com.mysql.jdbc.Driver");
              			Connection connn=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1","root","");
              			//,item4,item5,item6,item7,item8,item9,item10,item11,item12,item13,item14,item15,item16
              		 String sqli="insert into ordert (Order_Num,ItemName,Quantity,UPrice,Totprice) values(?,?,?,?,?)";
                       pst=connn.prepareStatement(sqli);
                      pst.setString(1, String.valueOf(ORDER));
                       pst.setString(2, jLabel4.getText());
                       pst.setString(3, jTextField1.getText());
                       pst.setString(4, String.valueOf(uprice));
                       pst.setString(5, String.valueOf(total_amount));
                      // pst.setString(3, jLabel5.getText());
                       //pst.setString(4, jLabel8.getText());
                     // pst.setString(5, jLabel11.getText());
                      // pst.setString(6, jLabel13.getText());
                      //pst.setString(7, jLabel15.getText());
                      //  pst.setString(8, jLabel3.getText());
                      //  pst.setString(9, jLabel22.getText());
                      //  pst.setString(10, jLabel27.getText());
                      //  pst.setString(11, jLabel32.getText());
                      //  pst.setString(12, jLabel33.getText());
                      // pst.setString(13, jLabel36.getText());
                        // pst.setString(14, jLabel38.getText());
                        // pst.setString(15, jCheckBox15.getText());
                        // pst.setString(16, jLabel40.getText());
                         //pst.setString(17, jLabel41.getText());
                       
                       pst.execute();
                                 
                            }
                          }catch(Exception e){
                             // JOptionPane.showMessageDialog(null, e );
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
                    	  
                    

                    	  Class.forName("com.mysql.jdbc.Driver");
              			Connection connn=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1","root","");
              			//,item4,item5,item6,item7,item8,item9,item10,item11,item12,item13,item14,item15,item16
              			 String sqli="insert into ordert (Order_Num,ItemName,Quantity,Totprice) values(?,?,?,?)";
                       pst=connn.prepareStatement(sqli);
                       pst.setString(1, String.valueOf(ORDER));
                       pst.setString(2, jLabel5.getText());
                       pst.setString(3, jTextField2.getText());
                       pst.setString(4, String.valueOf(total_amount));
                       //pst.setString(4, jLabel8.getText());
                     // pst.setString(5, jLabel11.getText());
                      // pst.setString(6, jLabel13.getText());
                      //pst.setString(7, jLabel15.getText());
                      //  pst.setString(8, jLabel3.getText());
                      //  pst.setString(9, jLabel22.getText());
                      //  pst.setString(10, jLabel27.getText());
                      //  pst.setString(11, jLabel32.getText());
                      //  pst.setString(12, jLabel33.getText());
                      // pst.setString(13, jLabel36.getText());
                        // pst.setString(14, jLabel38.getText());
                        // pst.setString(15, jCheckBox15.getText());
                        // pst.setString(16, jLabel40.getText());
                         //pst.setString(17, jLabel41.getText());

                            }
                          }catch(Exception e){
                              //JOptionPane.showMessageDialog(null, e);
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

                    	  Class.forName("com.mysql.jdbc.Driver");
              			Connection connn=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1","root","");
              			//,item4,item5,item6,item7,item8,item9,item10,item11,item12,item13,item14,item15,item16
              			String sqli="insert into ordert (Order_Num,ItemName,Quantity,Totprice) values(?,?,?,?)";
                       pst=connn.prepareStatement(sqli);
                       pst.setString(1, String.valueOf(ORDER));
                       pst.setString(2, jLabel8.getText());
                       pst.setString(3, jTextField3.getText());
                       pst.setString(4, String.valueOf(total_amount));
                       //
                     // pst.setString(5, jLabel11.getText());
                      // pst.setString(6, jLabel13.getText());
                      //pst.setString(7, jLabel15.getText());
                      //  pst.setString(8, jLabel3.getText());
                      //  pst.setString(9, jLabel22.getText());
                      //  pst.setString(10, jLabel27.getText());
                      //  pst.setString(11, jLabel32.getText());
                      //  pst.setString(12, jLabel33.getText());
                      // pst.setString(13, jLabel36.getText());
                        // pst.setString(14, jLabel38.getText());
                        // pst.setString(15, jCheckBox15.getText());
                        // pst.setString(16, jLabel40.getText());
                         //pst.setString(17, jLabel41.getText());

                                   

                            }
                          }catch(Exception e){
                              //JOptionPane.showMessageDialog(null, e);
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

                    	  

                    	  Class.forName("com.mysql.jdbc.Driver");
              			Connection connn=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1","root","");
              			//,item4,item5,item6,item7,item8,item9,item10,item11,item12,item13,item14,item15,item16
              		 String sqli="insert into foodorder (Order_Num,item4,orderID) values(?,?,?)";
                       pst=connn.prepareStatement(sqli);
                       pst.setString(1, String.valueOf(Orderi));
                       pst.setString(2, jLabel11.getText());
                       pst.setString(3, String.valueOf(ORDER));
                       //
                     // 
                      // pst.setString(6, jLabel13.getText());
                      //pst.setString(7, jLabel15.getText());
                      //  pst.setString(8, jLabel3.getText());
                      //  pst.setString(9, jLabel22.getText());
                      //  pst.setString(10, jLabel27.getText());
                      //  pst.setString(11, jLabel32.getText());
                      //  pst.setString(12, jLabel33.getText());
                      // pst.setString(13, jLabel36.getText());
                        // pst.setString(14, jLabel38.getText());
                        // pst.setString(15, jCheckBox15.getText());
                        // pst.setString(16, jLabel40.getText());
                         //pst.setString(17, jLabel41.getText());

                                   

                            }
                          }catch(Exception e){
                              //JOptionPane.showMessageDialog(null, e);
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

                    	  Class.forName("com.mysql.jdbc.Driver");
                			Connection connn=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1","root","");
                			//,item4,item5,item6,item7,item8,item9,item10,item11,item12,item13,item14,item15,item16
                		 String sqli="insert into foodorder (Order_Num,item5,orderID) values(?,?,?)";
                         pst=connn.prepareStatement(sqli);
                         pst.setString(1, String.valueOf(Orderi));
                         pst.setString(2, jLabel13.getText());
                         pst.setString(3, String.valueOf(ORDER));
                         //
                       // 
                        // 
                        //pst.setString(7, jLabel15.getText());
                        //  pst.setString(8, jLabel3.getText());
                        //  pst.setString(9, jLabel22.getText());
                        //  pst.setString(10, jLabel27.getText());
                        //  pst.setString(11, jLabel32.getText());
                        //  pst.setString(12, jLabel33.getText());
                        // pst.setString(13, jLabel36.getText());
                          // pst.setString(14, jLabel38.getText());
                          // pst.setString(15, jCheckBox15.getText());
                          // pst.setString(16, jLabel40.getText());
                           //pst.setString(17, jLabel41.getText());


                            }
                          }catch(Exception e){
                             // JOptionPane.showMessageDialog(null, e);
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
                    	  
                    	 
                    	  Class.forName("com.mysql.jdbc.Driver");
              			Connection connn=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1","root","");
              			//,item4,item5,item6,item7,item8,item9,item10,item11,item12,item13,item14,item15,item16
              		 String sqli="insert into foodorder (Order_Num,item6,orderID) values(?,?,?)";
                       pst=connn.prepareStatement(sqli);
                       pst.setString(1, String.valueOf(Orderi));
                       pst.setString(2, jLabel15.getText());
                       pst.setString(3, String.valueOf(ORDER));
                       //
                     // 
                      // 
                      //
                      //  pst.setString(8, jLabel3.getText());
                      //  pst.setString(9, jLabel22.getText());
                      //  pst.setString(10, jLabel27.getText());
                      //  pst.setString(11, jLabel32.getText());
                      //  pst.setString(12, jLabel33.getText());
                      // pst.setString(13, jLabel36.getText());
                        // pst.setString(14, jLabel38.getText());
                        // pst.setString(15, jCheckBox15.getText());
                        // pst.setString(16, jLabel40.getText());
                         //pst.setString(17, jLabel41.getText());


                            }
                          }catch(Exception e){
                             /// JOptionPane.showMessageDialog(null, e);
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
                    	  
                    	  
                    	  Class.forName("com.mysql.jdbc.Driver");
                			Connection connn=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1","root","");
                			//,item4,item5,item6,item7,item8,item9,item10,item11,item12,item13,item14,item15,item16
                		 String sqli="insert into foodorder (Order_Num,item7,orderID) values(?,?,?)";
                         pst=connn.prepareStatement(sqli);
                         pst.setString(1, String.valueOf(Orderi));
                         pst.setString(2, jLabel3.getText());
                         pst.setString(3, String.valueOf(ORDER));
                         //
                       // 
                        // 
                        //
                        //  pst.setString(8, jLabel3.getText());
                        //  pst.setString(9, jLabel22.getText());
                        //  pst.setString(10, jLabel27.getText());
                        //  pst.setString(11, jLabel32.getText());
                        //  pst.setString(12, jLabel33.getText());
                        // pst.setString(13, jLabel36.getText());
                          // pst.setString(14, jLabel38.getText());
                          // pst.setString(15, jCheckBox15.getText());
                          // pst.setString(16, jLabel40.getText());
                           //pst.setString(17, jLabel41.getText());
                                    

                            }
                          }catch(Exception e){
                             // JOptionPane.showMessageDialog(null, e);
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

                    	  Class.forName("com.mysql.jdbc.Driver");
              			Connection connn=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1","root","");
              			//,item4,item5,item6,item7,item8,item9,item10,item11,item12,item13,item14,item15,item16
              		 String sqli="insert into foodorder (Order_Num,item8,orderID) values(?,?,?)";
                       pst=connn.prepareStatement(sqli);
                       pst.setString(1, String.valueOf(Orderi));
                       pst.setString(2, jLabel3.getText());
                       pst.setString(3, String.valueOf(ORDER));
                       //
                     // 
                      // 
                      //
                      //  
                      //  pst.setString(9, jLabel22.getText());
                      //  pst.setString(10, jLabel27.getText());
                      //  pst.setString(11, jLabel32.getText());
                      //  pst.setString(12, jLabel33.getText());
                      // pst.setString(13, jLabel36.getText());
                        // pst.setString(14, jLabel38.getText());
                        // pst.setString(15, jCheckBox15.getText());
                        // pst.setString(16, jLabel40.getText());
                         //pst.setString(17, jLabel41.getText());
                                    
                            }
                          }catch(Exception e){
                             // JOptionPane.showMessageDialog(null, e);
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

                    	  Class.forName("com.mysql.jdbc.Driver");
                			Connection connn=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1","root","");
                			//,item4,item5,item6,item7,item8,item9,item10,item11,item12,item13,item14,item15,item16
                		 String sqli="insert into foodorder (Order_Num,item9,orderID) values(?,?,?)";
                         pst=connn.prepareStatement(sqli);
                         pst.setString(1, String.valueOf(Orderi));
                         pst.setString(2, jLabel22.getText());
                         pst.setString(3, String.valueOf(ORDER));
                         //
                       // 
                        // 
                        //
                        //  
                        //  
                        //  pst.setString(10, jLabel27.getText());
                        //  pst.setString(11, jLabel32.getText());
                        //  pst.setString(12, jLabel33.getText());
                        // pst.setString(13, jLabel36.getText());
                          // pst.setString(14, jLabel38.getText());
                          // pst.setString(15, jCheckBox15.getText());
                          // pst.setString(16, jLabel40.getText());
                           //pst.setString(17, jLabel41.getText());
                                      
                                   

                            }
                          }catch(Exception e){
                              //JOptionPane.showMessageDialog(null, e);
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
                    	  Class.forName("com.mysql.jdbc.Driver");
                			Connection connn=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1","root","");
                			//,item4,item5,item6,item7,item8,item9,item10,item11,item12,item13,item14,item15,item16
                		 String sqli="insert into foodorder (Order_Num,item10,orderID) values(?,?,?)";
                         pst=connn.prepareStatement(sqli);
                         pst.setString(1, String.valueOf(Orderi));
                         pst.setString(2, jLabel27.getText());
                         pst.setString(3, String.valueOf(ORDER));
                         //
                       // 
                        // 
                        //
                        //  
                        //  
                        //  
                        //  pst.setString(11, jLabel32.getText());
                        //  pst.setString(12, jLabel33.getText());
                        // pst.setString(13, jLabel36.getText());
                          // pst.setString(14, jLabel38.getText());
                          // pst.setString(15, jCheckBox15.getText());
                          // pst.setString(16, jLabel40.getText());
                           //pst.setString(17, jLabel41.getText());
                                 

                            }
                          }catch(Exception e){
                              //JOptionPane.showMessageDialog(null, e);
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

                    	  Class.forName("com.mysql.jdbc.Driver");
              			Connection connn=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1","root","");
              			//,item4,item5,item6,item7,item8,item9,item10,item11,item12,item13,item14,item15,item16
              		 String sqli="insert into foodorder (Order_Num,item11,orderID) values(?,?,?)";
                       pst=connn.prepareStatement(sqli);
                       pst.setString(1, String.valueOf(Orderi));
                       pst.setString(2, jLabel32.getText());
                       pst.setString(3, String.valueOf(ORDER));
                       //
                     // 
                      // 
                      //
                      //  
                      //  
                      //  
                      //  
                      //  pst.setString(12, jLabel33.getText());
                      // pst.setString(13, jLabel36.getText());
                        // pst.setString(14, jLabel38.getText());
                        // pst.setString(15, jCheckBox15.getText());
                        // pst.setString(16, jLabel40.getText());
                         //pst.setString(17, jLabel41.getText());
                               

                            }
                          }catch(Exception e){
                             // JOptionPane.showMessageDialog(null, e);
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


                    	  Class.forName("com.mysql.jdbc.Driver");
              			Connection connn=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1","root","");
              			//,item4,item5,item6,item7,item8,item9,item10,item11,item12,item13,item14,item15,item16
              		 String sqli="insert into foodorder (Order_Num,item12,orderID) values(?,?,?)";
                       pst=connn.prepareStatement(sqli);
                       pst.setString(1, String.valueOf(Orderi));
                       pst.setString(2, jLabel33.getText());
                       pst.setString(3, String.valueOf(ORDER));
                       //
                     // 
                      // 
                      //
                      //  
                      //  
                      //  
                      //  
                      //  
                      // pst.setString(13, jLabel36.getText());
                        // pst.setString(14, jLabel38.getText());
                        // pst.setString(15, jCheckBox15.getText());
                        // pst.setString(16, jLabel40.getText());
                         //pst.setString(17, jLabel41.getText());
                               

                                   
                            }
                          }catch(Exception e){
                              //JOptionPane.showMessageDialog(null, e);
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
                    	  
                    	

                    	  Class.forName("com.mysql.jdbc.Driver");
              			Connection connn=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1","root","");
              			//,item4,item5,item6,item7,item8,item9,item10,item11,item12,item13,item14,item15,item16
              		 String sqli="insert into foodorder (Order_Num,item13,orderID) values(?,?,?)";
                       pst=connn.prepareStatement(sqli);
                       pst.setString(1, String.valueOf(Orderi));
                       pst.setString(2, jLabel36.getText());
                       pst.setString(3, String.valueOf(ORDER));
                       //
                     // 
                      // 
                      //
                      //  
                      //  
                      //  
                      //  
                      //  
                      // pst.setString(13, jLabel36.getText());
                        // pst.setString(14, jLabel38.getText());
                        // pst.setString(15, jCheckBox15.getText());
                        // pst.setString(16, jLabel40.getText());
                         //pst.setString(17, jLabel41.getText());
                               

                                   

                            }
                          }catch(Exception e){
                              //JOptionPane.showMessageDialog(null, e);
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
                    	  
                    	 
                     	  Class.forName("com.mysql.jdbc.Driver");
                			Connection connn=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1","root","");
                			//,item4,item5,item6,item7,item8,item9,item10,item11,item12,item13,item14,item15,item16
                		 String sqli="insert into foodorder (Order_Num,item14,orderID) values(?,?,?)";
                         pst=connn.prepareStatement(sqli);
                         pst.setString(1, String.valueOf(Orderi));
                         pst.setString(2, jLabel36.getText());
                         pst.setString(3, String.valueOf(ORDER));
                         //
                       // 
                        // 
                        //
                        //  
                        //  
                        //  
                        //  
                        //  
                        // 
                          // pst.setString(14, jLabel38.getText());
                          // pst.setString(15, jCheckBox15.getText());
                          // pst.setString(16, jLabel40.getText());
                           //pst.setString(17, jLabel41.getText());
                                 
                                   

                            }
                          }catch(Exception e){
                              //JOptionPane.showMessageDialog(null, e);
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
                    	

                    	  Class.forName("com.mysql.jdbc.Driver");
              			Connection connn=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1","root","");
              			//,item4,item5,item6,item7,item8,item9,item10,item11,item12,item13,item14,item15,item16
              		 String sqli="insert into foodorder (Order_Num,item15,orderID) values(?,?,?)";
                       pst=connn.prepareStatement(sqli);
                       pst.setString(1, String.valueOf(Orderi));
                       pst.setString(2, jLabel38.getText());
                       pst.setString(3, String.valueOf(ORDER));
                       //
                     // 
                      // 
                      //
                      //  
                      //  
                      //  
                      //  
                      //  
                      // 
                        // pst.setString(14, jLabel38.getText());
                        // pst.setString(15, jCheckBox15.getText());
                        // pst.setString(16, jLabel40.getText());
                         //pst.setString(17, jLabel41.getText());
                               
                            }
                          }catch(Exception e){
                              //JOptionPane.showMessageDialog(null, e);
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

                    	  Class.forName("com.mysql.jdbc.Driver");
                			Connection connn=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1","root","");
                			//,item4,item5,item6,item7,item8,item9,item10,item11,item12,item13,item14,item15,item16
                		 String sqli="insert into foodorder (Order_Num,item16,orderID) values(?,?,?)";
                         pst=connn.prepareStatement(sqli);
                         pst.setString(1, String.valueOf(Orderi));
                         pst.setString(2, jCheckBox15.getText());
                         pst.setString(3, String.valueOf(ORDER));
                         //
                       // 
                        // 
                        //
                        //  
                        //  
                        //  
                        //  
                        //  
                        // 
                          // pst.setString(14, jLabel38.getText());
                          // pst.setString(15, jCheckBox15.getText());
                          // pst.setString(16, jLabel40.getText());
                           //pst.setString(17, jLabel41.getText());
                                 

                            }
                          }catch(Exception e){
                              //JOptionPane.showMessageDialog(null, e);
                          }finally{
                        try{
                             pst.close();
                                    rs.close();
                        }catch(Exception e){
                            
                        }
                    }
                     

                	
                      
                    
                    
                    
                    //////////////////////////////////////////////////////////////////////////////////////////////////////////////
                     
                     
                     
                     
                     
                   /*  if(total_amount>customer_cash){
                            JOptionPane.showMessageDialog(null, "Customer cash is not enough! Try again");
                           
                            
                     }else{
                          double change = customer_cash  - total_amount;
            jTextField37.setText(String.valueOf(change));
            jTextField36.setText(String.valueOf(customer_cash));
            
            JOptionPane.showMessageDialog(null, "Total amount "+total_amount+"\n"+"Cash entered "+customer_cash+"\n"+"Total change "+change);
            //
           // String sql = "insert into order (total) values("+total_amount+")";
            //pst=conn.prepareStatement(sql);
            
  
            
            JOptionPane.showMessageDialog(null,"your order is preparing");
                     }*/
           JOptionPane.showMessageDialog(null, "Total amount "+total_amount+"\n"+"Cash entered "+customer_cash+"\n"+"Total change "+change+"\n"+"Order ID = "+ORDER);
                     
                     JOptionPane.showMessageDialog(null,"your order is preparing" );

        get_last_id();
        insert_rice();
        insert_grilled();
        insert_sinigang();
        insert_others();
        insert_drinks();
        insert_items();
        //insertorders();
       clear();
       // print print = new print();
        //print.setVisible(true);
         }catch(Exception e){
                       JOptionPane.showMessageDialog(null, "Invalid Input");
                   }
            }
    
        
        
        }catch(Exception e){
           
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField30ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
    	
       try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
               
                  UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

  
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
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
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
}





  
