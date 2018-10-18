package idruet;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IDTWO extends JFrame{

    JLabel leading = new JLabel("© Department of Computer Science & Engineering, RUET, Kazla, Rajshahi-6204");
    JLabel web = new JLabel("Website:");
    JLabel website = new JLabel("www.ruet.ac.bd/department/CSE");
    JLabel mail = new JLabel("Email:");
    JLabel email = new JLabel("cse@ruet.ac.bd");
    
    JButton prev = new JButton("<<");
    JButton edit = new JButton("Edit");
    JButton ok = new JButton("Ok");
    
    IDTWO()
    {
        setSize(600, 500);
        setTitle("Login Form");
        setVisible(true);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        prev.setBounds(95, 320, 70, 30);
        edit.setBounds(265, 320, 70, 30);
        ok.setBounds(430, 320, 70, 30);
        add(prev);
        add(edit);
        add(ok);
        
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
        add(new moreID()).setBounds(-10, -50, 600, 400);
    }
    
    public class moreID extends JPanel
    {
        @Override
        public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        
        g.setColor(Color.WHITE);
        g.fillRoundRect(80, 80, 450, 280, 20, 20);
        
        g.setColor(Color.black);
        g.setFont(new Font("Times", Font.BOLD, 14));
        g.drawString("Date of Birth: "+IDRUET.myDateofBirth, 90, 125);
        g.drawString("Email: ", 90, 145);
        g.setColor(Color.blue);
        g.drawString(""+IDRUET.myEmail, 140, 145);
        
        g.setColor(Color.black);
        g.setFont(new Font("Times", Font.BOLD, 16));
        g.drawString("Present Address:", 90, 170);
        
        g.setFont(new Font("Times", Font.BOLD, 14));
        if("Select:".equals(IDRUET.myHall))
            g.drawString(""+IDRUET.myprRoad+",    "+IDRUET.myprVill+",    "+IDRUET.myprThana+",    "+IDRUET.myprDist+" - "+IDRUET.myprPost, 90, 190);
        else
            g.drawString(""+IDRUET.myHall+",    Room No:"+"  "+IDRUET.myRoom+"", 90, 190);
        
        g.setFont(new Font("Times", Font.BOLD, 16));
        g.drawString("Parmanent Address:", 90, 215);
        
        g.setFont(new Font("Times", Font.BOLD, 14));
        g.drawString(""+IDRUET.mypRoad+",    "+IDRUET.mypVill+",    "+IDRUET.mypThana+",    "+IDRUET.mypDist+" - "+IDRUET.mypPost, 90, 235);
        
        g.setColor(Color.red);
        g.setFont(new Font("Californian FB", Font.BOLD, 16));
        g.drawString("Address:", 90, 260);
        g.drawString("Rajshahi University of Engineering & Technology.", 90, 280);
        g.drawString("Kazla, Rajshahi-6204, Bangladesh.", 90, 300);
        
        g.setFont(new Font("Californian FB", Font.BOLD, 14));
        g.drawString("Fax:          +88 (0721) 750105,     PABX:     +88 (721) 750742-3, 751320-1", 90, 320);
        g.drawString("Website: ", 90, 340);
        g.setColor(Color.BLUE);
        g.drawString("www.ruet.ac.bd", 150, 340);
        g.setColor(Color.red);
        g.drawString("Email: ", 270, 340);
        g.setColor(Color.BLUE);
        g.drawString("registrar@ruet.ac.bd", 330, 340);
        
    }
    }
    
    private void RegOneActionListener() {        
        prev.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            setVisible(false);
            new IDONE().setVisible(true);
        }
        });
        
        edit.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            setVisible(false);
            IDRUET.myUpdate = false;
            new REGONE().setVisible(true);
        }
        });
        
        ok.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            setVisible(false);
            new IDLOGIN().setVisible(true);
        }
        });
    }
}
