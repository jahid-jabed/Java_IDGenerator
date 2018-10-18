package idruet;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IDONE extends JFrame{

    JLabel leading = new JLabel("© Department of Computer Science & Engineering, RUET, Kazla, Rajshahi-6204");
    JLabel web = new JLabel("Website:");
    JLabel website = new JLabel("www.ruet.ac.bd/department/CSE");
    JLabel mail = new JLabel("Email:");
    JLabel email = new JLabel("cse@ruet.ac.bd");
    
    JButton next = new JButton(">>");
    
    IDONE()
    {
        setSize(600, 500);
        setTitle("Login Form");
        setVisible(true);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
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
        add(new ID()).setBounds(-10, -50, 600, 400);
    }
    
    public class ID extends JPanel
    {
        @Override
        public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        //IdCard id = new IdCard();

        
        g.setColor(Color.WHITE);
        g.fillRoundRect(80, 80, 450, 280, 20, 20);
        g.setColor(Color.GRAY);
        g.fillRect(85, 305, 440, 30);
        
        g.setColor(Color.WHITE);
        g.setFont(new Font("Californian FB", Font.BOLD, 30));
        g.drawString("STUDENT", 370, 330);
        
        g.setColor(Color.black);
        g.setFont(new Font("Times", Font.ITALIC, 12));
        g.drawString("Heaven's Light is Our Guide", 220, 105);
        
        g.setColor(Color.red);
        g.setFont(new Font("Times", Font.BOLD, 16));
        g.drawString("Rajshahi University of", 210, 125);
        g.drawString("Engineering & Technology", 190, 145);
        
        g.setColor(Color.black);
        g.setFont(new Font("Times", Font.BOLD, 16));
        g.drawString(""+IDRUET.myName, 90, 205);
        
        g.setColor(Color.black);
        g.setFont(new Font("Times", Font.PLAIN, 14));
        g.drawString("Department of", 90, 230);
        g.drawString(IDRUET.myDept, 90, 245);
        g.drawString("Blood Group: "+IDRUET.myBlood, 90, 265);
        g.drawString("Mobile: "+IDRUET.myMobile, 90, 285);
        g.drawString("Holder's Signature", 410, 230);
        g.setFont(new Font("Times", Font.BOLD, 12));
        g.drawString("ID Number", 435, 270);
        g.setFont(new Font("Times", Font.BOLD, 16));
        g.drawString(IDRUET.myRoll, 440, 290);
        
        ImageIcon imageIcon1 = new ImageIcon(IDRUET.myImage);
        Image image1 = imageIcon1.getImage();
        g.drawImage(image1, 420, 90, 100, 120, this);
        
        ImageIcon imageIcon2 = new ImageIcon("image/ruet.png");
        Image image2 = imageIcon2.getImage();
        g.drawImage(image2, 90, 90, 80, 90, this);
        
        ImageIcon imageIcon3 = new ImageIcon(IDRUET.mySignature);
        Image image3 = imageIcon3.getImage();
        g.drawImage(image3, 395, 230, 130, 30, this);
        
    }
    }
    
    private void RegOneActionListener() {        
        next.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            setVisible(false);
            new IDTWO().setVisible(true);
        }
        });
    }
}
