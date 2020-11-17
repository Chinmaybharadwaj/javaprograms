
import java.awt.event.*;

import javax.swing.*;
import javax.swing.JFrame;


public class GraphicInterface implements ActionListener {
	JFormattedTextField tf1;
	dbSelect connect;
	JButton b1,b2,b3;
	JFrame f;
	JTable table1;
	
	GraphicInterface()
	{
		f=new JFrame("DataBase 1.0");
		connect= new dbSelect();
		b1=new JButton("ShowPrewiew");
		b1.setBounds(30,50,80,30);
		f.add(b1);
		b2=new JButton("add");
		b2.setBounds(120,50,80,30);
		f.add(b2);
		b3=new JButton("delet");
		b3.setBounds(210,50,80,30);
		f.add(b3);
		//String column[]= {"Name","id"};
		//String data[][]={ {"101","Amit","670000"},    
         //       {"102","Jai","780000"},    
          //      {"101","Sachin","700000"}}; 
		tf1=new JFormattedTextField("Prewiew");
		tf1.setBounds(30,150,400,300);
		//table1=new JTable(10,2);
		//table1.setBounds(30, 150, 400, 300);
		f.add(table1);
		b1.addActionListener(this);
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent a) {
		if(a.getSource()==b1) {
		connect.getData2();
		
		}
	}
}
