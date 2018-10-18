package idruet;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class REGTWO extends JFrame{
    
    JLabel motto = new JLabel("Heven's Light is Our Guide");
    JLabel heading = new JLabel("Rajshahi University of");
    JLabel heading2 = new JLabel("Engineering & Technology");
    JLabel leading = new JLabel("© Department of Computer Science & Engineering, RUET, Kazla, Rajshahi-6204");
    JLabel web = new JLabel("Website:");
    JLabel website = new JLabel("www.ruet.ac.bd/department/CSE");
    JLabel mail = new JLabel("Email:");
    JLabel email = new JLabel("cse@ruet.ac.bd");
    
    JLabel header = new JLabel("Students Registration:");
    JLabel id_image = new JLabel("*ID Image:");
    JLabel signature = new JLabel("*Signature:");
    JLabel birth = new JLabel("*Date of Birth:");
    JLabel department = new JLabel("*Department");
    JLabel blood = new JLabel("*Blood Group");
    
    JButton i = new JButton("Upload ID Image");
    JButton s = new JButton("Upload Signature");
    
    String day_date[] = {"Day:", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                        "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
                        "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
    String month_date[] = {"Month:", "January", "February", "March", "April", "May", "June",
                        "July", "August", "September", "October", "November", "December"};
    String year_date[] = {"Year:", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995",
                        "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004",
                        "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013",
                        "2014", "2015"};
    String dept[] = {"Department:", "ARCH", "CE", "CFE", "CSE", "ECE", "EEE", "ETE", "GCE", "IPE", "ME", "MTE", "URP"};
    String blood_group[] = {"Blood Group:", "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-"};
    JComboBox day = new JComboBox(day_date);
    JComboBox month = new JComboBox(month_date);
    JComboBox year = new JComboBox(year_date);
    JComboBox d = new JComboBox(dept);
    JComboBox b = new JComboBox(blood_group);
    
    JButton next = new JButton("Next");
    
    ImageIcon image = new ImageIcon("image/ruet.png");
    
    REGTWO()
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
        
        id_image.setBounds(90, 180, 250, 20);
        signature.setBounds(90, 205, 250, 20);
        birth.setBounds(90, 230, 250, 20);
        department.setBounds(90, 255, 250, 20);
        blood.setBounds(90, 280, 250, 20);
        i.setBounds(250, 180, 250, 20);
        s.setBounds(250, 205, 250, 20);
        day.setBounds(250, 230, 50, 20);
        month.setBounds(310, 230, 100, 20);
        year.setBounds(420, 230, 80, 20);
        d.setBounds(250, 255, 250, 20);
        b.setBounds(250, 280, 250, 20);
        add(id_image);
        add(signature);
        add(birth);
        add(department);
        add(blood);
        add(i);
        add(s);
        add(day);
        add(month);
        add(year);
        add(d);
        add(b);
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
        i.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            JFileChooser chooser = new JFileChooser();
            chooser.showOpenDialog(null);
            File f =chooser.getSelectedFile();
            IDRUET.myImage = f.getAbsolutePath();
        }
        });
        
        s.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            JFileChooser chooser = new JFileChooser();
            chooser.showOpenDialog(null);
            File f =chooser.getSelectedFile();
            IDRUET.mySignature = f.getAbsolutePath();
        }
        });
        
        next.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
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
                
                IDRUET.myBlood = (String) b.getSelectedItem();
                
                IDRUET.myDay = (String) day.getSelectedItem();
                IDRUET.myMonth = (String) month.getSelectedItem();
                IDRUET.myYear = (String) year.getSelectedItem();
                
                IDRUET.myDateofBirth = IDRUET.myDay+" "+IDRUET.myMonth+", "+IDRUET.myYear;

                
            setVisible(false);
            new REGEXTRA().setVisible(true);
        }
        });
    }
}
