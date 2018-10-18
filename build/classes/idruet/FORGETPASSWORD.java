package idruet;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class FORGETPASSWORD extends JFrame{
    
    JLabel motto = new JLabel("Heven's Light is Our Guide");
    JLabel heading = new JLabel("Rajshahi University of");
    JLabel heading2 = new JLabel("Engineering & Technology");
    JLabel leading = new JLabel("© Department of Computer Science & Engineering, RUET, Kazla, Rajshahi-6204");
    JLabel web = new JLabel("Website:");
    JLabel website = new JLabel("www.ruet.ac.bd/department/CSE");
    JLabel mail = new JLabel("Email:");
    JLabel email = new JLabel("cse@ruet.ac.bd");
    JLabel header = new JLabel("Password Rrcovery:");
    JLabel roll = new JLabel("Roll No:");
    JLabel mobile = new JLabel("Mobile No:");
    JLabel department = new JLabel("Department:");
    JLabel f_teacher = new JLabel("Favourite Teacher:");
    JLabel wi = new JLabel("Wrong information,");
    JLabel ta = new JLabel("Try again.");
    
    JTextField r = new JTextField();
    JTextField m = new JTextField("+88");
    JTextField f_t = new JTextField();
    
    String dept[] = {"Department:", "ARCH", "CE", "CFE", "CSE", "ECE", "EEE", "ETE", "GCE", "IPE", "ME", "MTE", "URP"};
    JComboBox d = new JComboBox(dept);
    
    JButton get_pass = new JButton("Ok");
    JButton cancel = new JButton("Cancel");
    
    
    ImageIcon image = new ImageIcon("image/ruet.png");
    
    FORGETPASSWORD()
    {
        setSize(600, 500);
        setTitle("Password Recovery");
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
        if(IDRUET.myFP){
            wi.setForeground(Color.red);
            add(wi).setBounds(300, 140, 400, 30);
            ta.setForeground(Color.blue);
            add(ta).setBounds(415, 140, 400, 30);
        }
        
        roll.setBounds(90, 180, 250, 20);
        mobile.setBounds(90, 210, 250, 20);
        department.setBounds(90, 240, 250, 20);
        f_teacher.setBounds(90, 270, 250, 20);
        r.setBounds(250, 180, 250, 20);
        m.setBounds(250, 210, 250, 20);
        d.setBounds(250, 240, 250, 20);
        f_t.setBounds(250, 270, 250, 20);
        add(roll);
        add(mobile);
        add(department);
        add(f_teacher);
        add(r);
        add(m);
        add(d);
        add(f_t);
        get_pass.setBounds(90, 300, 90, 30);
        cancel.setBounds(410, 300, 90, 30);
        add(get_pass);
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

        recoveryActionListener();
    }
    
    private void recoveryActionListener() {
        get_pass.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            
            IDRUET.myMobile = m.getText();
            IDRUET.myRoll = r.getText();
            IDRUET.mySQues = f_t.getText();
            
            if (d.getSelectedItem().equals("EEE"))
                IDRUET.myDept = "Electrical & Electronic Engineering";
            else if (d.getSelectedItem().equals("CE"))
                IDRUET.myDept = "Civil Engineering";
            else if (d.getSelectedItem().equals("CSE"))
                IDRUET.myDept = "Computer Science & Engineering";
            else if (d.getSelectedItem().equals("ME"))
                IDRUET.myDept = "Mechanical Engineering";
            else if (d.getSelectedItem().equals("ETE"))
                IDRUET.myDept = "Electronics & Telecommunication Engineering";
            else if (d.getSelectedItem().equals("MTE"))
                IDRUET.myDept = "Mechatronics Engineering";
            else if (d.getSelectedItem().equals("URP"))
                IDRUET.myDept = "Urban & Regional Planning";
            else if (d.getSelectedItem().equals("GCE"))
                IDRUET.myDept = "Glass & Ceramic Engineering";
            else if (d.getSelectedItem().equals("IPE"))
                IDRUET.myDept = "Industrial & Production Engineering";
            else if (d.getSelectedItem().equals("ARCH"))
                IDRUET.myDept = "Architecture";
            else if (d.getSelectedItem().equals("CFE"))
                IDRUET.myDept = "Chemical & Food Process Engineering";
            else if (d.getSelectedItem().equals("ECE"))
                IDRUET.myDept = "Electrical & Computer Engineering";
            else IDRUET.myDept = "";
            
            
            try{
            //Class.forName("oracle.jdbc.driver.OracleDriver");
            String host = "jdbc:derby://localhost:1527/IDRUET";
            String uName = "idruet";
            String uPass = "idcardruet";
            Connection con = DriverManager.getConnection(host, uName, uPass);
            
            String pword = "select pass from regdata where roll='"+IDRUET.myRoll+"' and mobile='"+IDRUET.myMobile+"' and squestion='"+IDRUET.mySQues+"' and dept='"+IDRUET.myDept+"'";
            PreparedStatement stm = con.prepareStatement(pword);
            
            ResultSet fs = stm.executeQuery();
            
            if(fs.next()){
                IDRUET.myPass = fs.getString(1);
                setVisible(false);
                IDRUET.myFP = true;
                new IDLOGIN().setVisible(true);
                //JOptionPane.showMessageDialog(null, "Your password is: "+password+"", "Password", EXIT_ON_CLOSE);
            }
            else{
                IDRUET.myFP = true;
                setVisible(false);
                new FORGETPASSWORD().setVisible(true);
                //JOptionPane.showMessageDialog(null, "Details not found or incorrect ...  \nTry Again with correct detail.",  "Attention please....", EXIT_ON_CLOSE);
            }
        }
        catch (Exception ex){
            System.out.println(ex);
        }
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
