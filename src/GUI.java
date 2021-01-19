import javax.swing.*;
import java.awt.event.*;
import javax.swing.JFrame; 


public class GUI {
    public static void main(String[] args) {
    
        JFrame f = new JFrame(); //creating instance of JFrame  
        f.setTitle("My Database Project");
        
        JTextArea area=new JTextArea();  
        area.setBounds(40,100,1000,500);
        area.setEditable(false);
       

        JLabel label1 = new JLabel("");
        label1.setText("My Database Project");
        label1.setBounds(350, 20, 800, 40);

        JButton b = new JButton("Log In"); //creating instance of JButton 
        final JPopupMenu menu = new JPopupMenu("Menu");
        menu.add("As Admin");
        menu.add("As Staff");
        menu.add("As Customer");
        b.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                menu.show(b, b.getWidth()/2, b.getHeight()/2);
            }
        } );
      
        JButton b1 = new JButton("About My Project");
       
       b1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		area.setText("This is my project for course Database Systems.This text is displayed upon clicking About My Project Button");
        	}
        });
         
        
        JButton b2 = new JButton("My Academic Interests");
        b2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		area.setText("My interests are web develpoment and database management."
        				+ "I am currently doing my masters in Southern Illinoi University Carbondale.");
        	}
        });
        
        
        JButton b3 = new JButton("My Hobbies");
        b3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		area.setText("Cricket "
        				+ "Tennis "
        				+ "Badminton");
        		
        				
        	}
        });
         
        JButton b4 = new JButton("Log Out");
        b4.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		f.setVisible(false);
        	}
        });
        
        
        b.setBounds(30, 60, 100, 30); //x axis, y axis, width, height  
        b1.setBounds(140, 60, 150, 30);
        b2.setBounds(300, 60, 150, 30);
        b3.setBounds(475, 60, 150, 30);
        b4.setBounds(650, 60, 150, 30);
        f.add(b); //adding button in JFrame  
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        
        f.add(label1);
        f.add(area);

        f.setSize(1100, 700); //400 width and 500 height  
        f.setLayout(null); //using no layout managers  
        f.setVisible(true); //making the frame visible  
    }
}

