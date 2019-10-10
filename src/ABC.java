import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
    
class ABC extends JFrame{
       
      public static void main(String args[]){
        JFrame gui=new JFrame();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.setSize(200,200);
        
        Container c=gui.getContentPane();
        c.setLayout(null);
        
        JLabel label=new JLabel("EName:");
        label.setBounds(70, 50, 140, 30);
        c.add(label);
        
        JTextField tf1=new JTextField();
        tf1.setBounds(120, 50, 140, 30);
        c.add(tf1);
        
        JLabel label1=new JLabel("Sex.: ");
        label1.setBounds(70, 90, 140, 30);
        c.add(label1);
        
        JRadioButton cb21=new JRadioButton("M");
        cb21.setBounds(120,90,60,30);
         ButtonGroup bg=new ButtonGroup();
         c.add(cb21);
        bg.add(cb21);
        
         JRadioButton jr1=new JRadioButton("F");
         jr1.setBounds(180,90,60,30);
        c.add(jr1);
         bg.add(jr1);
     
        
         JLabel label3=new JLabel("Address ");
        label3.setBounds(70, 130, 140, 30);
        c.add(label3);
        
        
        JTextField tf2=new JTextField();
        tf2.setBounds(120, 130, 160, 30);
        c.add(tf2);
        
        
         JLabel label6=new JLabel("District: ");
        label6.setBounds(70, 180, 140, 30);
        c.add(label6);
        
        
        JTextField tf3=new JTextField();
        tf3.setBounds(120, 180, 160, 30);
        c.add(tf3);
        
            JLabel label7=new JLabel("PIN: ");
        label7.setBounds(70, 230, 140, 30);
        c.add(label7);
        
        
        JTextField tf4=new JTextField();
        tf4.setBounds(120, 230, 160, 30);
        c.add(tf4);
        
        
     
        
         JLabel label5=new JLabel("EmpId:");
        label5.setBounds(300, 50, 140, 30);
        c.add(label5);
        
         JTextField tf5=new JTextField();
        tf5.setBounds(340, 50, 140, 30);
        c.add(tf5);
        
        
          JLabel label8=new JLabel("Ph.No");
        label8.setBounds(300, 90, 140, 30);
        c.add(label8);
        
         JTextField tf6=new JTextField();
        tf6.setBounds(340, 90, 140, 30);
        c.add(tf6);
        
           JLabel label9=new JLabel("Age");
        label9.setBounds(300, 130, 140, 30);
        c.add(label9);
        
         JTextField tf7=new JTextField();
        tf7.setBounds(340, 130, 140, 30);
        c.add(tf7);
        
          JLabel label10=new JLabel("Salary:");
        label10.setBounds(300, 180, 140, 30);
        c.add(label10);
        
         JTextField tf8=new JTextField();
        tf8.setBounds(340, 180, 140, 30);
        c.add(tf8);
        
        
           JLabel label11=new JLabel("Religion");
        label11.setBounds(290, 230, 140, 30);
        c.add(label11);
        
         JTextField tf9=new JTextField();
        tf9.setBounds(340, 230, 140, 30);
        c.add(tf9);
        
         

         
         
         JButton submit=new JButton("Submit");
         submit.setBounds(190,300,80,30);
         c.add(submit);
        
         JButton Retrive=new JButton("Retrive");
         Retrive.setBounds(320,300,80,30);
         c.add(Retrive);
         
        
        submit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                   Connection con=null;
                   String N=tf1.getText();
                   String A=tf2.getText();
                   String D=tf3.getText();
                   String P=tf4.getText();
                   String I=tf5.getText();
                   String Ph=tf6.getText();
                   String Ag=tf7.getText();
                   String S=tf8.getText();
                   String R=tf9.getText();
           try{
          Class.forName("com.mysql.cj.jdbc.Driver");
          System.out.println("Driver loaded");
          con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employe","root","");
          Statement stmt=con.createStatement();
          stmt.executeUpdate("insert into emp(Ename,Address,District,Pin,Empid,PhNo,Age,Salary,Religion)values('"+N+"','"+A+"','"+D+"','"+P+"','"+I+"','"+Ph+"','"+Ag+"','"+S+"','"+R+"')");
          
            tf1.setText("");  
            tf2.setText("");  
            tf3.setText("");  
            tf4.setText("");  
            tf5.setText("");  
            tf6.setText("");  
            tf7.setText("");  
            tf8.setText("");
            tf9.setText("");
            
           }
           catch(ClassNotFoundException z){
          System.out.println("Exception "+z.getMessage());
      }
      catch(SQLException z){
          System.out.println("sql Exception: "+z.getMessage());
      }
      try{
          con.close();     
      
      }
      catch(SQLException l){
          System.out.println("sql Exception"+l.getMessage());
      }
            }
        
        });
       
      }
}