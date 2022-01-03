/*Problem statement: Write a Java program to implement Swing components namely Buttons, ,JLabels
Checkboxes, Radio Buttons, JScrollPane, JList, JComboBox, Trees, Tables Scroll pan Menus
and Toolbars to design interactive GUI.*/

//ANY IMPROVMENTS ARE MOST WELCOMED. :-)
//I'VE TYPED AND EXECUTED THE CODE IN NETBEANS AND PUBLISHED HERE THROUGH VS CODE. SO IF U RUN THIS IN VS CODE THE CODE ////MAY GIVE SOME ISSUES
//BUT BY USING DEBUGGER THE CODE RUNS SUCCESSFULLY IN VS CODE TOO :-)

package expt13;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;


public class Expt13 {
    Expt13()
    {
        //creating a frame
	JFrame jf = new JFrame();
        jf.setSize(900,700);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setFocusable(false);

        //creating a menu bar
		JMenuBar jmb1 = new JMenuBar();
        jmb1.setBounds(1,1,800,20);
        JMenu jm1 = new JMenu("Menu");
        jmb1.add(jm1);
        JMenuItem i1 = new JMenuItem("Item 1");
        JMenuItem i2 = new JMenuItem("Item 2");
        JMenuItem i3 = new JMenuItem("Item 3");
        JMenuItem i4 = new JMenuItem("Item 4");
        jm1.add(i1);  jm1.add(i2);  jm1.add(i3);  jm1.add(i4);
        jf.add(jmb1);

        
        JMenu jm2 = new JMenu("Action");
        jmb1.add(jm2);
        JMenuItem a1 = new JMenuItem("New file");
        JMenuItem a2 = new JMenuItem("Open file");
        JMenuItem a3 = new JMenuItem("Upload");
        JMenuItem a4 = new JMenuItem("Close");
        jm2.add(a1); jm2.add(a2); jm2.add(a3); jm2.add(a4);

        
        //code block to insert label into the frame
		//here they ar similar normal print statements in a simple non swing java programs
		JLabel l1 = new JLabel("Type your name");
        l1.setBounds(30,80,100,30);
        l1.setLayout(null);
        l1.setVisible(true);
        jf.add(l1);
        JTextField jtf = new JTextField();
        jtf.setBounds(130,80,200,30);
        jf.add(jtf);

        
        JLabel l2 = new JLabel("Choose your role");
        l2.setBounds(30,150,150,30);
        l2.setLayout(null);
        l2.setVisible(true);
        jf.add(l2);
        String item[] = {"Student", "Teacher" , "Non teaching staff", "Other"};
        JComboBox jcb = new JComboBox<>(item);
        jcb.setBounds(150,150,150,30);
        jf.add(jcb);

        
        JLabel l3 = new JLabel("These students have registered themselves");
        l3.setBounds(30,200,950,30);
        l3.setLayout(null);
        l3.setVisible(true);
        jf.add(l3);
        
		//creating a scrollpane 
		JScrollPane jsp = new JScrollPane();
        jsp.setBounds(150,250,100,80);        
        String[] column = {"Name","Branch","Year"};
        String[][] row = {{"Jainam","IT","SE"},{"Darshan","IT","SE"},{"Nick","CS","TE"},{"Jimmy","ECS","FE"},{"Ajaz","EXTC","BE"},{"Jai","IT","SE"},{"Nikhil","CS","CS"}};     
        
		//creating a table to show student's details
		JTable jtab = new JTable(row,column);
        JScrollPane sp = new JScrollPane(jtab);
        sp.setBounds(30,250,200,80);
        sp.getViewport().add(jtab);
        jf.add(sp);
        
        //creating another table with a scrollpane
        JLabel l4 = new JLabel("Select your birth month.");
        l4.setBounds(500,205,200,30);
        l4.setLayout(null);
        l4.setVisible(true);
        jf.add(l4);
        String[] month = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        JList list = new JList(month);
        JScrollPane jsp2 = new JScrollPane();
        jsp2.setBounds(500,250,100,80);
        jsp2.getViewport().add(list);
        jf.add(jsp2);
        
        
        JLabel l5 = new JLabel("Choose your gender");
        l5.setBounds(20,330,850,30);
        l5.setLayout(null);
        l5.setVisible(true);
        jf.add(l5);
        JRadioButton jrd1 = new JRadioButton("Male"); 
        JRadioButton jrd2 = new JRadioButton("Female");
        jrd1.setBounds(15,360,100,30);
        jrd2.setBounds(15,380,100,30);
        ButtonGroup bg = new ButtonGroup();
        bg.add(jrd1);
        bg.add(jrd2);
        jf.add(jrd1); jf.add(jrd2);
        
        //creating a tree
         JLabel l6 = new JLabel("Select your branch.");
        l6.setBounds(20,420,850,30);
        l6.setLayout(null);
        l6.setVisible(true);
        jf.add(l6);
        
        DefaultMutableTreeNode field = new DefaultMutableTreeNode("Field");
        
        DefaultMutableTreeNode cs = new DefaultMutableTreeNode("Computer Science");
        DefaultMutableTreeNode it = new DefaultMutableTreeNode("Information & Technology");
        DefaultMutableTreeNode extc = new DefaultMutableTreeNode("Elecs & Telecom");
        DefaultMutableTreeNode ecs = new DefaultMutableTreeNode("Elecs and CS");
        DefaultMutableTreeNode aids = new DefaultMutableTreeNode("AI & DS");
        DefaultMutableTreeNode csec = new DefaultMutableTreeNode("Cyber Sec");
        
        field.add(cs); field.add(it); field.add(extc); field.add(ecs); field.add(aids); field.add(csec);
        
        JTree tree = new JTree(field);
        tree.setBounds(15,450,400,180);
        jf.add(tree);
        jf.setVisible(true);       
        
        
        //creating a button to submit the form
        JButton b1 = new JButton("Register");
        b1.setBounds(700,700,150,50);
        jf.add(b1);
        
		//creating code block that will show 
		//a confirmation dialog after it is clicked
		b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(b1, "You have successfully registered yourself");
                b1.setFocusable(false);
            }
        });


    }

//the main method
public static void main(String[] args) {
        Expt13 expt13 = new Expt13();
        
}
}

