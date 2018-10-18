package idruet;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class REGTHREE extends JFrame{
    
    JLabel motto = new JLabel("Heven's Light is Our Guide");
    JLabel heading = new JLabel("Rajshahi University of");
    JLabel heading2 = new JLabel("Engineering & Technology");
    JLabel leading = new JLabel("© Department of Computer Science & Engineering, RUET, Kazla, Rajshahi-6204");
    JLabel web = new JLabel("Website:");
    JLabel website = new JLabel("www.ruet.ac.bd/department/CSE");
    JLabel mail = new JLabel("Email:");
    JLabel email = new JLabel("cse@ruet.ac.bd");
    
    JLabel header = new JLabel("Students Registration:");
    JLabel pr_add = new JLabel("Present Address:");
    JLabel p_add = new JLabel("*Permanent Address:");
    JLabel pr_road = new JLabel("Road No:");
    JLabel p_road = new JLabel("  Road No:");
    JLabel pr_vill = new JLabel("Vill / Area:");
    JLabel p_vill = new JLabel("  Vill / Area:");
    JLabel pr_thana = new JLabel("Thana:");
    JLabel p_thana = new JLabel("  Thana:");
    JLabel pr_dist = new JLabel("Dist:");
    JLabel p_dist = new JLabel("  Dist:");
    JLabel pr_post = new JLabel("Post Code:");
    JLabel p_post = new JLabel("  Post Code:");
    
    JTextField pr_r = new JTextField();
    JTextField p_r = new JTextField();
    JTextField pr_v = new JTextField();
    JTextField p_v = new JTextField();
    JTextField pr_t = new JTextField();
    JTextField p_t = new JTextField();
    JTextField pr_d = new JTextField();
    JTextField p_d = new JTextField();
    JTextField pr_p = new JTextField();
    JTextField p_p = new JTextField();
    
    JButton confirm = new JButton("Confirm");
    JButton cancel = new JButton("Cancel");
    
    ImageIcon image = new ImageIcon("image/ruet.png");
    
    REGTHREE()
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
        
        pr_add.setBounds(90, 170, 200, 30);
        pr_add.setFont(new Font("Times", Font.BOLD, 15));
        add(pr_add);
        p_add.setBounds(320, 170, 200, 30);
        p_add.setFont(new Font("Times", Font.BOLD, 15));
        add(p_add);
        add(pr_road).setBounds(90, 200, 60, 20);
        add(pr_r).setBounds(180, 200, 100, 20);
        add(pr_vill).setBounds(90, 220, 60, 20);
        add(pr_v).setBounds(180, 220, 100, 20);
        add(pr_thana).setBounds(90, 240, 60, 20);
        add(pr_t).setBounds(180, 240, 100, 20);
        add(pr_dist).setBounds(90, 260, 60, 20);
        add(pr_d).setBounds(180, 260, 100, 20);
        add(pr_post).setBounds(90, 280, 70, 20);
        add(pr_p).setBounds(180, 280, 100, 20);
        add(p_road).setBounds(320, 200, 60, 20);
        add(p_r).setBounds(410, 200, 100, 20);
        add(p_vill).setBounds(320, 220, 70, 20);
        add(p_v).setBounds(410, 220, 100, 20);
        add(p_thana).setBounds(320, 240, 60, 20);
        add(p_t).setBounds(410, 240, 100, 20);
        add(p_dist).setBounds(320, 260, 60, 20);
        add(p_d).setBounds(410, 260, 100, 20);
        add(p_post).setBounds(320, 280, 70, 20);
        add(p_p).setBounds(410, 280, 100, 20);
        
        cancel.setBounds(90, 320, 80, 30);
        confirm.setBounds(430, 320, 80, 30);
        add(confirm);
        add(cancel);
        
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
        
        RegThreeActionListener();
    }
    
    private void RegThreeActionListener() {
        confirm.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            IDRUET.mypRoad = p_r.getText();
            IDRUET.mypVill = p_v.getText();
            IDRUET.mypThana = p_t.getText();
            IDRUET.mypDist = p_d.getText();
            IDRUET.mypPost = p_p.getText();
                
            IDRUET.myprRoad = pr_r.getText();
            IDRUET.myprVill = pr_v.getText();
            IDRUET.myprThana = pr_t.getText();
            IDRUET.myprDist = pr_d.getText();
            IDRUET.myprPost = pr_p.getText();
            
            try{
            //Class.forName("oracle.jdbc.driver.OracleDriver");
            String host = "jdbc:derby://localhost:1527/IDRUET";
            String uName = "idruet";
            String uPass = "idcardruet";
            Connection con = DriverManager.getConnection(host, uName, uPass);
            Statement stmt=con.createStatement();
            if(IDRUET.myUpdate == true){ //Insert into Database
                stmt.executeUpdate("insert into RegData values('"+IDRUET.myRoll+"', '"+IDRUET.myName+"', '"+IDRUET.myMobile+"',"
                    + "'"+IDRUET.myDept+"', '"+IDRUET.myPass+"', '"+IDRUET.myEmail+"', '"+IDRUET.myBlood+"', '"+IDRUET.myDateofBirth+"',"
                    + "'"+IDRUET.myprRoad+"', '"+IDRUET.myprVill+"', '"+IDRUET.myprThana+"', '"+IDRUET.myprDist+"', '"+IDRUET.myprPost+"',"
                    + "'"+IDRUET.mypRoad+"', '"+IDRUET.mypVill+"', '"+IDRUET.mypThana+"', '"+IDRUET.mypDist+"', '"+IDRUET.mypPost+"',"
                    + "'"+IDRUET.myImage+"', '"+IDRUET.mySignature+"', '"+IDRUET.myHall+"', '"+IDRUET.myRoom+"', '"+IDRUET.mySQues+"')");
            }
            else{ //Update Database
                String info = "update RegData set name='"+IDRUET.myName+"', mobile='"+IDRUET.myMobile+"',"
                    + "dept='"+IDRUET.myDept+"', pass='"+IDRUET.myPass+"', email='"+IDRUET.myEmail+"', blood='"+IDRUET.myBlood+"', dateofbirth='"+IDRUET.myDateofBirth+"',"
                    + "prroad='"+IDRUET.myprRoad+"', prvill='"+IDRUET.myprVill+"', prthana='"+IDRUET.myprThana+"', prdist='"+IDRUET.myprDist+"', prpost='"+IDRUET.myprPost+"',"
                    + "proad='"+IDRUET.mypRoad+"', pvill='"+IDRUET.mypVill+"', pthana='"+IDRUET.mypThana+"', pdist='"+IDRUET.mypDist+"', ppost='"+IDRUET.mypPost+"',"
                    + "idimage='"+IDRUET.myImage+"', idsignature='"+IDRUET.mySignature+"',  hall='"+IDRUET.myHall+"', room='"+IDRUET.myRoom+"', squestion='"+IDRUET.mySQues+"' where roll='"+IDRUET.myRoll+"'";
                try (Statement pStmt = con.createStatement()) {
                    pStmt.executeUpdate(info);
                }
            }
        }
        catch (Exception ex){
            System.out.println(ex);
        }
            
            setVisible(false);
            new IDONE().setVisible(true);
        }
        });
        
        cancel.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            setVisible(false);
            IDRUET.myFP = false;
            new IDLOGIN().setVisible(true);
        }
        });
    }
}
