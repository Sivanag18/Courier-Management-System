import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.*;

 public class frame2in {    
    public static  void frame3(){

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

JButton back = new JButton();
back.setBackground(new java.awt.Color(0, 102, 51));
back.setFont(new java.awt.Font("SansSerif", 1, 18)); 
back.setForeground(new java.awt.Color(255, 255, 255));
back.setText("BACK");
inpanel2.add(back);
confirm.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e){
      ImageIcon tick = new ImageIcon("tick.png");
      JOptionPane.showOptionDialog(null, "Order Confirmed", "Confirmation", JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE, tick, null, 0);
    }
  });

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

String data2 = "Dear"+"in_name"+",";
JLabel  line2nd = new JLabel(data2);
line2nd .setFont(new Font("SansSerif", Font.PLAIN, 20));
line2nd .setSize(150, 20);
line2nd .setLocation(60, 50);
regorder.add(line2nd );
JLabel  line3rd = new JLabel("Your Product +P_name+ will transer to + R_name + within 5 Days");
line3rd .setFont(new Font("SansSerif", Font.PLAIN, 20));
line3rd .setSize(1000, 20);
line3rd .setLocation(60, 80);
regorder.add(line3rd );
JLabel  line4th = new JLabel("From : ");
line4th .setFont(new Font("SansSerif", Font.PLAIN, 20));
line4th .setSize(150, 20);
line4th .setLocation(60, 105);
regorder.add(line4th);

JLabel  line5th = new JLabel("A_name,");
line5th .setFont(new Font("SansSerif", Font.PLAIN, 20));
line5th .setSize(150, 20);
line5th .setLocation(60, 130);
regorder.add(line5th);
JLabel  line6th = new JLabel("L_name, ");
line6th .setFont(new Font("SansSerif", Font.PLAIN, 20));
line6th .setSize(150, 20);
line6th .setLocation(60, 155);
regorder.add(line6th);
JLabel  line7th = new JLabel("P_code+.");
line7th .setFont(new Font("SansSerif", Font.PLAIN, 20));
line7th .setSize(150, 20);
line7th .setLocation(60, 180);
regorder.add(line7th);
JLabel  line8th = new JLabel("To : ");
line8th .setFont(new Font("SansSerif", Font.PLAIN, 20));
line8th .setSize(150, 20);
line8th .setLocation(350, 105);
regorder.add(line8th);
JLabel  line9th = new JLabel("R_Address+, ");
line9th .setFont(new Font("SansSerif", Font.PLAIN, 20));
line9th .setSize(150, 20);
line9th .setLocation(350, 130);
regorder.add(line9th);
JLabel  line10th = new JLabel("R_num+, ");
line10th .setFont(new Font("SansSerif", Font.PLAIN, 20));
line10th .setSize(150, 20);
line10th .setLocation(350, 155);
regorder.add(line10th);
JLabel  line11th = new JLabel("R_code + , + cb +.");
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
public static void main(String[] args) {
  frame3();
}
 }
