import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.*;


public class frame2{
  
    static JFrame frame2;
    static JPanel panel1, panel2, panel3, panel4,panel5;
    public void Secondframe(){
      frame2 = new JFrame();
      frame2.setLayout(new BorderLayout());
      
   JPanel panel1 = new JPanel();                       // top panel
   panel1.setBackground(new Color(255, 153, 0));
   
   JLabel headingl = new JLabel();
   headingl.setText("WELCOME TO COURIER MANAGEMENT SYSTEM \t KINDLY USE IT");
   headingl.setFont(new Font(null,Font.LAYOUT_LEFT_TO_RIGHT,25));
   headingl.setBackground(Color.RED);
   panel1.add(headingl);


   JPanel panel2 = new JPanel();
  

  
 

   JPanel panel3 = new JPanel();
   panel3.setBackground(Color.PINK);
   JLabel label = new JLabel("   Transfer Your Products ");
   label.setFont(new Font("SansSerif", 1, 16)); 
   label.setForeground(new Color(153, 0, 0));
  JLabel space = new JLabel();
  space.setFont(new Font("SansSerif", 1, 16)); 
 space.setForeground(new Color(153, 0, 0));

   JLabel label1 = new JLabel();
   label1.setFont(new Font("SansSerif", 1, 13));
   label1.setForeground(Color.BLACK);
   label1.setText("NAME OF THE CUSTOMER :");

  JTextField tname = new JTextField(10);
  
 
  
  
   JLabel label2 = new JLabel();
   label2.setFont(new Font("SansSerif", 1, 13));
   label2.setText("NAME OF THE PRODUCT :");
   label2.setForeground(Color.BLACK);

   JTextField tpname = new JTextField(10);

   JLabel label3 = new JLabel();
   label3.setFont(new Font("SansSerif", 1, 13));
   label3.setForeground(Color.BLACK);
   label3.setText("PICK-UP ADDRESS :");
   JTextField tdesign = new JTextField(10);

   JLabel label4 = new JLabel();
   label4.setFont(new Font("SansSerif", 1, 13));
   label4.setForeground(Color.BLACK);
   label4.setText("PICK-UP LOCALITY :");
   JTextField tcode = new JTextField(20);

   JLabel labe = new JLabel();
   labe.setFont(new Font("SansSerif", 1, 13));
   labe.setForeground(Color.BLACK);
   labe.setText("PINCODE :");
   JTextField tlocal = new JTextField();
  
 
   panel3.setLayout(new GridLayout(6, 2));
   panel3.add(label);
   panel3.add(space);
 
   panel3.add(label1);
   panel3.add(tname);

   panel3.add(label2);
   panel3.add(tpname);

   panel3.add(label3);
   panel3.add(tdesign);

   panel3.add(label4);
   panel3.add(tcode);

   panel3.add(labe);
   panel3.add(tlocal);

   JLabel space1 = new JLabel();
   JLabel space2 = new JLabel();
   JLabel label5 = new JLabel();
   label5.setFont(new Font("SansSerif", 1, 13));
   label5.setForeground(Color.BLACK);
   label5.setText("NAME OF THE RECIPIENT :");
   JTextField tcity = new JTextField(20);

  JLabel label6 = new JLabel();
  label6.setFont(new Font("SansSerif", 1, 13));
  label6.setForeground(Color.BLACK);
  label6.setText("DESTINATION STATE :");
  
  String states[] = {"Andhra Pradesh", "Arunachal Pradesh", "Assam Bihar", "Chhattisgarh", "Goa", "Gujarat", "Haryana", "Himachal Pradesh", 
   "Jammu and Kashmir Srinagar", "Jharkhand", "Karnataka", "Kerala", "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya", "Mizoram", "Nagaland",
  "Odisha", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", "Telangana", "Tripura", "Uttar Pradesh", "Uttarakhand",	"West Bengal"};
  
  JComboBox cb = new JComboBox(states);


  JLabel label7 = new JLabel();
  label7.setFont(new Font("SansSerif", 1, 13));
  label7.setForeground(Color.BLACK);
  label7.setText("RECIPIENT PHONE NUMBER :");
  JTextField tproduct = new JTextField(20);

  JLabel label8 = new JLabel();
  label8.setFont(new Font("SansSerif", 1, 13));
  label8.setForeground(Color.BLACK);
  label8.setText("RECIPIENT ADDRESS :");
  JTextField trecept = new JTextField(20);

  JLabel label9 = new JLabel();
  label9.setFont(new Font("SansSerif", 1, 13));
  label9.setForeground(Color.BLACK);
  label9.setText("RECIPIENT PINCODE :");
  JTextField tpincode = new JTextField();



  JPanel panel4 = new JPanel();
  panel4.setBackground(Color.PINK);
   panel4.setLayout(new GridLayout(6,0));  
   panel4.add(space1);
   panel4.add(space2);
   panel4.add(label5);
   panel4.add(tcity);

   panel4.add(label7);
   panel4.add(tproduct);

   panel4.add(label8);
   panel4.add(trecept);

   panel4.add(label9);
   panel4.add(tpincode);

   panel4.add(label6);
   panel4.add(cb);
   
   panel2.setLayout(new GridLayout(1, 2));
   panel2.add(panel3,BorderLayout.WEST);
   panel2.add(panel4,BorderLayout.EAST);
   panel2.setBackground(new Color(102, 204, 255));
   
  JButton b1 = new JButton("ORDER");
   b1.setFont(new Font(null, Font.BOLD, 30));
    
   b1.addActionListener(new ActionListener() {
     public void actionPerformed(ActionEvent e)
     {
        String in_name = tname.getText();
        String P_name = tpname.getText();
        String A_name = tdesign.getText();
        String L_name = tcode.getText();
        String P_code  = tlocal.getText();
        String R_name = tcity.getText();
        String P_num = tproduct.getText();
        String  R_Address = trecept.getText();
        String R_code = tpincode.getText();
       String str= (String)cb.getSelectedItem(); 
        
      

       if(in_name.equals("")|| P_name.equals("")||A_name.equals("")||L_name.equals("")||P_code.equals("")||R_name.equals("")||
           P_num.equals("")||R_code.equals("")||R_Address.equals("")){
         JOptionPane.showMessageDialog(null," All fields are Required", "warning",JOptionPane.WARNING_MESSAGE);
       }else if ( P_num.length() != 10 ){
         JOptionPane.showMessageDialog(null, "Mobile Number should be 10 digits", "warning", JOptionPane.WARNING_MESSAGE );
       }else if(P_code.length() != 6 || R_code.length() != 6){
         JOptionPane.showMessageDialog(null, "Pincode Number should be 6 digits", "warning", JOptionPane.WARNING_MESSAGE );
       }else{
        frame2.dispose();
        JFrame inframe = new JFrame();

JPanel toppapnel = new JPanel();
toppapnel.setBackground(new Color(255, 153, 0));

JLabel thanks = new JLabel();
thanks.setForeground(Color.BLACK);
thanks.setFont(new Font("Book Antiqua",2,36));
thanks.setText("Thanks for choosing us.😌😌");
toppapnel.add(thanks);

JPanel inpanel2 = new JPanel();


JButton confirm = new JButton();
confirm.setBackground(new java.awt.Color(0, 102, 51));
confirm.setFont(new java.awt.Font("SansSerif", 1, 18)); 
confirm.setForeground(new java.awt.Color(255, 255, 255));
confirm.setText("CONFIRM");
inpanel2.add(confirm);
confirm.addActionListener(new ActionListener() {
  public void actionPerformed(ActionEvent e){
    ImageIcon tick = new ImageIcon("tick.png");
    JOptionPane.showOptionDialog(null, "Order Confirmed", "Confirmation", JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE, tick, null, 0);
  }
});
JButton back = new JButton();
back.setBackground(new java.awt.Color(0, 102, 51));
back.setFont(new java.awt.Font("SansSerif", 1, 18)); 
back.setForeground(new java.awt.Color(255, 255, 255));
back.setText("BACK");
inpanel2.add(back);

back.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e){
        inframe.dispose();
        frame2 mainframe = new frame2();
        mainframe.Secondframe();
    }
});
Container  regorder =  new Container();
regorder.setBackground(Color.GRAY);
int id = ThreadLocalRandom.current().nextInt();  
String data = "Order Id : #"+id ; 

JLabel line1st = new JLabel(data);
line1st.setFont(new Font("SansSerif", Font.PLAIN, 20));
line1st.setForeground(Color.MAGENTA);
line1st.setSize(600, 30);
line1st.setLocation(60, 20);
regorder.add(line1st);

String data2 = "Dear"+  in_name+",";
JLabel  line2nd = new JLabel(data2);
line2nd .setFont(new Font("SansSerif", Font.PLAIN, 20));
line2nd .setSize(150, 20);
line2nd .setLocation(60, 50);
regorder.add(line2nd );
JLabel  line3rd = new JLabel("Your Product "+P_name+" will transer to" + R_name+ "within 5 Days.");
line3rd .setFont(new Font("SansSerif", Font.PLAIN, 20));
line3rd .setSize(1000, 20);
line3rd .setLocation(60, 80);
regorder.add(line3rd );
JLabel  line4th = new JLabel("From : ");
line4th .setFont(new Font("SansSerif", Font.PLAIN, 20));
line4th .setSize(150, 20);
line4th .setLocation(60, 105);
regorder.add(line4th);

JLabel  line5th = new JLabel(A_name+",");
line5th .setFont(new Font("SansSerif", Font.PLAIN, 20));
line5th .setSize(150, 20);
line5th .setLocation(60, 130);
regorder.add(line5th);
JLabel  line6th = new JLabel(L_name+",");
line6th .setFont(new Font("SansSerif", Font.PLAIN, 20));
line6th .setSize(150, 20);
line6th .setLocation(60, 155);
regorder.add(line6th);
JLabel  line7th = new JLabel(P_code+".");
line7th .setFont(new Font("SansSerif", Font.PLAIN, 20));
line7th .setSize(150, 20);
line7th .setLocation(60, 180);
regorder.add(line7th);
JLabel  line8th = new JLabel("To : ");
line8th .setFont(new Font("SansSerif", Font.PLAIN, 20));
line8th .setSize(150, 20);
line8th .setLocation(350, 105);
regorder.add(line8th);
JLabel  line9th = new JLabel(R_Address+",");
line9th .setFont(new Font("SansSerif", Font.PLAIN, 20));
line9th .setSize(150, 20);
line9th .setLocation(350, 130);
regorder.add(line9th);
JLabel  line10th = new JLabel(P_num + ",");
line10th .setFont(new Font("SansSerif", Font.PLAIN, 20));
line10th .setSize(150, 20);
line10th .setLocation(350, 155);
regorder.add(line10th);
JLabel  line11th = new JLabel(R_code +" ,"+str);
line11th .setFont(new Font("SansSerif", Font.PLAIN, 20));
line11th .setSize(500, 20);
line11th .setLocation(350, 180);
regorder.add(line11th);



regorder.setSize(200, 200);
regorder.setLayout(null);

inframe.add(toppapnel,BorderLayout.NORTH);
inframe.add(regorder,BorderLayout.CENTER);
inframe.add(inpanel2,BorderLayout.SOUTH);
inframe.setSize(800, 500);
inframe.setLocationRelativeTo(null);
inframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
inframe.setVisible(true);
    }
       
  }
}  
  );


   JButton b2 = new JButton("CLEAR");
   b2.setFont(new Font(null, Font.BOLD, 30));
   b2.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e){
      tname.setText(" ");
      tcity.setText(" ");
      tcode.setText(" ");
      tpincode.setText("");
      tdesign.setText(" ");
      tlocal.setText(" ");
      tpname.setText(" ");
      trecept.setText(" ");
    }
   });

   JPanel panel5 = new JPanel();

   panel5.setLayout(new FlowLayout(FlowLayout.CENTER));
   panel5.add(b1);
   panel5.add(b2);
   
   frame2.add(panel1,BorderLayout.NORTH);
   frame2.add(panel2,BorderLayout.CENTER);
   frame2.add(panel5,BorderLayout.SOUTH);

   frame2.setTitle("Processing");
   frame2.setSize(800,600);
   frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
   frame2.setLocationRelativeTo(null);
   frame2.setVisible(true);

}
    

public static void main(String[] args) {

     frame2 s2 = new frame2();
     s2.Secondframe();
     
  
}
}
