import javax.swing.*;


import java.awt.event.*;
import java.awt.*;

public class frame1  {
  
  /*public void Frame1(){
    JFrame frame2 = new JFrame();
    
    frame2.setTitle("Processing");
    frame2.setSize(600,600);
    frame2.getContentPane().setBackground(Color.green);                
    frame2.setLocationRelativeTo(null);
    frame2.setVisible(true);
  }
  */

/* 
class registration {
  static void show(){
    JFrame framein = new JFrame("Registration Form");
    Container c= new Container();
//    c=getContentPane();
    c.setLayout(null);

    JLabel name = new JLabel("Register Yourself");
    name.setFont(new Font("Arial", Font.PLAIN, 20));
    name.setSize(100, 20);
    name.setLocation(100, 100);
    c.add(name);
    JTextField tname = new JTextField();
    tname.setFont(new Font("Arial", Font.PLAIN, 15));
    tname.setSize(190, 20);
    tname.setLocation(200, 100);
    c.add(tname);
    JLabel mno = new JLabel("Mobile");
    mno.setFont(new Font("Arial", Font.PLAIN, 20));
    mno.setSize(100, 20);
    mno.setLocation(100, 150);
    c.add(mno);
    JTextField tmno = new JTextField();
    tmno.setFont(new Font("Arial", Font.PLAIN, 15));
    tmno.setSize(150, 20);
    tmno.setLocation(200, 150);
    c.add(tmno);
    JLabel pass = new JLabel("Password");
    pass.setFont(new Font("Arial", Font.PLAIN, 20));
    pass.setSize(100, 20);
    pass.setLocation(100, 150);
    c.add(pass);
    JPasswordField password = new JPasswordField();
    password.setFont(new Font("Arial", Font.PLAIN, 15));
    password.setSize(150, 20);
    password.setLocation(200, 150);
    c.add(password);

    framein.setBounds(300, 90, 900, 600);
    framein.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    framein.setVisible(true);
  }
}
*/

     public void loginframe(){
     

  // Create frame 
          JFrame frame= new JFrame();
          frame.setLayout(new BorderLayout());
          frame.setTitle("CMS");

          JPanel headingPanel = new JPanel();
          JLabel headingLabel = new JLabel("COURIER MANAGEMENT SYSTEM");
          headingPanel.setBackground(Color.BLACK);
          headingLabel.setForeground(Color.PINK);
          
          headingLabel.setFont(new Font("Arial Black", Font.ITALIC,26));
          headingPanel.add(headingLabel);


          JPanel panel = new JPanel(new GridBagLayout());
          
         // Constraints for the layout
         GridBagConstraints constr = new GridBagConstraints();
         constr.insets = new Insets(10, 10, 10, 10);
         constr.anchor = GridBagConstraints.WEST;

         constr.gridx=0;
         constr.gridy=0;

         JLabel nameLabel      = new JLabel("Mobile Number :");
         nameLabel.setForeground(Color.BLACK);
         JLabel phoneLabel     = new JLabel("Password          :");
         phoneLabel.setForeground(Color.BLACK);
         JTextField mbNofField           = new JTextField(20);
         JPasswordField passField         = new JPasswordField(20);
         passField.setEchoChar('*');
         panel.add(nameLabel, constr);
         constr.gridx=1;
         panel.add(mbNofField, constr);
         constr.gridx=0; constr.gridy=1;
         panel.add(phoneLabel, constr);
         constr.gridx=1;
         panel.add(passField, constr);
         constr.gridx=0; constr.gridy=3;
         constr.gridwidth = 3;
         constr.anchor = GridBagConstraints.CENTER; 

// Button with text "Register"
      JButton button = new JButton("Login");
      button.setForeground(Color.BLACK);
      button.setBackground(new Color(128, 50, 251));
      JButton register = new JButton("Register");
      register.setForeground(Color.BLACK);
      register.setBackground(new Color(128, 50, 251));

// add a listener to button
      button.addActionListener(new ActionListener()
      {
          public void actionPerformed(ActionEvent e)
        {
              String moblieNumber = mbNofField.getText();
              char[] password = passField.getPassword();
              String pw1 = new String(password);
                if(moblieNumber.length() != 10  || pw1.length() != 8){
                    JOptionPane.showMessageDialog(null, "Invalid Mobile Number and Password", "Warning", JOptionPane.WARNING_MESSAGE);
                    mbNofField.setText("");
                    passField.setText("");
                }else{
                  frame.dispose();
                   frame2 mframe = new frame2();
                   mframe.Secondframe();
                   }
       }

         
      });
      register.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
          frame.dispose();
          frame1in register = new frame1in();
          register.show();
        }
      });
   
     

JPanel thirdPanel = new JPanel();
thirdPanel.setLayout(new FlowLayout());
thirdPanel.add(button);
thirdPanel.add(register);
//panel.add(button, constr);
//panel.add(register,constr);
frame.add(headingPanel,BorderLayout.NORTH);
frame.add(panel, BorderLayout.CENTER);
frame.add(thirdPanel,BorderLayout.SOUTH);
frame.setSize(500, 300);
frame.setLocationRelativeTo(null);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
}


public static void main(String[] args){
  frame1 f11 = new frame1();
  f11.loginframe();
   
  /*
  frame2 f1 = new frame2();

  // Create frame 
          JFrame frame= new JFrame();
          frame.setLayout(new BorderLayout());
          frame.setTitle("CMS");

          JPanel headingPanel = new JPanel();
          JLabel headingLabel = new JLabel("COURIER MANAGEMENT SYSTEM");
          headingPanel.setBackground(Color.BLACK);
          headingLabel.setForeground(Color.PINK);
          
          headingLabel.setFont(new Font("Arial Black", Font.ITALIC,26));
          headingPanel.add(headingLabel);


          JPanel panel = new JPanel(new GridBagLayout());
          
         // Constraints for the layout
         GridBagConstraints constr = new GridBagConstraints();
         constr.insets = new Insets(10, 10, 10, 10);
         constr.anchor = GridBagConstraints.WEST;

         constr.gridx=0;
         constr.gridy=0;

         JLabel nameLabel      = new JLabel("Mobile Number :");
         nameLabel.setForeground(Color.BLACK);
         JLabel phoneLabel     = new JLabel("Password          :");
         phoneLabel.setForeground(Color.BLACK);
         JTextField mbNofField           = new JTextField(20);
         JPasswordField passField         = new JPasswordField(20);
         passField.setEchoChar('*');
         panel.add(nameLabel, constr);
         constr.gridx=1;
         panel.add(mbNofField, constr);
         constr.gridx=0; constr.gridy=1;
         panel.add(phoneLabel, constr);
         constr.gridx=1;
         panel.add(passField, constr);
         constr.gridx=0; constr.gridy=3;
         constr.gridwidth = 3;
         constr.anchor = GridBagConstraints.CENTER; 

// Button with text "Register"
      JButton button = new JButton("Login");
      button.setForeground(Color.BLACK);
      button.setBackground(new Color(128, 50, 251));
      JButton register = new JButton("Register");
      register.setForeground(Color.BLACK);
      register.setBackground(new Color(128, 50, 251));

// add a listener to button
      button.addActionListener(new ActionListener()
      {
          public void actionPerformed(ActionEvent e)
        {
              String moblieNumber = mbNofField.getText();
              char[] password = passField.getPassword();
              String pw1 = new String(password);
                if(moblieNumber.length() != 10  || pw1.length() != 8){
                    JOptionPane.showMessageDialog(null, "Invalid Mobile Number and Password", "Warning", JOptionPane.WARNING_MESSAGE);
                    mbNofField.setText("");
                    passField.setText("");
                }else{
                   f1.Secondframe(); 
                   }
       }

         
      });
      register.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
          
        }
      });
   
     

JPanel thirdPanel = new JPanel();
thirdPanel.setLayout(new FlowLayout());
thirdPanel.add(button);
thirdPanel.add(register);
//panel.add(button, constr);
//panel.add(register,constr);
frame.add(headingPanel,BorderLayout.NORTH);
frame.add(panel, BorderLayout.CENTER);
frame.add(thirdPanel,BorderLayout.SOUTH);
frame.setSize(500, 300);
frame.setLocationRelativeTo(null);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
*/
}
}

