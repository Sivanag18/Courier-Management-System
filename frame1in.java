import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

 public class frame1in {
    public void show(){
      JFrame framein = new JFrame("Registration Form");
      Container c= new Container();
      c.setBackground(Color.ORANGE);
      //c=getContentPane();
      c.setLayout(null);
  
      JLabel name = new JLabel("Register Yourself");
      name.setFont(new Font("SansSerif", Font.PLAIN, 20));
      name.setForeground(Color.MAGENTA);
      name.setSize(300, 30);
      name.setLocation(130, 30);
      c.add(name);
      JLabel  l1 = new JLabel("Name");
      l1.setFont(new Font("SansSerif", Font.PLAIN, 20));
      l1.setSize(150, 20);
      l1.setLocation(100, 100);
      c.add(l1);
      JTextField tname = new JTextField();
      tname.setFont(new Font("SansSerif", Font.PLAIN, 15));
      tname.setSize(150, 20);
      tname.setLocation(200, 100);
      c.add(tname);
      JLabel mno = new JLabel("Mobile");
      mno.setFont(new Font("SansSerif", Font.PLAIN, 20));
      mno.setSize(100, 20);
      mno.setLocation(100, 150);
      c.add(mno);
      JTextField tmno = new JTextField();
      tmno.setFont(new Font("SansSerif", Font.PLAIN, 15));
      tmno.setSize(150, 20);
      tmno.setLocation(200, 150);
      c.add(tmno);
      JLabel pass = new JLabel("Password");
      pass.setFont(new Font("SansSerif", Font.PLAIN, 20));
      pass.setSize(100, 20);
      pass.setLocation(100, 200);
      c.add(pass);
      JPasswordField password = new JPasswordField();
      password.setFont(new Font("SansSerif", Font.PLAIN, 15));
      password.setSize(150, 20);
      password.setLocation(200, 200);
      c.add(password);
     
      JButton sub = new JButton("Submit");
      sub.setBackground(new Color(0, 102, 51));
      sub.setFont(new Font("SansSerif", 1, 18)); 
      sub.setForeground(new Color(255, 255, 255));
      sub.setSize(100, 20);
      sub.setLocation(150, 250);
      c.add(sub);
      /* 
      JButton back = new JButton("Back");
      back.setBackground(new Color(0, 102, 51));
      back.setFont(new Font("SansSerif", 1, 18)); 
      back.setForeground(new Color(255, 255, 255));
      back.setSize(100, 20);
      back.setLocation(250, 250);
      c.add(back);
      */
      sub.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
         String name = tname.getText();
         char[] pwd2 = password.getPassword();
         String regpass = new String(pwd2);
         String mno = tmno.getText();
         if(name.equals("") || regpass.equals("")||mno.equals("")){
          JOptionPane.showMessageDialog(null, "All Fields are Required", "Warning", JOptionPane.WARNING_MESSAGE);
          tname.setText("");
          password.setText("");
          tmno.setText("");
         }else if(mno.length() != 10){
          JOptionPane.showMessageDialog(null, "Mobile Number should be in 10 digits", "Warning", JOptionPane.WARNING_MESSAGE);
          tmno.setText("");
         }else if(regpass.length() != 8 || !(regpass.contains("@") || regpass.contains("#"))){
          JOptionPane.showMessageDialog(null, "Password Contains 8 charcters with @ and #", "Warning", JOptionPane.WARNING_MESSAGE);
          password.setText("");
         }else {
            
          framein.dispose();
          frame1 lgframe = new frame1();
          lgframe.loginframe();
         }
         }
        }
      );

     /*  back.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
          framein.dispose();
          frame1 lgframe = new frame1();
          lgframe.loginframe();
        }
      });
      */
      framein.add(c);
      framein.setSize(500,400);
      framein.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      framein.setVisible(true);
      framein.setLocationRelativeTo(null);
    }
   
    public static void main(String[] args) {
       // show();
    }
  }
