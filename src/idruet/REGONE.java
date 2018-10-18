package idruet;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class REGONE extends JFrame{
    
    JLabel motto = new JLabel("Heven's Light is Our Guide");
    JLabel heading = new JLabel("Rajshahi University of");
    JLabel heading2 = new JLabel("Engineering & Technology");
    JLabel leading = new JLabel("© Department of Computer Science & Engineering, RUET, Kazla, Rajshahi-6204");
    JLabel web = new JLabel("Website:");
    JLabel website = new JLabel("www.ruet.ac.bd/department/CSE");
    JLabel mail = new JLabel("Email:");
    JLabel email = new JLabel("cse@ruet.ac.bd");
    JLabel header = new JLabel("Students Registration:");
    JLabel roll = new JLabel("*Roll No:");
    JLabel name = new JLabel("*Name:");
    JLabel mobile = new JLabel("*Mobile No:");
    JLabel e_mail = new JLabel("  Email:");
    JLabel pass = new JLabel("*Password:");
    
    JTextField n = new JTextField();
    JTextField r = new JTextField();
    JTextField m = new JTextField("+88");
    JTextField e_m = new JTextField();
    JPasswordField p = new JPasswordField();
    
    JButton next = new JButton("Next");
    
    ImageIcon image = new ImageIcon("image/ruet.png");
    
    REGONE()
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
        
        name.setBounds(90, 180, 250, 20);
        roll.setBounds(90, 205, 250, 20);
        mobile.setBounds(90, 230, 250, 20);
        e_mail.setBounds(90, 255, 250, 20);
        pass.setBounds(90, 280, 250, 20);
        n.setBounds(250, 180, 250, 20);
        r.setBounds(250, 205, 250, 20);
        m.setBounds(250, 230, 250, 20);
        e_m.setBounds(250, 255, 250, 20);
        p.setBounds(250, 280, 250, 20);
        add(name);
        add(roll);
        add(mobile);
        add(e_mail);
        add(pass);
        add(n);
        add(r);
        add(m);
        add(e_m);
        add(p);
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
            IDRUET.myName = n.getText();
            IDRUET.myMobile = m.getText();
            IDRUET.myRoll = r.getText();
            IDRUET.myEmail = e_m.getText();
            IDRUET.myPass = p.getText();
            setVisible(false);
            new REGTWO().setVisible(true);
        }
        });
    }
}
