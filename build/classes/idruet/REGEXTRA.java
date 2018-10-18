package idruet;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class REGEXTRA extends JFrame{
    
    JLabel motto = new JLabel("Heven's Light is Our Guide");
    JLabel heading = new JLabel("Rajshahi University of");
    JLabel heading2 = new JLabel("Engineering & Technology");
    JLabel leading = new JLabel("© Department of Computer Science & Engineering, RUET, Kazla, Rajshahi-6204");
    JLabel web = new JLabel("Website:");
    JLabel website = new JLabel("www.ruet.ac.bd/department/CSE");
    JLabel mail = new JLabel("Email:");
    JLabel email = new JLabel("cse@ruet.ac.bd");
    
    JLabel header = new JLabel("Students Registration:");
    JLabel hall = new JLabel("Hall Name:");
    JLabel room = new JLabel("Room No:");
    JLabel sequrity = new JLabel("Security Question:");
    JLabel s_q = new JLabel("*What is your favourite teacher's name:");
 
    JTextField r = new JTextField();
    JTextField s = new JTextField();

    String hall_name[] = {"Select:", "Shahid Lt. Selim Hall", "Shahid Shahidul Islam Hall", "Shahid Abdul Hamid Hall",
                        "Tin Shed Hall(Shahid Sahidul Islam Hall)", "Deshratna Sheik Hasina Hall",
                        "Shahid President Ziaur Rahman Hall", "Bongobondhu Hall"};

    JComboBox h = new JComboBox(hall_name);
    
    JButton next = new JButton("Next");
    
    ImageIcon image = new ImageIcon("image/ruet.png");
    
    REGEXTRA()
    {
        setSize(600, 500);
        setTitle("Login Form");
        setVisible(true);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
 
        motto.setBounds(270, 10, 200, 20);
        motto.setForeground(Color.red);
        motto.setFont(new Font("Times", Font.ITALIC, 11));
        
        heading.setBounds(230, 35, 250, 25);
        heading.setForeground(Color.blue);
        heading.setFont(new Font("Times", Font.BOLD, 20));
        
        heading2.setBounds(205, 60, 250, 25);
        heading2.setForeground(Color.blue);
        heading2.setFont(new Font("Times", Font.BOLD, 20));
        
        add(motto);
        add(heading);
        add(heading2);
        add(new JLabel(image)).setBounds(25, 10, 110, 119);
        header.setBounds(90, 140, 400, 30);
        header.setFont(new Font("Times", Font.BOLD, 20));
        add(header);
        
        hall.setBounds(90, 180, 250, 20);
        room.setBounds(90, 205, 250, 20);

        sequrity.setBounds(90, 240, 250, 20);
        sequrity.setFont(new Font("Times", Font.BOLD, 20));
        add(sequrity);
        s_q.setBounds(90, 280, 250, 20);
        h.setBounds(250, 180, 250, 20);
        r.setBounds(250, 205, 250, 20);
        s.setBounds(320, 280, 180, 20);
        add(hall);
        add(room);
        add(s_q);
        add(h);
        add(r);
        add(s);
        next.setBounds(430, 320, 70, 30);
        add(next);
        
        leading.setBounds(25, 360, 600, 20);
        leading.setFont(new Font("Times", Font.PLAIN, 15));
        web.setBounds(25, 380, 300, 20);
        web.setFont(new Font("Times", Font.PLAIN, 15));
        website.setForeground(Color.blue);
        website.setBounds(100, 380, 300, 20);
        website.setFont(new Font("Times", Font.PLAIN, 15));
        mail.setBounds(25, 400, 300, 20);
        mail.setFont(new Font("Times", Font.PLAIN, 15));
        email.setForeground(Color.blue);
        email.setBounds(100, 400, 300, 20);
        email.setFont(new Font("Times", Font.PLAIN, 15));
        
        add(leading);
        add(web);
        add(website);
        add(mail);
        add(email);
        
        RegOneActionListener();
    }
    
    private void RegOneActionListener() {
        
        next.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
  
            IDRUET.myHall = (String) h.getSelectedItem();
            IDRUET.myRoom = r.getText();
            IDRUET.mySQues = s.getText();
                
            setVisible(false);
            new REGTHREE().setVisible(true);
        }
        });
    }
}
