package university.managment.system;

import java.awt.Image;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project extends JFrame implements ActionListener{
    
    Project(){
        setSize(1540, 850);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1500, 750, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        
        JMenuBar ab = new JMenuBar();
    //New INformation
        JMenu newInformation = new JMenu("New Information");
        newInformation.setForeground(Color.BLUE);
        ab.add(newInformation);
        
        JMenuItem facultyinfo = new JMenuItem("New Faculty Information");
        facultyinfo.setBackground(Color.WHITE);
        facultyinfo.addActionListener(this);
        newInformation.add(facultyinfo);
        
        JMenuItem studentinfo = new JMenuItem("New Student Information");
        studentinfo.setBackground(Color.WHITE);
        studentinfo.addActionListener(this);
        newInformation.add(studentinfo);
    //Details
        JMenu details = new JMenu("Details");
        details.setForeground(Color.RED);
        ab.add(details);
        
        JMenuItem facultydetails = new JMenuItem("View Faculty Details");
        facultydetails.setBackground(Color.WHITE);
        facultydetails.addActionListener(this);
        details.add(facultydetails);
        
        JMenuItem studentdetails = new JMenuItem("View Student Details");
        studentdetails.setBackground(Color.WHITE);
        studentdetails.addActionListener(this);
        details.add(studentdetails);
    //Leave
        JMenu leave = new JMenu("Apply for leave");
        leave.setForeground(Color.BLUE);
        ab.add(leave);
        
        JMenuItem facultyleave = new JMenuItem("Faculty Leave");
        facultyleave.setBackground(Color.WHITE);
        facultyleave.addActionListener(this);
        leave.add(facultyleave);
        
        JMenuItem studentleave = new JMenuItem("Student Leave");
        studentleave.setBackground(Color.WHITE);
        studentleave.addActionListener(this);
        leave.add(studentleave);
    //Leave Details
        JMenu leavedetails = new JMenu("Leave Details");
        leavedetails.setForeground(Color.BLUE);
        ab.add(leavedetails);
        
        JMenuItem facultyleavedetails = new JMenuItem("Faculty Leave Details");
        facultyleavedetails.setBackground(Color.WHITE);
        facultyleavedetails.addActionListener(this);
        leavedetails.add(facultyleavedetails);
        
        JMenuItem studentleavedetails = new JMenuItem("Student Leave Details");
        studentleavedetails.setBackground(Color.WHITE);
        studentleavedetails.addActionListener(this);
        leavedetails.add(studentleavedetails);
    //Exam 
        JMenu exam = new JMenu("Examination");
        exam.setForeground(Color.BLUE);
        ab.add(exam);
        
        JMenuItem examinationdetails = new JMenuItem("Examination Results");
        examinationdetails.setBackground(Color.WHITE);
        examinationdetails.addActionListener(this);
        exam.add(examinationdetails);
        
        JMenuItem entermarks = new JMenuItem("Enter marks");
        entermarks.setBackground(Color.WHITE);
        entermarks.addActionListener(this);
        exam.add(entermarks);    
        
   //UpdateInfo 
        JMenu updateinfo = new JMenu("Update Details");
        updateinfo.setForeground(Color.RED);
        ab.add(updateinfo);
        
        JMenuItem updatestudentdetails = new JMenuItem("Update Student Details");
        updatestudentdetails.setBackground(Color.WHITE);
        updatestudentdetails.addActionListener(this);
        updateinfo.add(updatestudentdetails);
        
        JMenuItem updatefacultydetails= new JMenuItem("Update Faculty Details");
        updatefacultydetails.setBackground(Color.WHITE);
        updatefacultydetails.addActionListener(this);
        updateinfo.add(updatefacultydetails);    
            
    
    //Fee 
        JMenu fee = new JMenu("Fee Details");
        fee.setForeground(Color.BLUE);
        ab.add(fee);
        
        JMenuItem feestructure = new JMenuItem("Fee Structure");
        feestructure.setBackground(Color.WHITE);
        feestructure.addActionListener(this);
        fee.add(feestructure);
        
        JMenuItem feeform = new JMenuItem("Student Fee Form");
        feeform.setBackground(Color.WHITE);
        feeform.addActionListener(this);
        fee.add(feeform);    
       
    //Utility 
        JMenu utility = new JMenu("Utility");
        utility.setForeground(Color.RED);
        ab.add(utility);
        
        JMenuItem notepad = new JMenuItem("Notepad");
        notepad.setBackground(Color.WHITE);
        notepad.addActionListener(this);
        utility.add(notepad);
        
        JMenuItem calc = new JMenuItem("Calculator");
        calc.setBackground(Color.WHITE);
        calc.addActionListener(this);
        utility.add(calc);    
    
    //About 
        JMenu about = new JMenu("ABOUT");
        about.setForeground(Color.BLUE);
        ab.add(about);
        
        JMenuItem mb = new JMenuItem("About");
        mb.setBackground(Color.WHITE);
        mb.addActionListener(this);
        about.add(mb);    
        
    //Exit 
        JMenu exit = new JMenu("EXIT");
        exit.setForeground(Color.RED);
        ab.add(exit);
        
        JMenuItem ex = new JMenuItem("Exit");
        ex.setBackground(Color.WHITE);
        ex.addActionListener(this);
        exit.add(ex);    
        
        setJMenuBar(ab);    
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        String msg = ae.getActionCommand();
        if(msg.equals("Exit")){
            setVisible(false);       
        }
        else if(msg.equals("Calculator")){
            try {
                Runtime.getRuntime().exec("calc.exe");
            }
            catch (Exception e){
                
            }
        }
        else if(msg.equals("Notepad")){
            try {
                Runtime.getRuntime().exec("notepad.exe");
            }
            catch (Exception e){
                
            }
        }
        else if(msg.equals("New Faculty Information")){
            new AddTeacher();
        }
        else if(msg.equals("New Student Information")){
            new AddStudent();
        }
        else if(msg.equals("View Faculty Details")){
            new TeacherDetails();
        }
        else if(msg.equals("View Student Details")){
            new StudentDetails();
        }
        else if(msg.equals("Faculty Leave")){
            new TeacherLeave();
        }
        else if(msg.equals("Student Leave")){
            new StudentLeave();
        }
        else if(msg.equals("Faculty Leave Details")){
            new TeacherLeaveDetails();
        }
        else if(msg.equals("Student Leave Details")){
            new StudentLeaveDetails();
        }
        else if(msg.equals("Update Faculty Details")){
            new UpdateTeacher();
        }
        else if(msg.equals("Update Student Details")){
            new UpdateStudent();
        }
        else if(msg.equals("Enter marks")){
            new EnterMarks();
        }
        else if(msg.equals("Examination Results")){
            new ExaminationDetails();
        }
        else if(msg.equals("Fee Structure")){
            new FeeStructure();
        }
        else if(msg.equals("About")){
            new About();
        }
        else if(msg.equals("Student Fee Form")){
            new StudentFeeForm();
        }
    }
    
    public static void main(String[] arg){
        new Project();
    }
    
}




































 