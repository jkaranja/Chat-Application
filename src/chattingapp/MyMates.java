/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chattingapp;

/**
 *
 * @author john
 */

import javax.swing.*;
import java.lang.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyMates extends JFrame{
private JMenu menu, submenu;
private JMenuItem menuItem;
private JMenuBar menuBar;
private MyDialog2 myDialog = new MyDialog2(this, "My Dialog");
private MyDialog3 myDialog1 = new MyDialog3(this, "My Dialog");
private MyDialog4 myDialog2 = new MyDialog4(this, "My Dialog");
private MyDialog5 myDialog3 = new MyDialog5(this, "My Dialog");
    public MyMates() {
    	
    	   initUI();
    }
    private void initUI() {
        JMenuBar menubar = new JMenuBar();
        menubar.setLayout(new GridLayout(1,3,1,1));
        
        //UIManager.setLook(UIManager.getSystemLookAndFeelClassNa());
        UIManager.put("MenuBar.background",Color.RED);
        UIManager.put("Menu.background",Color.GREEN);
        UIManager.put("MenuItem.background",Color.MAGENTA);
        
        
        ImageIcon iconNew = new ImageIcon("new.png");
        ImageIcon iconOpen = new ImageIcon("open.png");
        ImageIcon iconSave = new ImageIcon("save.png");
        ImageIcon iconExit = new ImageIcon("exit.png");

        JMenu fileMenu1 = new JMenu("Icon");
        JMenu fileMenu2 = new JMenu("Invite Friends");
        JMenu fileMenu3= new JMenu("Help");

        JMenu impMenu = new JMenu("Import");

        JMenuItem newsfMi = new JMenuItem("Import newsfeed list...");
        JMenuItem bookmMi = new JMenuItem("Import bookmarks...");
        JMenuItem mailMi = new JMenuItem("Import mail...");

        impMenu.add(newsfMi);
        impMenu.add(bookmMi);
        impMenu.add(mailMi);

        JMenuItem newMi = new JMenuItem("New", iconNew);
        JMenuItem openMi = new JMenuItem("Open", iconOpen);
        JMenuItem saveMi = new JMenuItem("Save", iconSave);

        JMenuItem exitMi = new JMenuItem("Exit", iconExit);
        exitMi.setToolTipText("Exit application");

        exitMi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });

        fileMenu1.add(newMi);
        fileMenu1.add(openMi);
        fileMenu1.add(saveMi);
        fileMenu1.addSeparator();
        fileMenu1.add(impMenu);
        fileMenu1.addSeparator();
        fileMenu1.add(exitMi);

        menubar.add(fileMenu1);
        menubar.add(fileMenu2);
        menubar.add(fileMenu3);

        setJMenuBar(menubar);  
        	
        
        
        
    	Container con=getContentPane();
    	
    	JPanel p1=new JPanel();
    	p1.setLayout(new GridLayout(1,3,2,2));
    	p1.setBackground(Color.gray);
    	con.add(p1);
    	
        
    	
    JLabel bt1=new JLabel("Connect and Share:");
    	JLabel bt2=new JLabel("MyMate App");
    //	bt2.addActionListener ( this) ;
    	JButton bt3=new JButton("Login");
    	bt3.setBackground(Color.gray);
        bt3.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            if (!myDialog3.isVisible()) {
               myDialog3.setVisible(true);
             //  textField.setText(myDialog.getTextFieldText());
            }
         }
      });
    	
    	p1.add(bt1);
    p1.add(bt2);
    p1.add(bt3);
    	
    	//JPanel p2= new JPanel();
    	//p2.setLayout(new GridLayout(1,1,2,2));
    	//JButton bt12=new JButton("Login");
    	//p2.setBackground(Color.red);
    //	p2.add(bt12);
    	
    	JPanel p2= new JPanel();
    	//JPanel jp = new JPanel();
        p2.setLayout(new BorderLayout());
        p2.setBackground(Color.green);
        JTabbedPane tb = new JTabbedPane();
        
        //tb.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
       // tb.setUI(new CustomTabbedPaneUI());
        
        JPanel pp1= new JPanel(new BorderLayout());      
        
       pp1.setLayout(new BorderLayout());
        ImageIcon icon1= new ImageIcon("index44.PNG");
        JButton btnpp1=new JButton(icon1);
        
        
        
       pp1.add(btnpp1,BorderLayout.CENTER);
        
        
        
        
        JPanel pp2= new JPanel(new BorderLayout());
        pp2.setBackground(Color.white);
        JPanel inside2=new JPanel(new GridLayout(1,3,1,1));
        inside2.setBackground(Color.green);
        
        
              JLabel lblpp1=new JLabel("SELECT YOUR CATEGORY" );
              
        inside2.add(lblpp1);
        JTextField tfpp2=new JTextField("seach group name");
        inside2.add(tfpp2);
        JButton lblpp2=new JButton("FIND" );
              
        inside2.add(lblpp2);
                  pp2.add(inside2,BorderLayout.NORTH);
        
        JPanel inside=new JPanel(new GridLayout(5,1));
        pp2.add(inside,BorderLayout.WEST);
        
        JButton btnpp2=new JButton("Class Mates");
        
        JButton btnppp3=new JButton("Work Mates");
        JButton btnpp4=new JButton("Friends");
        JButton btnpp5=new JButton("SchoolMates");
        JButton btnpp6=new JButton("ClubMates");
        
        	inside.add(btnpp2);
        		inside.add(btnppp3);
        			inside.add(btnpp4);
        				inside.add(btnpp5);
        				inside.add(btnpp6);
        				
        JButton showDialogBtn=new JButton("Group Name");
        pp2.add(showDialogBtn,BorderLayout.CENTER);
        showDialogBtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            if (!myDialog1.isVisible()) {
               myDialog1.setVisible(true);
             //  textField.setText(myDialog.getTextFieldText());
            }
         }
      });
        
        
        
        //create group tab
        JPanel pp3= new JPanel(new BorderLayout());
        
       JLabel jlabel =new JLabel("Enter Group Details");
       jlabel.setBounds ( 70, 109 , 86, 14);
        	         JPanel pp12= new JPanel(new GridLayout(7,1));
        	         pp3.add(pp12,BorderLayout.WEST);
        JLabel gname=new JLabel("Group name");
        	JTextField gtxf=new JTextField(10);
         JRadioButton radio1 = new JRadioButton("classmates");        
        JRadioButton radio2 = new JRadioButton("Friends");
        
        JRadioButton radio3 = new JRadioButton("WorkMates");
        
        JRadioButton radio4 = new JRadioButton("SchoolMates");
        
        JRadioButton radio5 = new JRadioButton("ClubMates");
        ButtonGroup group=new ButtonGroup();
            group.add(radio1);
        group.add(radio2);
        group.add(radio3);
        group.add(radio4);
        group.add(radio5);
        pp12.add(gname);
        pp12.add(gtxf);
    pp12.add(radio1);
        pp12.add(radio2);
        pp12.add(radio3);
        pp12.add(radio4);
        pp12.add(radio5);
    
    JPanel pp13= new JPanel(new FlowLayout());
         pp3.add(pp13,BorderLayout.CENTER);
         
    JLabel jlab1 =new JLabel("Your Account Details");
    JLabel jlab2=new JLabel("User name");
    JTextField textf =new JTextField(10);
   JLabel jlab3=new JLabel("Password");
    JTextField textf2 =new JTextField(10);
                      pp13.add(jlab1);
                      pp13.add(jlab2);
        				pp13.add(textf);
        				pp13.add(jlab3);
                        	pp13.add(textf2);
    
    
    JPanel pp14= new JPanel(new GridLayout(3,1));
         pp3.add(pp14,BorderLayout.EAST);
   
    JLabel jlab7 =new JLabel("Invite Friends in other groups");
    JLabel jlab4 =new JLabel("via FB");
    JLabel jlab5 =new JLabel("Via Twitter");
                       pp14.add(jlab3);
        				pp14.add(jlab4);
        				pp14.add(jlab5);
                        
       
        JPanel pp4= new JPanel();
        
        
        //panel 4 in tab
         /*       JPanel pp4= new JPanel();
        
        
        pp4.add(showDialogBtn);
        
        */
        
        
        
        
        
        tb.setBackground(Color.MAGENTA);
        tb.setForeground(Color.white);
        tb.add("HOME", pp1);
        tb.add("JOIN A GROUP", pp2);
        tb.add("CREATE A NEW GROUP", pp3);
        tb.add("About", pp4);
        //tb.add("Tab5", pp5);
        
        p2.add(tb,BorderLayout.CENTER);
        add(p2, BorderLayout.CENTER);
       // tb.setEnabledAt(1, false);
       // tb.setEnabledAt(3, false);
    	
    	
    	
    	
    	con.add(p2);        
    	JPanel p3= new JPanel();
    	p3.setLayout(new GridLayout(2,2));
    	
    		
    		JButton bt7=new JButton("About");
    		p3.add(bt7);
    		JButton bt8=new JButton("About");
    		p3.add(bt8);
    		con.add(p3);
    
    	
    
    	
    	setLayout(new BorderLayout());
    	add(p1,BorderLayout.NORTH);
    add(p2,BorderLayout.CENTER );
    	add(p3,BorderLayout.SOUTH);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setSize(650,650);
    	setVisible(true);
    	setResizable(false);
    	setLocationRelativeTo(null);
    	setTitle("MyMates APP");
       	
    }
  
   public static void main(String[] args) {
      // Run the GUI construction in the Event-Dispatching thread for thread-safety
      SwingUtilities.invokeLater(new Runnable() {
         @Override
         public void run() {
            new MyMates(); // Let the constructor do the job
         }
      });
   }
}

class MyDialog2 extends JDialog {
	
	 private JLabel jlbl =new JLabel("User Name");
   private JTextField textfield =new JTextField(10);
   JLabel jlbl2=new JLabel("Password");
     private JTextField textfield2 =new JTextField(10);
   
   private JButton login = new JButton("Login");   	
   	
    private JButton forgotpass = new JButton("forgot password");
    private JButton exitd = new JButton("Exit");
   public MyDialog2(JFrame frame,String title) {
      //super(frame, title,true); // !!!!! made into a modaldialog
      
      
      JPanel panel = new JPanel(new GridLayout(4,2,1,1));
      panel.add(jlbl);
      panel.add(textfield);
       panel.add(jlbl2);
      panel.add(textfield2);
      panel.add(forgotpass);
      panel.add(login);
       panel.add(exitd);
      add(panel);
      
    	setResizable(false);
    	setTitle("Input Login Details");
      pack();
      
       setModal(true);     
      	setSize(300,140);
      setLocationRelativeTo(null);
      //ActionListener confirmListener= new ConfirmListener();
     // confirmBtn.addActionListener(confirmListener); // add listener
     // textfield.addActionListener(confirmListener );
   }
  
}
  
  
  
  
class MyDialog3 extends JDialog {
	
	private JLabel jlbl3 =new JLabel("Send your prefered account ");
	
	private JLabel jlbl41 =new JLabel("and contact details to   ");
	
	private JLabel jlbl51 =new JLabel("Group's Admin  ");
	 private JLabel jlbl =new JLabel("User Name");
   private JTextField textfield =new JTextField(10);
   JLabel jlbl2=new JLabel("Password");
     private JTextField textfield2 =new JTextField(10);
   JLabel jlbl4=new JLabel("Phone Number");
   private JTextField textfield3 =new JTextField(10);
   JLabel jlbl5=new JLabel("Valid Email");
   private JTextField textfield4 =new JTextField(10);
   
   private JButton confirmBtn = new JButton("Send");
    private JButton exitd = new JButton("Exit");
   public MyDialog3(JFrame frame,String title) {
      //super(frame, title,true); // !!!!! made into a modaldialog
      
      
      JPanel panel = new JPanel(new GridLayout(6,2,1,1));
      panel.add(jlbl3);
      
      panel.add(jlbl41);
      //panel.add(jlbl51);
      panel.add(jlbl);
      panel.add(textfield);
      panel.add(jlbl2);
      panel.add(textfield2);
      panel.add(jlbl4);
      panel.add(textfield3);
       panel.add(jlbl5);
      panel.add(textfield4);
      panel.add(confirmBtn);
       panel.add(exitd);
      add(panel);
      
    	setResizable(false);
    	setTitle("Request Add by Groups's Admin");
      pack();
      
       setModal(true);     
      	setSize(350,300);
      setLocationRelativeTo(null);
      //ActionListener confirmListener= new ConfirmListener();
     // confirmBtn.addActionListener(confirmListener); // add listener
     // textfield.addActionListener(confirmListener );
   }
  
}



class MyDialog4 extends JDialog {
   
   public MyDialog4(JFrame frame,String title) {
    	Container cont2=getContentPane();
    
    	JPanel userprofile=new JPanel(new FlowLayout());
    	userprofile.setBackground(Color.MAGENTA);  
        
    	
    	
    	JLabel welcome=new JLabel("welcome user");
    	JLabel picprof=new JLabel("user profile pic");
    	
   userprofile.add(welcome);
    userprofile.add(picprof);
    	
    	
    	JPanel user=new JPanel(new BorderLayout());
    	 user.setBackground(Color.MAGENTA);
    	 
    	 JTabbedPane tabuser = new JTabbedPane();
    	 tabuser.setForeground(Color.black);
    	 tabuser.setBackground(Color.green);
        JPanel userp1=new JPanel();
        JPanel userp2=new JPanel();
        JPanel userp3=new JPanel();
        JPanel userp4=new JPanel();
        
       // tabuser.setBackground(Color.MAGENTA);
        //tabuser.setForeground(Color.white);
        tabuser.add("Chat Room", userp1);
        tabuser.add("Share Documents", userp2);
        tabuser.add("Notifications", userp3);
        tabuser.add("Addition Features", userp4);
        //tb.add("Tab5", pp5);
        
        user.add(tabuser,BorderLayout.CENTER);
        
       cont2.add(userprofile,BorderLayout.NORTH);
        add(user,BorderLayout.CENTER);
        
    	
    	
        
      
    	setResizable(false);
    	setTitle("Welcome back to your Account");
      pack();
      
       setModal(true);     
      	setSize(650,650);
      setLocationRelativeTo(null);
      //ActionListener confirmListener= new ConfirmListener();
     // confirmBtn.addActionListener(confirmListener); // add listener
     // textfield.addActionListener(confirmListener );
   }
  
}
  



class MyDialog5 extends JDialog {
   
   public MyDialog5(JFrame frame,String title) {
    	Container cont3=getContentPane();
    
    	JPanel adminprofile=new JPanel(new FlowLayout());
    	adminprofile.setBackground(Color.MAGENTA);  
        
    	
    	
    	JLabel welcomeadmin=new JLabel("welcome user");
    	JLabel picprofadmin=new JLabel("user profile pic and logout b");
    	
   adminprofile.add(welcomeadmin);
    adminprofile.add(picprofadmin);
    	
    	
    	JPanel admin=new JPanel(new BorderLayout());
    	admin.setBackground(Color.MAGENTA);
    	 
    	 JTabbedPane tabadmin = new JTabbedPane();
    	 tabadmin.setForeground(Color.black);
    	 tabadmin.setBackground(Color.green);
        JPanel adminp1=new JPanel();
        JPanel adminp2=new JPanel();
        JPanel adminp3=new JPanel();
        JPanel adminp4=new JPanel(new FlowLayout());
        
        JLabel username =new JLabel("User Name");
   JTextField textfieldadd1 =new JTextField(10);
   JLabel userpass=new JLabel("Password");
     JTextField textfieldadd2 =new JTextField(10);
     JButton addbtn=new JButton("Add"); 
      adminp4.add(username);
      adminp4.add(textfieldadd1);
      adminp4.add(userpass);
      adminp4.add(textfieldadd2);
        adminp4.add(addbtn); 
        JPanel adminp5=new JPanel();
       // tabuser.setBackground(Color.MAGENTA);
        //tabuser.setForeground(Color.white);
        tabadmin.add("Chat Room", adminp1);
        tabadmin.add("Share Documents", adminp2);
        tabadmin.add("Notifications", adminp3);
        tabadmin.add("Add Users", adminp4);
        tabadmin.add("Manage Group memebers", adminp5);
        //tb.add("Tab5", pp5);
        
        admin.add(tabadmin,BorderLayout.CENTER);
        
       cont3.add(adminprofile,BorderLayout.NORTH);
        add(admin,BorderLayout.CENTER);
        
    	
    	
        
      
    	setResizable(false);
    	setTitle("Welcome back to your Account");
      pack();
      
       setModal(true);     
      	setSize(650,650);
      setLocationRelativeTo(null);
      //ActionListener confirmListener= new ConfirmListener();
     // confirmBtn.addActionListener(confirmListener); // add listener
     // textfield.addActionListener(confirmListener );
   }
  
}







  