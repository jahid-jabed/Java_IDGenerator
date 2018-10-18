package idruet;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class IDLOGIN extends JFrame{
    
    JLabel motto = new JLabel("Heven's Light is Our Guide");
    JLabel heading = new JLabel("Rajshahi University of");
    JLabel heading2 = new JLabel("Engineering & Technology");
    JLabel leading = new JLabel("© Department of Computer Science & Engineering, RUET, Kazla, Rajshahi-6204");
    JLabel web = new JLabel("Website:");
    JLabel website = new JLabel("www.ruet.ac.bd/department/CSE");
    JLabel mail = new JLabel("Email:");
    JLabel email = new JLabel("cse@ruet.ac.bd");
    JLabel header = new JLabel("Students Login:");
    JLabel roll = new JLabel("Roll No:");
    JLabel pass = new JLabel("Password:");
    JLabel wp = new JLabel("Roll not found or incorrect password.");
    
    JTextField r = new JTextField();
    JTextField password = new JTextField();
    JPasswordField p = new JPasswordField();
    
    JButton log_in = new JButton("Login");
    JButton register = new JButton("Register");
    JButton forget_pass = new JButton("Forgot Password?");
    
    ImageIcon image = new ImageIcon("image/ruet.png");
    
    IDLOGIN()
    {
        setSize(600, 500);
        setTitle("Login Form");
        setVisible(true);
        setLocationRelativeTo(null);
        setLayout(null);
        setBackground (new Color(150, 192, 122));
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
        if(IDRUET.myFP)
        {
            add(new JLabel("Your Password is:")).setBounds(90, 265, 187, 30);
            password.setBounds(250, 260, 250, 30);
            password.setText(IDRUET.myPass); //Recovered Password
            add(password);
        }
        if(IDRUET.myWP)
        {
            wp.setForeground(Color.red);
            add(wp).setBounds(250, 140, 250, 30); //Wrong Password
        }
        roll.setBounds(90, 180, 250, 30);
        pass.setBounds(90, 220, 250, 30);
        r.setBounds(250, 180, 250, 30);
        p.setBounds(250, 220, 250, 30);
        add(roll);
        add(pass);
        add(r);
        add(p);
        log_in.setBounds(90, 300, 90, 30);
        register.setBounds(190, 300, 110, 30);
        forget_pass.setBounds(310, 300, 187, 30);
        add(log_in);
        add(register);
        add(forget_pass);
        
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
        
        IdLoginActionListener();
    }
    
        private void IdLoginActionListener() {
        log_in.addActionListener(new ActionListener(){ //Login Button
        @Override
        public void actionPerformed(ActionEvent e) {
            String str_roll = r.getText();
            char[] pass_word = p.getPassword();
            String str_pass = new String(pass_word);
        
        try{
            //Class.forName("oracle.jdbc.driver.OracleDriver"); //Creating Database
            String host = "jdbc:derby://localhost:1527/IDRUET"; 
            String uName = "idruet";
            String uPass = "idcardruet";
            Connection con = DriverManager.getConnection(host, uName, uPass); //Creating a Connection to Database
            
            PreparedStatement ps = con.prepareStatement("select name from RegData where roll=? and pass=?"); //Matching Roll and Password

            ps.setString(1, str_roll);
            ps.setString(2, str_pass);
            
            PreparedStatement stmt = con.prepareStatement("select roll, name,"
                    + "mobile, dept, email, blood, dateofbirth, prroad, prvill,"
                    + "prthana, prdist, prpost, proad, pvill, pthana, pdist, ppost,"
                    + "idimage, idsignature, hall, room  from regdata where roll='"+str_roll+"'");

            ResultSet rs = ps.executeQuery();
            
            ResultSet r = stmt.executeQuery(); //Collect information
            if (r.next()) { //Assighn information into variables
            IDRUET.myRoll = r.getString(1);
            IDRUET.myName = r.getString(2);
            IDRUET.myMobile = r.getString(3);
            IDRUET.myDept = r.getString(4);
            IDRUET.myEmail = r.getString(5);
            IDRUET.myBlood = r.getString(6);
            IDRUET.myDateofBirth = r.getString(7);
            
            IDRUET.myprRoad = r.getString(8);
            IDRUET.myprVill = r.getString(9);
            IDRUET.myprThana = r.getString(10);
            IDRUET.myprDist = r.getString(11);
            IDRUET.myprPost = r.getString(12);
            
            IDRUET.mypRoad = r.getString(13);
            IDRUET.mypVill = r.getString(14);
            IDRUET.mypThana = r.getString(15);
            IDRUET.mypDist = r.getString(16);
            IDRUET.mypPost = r.getString(17);
            
            IDRUET.myImage = r.getString(18);
            IDRUET.mySignature = r.getString(19);
            
            IDRUET.myHall = r.getString(20);
            IDRUET.myRoom = r.getString(21);
            
            
            }

            if (rs.next()){
                setVisible(false);
                new IDONE().setVisible(true); //Calling IDONE()
            }
            else{
                setVisible(false);
                IDRUET.myWP = true;
                new IDLOGIN().setVisible(true); //Calling IDLOGIN()
                //JOptionPane.showMessageDialog(null, "Roll not found or incorrect password..Try Again with correct detail.",  "Attention please....", EXIT_ON_CLOSE);
            }
        }
        catch (Exception ex){
            System.out.println(ex);
        }
        }
        });
        
        register.addActionListener(new ActionListener(){ 
        @Override
        public void actionPerformed(ActionEvent e) {
            setVisible(false);
            new REGONE().setVisible(true); //Calling Registration Page
        }
        });
        forget_pass.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            setVisible(false);
            IDRUET.myFP = false;
            new FORGETPASSWORD().setVisible(true); //Calling Password Recovery Page
        }
        });
    }
    
    
}
